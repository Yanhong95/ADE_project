/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import java.util.ArrayList;
/**
 *
 * @author yanhongchen
 */
public class AirlinerDirectory {
    private ArrayList<Airliner> airlinerDir;
//    private FlightDirectory flightDirectory;

//    public FlightDirectory getFlightDirectory() {
//        return flightDirectory;
//    }
    
    public AirlinerDirectory() {
        airlinerDir=new ArrayList<Airliner>();
//        flightDirectory= new FlightDirectory();
    } 
    
    public ArrayList<Airliner> getAirlinerDir() {
        return airlinerDir;
    }
    
    public Airliner addAirliner(){
        Airliner a = new Airliner();
        airlinerDir.add(a);
        return a;
    }
      
    public void removeAirliner(Airliner a){
        airlinerDir.remove(a);
    }
   
    public Airliner searchAirliner(String airlinerName){
        for (Airliner a : airlinerDir){
            if(airlinerName.equals(a.getAirlinerName())){
                return a;
            }
        }
        return null;
    }
      
    
}
