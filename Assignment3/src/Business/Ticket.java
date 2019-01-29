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
public class Ticket {
    private int row;
    private int column;
    private String Name;
    private String FlightId;

    public Ticket() {
        this.row = row;
        this.column = column;
        this.FlightId = FlightId;
        this.Name = Name;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getFlightId() {
        return FlightId;
    }

    public void setFlightId(String FlightId) {
        this.FlightId = FlightId;
    }
   @Override
    public String toString(){
        return Name;
    }
    
}
