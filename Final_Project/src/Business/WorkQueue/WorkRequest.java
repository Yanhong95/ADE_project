/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Organization.Organization;
import java.util.Date;

/**
 *
 * @author raunak
 */
public class WorkRequest {

    private String message;
    private Organization sender;
    private Organization receiver;
    private String status;
    private String requestDate;
    private String resolveDate;
    private String reply;
    private boolean isAble;
    
    public WorkRequest(){
        this.message = "";
        this.sender = null;
        this.receiver = null;
        this.requestDate = "";
        this.resolveDate = "";
        this.status = "Pending...";
        this.reply = "";
        this.isAble = true;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Organization getSender() {
        return sender;
    }

    public void setSender(Organization sender) {
        this.sender = sender;
    }

    public Organization getReceiver() {
        return receiver;
    }

    public void setReceiver(Organization receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(String requestDate) {
        this.requestDate = requestDate;
    }

    public String getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(String resolveDate) {
        this.resolveDate = resolveDate;
    }

    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply;
    }

    public boolean isIsAble() {
        return isAble;
    }

    public void setIsAble(boolean isAble) {
        this.isAble = isAble;
    }
    
    @Override
    public String toString(){
        return this.getRequestDate();
    }
}
