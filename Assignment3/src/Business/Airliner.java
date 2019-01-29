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
public class Airliner {
     private String airlinerName;
     private String airlinerAddress;
     private int totalFlightsPerDay;
     private FlightDirectory flightDirectory;

    public Airliner() {
        this.flightDirectory=new FlightDirectory();
    }
    
    public FlightDirectory getFlightDirectory() {
        return flightDirectory;
    }
    
    public String getAirlinerName() {
        return airlinerName;
    }

    public void setAirlinerName(String airlinerName) {
        this.airlinerName = airlinerName;
    }

    public String getAirlinerAddress() {
        return airlinerAddress;
    }

    public void setAirlinerAddress(String airlinerAddress) {
        this.airlinerAddress = airlinerAddress;
    }

    public int getTotalFlightsPerDay() {
        return totalFlightsPerDay;
    }

    public void setTotalFlightsPerDay(int totalFlightsPerDay) {
        this.totalFlightsPerDay = totalFlightsPerDay;
    }

    @Override
    public String toString(){
        return airlinerName;
    }

     
}
