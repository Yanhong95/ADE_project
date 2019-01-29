/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Inventory.NewItemInventory;
import Business.Inventory.SecondHandDirectory;
import Business.Order.Order;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MyPC1
 */
public class BookStoreEnterprise extends Enterprise {
    
    private NewItemInventory newbookDirectory;
    private SecondHandDirectory oldBookDirectory;
    private List<Order> orderList;
    
    public BookStoreEnterprise(String name){
        super(name,EnterpriseType.BookStore);
        this.newbookDirectory = new NewItemInventory();
        this.oldBookDirectory = new SecondHandDirectory();
        this.orderList = new ArrayList<>();
    }
    
    public NewItemInventory getItemDirectory() {
        return newbookDirectory;
    }

    public void setItemDirectory(NewItemInventory itemDirectory) {
        this.newbookDirectory = itemDirectory;
    }

    public SecondHandDirectory getOldBookDirectory() {
        return oldBookDirectory;
    }

    public void setOldBookDirectory(SecondHandDirectory oldBookDirectory) {
        this.oldBookDirectory = oldBookDirectory;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }
    
}
