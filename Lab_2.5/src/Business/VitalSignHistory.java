/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yanhongchen
 */
public class VitalSignHistory {
    private ArrayList<VitalSigns> VitalSignHistory;
    private List<VitalSigns>AbnormalList;

    public List<VitalSigns> getAbnormalList() {
        return AbnormalList;
    }

    public void setAbnormalList(List<VitalSigns> AbnormalList) {
        this.AbnormalList = AbnormalList;
    }
    
    private double maxbp;
    private double minbo;

    public double getMaxbp() {
        return maxbp;
    }

    public void setMaxbp(double maxbp) {
        this.maxbp = maxbp;
    }

    public double getMinbo() {
        return minbo;
    }

    public void setMinbo(double minbo) {
        this.minbo = minbo;
    }
    
    public VitalSignHistory(){
        VitalSignHistory=new ArrayList<VitalSigns>();
    }

    public ArrayList<VitalSigns> getVitalsignHistory() {
        return VitalSignHistory;
    }

    public void setVitalsignHistory(ArrayList<VitalSigns> VitalsignHistory) {
        this.VitalSignHistory = VitalsignHistory;
    }
    
    public VitalSigns addVitals(){
        VitalSigns vs= new VitalSigns();
        VitalSignHistory.add(vs);
        return vs;
    }
    public void deleteVitals(VitalSigns v){
        VitalSignHistory.remove(v);    
    } 
 
    
   public List<VitalSigns>getAbnormalList(double maxbp,double minbp){
        List<VitalSigns>abnList=new ArrayList<>();
        for(VitalSigns vs:VitalSignHistory){
            if(vs.getBloodpressure()>maxbp || vs.getBloodpressure()<minbp){
                abnList.add(vs);
            }
        }
        return abnList;
    }
}
