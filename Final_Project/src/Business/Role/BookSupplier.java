/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Employee.Employee;
import Business.UserAccount.User;


/**
 *
 * @author chenchen
 */
public class BookSupplier extends Employee {
    
    public BookSupplier(long id, String username, String password){
        super();
        this.setID(id);
        this.setName(username);
        this.setPassword(password);
    }
    
    @Override
    public String toString(){
        return this.getName();
    }
}
