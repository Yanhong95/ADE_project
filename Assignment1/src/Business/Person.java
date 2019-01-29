/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author yanhongchen
 */
public class Person {
    
    private Address address = new Address();
    private Demographic demographic = new Demographic();
    private Bankaccount bankaccount = new Bankaccount();
    private Driver driver = new Driver();
    private Medical medical = new Medical();   


    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Demographic getDemographic() {
        return demographic;
    }

    public void setDemographic(Demographic demographic) {
        this.demographic = demographic;
    }

    public Bankaccount getBankaccount() {
        return bankaccount;
    }

    public void setBankaccount(Bankaccount bankaccount) {
        this.bankaccount = bankaccount;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Medical getMedical() {
        return medical;
    }

    public void setMedical(Medical medical) {
        this.medical = medical;
    }
}