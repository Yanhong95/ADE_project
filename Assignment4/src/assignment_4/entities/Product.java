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
public class Product implements Comparable<Product>{
    int productID;
    int minPrice;
    int maxPrice;
    int targetPrice;
    int salesPrice;
    List<Item> itemList;

    public Product(int id, int min,int max,int target){
        this.productID = id;
        this.minPrice = min;
        this.maxPrice = max;
        this.targetPrice = target;
        itemList = new ArrayList<Item>();
    }
    
    public Product(int id,int salesPrice){
        this.productID = id;
        this.salesPrice = salesPrice;
        itemList = new ArrayList<Item>();
    }
    
    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(int minPrice) {
        this.minPrice = minPrice;
    }

    public int getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(int maxPrice) {
        this.maxPrice = maxPrice;
    }

    public int getTargetPrice() {
        return targetPrice;
    }

    public void setTargetPrice(int targetPrice) {
        this.targetPrice = targetPrice;
    }

    public int getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(int salesPrice) {
        this.salesPrice = salesPrice;
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> ItemList) {
        this.itemList = ItemList;
    }
    
    public int getSaleQuantities(){
        int totalQuantities = 0;
        for(Item item:itemList){
            totalQuantities = totalQuantities+item.getQuantity();
        }
        return totalQuantities;
    }
 
    @Override
    public int compareTo(Product o) {
        return o.getSaleQuantities() - this.getSaleQuantities();
    }
    
    @Override
    public String toString(){
        return "ID: "+this.getProductID()+"    Totally Sold Quantities:  "+this.getSaleQuantities();
    }
}
