/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Users;

import Business.Abstract.User;
import java.util.Date;
import Business.CustomerDirectory;

/**
 *
 * @author harshalneelkamal
 */
public class Customer extends User implements Comparable<Customer> {
    private CustomerDirectory directory;
    private Date dateCreated;
    
    public Customer(Date dateCreated,String password,String userName){
        super(password,userName, "CUSTOMER");
        this.dateCreated = dateCreated;
        directory = new CustomerDirectory();
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
 

    public CustomerDirectory getDirectory() {
        return directory;
    }

    public void setDirectory(CustomerDirectory directory) {
        this.directory = directory;
    }

    @Override
    public int compareTo(Customer o) {
        return o.getUserName().compareTo(this.getUserName());
    }

    @Override
    public String toString() {
        return getUserName(); 
    }
    
    public boolean verify(String password){
        if(password.equals(getPassword()))
            return true;
        return false;
    }
    
    
}
