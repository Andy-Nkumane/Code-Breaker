/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code_breaker;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nkuma
 */
public class Help extends javax.swing.JFrame {

    /**
     * Creates new form Help
     */
    public Help() {
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

        jtpHelp = new javax.swing.JTabbedPane();
        jpHelp = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaHelp = new javax.swing.JTextArea();
        jpWorks = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtaWorks = new javax.swing.JTextArea();
        jpPlay = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtaPlay = new javax.swing.JTextArea();
        jpHint = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtaHint = new javax.swing.JTextArea();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jtaHelp.setColumns(20);
        jtaHelp.setRows(5);
        jtaHelp.setText("help");
        jScrollPane1.setViewportView(jtaHelp);

        javax.swing.GroupLayout jpHelpLayout = new javax.swing.GroupLayout(jpHelp);
        jpHelp.setLayout(jpHelpLayout);
        jpHelpLayout.setHorizontalGroup(
            jpHelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
        );
        jpHelpLayout.setVerticalGroup(
            jpHelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
        );

        jtpHelp.addTab("Help", jpHelp);

        jtaWorks.setColumns(20);
        jtaWorks.setRows(5);
        jtaWorks.setText("how it works");
        jScrollPane2.setViewportView(jtaWorks);

        javax.swing.GroupLayout jpWorksLayout = new javax.swing.GroupLayout(jpWorks);
        jpWorks.setLayout(jpWorksLayout);
        jpWorksLayout.setHorizontalGroup(
            jpWorksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
        );
        jpWorksLayout.setVerticalGroup(
            jpWorksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
        );

        jtpHelp.addTab("How it works", jpWorks);

        jtaPlay.setColumns(20);
        jtaPlay.setRows(5);
        jtaPlay.setText("how to play");
        jScrollPane3.setViewportView(jtaPlay);

        javax.swing.GroupLayout jpPlayLayout = new javax.swing.GroupLayout(jpPlay);
        jpPlay.setLayout(jpPlayLayout);
        jpPlayLayout.setHorizontalGroup(
            jpPlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
        );
        jpPlayLayout.setVerticalGroup(
            jpPlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
        );

        jtpHelp.addTab("How to play", jpPlay);

        jtaHint.setColumns(20);
        jtaHint.setRows(5);
        jtaHint.setText("helpful strategic hint");
        jScrollPane4.setViewportView(jtaHint);

        javax.swing.GroupLayout jpHintLayout = new javax.swing.GroupLayout(jpHint);
        jpHint.setLayout(jpHintLayout);
        jpHintLayout.setHorizontalGroup(
            jpHintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
        );
        jpHintLayout.setVerticalGroup(
            jpHintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
        );

        jtpHelp.addTab("Helpful strategic hint", jpHint);

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtpHelp)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jtpHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBack)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jtpHelp.getAccessibleContext().setAccessibleName("tab 1");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        Menu mMenu = new Menu();
        mMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        File help = new File("Code Breaker Help.txt");
        try {
            Scanner rHelp = new Scanner(help);
            jtaHelp.setText("");
            while (rHelp.hasNextLine()) jtaHelp.setText(jtaHelp.getText() + "\n" + rHelp.nextLine());
            rHelp.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Help.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        File works = new File("How It Works.txt");
        try {
            Scanner rWorks = new Scanner(works);
            jtaWorks.setText("");
            while (rWorks.hasNextLine()) jtaWorks.setText(jtaWorks.getText() + "\n" + rWorks.nextLine());
            rWorks.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Help.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        File play = new File("How To Play.txt");
        try {
            Scanner rPlay = new Scanner(play);
            jtaPlay.setText("");
            while (rPlay.hasNextLine()) jtaPlay.setText(jtaPlay.getText() + "\n" + rPlay.nextLine());
            rPlay.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Help.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        File hint = new File("Helpful Strategic Hint.txt");
        try {
            Scanner rHint = new Scanner(hint);
            jtaHint.setText("");
            while (rHint.hasNextLine()) jtaHint.setText(jtaHint.getText() + "\n" + rHint.nextLine());
            rHint.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Help.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formComponentShown

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
            java.util.logging.Logger.getLogger(Help.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Help.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Help.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Help.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Help().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPanel jpHelp;
    private javax.swing.JPanel jpHint;
    private javax.swing.JPanel jpPlay;
    private javax.swing.JPanel jpWorks;
    private javax.swing.JTextArea jtaHelp;
    private javax.swing.JTextArea jtaHint;
    private javax.swing.JTextArea jtaPlay;
    private javax.swing.JTextArea jtaWorks;
    private javax.swing.JTabbedPane jtpHelp;
    // End of variables declaration//GEN-END:variables
}
