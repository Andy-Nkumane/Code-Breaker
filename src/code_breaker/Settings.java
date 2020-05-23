/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code_breaker;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nkuma
 */
public class Settings extends javax.swing.JFrame {

    /**
     * Creates new form Settings
     */
    public Settings() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCancel = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jsLength = new javax.swing.JSlider();
        lblLength = new javax.swing.JLabel();
        jcbDifficulty = new javax.swing.JComboBox<>();
        lblAttempt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Settings");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jsLength.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jsLengthMouseDragged(evt);
            }
        });
        jsLength.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jsLengthMouseClicked(evt);
            }
        });

        lblLength.setText("Length");

        jcbDifficulty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbDifficulty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbDifficultyActionPerformed(evt);
            }
        });

        lblAttempt.setText("Attempts");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(btnCancel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 238, Short.MAX_VALUE)
                .addComponent(btnSave)
                .addGap(91, 91, 91))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLength)
                .addGap(76, 76, 76))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jsLength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jcbDifficulty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addComponent(lblAttempt)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(lblLength)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jsLength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbDifficulty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAttempt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 253, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel)
                    .addComponent(btnSave))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        try {
            FileWriter newSettings = new FileWriter("Settings.txt");
            newSettings.write(jsLength.getValue() + "\n" + jcbDifficulty.getSelectedItem() + Attempts());
            newSettings.close();
        } catch (IOException ex) {
            Logger.getLogger(Settings.class.getName()).log(Level.SEVERE, null, ex);
        }
        Menu mMenu = new Menu();
        mMenu.setVisible(true);
        mMenu.setSize(500, 410);
        dispose();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        Menu mMenu = new Menu();
        mMenu.setVisible(true);
        mMenu.setSize(500, 410);
        dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        jcbDifficulty.removeAllItems();
        jcbDifficulty.addItem("Easy");
        jcbDifficulty.addItem("Medium");
        jcbDifficulty.addItem("Hard");
        jcbDifficulty.addItem("Unlimited");
        File settings = new File("Settings.txt");
        if (settings.exists() == false) {
            try {
                settings.createNewFile();
                jsLength.setValue(3);
                jcbDifficulty.setSelectedItem("Easy");
                lblAttempt.setText(String.valueOf(Attempts()));
            } catch (IOException ex) {
                Logger.getLogger(Settings.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else {
            try {
                Scanner read = new Scanner(settings);
                int len = Integer.parseInt(read.nextLine());
                String diff = read.nextLine();
                jsLength.setValue(len);
                jcbDifficulty.setSelectedItem(diff.replaceAll("\\d+",""));
                if ("Unlimited".equals(diff)) lblAttempt.setText("Infinity");
                else lblAttempt.setText(diff.replaceAll("\\D+",""));
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Settings.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        jsLength.setMaximum(9);
        jsLength.setMinimum(3);
        lblLength.setText(String.valueOf(getLength()));
    }//GEN-LAST:event_formComponentShown

    private void jsLengthMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jsLengthMouseDragged
        // TODO add your handling code here:
        lblLength.setText(String.valueOf(getLength()));
        if ("Unlimited".equals(jcbDifficulty.getSelectedItem())) lblAttempt.setText("Infinity");
        else lblAttempt.setText(String.valueOf(Attempts()));
    }//GEN-LAST:event_jsLengthMouseDragged

    private void jsLengthMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jsLengthMouseClicked
        // TODO add your handling code here:
        lblLength.setText(String.valueOf(getLength()));
        if ("Unlimited".equals(jcbDifficulty.getSelectedItem())) lblAttempt.setText("Infinity");
        else lblAttempt.setText(String.valueOf(Attempts()));
    }//GEN-LAST:event_jsLengthMouseClicked

    private void jcbDifficultyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbDifficultyActionPerformed
        // TODO add your handling code here:
        if ("Unlimited".equals(jcbDifficulty.getSelectedItem())) lblAttempt.setText("Infinity");
        else lblAttempt.setText(String.valueOf(Attempts()));
    }//GEN-LAST:event_jcbDifficultyActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Settings().setVisible(true);
            }
        });
    }
    
    int getLength(){
        return(jsLength.getValue());
    }
    
    int Attempts(){
        if (jcbDifficulty.getSelectedItem() == "Easy"){
            if (jsLength.getValue() == 3) return 14;
            else if (jsLength.getValue() == 4) return 16;
            else if (jsLength.getValue() == 5) return 18;
            else if (jsLength.getValue() == 6) return 20;
            else if (jsLength.getValue() == 7) return 24;
            else if (jsLength.getValue() == 8) return 28;
            else if (jsLength.getValue() == 9) return 30;
        } 
        else if (jcbDifficulty.getSelectedItem() == "Medium"){
            if (jsLength.getValue() == 3) return 10;
            else if (jsLength.getValue() == 4) return 12;
            else if (jsLength.getValue() == 5) return 14;
            else if (jsLength.getValue() == 6) return 16;
            else if (jsLength.getValue() == 7) return 20;
            else if (jsLength.getValue() == 8) return 24;
            else if (jsLength.getValue() == 9) return 26;
        }
        else if (jcbDifficulty.getSelectedItem() == "Hard"){
            if (jsLength.getValue() == 3) return 6;
            else if (jsLength.getValue() == 4) return 8;
            else if (jsLength.getValue() == 5) return 10;
            else if (jsLength.getValue() == 6) return 12;
            else if (jsLength.getValue() == 7) return 16;
            else if (jsLength.getValue() == 8) return 20;
            else if (jsLength.getValue() == 9) return 22;
        }
        return 0;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> jcbDifficulty;
    private javax.swing.JSlider jsLength;
    private javax.swing.JLabel lblAttempt;
    private javax.swing.JLabel lblLength;
    // End of variables declaration//GEN-END:variables

    private String toString(int length) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
