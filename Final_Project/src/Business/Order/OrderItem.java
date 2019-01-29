/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import Business.Comment.ItemComment;
import Business.Item.Item;

/**
 *
 * @author chenchen
 */
public class OrderItem {
    private int orderItemID;
    private Item item;
    private int saleQuantity;
    private double rating;
    private ItemComment comment;
    
    public OrderItem(int omid, Item item, int sq){
        this.orderItemID = omid;
        this.item = item;
        this.saleQuantity = sq;
        this.rating = 8;
    }

    public int getOrderItemID() {
        return orderItemID;
    }

    public void setOrderItemID(int orderItemID) {
        this.orderItemID = orderItemID;
    }

    public Item getItem() {
        return this.item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getSaleQuantity() {
        return saleQuantity;
    }

    public void setSaleQuantity(int saleQuantity) {
        this.saleQuantity = saleQuantity;
    }

    public ItemComment getComment() {
        return comment;
    }

    public void setComment(ItemComment comment) {
        this.comment = comment;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
    
    @Override
    public String toString(){
        return this.getItem().getBook().getTitle();
    }
}
