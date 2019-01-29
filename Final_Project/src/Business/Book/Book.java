/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Book;

import Business.Comment.BookComment;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chenchen
 */
public class Book implements Comparable<Book> {
    private int bookID;
    private String title;
    private String author;
    private double rating;
    private String description;
    private String picture;
    private List<BookComment> bookCommentList;
    
    public Book(int id, String title, String author,String description){
        this.bookID = id;
        this.title = title;
        this.author = author;
        this.rating = 0.0;
        this.description = description;
        bookCommentList = new ArrayList<>();
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public List<BookComment> getBookCommentList() {
        return bookCommentList;
    }

    public void setBookCommentList(List<BookComment> bookCommentList) {
        this.bookCommentList = bookCommentList;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
    
    @Override
    public String toString(){
        return this.title;
    }
    
    @Override
    public int compareTo(Book b) {
        if(b.getRating() - this.getRating()>0){
            return 1;
        }
        else if(b.getRating() - this.getRating() == 0){
            return 0;
        }
        else{
            return -1;
        }
    }
}
