/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.ManageCustomer;

import Business.AirlinerDirectory;
import Business.Flight;
import Business.Airliner;
import Business.Customer;
import Business.FlightDirectory;
import Business.Ticket;
import Interface.ManageFlights.ViewFlightDetailJPanel;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yanhongchen
 */
public class BookTicketJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BookTicketJPanel
     */
    JPanel userProcessContainer;
    AirlinerDirectory airlinerDirectory;
    FlightDirectory flightDirectory;
    Airliner airliner;
    Customer customer;
    BookTicketJPanel(JPanel userProcessContainer, AirlinerDirectory airlinerDirectory, FlightDirectory flightDirectory, Airliner airliner, Customer customer) {
        initComponents();
        this.airliner= airliner;
        this.airlinerDirectory=airlinerDirectory;
        this.userProcessContainer=userProcessContainer;
        this.flightDirectory=flightDirectory;
        this.customer=customer;
        refreshTable();
    }
        private void refreshTable() {
        int rowCount = viewTable.getRowCount();
        DefaultTableModel model = (DefaultTableModel)viewTable.getModel();
        for(int i=rowCount-1;i>=0;i--) {
            model.removeRow(i);
        }
        for(Airliner a : airlinerDirectory.getAirlinerDir()){
           for(Flight f : a.getFlightDirectory().getFlightDir()){
               Object row[] = new Object[model.getColumnCount()];
               row[0]=a;
               row[1]=f;
               row[2]=f.getDate();
               row[3]=f.getDateSection();
               row[4]=f.getOrigin();
               row[5]=f.getDestination();
               model.addRow(row);            
            }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        viewTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        keyTxt = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        bookBtn = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        viewTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "AirlinerName", "FlightName", "Date", "Date Section", "Origin", "Destination"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(viewTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 550, 110));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("Total Flights");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, -1, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel4.setText("Search Flight");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, -1, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel3.setText("Enter your key word :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, -1, -1));

        keyTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyTxtActionPerformed(evt);
            }
        });
        add(keyTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 160, 40));

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        add(searchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 160, 40));

        backBtn.setText("<<Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, -1, -1));

        bookBtn.setText("Book");
        bookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookBtnActionPerformed(evt);
            }
        });
        add(bookBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 160, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        int row = viewTable.getRowCount();
        if(row<1) {
            JOptionPane.showMessageDialog(null, "empty filght", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Flight f = new Flight();
        f.setFlightName(keyTxt.getText());
        f.setDate(keyTxt.getText());
        f.setDateSection(keyTxt.getText());
        f.setOrigin(keyTxt.getText());
        f.setDestination(keyTxt.getText());  
        ArrayList<Flight> air=flightDirectory.searchFlightTicket(f);   
     
 //     System.out.println(air.get(0).getFlightName());
 
        int rowCount = viewTable.getRowCount();
        DefaultTableModel model = (DefaultTableModel)viewTable.getModel();
        for(int i=rowCount-1;i>=0;i--) {
            model.removeRow(i);
        }
//      for (int i = 0; i < air.size(); i++) {
//      Flight fl = air.get(i);
        for (Flight fl : air) {
        Object r[] = new Object[model.getColumnCount()];
        r[0]=fl;
        r[1]=fl.getDate();
        r[2]=fl.getDateSection();
        r[3]=fl.getOrigin();
        r[4]=fl.getDestination();	
        model.addRow(r); 
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void keyTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keyTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_keyTxtActionPerformed

    private void bookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookBtnActionPerformed
        // TODO add your handling code here:
        int row = viewTable.getSelectedRow();
        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a flight from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Flight f = (Flight)viewTable.getValueAt(row,1);
        TicketJPanel tjp = new TicketJPanel(userProcessContainer, f ,customer);
        userProcessContainer.add("TicketJPanel", tjp);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_bookBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton bookBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField keyTxt;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTable viewTable;
    // End of variables declaration//GEN-END:variables
}
