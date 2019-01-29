/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.Organization.Organization;
import Business.UserAccount.User;

/**
 *
 * @author raunak
 */
public class Employee {

    private String name;
    private long id;
    String password;
    private Organization org;

    public Employee() {
    }

    public long getId() {
        return id;
    }
    
    public void setID(long id){
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Organization getOrg() {
        return org;
    }

    public void setOrg(Organization org) {
        this.org = org;
    }

    @Override
    public String toString() {
        return id+"";
    }
    
}
