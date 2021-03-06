/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_4.analytics;

import assignment_4.entities.Customer;
import assignment_4.entities.Item;
import assignment_4.entities.Order;
import assignment_4.entities.Product;
import assignment_4.entities.SalesPerson;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author yanhongchen
 */
    
public class DataStore {
    private static DataStore dataStore;
    
    private Map<Integer,Customer> customers;
    private Map<Integer,SalesPerson> salesPersons;
    private Map<Integer,Order> orders;
    private Map<Integer,Product> products;
    private Map<Integer,Item> item;
    private Map<Integer,Integer> orderProductPrice;
    
    private DataStore(){
        customers = new HashMap<>();
        salesPersons = new HashMap<>();
        orders = new HashMap<>();
        products = new HashMap<>();
        item = new HashMap<>();
        orderProductPrice = new HashMap<>();
    }
    
    public static DataStore getInstance(){
        if(dataStore == null)
            dataStore = new DataStore();
        return dataStore;
    }
    
    public static DataStore getDataStore() {
        return dataStore;
    }

    public static void setDataStore(DataStore dataStore) {
        DataStore.dataStore = dataStore;
    }

    public Map<Integer, Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(Map<Integer, Customer> customers) {
        this.customers = customers;
    }

    public Map<Integer, SalesPerson> getSalesPersons() {
        return salesPersons;
    }

    public void setSalesPersons(Map<Integer, SalesPerson> salesPersons) {
        this.salesPersons = salesPersons;
    }

    public Map<Integer, Order> getOrders() {
        return orders;
    }

    public void setOrders(Map<Integer, Order> orders) {
        this.orders = orders;
    }

    public Map<Integer, Product> getProducts() {
        return products;
    }

    public void setProducts(Map<Integer, Product> products) {
        this.products = products;
    }

    public Map<Integer, Item> getItem() {
        return item;
    }

    public void setItem(Map<Integer, Item> item) {
        this.item = item;
    }

    public Map<Integer, Integer> getOrderProductPrice() {
        return orderProductPrice;
    }

    public void setOrderProductPrice(Map<Integer, Integer> orderProductPrice) {
        this.orderProductPrice = orderProductPrice;
    }
    
}