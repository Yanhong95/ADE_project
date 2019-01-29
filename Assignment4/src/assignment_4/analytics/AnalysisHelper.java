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
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 *
 * @author yanhongchen
 */
public class AnalysisHelper {
    
    public void getReportHeader(){
        Map<Integer,Customer> customers  = DataStore.getInstance().getCustomers();
        Map<Integer,SalesPerson> salesPersons  = DataStore.getInstance().getSalesPersons();
        Map<Integer,Order> orders  = DataStore.getInstance().getOrders();
        Map<Integer,Product> products  = DataStore.getInstance().getProducts();
        int cnum = customers.size();
        int snum = salesPersons.size();
        int onum = orders.size();
        int pnum = products.size();
        int inum = 0;
        for(Product p:products.values()){
            inum = inum + p.getSaleQuantities();
        }
        System.out.println("Xerox Received Customers:  "+cnum);
        System.out.println("Xerox Employed SalesPersons:  "+snum);
        System.out.println("Xerox Completed Orders:  "+onum);
        System.out.println("Xerox Sales Products:  "+pnum+" types, Totally Accounting  "+inum+" items");
    }
    
    public void getThreeMostPopularProducts(){
        Map<Integer,Product> products = DataStore.getInstance().getProducts();
        List<Product> productList = new ArrayList<>(products.values());
        System.out.println("----------------------------------------------");
        System.out.println("The Top 3 Most Popular Products are: ");
        Collections.sort(productList);
        for(int i = 0;i<3;i++){
            int min = productList.get(i).getMinPrice();
            int revenue = 0;
            for(Item item:productList.get(i).getItemList()){
                revenue = revenue + (item.getSalesPrice()-min)*item.getQuantity();
            }
            System.out.println(productList.get(i)+",  Revenue:  "+revenue);
        }
    }
    
    public void getTotalRevenue(){
        Map<Integer,Order> orders = DataStore.getInstance().getOrders();
        Map<Integer,Product> products = DataStore.getInstance().getProducts();
        int totalRevenue = 0;
        for(Order o:orders.values()){
            int orderTotal = o.getOrderTotal();
            int orderQuantities = o.getItem().getQuantity();
            int min = products.get(o.getItem().getProductId()).getMinPrice();
            totalRevenue = totalRevenue+ (orderTotal - orderQuantities*min);
        }
        System.out.println("----------------------------------------------");
        System.out.println("\nThe Total Revenue for The Year is  "+totalRevenue+"\n");
        System.out.println("----------------------------------------------");
    }
    
    public void getTopThreeBestSalesPeople(){
        Map<Integer,Integer> minpricePerProduct = new HashMap<>();
        Map<Integer,Order> orders  = DataStore.getInstance().getOrders();
        Map<Integer,Product> products  = DataStore.getInstance().getProducts();
        Map<Integer,Integer> individualRevenue = new HashMap<>();
        Map<Integer,Integer> individualRevenue2 = new HashMap<>();
        Map<Integer,Integer> revenuePerOrder = new HashMap<>();
        Map<Integer,Integer> orderIDAndSalesPerson = new HashMap<>();
        
        for(Product p : products.values()){
            int productID = p .getProductID();
            int minPrice = p.getMinPrice();
            minpricePerProduct.put(productID, minPrice);
        }  
        List<Integer> productIDList = new ArrayList<>(minpricePerProduct.keySet());
        Collections.sort(productIDList);
        
        int revenuePerLine = 0 ;
        for(Order o: orders.values()){
            for (int i=0; i<productIDList.size(); i++){
                if( o.getItem().getProductId() == productIDList.get(i) ){
                    revenuePerLine = (o.getItem().getSalesPrice() - minpricePerProduct.get(productIDList.get(i)))*o.getItem().getQuantity();
                    //System.out.println(o.getOrderId()+"      "+revenuePerLine);
                }
            }
            revenuePerOrder.put(o.getOrderId(), revenuePerLine);
        }
                  
        for(Order o : orders.values()){
           int SalesID = o.getSalesId();
           int OrderID = o.getOrderId();
           orderIDAndSalesPerson.put(OrderID, SalesID);
          // System.out.println(OrderID +"  "+SalesID);
        }
        
        int revenuePerSales = 0;
         
        for(Order o : orders.values()){
            //System.out.println(o.getOrderId());
            if (!individualRevenue.containsKey(orderIDAndSalesPerson.get(o.getOrderId()))){
              individualRevenue.put(orderIDAndSalesPerson.get(o.getOrderId()),revenuePerOrder.get(o.getOrderId()));
              individualRevenue2.put(revenuePerOrder.get(o.getOrderId()), orderIDAndSalesPerson.get(o.getOrderId()));
            }else{
              revenuePerSales = individualRevenue.get(orderIDAndSalesPerson.get(o.getOrderId())) + revenuePerOrder.get(o.getOrderId());
              individualRevenue.put(orderIDAndSalesPerson.get(o.getOrderId()),revenuePerSales);
              individualRevenue2.put(revenuePerSales, orderIDAndSalesPerson.get(o.getOrderId()));
            }
        }
        
        List<Integer> revenuePerSalesList = new ArrayList<>(individualRevenue.values());
        Collections.sort(revenuePerSalesList,Collections.reverseOrder());
  
        System.out.println("Top three best SalesPeople are : ");
        for(int i = 0;i < 3;i++){
            int id = individualRevenue2.get(revenuePerSalesList.get(i));
            System.out.println("ID: "+ id + " Totally Sold Revenues :" + revenuePerSalesList.get(i));
        }  
    }
    
    public void getThreeBestCustomers(){
        Map<Integer,Customer> customers  = DataStore.getInstance().getCustomers();
        Map<Integer,Product> products = DataStore.getInstance().getProducts();
        Map<Integer,Customer> customersRevenue = new HashMap<>();
        List<Integer> revenues = new ArrayList<>();
        for(Customer sp : customers.values()){
            int personOrderTotal = sp.getToalRevenues();
            int personOrderMin = 0;
            for(Order o : sp.getOrderList()){
                int orderQuantities = o.getItem().getQuantity();
                int min = products.get(o.getItem().getProductId()).getMinPrice();
                personOrderMin = personOrderMin + (orderQuantities*min);
            }
            int orderRevenue = personOrderTotal - personOrderMin;
            revenues.add(orderRevenue);
            customersRevenue.put(orderRevenue, sp);
        }
        Collections.sort(revenues, new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }    
        });
        
        System.out.println("---------------------------------------------------\n");
        System.out.println("Our three best Customers are : ");
        for(int i=0;i<3;i++){
            System.out.println("ID: "+customersRevenue.get(revenues.get(i)).getCustomerID()+"   Totally Consumed Revenue: "+revenues.get(i));
        }
    }
}
