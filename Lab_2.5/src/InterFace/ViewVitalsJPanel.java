/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterFace;
import Business.VitalSignHistory;
import Business.VitalSigns;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author yanhongchen
 */
public class ViewVitalsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewVitalsJPanel
     */
    private VitalSignHistory VSHistory;
    public ViewVitalsJPanel(VitalSignHistory VSHistory) {
        initComponents();
        this.VSHistory=VSHistory;
        populateTable();
    }
    public void populateTable()
    {
        DefaultTableModel dtm =(DefaultTableModel)vitalSignsTbl.getModel();
        dtm.setRowCount(0);
        for(VitalSigns vs :VSHistory.getVitalsignHistory())
        {
            Object row[]=new Object[2];
            row[0]=vs;
            row[1]=vs.getBloodpressure();
            dtm.addRow(row);
            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        vitalSignsTbl = new javax.swing.JTable();
        detailBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dateTextField = new javax.swing.JTextField();
        pulseTextField = new javax.swing.JTextField();
        presureTextField = new javax.swing.JTextField();
        temperatureTextField = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(530, 530));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel6.setText("View Vital Signs");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, -1, -1));

        vitalSignsTbl.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        vitalSignsTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Blood Pressure"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(vitalSignsTbl);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 450, 130));

        detailBtn.setText("ViewDetails");
        detailBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detailBtnActionPerformed(evt);
            }
        });
        add(detailBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, -1, -1));

        DeleteBtn.setText("Delete");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });
        add(DeleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, -1, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel2.setText("Temperature :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 108, 34));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel3.setText("Pulse :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 50, 34));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel4.setText("Blood Pressure :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 130, 34));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel5.setText("Date :");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 50, 34));

        dateTextField.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        add(dateTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 400, 170, -1));

        pulseTextField.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        add(pulseTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 170, -1));

        presureTextField.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        add(presureTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 170, -1));

        temperatureTextField.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        add(temperatureTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 170, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        // TODO add your handling code here:
        int selectedrow= vitalSignsTbl.getSelectedRow();
        if (selectedrow >=0)
        {
           VitalSigns vs =(VitalSigns)vitalSignsTbl.getValueAt(selectedrow, 0);
           VSHistory.deleteVitals(vs);
           JOptionPane.showMessageDialog(null,"Vital sign has been deleted");
           populateTable();
        }
        else
            JOptionPane.showMessageDialog(null,"Please Select any row");
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void detailBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detailBtnActionPerformed
        // TODO add your handling code here:
        int selectedrow= vitalSignsTbl.getSelectedRow();
        if (selectedrow >=0)
        {
            VitalSigns vs =(VitalSigns)vitalSignsTbl.getValueAt(selectedrow, 0);
            temperatureTextField.setText(String.valueOf(vs.getTemperature()));
            presureTextField.setText(String.valueOf(vs.getBloodpressure()));
            pulseTextField.setText(String.valueOf(vs.getPluse()));
            dateTextField.setText(String.valueOf(vs.getPluse()));
        
        }
        else
            JOptionPane.showMessageDialog(null,"Please Select any row");
    }//GEN-LAST:event_detailBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JTextField dateTextField;
    private javax.swing.JButton detailBtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField presureTextField;
    private javax.swing.JTextField pulseTextField;
    private javax.swing.JTextField temperatureTextField;
    private javax.swing.JTable vitalSignsTbl;
    // End of variables declaration//GEN-END:variables
}
