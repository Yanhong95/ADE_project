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
public class SalesPerson {
    int salesID;
    List<Order> orderList;
    int totalRevenue;

    public SalesPerson(int id){
        this.salesID = id;
        orderList = new ArrayList<Order>();
        totalRevenue = 0;
    }
    
    public int getSalesID() {
        return salesID;
    }

    public void setSalesID(int salesID) {
        this.salesID = salesID;
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
        return this.getSalesID()+"    Total Revenue: "+this.getToalRevenues();
    }
}
