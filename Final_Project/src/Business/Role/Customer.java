/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Address.Address;
import Business.Item.SecondItem;
import Business.Order.Order;
import Business.Order.OrderItem;
import Business.UserAccount.User;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chenchen
 */
public class Customer extends User {
    private List<Address> addressDirectory;
    private List<OrderItem> cartList;
    private List<Order> orderList;
    private List<SecondItem> secondList;
    
    public Customer(long id, String username, String password){
        super(id,username,password);
        this.addressDirectory = new ArrayList<>();
        this.cartList = new ArrayList<>();
        this.orderList = new ArrayList<>();
        this.secondList = new ArrayList<>();
    }

    public List<Address> getAddressDirectory() {
        return addressDirectory;
    }

    public void setAddressDirectory(List<Address> addressDirectory) {
        this.addressDirectory = addressDirectory;
    }

    public List<OrderItem> getCartList() {
        return cartList;
    }

    public void setCartList(List<OrderItem> cartList) {
        this.cartList = cartList;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    public List<SecondItem> getSecondList() {
        return secondList;
    }

    public void setSecondList(List<SecondItem> secondList) {
        this.secondList = secondList;
    }
    
    @Override
    public String toString(){
        return this.getUsername();
    }
}
