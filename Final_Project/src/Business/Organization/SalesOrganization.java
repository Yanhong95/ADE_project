/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Order.Order;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author raunak
 */
public class SalesOrganization extends Organization{

    private List<Order> orderList;
    
    public SalesOrganization() {
        super(Organization.Type.Sales.getValue());
        this.orderList = new ArrayList<>();
    }
    
    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }
     
}