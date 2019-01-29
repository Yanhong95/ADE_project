/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author yanhongchen
 */
public class FlightDirectory {
    private ArrayList<Flight> flightDir;
    
    public FlightDirectory(){
        flightDir=new ArrayList<Flight>();
    }

    public ArrayList<Flight> getFlightDir() {
        return flightDir;
    }
    public Flight addFlight(){
        Flight f = new Flight();
        flightDir.add(f);
        return f; 
    }
    
    public void removeFlight(Flight f){
        flightDir.remove(f);
    }
    
    public Flight searchFlight(String flightName){
        for (Flight f: flightDir){
            if(f.getFlightName().equals(flightName)){
            return f;
            }else{
            JOptionPane.showMessageDialog(null, "Unable to find it", "Warning", JOptionPane.WARNING_MESSAGE);
            }                  
        } 
        return null;
    }
      public ArrayList<Flight> searchFlightTicket(Flight f){
        ArrayList<Flight> result = new ArrayList<>();
        for (Flight tmp : flightDir) {
//          for (int i = 0; i<flightDir.size(); i++){
//          Flight tmp = flightDir.get(i);
            if((f.getFlightName()==null || tmp.getFlightName().equals(f.getFlightName()))
            ||(f.getDate()==null||tmp.getDate().equals(f.getDate()))
            ||(f.getDateSection()==null||tmp.getDate().equals(f.getDateSection()))
            ||(f.getOrigin()==null||tmp.getOrigin().equals(f.getOrigin()))
            ||(f.getDestination()==null||tmp.getDestination().equals(f.getDestination()))){ 
            result.add(tmp);
            }
        } 
        return result;
    }
}
