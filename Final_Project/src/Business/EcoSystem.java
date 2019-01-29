/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Book.BookDirectory;
import Business.Network.Network;
import Business.Organization.Organization;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    private ArrayList<Network> networkList;
    private BookDirectory bookDirectory;
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
    public Network createAndAddNetwork(){
        Network network=new Network();
        networkList.add(network);
        return network;
    }

    private EcoSystem(){
        super(null);
        networkList=new ArrayList<Network>();
        this.bookDirectory = new BookDirectory();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    
    public BookDirectory getBookDirectory() {
        return bookDirectory;
    }

    public void setBookDirectory(BookDirectory bookDirectory) {
        this.bookDirectory = bookDirectory;
    }
    public boolean checkIfUserIsUnique(String userName){
       // if(!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
       //     return false;
       // }
        for(Network network:networkList){
            
        }
        return true;
    }
}
