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
public class Customer {
    private String Name;
    private int Age;
    private int ID;
    private TicketDirectory ticketDirectory = new TicketDirectory();
    
    public TicketDirectory getTicketDirectory() {
        return ticketDirectory;
    }

    public void setTicketDirectory(TicketDirectory ticketDirectory) {
        this.ticketDirectory = ticketDirectory;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
    @Override
    public String toString(){
        return Name;
    }
   
}
