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
public class Bankaccount {
    private String sName;
    private String sRoutingNum;
    private String sAccountNum;
    private String sAccountBal;
    private String cName;
    private String cRoutingNum;
    private String cAccountNum;
    private String cAccountBal;

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsRoutingNum() {
        return sRoutingNum;
    }

    public void setsRoutingNum(String sRoutingNum) {
        this.sRoutingNum = sRoutingNum;
    }

    public String getsAccountNum() {
        return sAccountNum;
    }

    public void setsAccountNum(String sAccountNum) {
        this.sAccountNum = sAccountNum;
    }

    public String getsAccountBal() {
        return sAccountBal;
    }

    public void setsAccountBal(String sAccountBal) {
        this.sAccountBal = sAccountBal;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getcRoutingNum() {
        return cRoutingNum;
    }

    public void setcRoutingNum(String cRoutingNum) {
        this.cRoutingNum = cRoutingNum;
    }

    public String getcAccountNum() {
        return cAccountNum;
    }

    public void setcAccountNum(String cAccountNum) {
        this.cAccountNum = cAccountNum;
    }

    public String getcAccountBal() {
        return cAccountBal;
    }

    public void setcAccountBal(String cAccountBal) {
        this.cAccountBal = cAccountBal;
    }
}
