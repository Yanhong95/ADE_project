/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_4.entities;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author harshalneelkamal
 */
public class Customer {
    int customerID;
    List<Order> orderList;
    int totalRevenue;

    public Customer(int id){
        this.customerID = id;
        orderList = new ArrayList<Order>();
        totalRevenue = 0;
    }
    
    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }
    
    public int getToalRevenues(){
        for(Order order:orderList){
            totalRevenue = totalRevenue + order.getOrderTotal();
        }
        return totalRevenue;
    }
    
    @Override
    public String toString(){
        return this.getCustomerID()+"    Total Revenue: "+this.getToalRevenues();
    }
}
