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
    private String firstname;
    private String lastname;
    private String address;
    private String dateofbirth;
    private String streetaddress;
    private Workaddress workaddress= new Workaddress();
    private Localaddress localaddress = new Localaddress();
    private Homeaddress homeaddress= new Homeaddress();
    

    public String getStreetaddress() {
        return streetaddress;
    }

    public void setStreetaddress(String streetaddress) {
        this.streetaddress = streetaddress;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public Workaddress getWorkaddress() {
        return workaddress;
    }

    public void setWorkaddress(Workaddress workaddress) {
        this.workaddress = workaddress;
    }

    public Localaddress getLocaladdress() {
        return localaddress;
    }

    public void setLocaladdress(Localaddress localaddress) {
        this.localaddress = localaddress;
    }

    public Homeaddress getHomeaddress() {
        return homeaddress;
    }

    public void setHomeaddress(Homeaddress homeaddress) {
        this.homeaddress = homeaddress;
    }
}
