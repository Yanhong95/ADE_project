/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author yanhongchen
 */
public class CustomerDirectory {
    private ArrayList<Customer> CustomerDir;
    
    public CustomerDirectory(){
        CustomerDir=new ArrayList<Customer>();
    }

    public ArrayList<Customer> getCustomerDir() {
        return CustomerDir;
    }
    
    public Customer addCustomer(){
        Customer P = new Customer();
        CustomerDir.add(P);
        return P;        
    }
    
    public void removeCustomer(Customer P){
        CustomerDir.remove(P);
    }
    
    public Customer searchCustomer(String Name){
        for(Customer P : CustomerDir){
            if(P.getName().equals(Name)){
             return P;
            }else{
            JOptionPane.showMessageDialog(null, "Unable to find the person", "Warning", JOptionPane.WARNING_MESSAGE);
            }  
        }
        return null;
    }
}
