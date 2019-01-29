/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Item;

import Business.Book.Book;
import Business.Comment.ItemComment;
import Business.Enterprise.Enterprise;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chenchen
 */
public class Item implements Comparable<Item>{
    private int itemID;
    private int quantity;
    private double price;
    private String picture;
    private String type;
    private double rating;
    private String description;
    private Book book;
    private Enterprise enterprise;
    private List<ItemComment> commentList;
    
    public Item(int mid, int quan, double price, Book book){
        this.itemID = mid;
        this.quantity = quan;
        this.price = price;
        this.book = book;
        this.commentList = new ArrayList<>();
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public List<ItemComment> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<ItemComment> commentList) {
        this.commentList = commentList;
    }
    
    @Override
    public String toString(){
        return this.getBook().getTitle();
    }
    
    @Override
    public int compareTo(Item o) {
        if(o.getRating() - this.getRating()>0){
            return 1;
        }
        else if(o.getRating() - this.getRating() == 0){
            return 0;
        }
        else{
            return -1;
        }
    }
}
