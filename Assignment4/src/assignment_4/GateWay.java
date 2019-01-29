/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_4;

import assignment_4.analytics.AnalysisHelper;
import assignment_4.analytics.DataStore;
import assignment_4.entities.Customer;
import assignment_4.entities.Item;
import assignment_4.entities.Order;
import assignment_4.entities.Product;
import assignment_4.entities.SalesPerson;
import java.io.IOException;

/**
 *
 * @author harshalneelkamal
 */
public class GateWay {
    
    DataGenerator generator;
    DataReader productReader;
    DataReader personReader;
    DataReader ordersReader;
    AnalysisHelper helper;
    
    public GateWay() throws IOException{
        generator = DataGenerator.getInstance();
        productReader = new DataReader(generator.getProductCataloguePath());
        personReader = new DataReader(generator.getOrderFilePath());
        ordersReader = new DataReader(generator.getOrderFilePath());
        helper = new AnalysisHelper();
    }
    
    public static void main(String args[]) throws IOException{     
        GateWay gate = new GateWay();
        System.out.println("\n--------------Xerox Sales Report---------------");
        gate.readData();
    }
        
    public void readData() throws IOException{
        String row[];
        while((row = productReader.getNextRow())!=null){
            generateProduct(row);
        }
        while((row = personReader.getNextRow())!=null){
            generateCustomer(row);
            generateSalesPerson(row);
        }
        while((row = ordersReader.getNextRow())!=null){
            generateOrder(row);
        }
        runAnalysis();
    }
    
    public void generateProduct(String[] row){
        int pid = Integer.parseInt(row[0]);
        int min = Integer.parseInt(row[1]);
        int max = Integer.parseInt(row[2]);
        int tar = Integer.parseInt(row[3]);
        Product product = new Product(pid,min,max,tar);
        DataStore.getInstance().getProducts().put(pid, product);
    }
    
    public void generateCustomer(String[] row){
        int cid = Integer.parseInt(row[5]);
        Customer customer = new Customer(cid);
        DataStore.getInstance().getCustomers().put(cid, customer);
    }
    
    public void generateSalesPerson(String[] row){
        int sid = Integer.parseInt(row[4]);
        SalesPerson salesPerson = new SalesPerson(sid);
        DataStore.getInstance().getSalesPersons().put(sid, salesPerson);
    }
    
    public void generateOrder(String[] row){
        int oid = Integer.parseInt(row[0]);
        int mid = Integer.parseInt(row[1]);
        int pid = Integer.parseInt(row[2]);
        int quantity = Integer.parseInt(row[3]);
        int sid = Integer.parseInt(row[4]);
        int cid = Integer.parseInt(row[5]);
        int price = Integer.parseInt(row[6]);
        Item item = new Item(pid,price,quantity);
        Order order = new Order(oid,sid,cid,item);
        DataStore.getInstance().getOrders().put(oid, order);
        if(DataStore.getInstance().getProducts().containsKey(pid)){
            DataStore.getInstance().getOrderProductPrice().put(oid, price);
            DataStore.getInstance().getProducts().get(pid).getItemList().add(item);
        }
        if(DataStore.getInstance().getCustomers().containsKey(cid)){
            DataStore.getInstance().getCustomers().get(cid).getOrderList().add(order);
        }
        if(DataStore.getInstance().getSalesPersons().containsKey(sid)){
            DataStore.getInstance().getSalesPersons().get(sid).getOrderList().add(order);
        }
    }
    
    public void runAnalysis(){
        helper.getReportHeader();
        helper.getThreeMostPopularProducts();
        helper.getTotalRevenue();
        helper.getTopThreeBestSalesPeople();
        helper.getThreeBestCustomers();
    }
    
}
