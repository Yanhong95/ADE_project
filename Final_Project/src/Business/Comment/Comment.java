/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Comment;

/**
 *
 * @author chenchen
 */
public abstract class Comment {
    private int commentID;
    private long userID;
    private String content;
    
    public Comment(int cid, long uid, String content){
        this.commentID = cid;
        this.userID = uid;
        this.content = content;
    }

    public int getCommentID() {
        return commentID;
    }

    public void setCommentID(int commentID) {
        this.commentID = commentID;
    }

    public long getUserID() {
        return userID;
    }

    public void setUserID(long userID) {
        this.userID = userID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    
    @Override
    public String toString(){
        return this.getContent();
    }
}
