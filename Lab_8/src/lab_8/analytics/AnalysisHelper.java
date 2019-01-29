/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_8.analytics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import lab_8.entities.Comment;
import lab_8.entities.Post;
import lab_8.entities.User;

/**
 *
 * @author harshalneelkamal
 */
public class AnalysisHelper {
    
    
    public void userWithMostLikes(){
        Map<Integer,Integer> userLikeCount = new HashMap<>();
        Map<Integer,User> users = DataStore.getInstance().getUsers();
        for(User user : users.values()){
            for(Comment c : user.getComments()){
                int Likes = 0;
                if(userLikeCount.containsKey(user.getId())){
                    Likes = userLikeCount.get(user.getId());
                }
                Likes += c.getLikes();
                userLikeCount.put(user.getId(), Likes);
            }
        }
        int max = 0;
        int maxID = 0;
        for(int id : userLikeCount.keySet()){
            if(userLikeCount.get(id)>max){
                max = userLikeCount.get(id);
                maxID = id;
            }
        }
        System.out.println("User with most Likes is : "+max +"\n"+ users.get(maxID));  
    }
    
    public void getFiveMostLikedComment(){
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();       
        List<Comment> commentList = new ArrayList<>(comments.values());
        Collections.sort(commentList , new Comparator<Comment>(){
            @Override
            public int compare (Comment c1, Comment c2){
                return c2.getLikes()-c1.getLikes();
            }
        });  
        System.out.println("5 most liked comments: ");
        for(int i = 0;i < 5;i++){
            System.out.println(commentList.get(i));
        }        
    }      
    
    
    public void getFiveMostInactiveUsersBasedOnPosts(){
        Map<Integer,Integer> usePostsCount = new HashMap<>();
        Map<Integer,User> users = DataStore.getInstance().getUsers();
        Map<Integer,Post> posts = DataStore.getInstance().getPosts();
        for(Post post : posts.values()){
            int postsCount = 0;
            if(usePostsCount.containsKey(post.getUserId())){
                postsCount = usePostsCount.get(post.getUserId());
            }
            postsCount++;
            usePostsCount.put(post.getUserId(), postsCount);
        }
        List<Map.Entry<Integer,Integer>> usePostsCountlist = new ArrayList<>(usePostsCount.entrySet());
        Collections.sort(usePostsCountlist, new Comparator<Map.Entry<Integer,Integer>>(){
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o1.getValue() - o2.getValue();
            }
        });
        System.out.println("5 most Inactive Users Based On Posts: ");
        for(int i = 0; i<usePostsCountlist.size() && i<5; i++){
             System.out.println(users.get(usePostsCountlist.get(i).getKey()) + " no. of  Posts = " + usePostsCountlist.get(i).getValue());
        }
    }
    public void getFiveMostInactiveUsersBasedOnComments(){
        Map<Integer,Integer> userCommentsCount = new HashMap<>();
        Map<Integer,User> users = DataStore.getInstance().getUsers();
        for(User user : users.values()){
           int commentsCount = user.getComments().size();
           userCommentsCount.put(commentsCount, user.getId());
        }
        List<Integer> commentsCount = new ArrayList<>(userCommentsCount.keySet());
        Collections.sort(commentsCount);
        System.out.println("5 most Inactive Users Based On Comments: ");
        for(int i = 0;i <commentsCount.size() && i < 5;i++){
            int id = userCommentsCount.get(commentsCount.get(i));
            System.out.println(users.get(id));
        } 
    
    }
    
    public void getFiveMostInactiveUsersOverall(){
        Map<Integer,Integer> userCommentsCount = new HashMap<>();
        Map<Integer,Integer> userPostsCount = new HashMap<>();
        Map<Integer,Integer> postCountInComments = new HashMap<>();
        Map<Integer,Integer> userLikeCount = new HashMap<>();
        Map<Integer,User> users = DataStore.getInstance().getUsers();
        Map<Integer,Integer> userOverallCount = new HashMap<>();
        
        for(User user : users.values()){
            int userComments = user.getComments().size();
            userCommentsCount.put(user.getId(), userComments);
            int postIncomments = 0;
            for(Comment c : user.getComments()){
                if(!postCountInComments.containsKey(c.getPostId())){
                    postIncomments++;
                }
                postCountInComments.put(c.getPostId(), postIncomments);
                int Likes = 0;
                if(userLikeCount.containsKey(user.getId())){
                    Likes = userLikeCount.get(user.getId());
                }
                Likes += c.getLikes();
                userLikeCount.put(user.getId(), Likes);
            }
            userPostsCount.put(user.getId(), postIncomments);
        }
        List<Integer> overallcount = new ArrayList<Integer>();
        for(int id:userCommentsCount.keySet()){
            int total = userCommentsCount.get(id)+userPostsCount.get(id)+userLikeCount.get(id);
            userOverallCount.put(total,id);
            overallcount.add(total);
        }
        System.out.println("5 most Inactive Users Overall: ");
        Collections.sort(overallcount);
        for(int i=0;i<5;i++){
           int userid = userOverallCount.get(overallcount.get(i));
            System.out.println(users.get(userid));
        }
    }
    
    public void getFiveMostProactiveUsersOverall(){
        Map<Integer,Integer> userCommentsCount = new HashMap<>();
        Map<Integer,Integer> userPostsCount = new HashMap<>();
        Map<Integer,Integer> postCountInComments = new HashMap<>();
        Map<Integer,Integer> userLikeCount = new HashMap<>();
        Map<Integer,User> users = DataStore.getInstance().getUsers();
        Map<Integer,Integer> userOverallCount = new HashMap<>();
        
        for(User user : users.values()){
            int userComments = user.getComments().size();
            userCommentsCount.put(user.getId(), userComments);
            int postIncomments = 0;
            for(Comment c : user.getComments()){
                if(!postCountInComments.containsKey(c.getPostId())){
                    postIncomments++;
                }
                postCountInComments.put(c.getPostId(), postIncomments);
                int Likes = 0;
                if(userLikeCount.containsKey(user.getId())){
                    Likes = userLikeCount.get(user.getId());
                }
                Likes += c.getLikes();
                userLikeCount.put(user.getId(), Likes);
            }
            userPostsCount.put(user.getId(), postIncomments);
        }
        List<Integer> overallcount = new ArrayList<Integer>();
        for(int id:userCommentsCount.keySet()){
            int total = userCommentsCount.get(id)+userPostsCount.get(id)+userLikeCount.get(id);
            userOverallCount.put(total,id);
            overallcount.add(total);
        }
        System.out.println("5 most proactive Users Overall: ");
        Collections.sort(overallcount,new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        for(int i=0;i<5;i++){
           int userid = userOverallCount.get(overallcount.get(i));
            System.out.println(users.get(userid));
        }
    }
    
        //Find Average number of likes per comment.
    public void averageOfLikes() {
        
        Map <Integer, Comment> comments = DataStore.getInstance().getComments();
        int sum = 0;
        for (Comment comment : comments.values()) {
            sum += comment.getLikes();
        }
        double average = (double)sum / comments.size();
        System.out.println("The average number of likes per comment: \n" + String.valueOf(average));
      
    }
    
     //Post with most liked comments.
    public void postWithMostLikedComment () {
        Map <Integer, Post> posts = DataStore.getInstance().getPosts();
        //postID , num of likes
        Map <Integer, Integer> mostLikesOfPost = new HashMap<> ();
        
        
        for (Post post : posts.values()) {
            if ( !mostLikesOfPost.containsKey(post.getPostId()) ) {
                mostLikesOfPost.put(post.getPostId(), 0);
            }
            for ( Comment comment : post.getComments() ) {
                if ( mostLikesOfPost.get(post.getPostId()) < comment.getLikes() ) {
                    mostLikesOfPost.put( post.getPostId(), comment.getLikes() );
                }
            }
        }
        
        int maxLikes = 0;
        int aimPostId = 0;
        for ( Integer i : mostLikesOfPost.keySet() ) {
            if (maxLikes < mostLikesOfPost.get(i) ) {
                maxLikes = mostLikesOfPost.get(i);
                aimPostId = i;
            }
        }
        
        Post mlcPost = posts.get(aimPostId);
        System.out.print("Post with most liked comments is : \n" );
        System.out.println("Post{id = " + mlcPost.getPostId() + ", userId = " + mlcPost.getUserId() + ", number of likes = " + maxLikes + "}");
        
    }
    
    //Post with most comments.
    public void postWithMostComment() {
        Map <Integer, Post> posts = DataStore.getInstance().getPosts();
        List <Post> postList = new ArrayList <> (posts.values());
        Collections.sort(postList, new Comparator<Post> () {
            @Override
            public int compare(Post p1, Post p2) {
                return p2.getComments().size() - p1.getComments().size();
            }
        });
        System.out.println("Post with most comments: ");
        System.out.println("Post{id = " + String.valueOf(postList.get(0).getPostId()) + 
                ", userId = " + String.valueOf(postList.get(0).getUserId()) + 
                ", the number of comments = " + String.valueOf(postList.get(0).getComments().size() + "}"));
    }
}
