/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Gopal Roy
 */
public class choose_compressions extends javax.swing.JFrame {

    /**
     * Creates new form choose_compressions
     */
    public choose_compressions() {
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

        GZ_FORMAT = new javax.swing.JButton();
        Zip_format = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        close = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 260));
        setMinimumSize(new java.awt.Dimension(600, 260));
        setPreferredSize(new java.awt.Dimension(600, 260));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        GZ_FORMAT.setBackground(new java.awt.Color(0, 255, 0));
        GZ_FORMAT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        GZ_FORMAT.setText("gz Format");
        GZ_FORMAT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GZ_FORMAT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GZ_FORMATActionPerformed(evt);
            }
        });
        getContentPane().add(GZ_FORMAT, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, -1));

        Zip_format.setBackground(new java.awt.Color(0, 255, 0));
        Zip_format.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Zip_format.setText("zip Format");
        Zip_format.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Zip_format.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Zip_formatActionPerformed(evt);
            }
        });
        getContentPane().add(Zip_format, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 255, 204));
        jLabel1.setText("Choose type in which you want to convert");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        close.setBackground(new java.awt.Color(255, 51, 0));
        close.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        close.setText("close");
        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/istockphoto-1368237807-170667a.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GZ_FORMATActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GZ_FORMATActionPerformed
        // TODO add your handling code here:
                JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File file = chooser.getSelectedFile();
        String filePath = file.getAbsolutePath();
         try{
                    Compress_algos.gzcompress(file);
                }
                catch(Exception excp){
                    JOptionPane.showMessageDialog(null, excp.toString());
                }
         JOptionPane.showMessageDialog(null,"It is done");
    }//GEN-LAST:event_GZ_FORMATActionPerformed

    private void Zip_formatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Zip_formatActionPerformed
        // TODO add your handling code here:
                        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File file = chooser.getSelectedFile();
        String filePath = file.getAbsolutePath();
         try{
                    Compress_algos.zipcompress(file);
                }
                catch(Exception excp){
                    JOptionPane.showMessageDialog(null, excp.toString());
                }
         JOptionPane.showMessageDialog(null,"It is done");
    }//GEN-LAST:event_Zip_formatActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        // TODO add your handling code here:
                 int res = JOptionPane.showConfirmDialog(null,"Are you sure that you want to exit");
                if(res ==0){
                    setVisible(false);
                    
                }
                Home frame = new Home();
                frame.setVisible(true);
    }//GEN-LAST:event_closeActionPerformed

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
            java.util.logging.Logger.getLogger(choose_compressions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(choose_compressions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(choose_compressions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(choose_compressions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new choose_compressions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GZ_FORMAT;
    private javax.swing.JButton Zip_format;
    private javax.swing.JButton close;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
