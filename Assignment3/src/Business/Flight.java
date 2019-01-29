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
public class Flight {
    private String FlightName;
    private String Date;
    private String DateSection;
    private String Origin;
    private String Destination;
    private String Seat[][]= new String[25][6];
    private TicketDirectory ticketDirectory ;

    public Flight() {
         for(int i=0; i<25; i++ ){
           for(int j=0; j<6; j++)
              Seat [i][j]="none";
        } 
    }

    public String[][] getSeat() {
        return Seat;
    }

    public void setSeat(String[][] Seat) {
        this.Seat = Seat;
    }
   
    
    public void setTicketDirectory(TicketDirectory ticketDirectory) {
        this.ticketDirectory = ticketDirectory;
    }
    
    public String getFlightName() {
        return FlightName;
    }
    
    
    public void setFlightName(String FlightName) {
        this.FlightName = FlightName;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getOrigin() {
        return Origin;
    }

    public void setOrigin(String Origin) {
        this.Origin = Origin;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String Destination) {
        this.Destination = Destination;
    }


    public String getDateSection() {
        return DateSection;
    }

    public void setDateSection(String DateSection) {
        this.DateSection = DateSection;
    }
    @Override
    public String toString(){
        return FlightName;
    }

 
   
}
