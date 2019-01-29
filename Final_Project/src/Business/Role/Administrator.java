/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Enterprise.Enterprise;
import Business.UserAccount.User;

/**
 *
 * @author chenchen
 */
public class Administrator extends User {
    private Enterprise enterprise;
    public Administrator(long id, String username,String password){
        super(id,username,password);
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }
    
    @Override
    public String toString(){
        return this.getUserID()+"";
    }
}
