/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Comment;

import java.util.Date;

/**
 *
 * @author chenchen
 */
public class BookComment extends Comment {
    private int bookID;
    private int like;
    private Date dateCreated;
    public BookComment(int cid, long uid, String content, int bid, int like, Date dateCreated){
        super(cid,uid,content);
        this.bookID = bid;
        this.like = like;
        this.dateCreated = dateCreated;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
  
    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }
    
    @Override
    public String toString(){
        return String.valueOf(this.getUserID());
    }
}
