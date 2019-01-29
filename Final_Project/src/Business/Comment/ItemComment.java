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
public class ItemComment extends Comment {
    private long orderID;
    private int orderItemID;
    private static int count;
    
    public ItemComment(long uid, String content, long oid, int omid){
        super(count,uid,content);
        this.orderID = oid;
        this.orderItemID = omid;
        count++;
    }

    public long getOrderID() {
        return orderID;
    }

    public void setOrderID(long orderID) {
        this.orderID = orderID;
    }

    public int getOrderItemID() {
        return orderItemID;
    }

    public void setOrderItemID(int orderItemID) {
        this.orderItemID = orderItemID;
    }
    
    @Override
    public String toString(){
        return this.getContent();
    }
}
