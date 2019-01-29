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
public class Localaddress {
    private String lstreetline1;
    private String lstreetline2;
    private String lcity;              
    private String lstate;
    private String lzipcode;
    private String lcountry;

    public String getLstreetline1() {
        return lstreetline1;
    }

    public void setLstreetline1(String lstreetline1) {
        this.lstreetline1 = lstreetline1;
    }

    public String getLstreetline2() {
        return lstreetline2;
    }

    public void setLstreetline2(String lstreetline2) {
        this.lstreetline2 = lstreetline2;
    }

    public String getLcity() {
        return lcity;
    }

    public void setLcity(String lcity) {
        this.lcity = lcity;
    }

    public String getLstate() {
        return lstate;
    }

    public void setLstate(String lstate) {
        this.lstate = lstate;
    }

    public String getLzipcode() {
        return lzipcode;
    }

    public void setLzipcode(String lzipcode) {
        this.lzipcode = lzipcode;
    }

    public String getLcountry() {
        return lcountry;
    }

    public void setLcountry(String lcountry) {
        this.lcountry = lcountry;
    }
    
}
