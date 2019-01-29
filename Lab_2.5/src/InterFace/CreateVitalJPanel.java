/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterFace;
import Business.VitalSignHistory;
import Business.VitalSigns;
import javax.swing.JOptionPane;
/**
 *
 * @author yanhongchen
 */
public class CreateVitalJPanel extends javax.swing.JPanel {

    /**
     * Creates new form MainVitalJPanel
     */
   
    private VitalSignHistory VSHistory;
    public CreateVitalJPanel(VitalSignHistory VSHistory) {
        initComponents();
        this.VSHistory=VSHistory;
      }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dateTextField = new javax.swing.JTextField();
        pulseTextField = new javax.swing.JTextField();
        presureTextField = new javax.swing.JTextField();
        temperatureTextField = new javax.swing.JTextField();
        saveBtn = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("Create Vital Signs");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, -1, 31));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel2.setText("Temperature :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 108, 34));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel3.setText("Pulse :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 50, 34));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel4.setText("Blood Pressure :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 130, 34));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel5.setText("Date :");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 50, 34));

        dateTextField.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        add(dateTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 170, -1));

        pulseTextField.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        add(pulseTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 170, -1));

        presureTextField.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        add(presureTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 170, -1));

        temperatureTextField.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        add(temperatureTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 170, -1));

        saveBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        add(saveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 100, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        double temperature= Double.parseDouble(temperatureTextField.getText());
        double presure=Double.parseDouble(presureTextField.getText());
        int pulse=Integer.parseInt(pulseTextField.getText());
        String data=dateTextField.getText();
        VitalSigns v = VSHistory.addVitals();
        v.setBloodpressure(presure);
        v.setDate(data);
        v.setPluse(pulse);
        v.setTemperature(temperature);
        JOptionPane.showMessageDialog(null, "VitalSigns Added Successfully ");
        temperatureTextField.setText("");
        presureTextField.setText("");
        pulseTextField.setText("");
        dateTextField.setText("");
        
    }//GEN-LAST:event_saveBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dateTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField presureTextField;
    private javax.swing.JTextField pulseTextField;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTextField temperatureTextField;
    // End of variables declaration//GEN-END:variables
}