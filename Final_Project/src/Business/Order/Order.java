/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import Business.Address.Address;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chenchen
 */
public class Order {
    private long orderID;
    private long customerID;
    private String date;
    private Address address;
    private double totalPrice;
    private String status;
    private List<OrderItem> orderItemList;
    
    public Order(long oid, long cid){
        this.orderID = oid;
        this.customerID = cid;
        this.orderItemList = new ArrayList<>();
    }

    public long getOrderID() {
        return orderID;
    }

    public void setOrderID(long orderID) {
        this.orderID = orderID;
    }

    public long getCustomerID() {
        return customerID;
    }

    public void setCustomerID(long customerID) {
        this.customerID = customerID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(List<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }
    
    @Override
    public String toString(){
        return this.getDate();
    }
}
