/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package splashscreenexample;

import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class SplashScreen extends javax.swing.JFrame {

    /** Creates new form SplashScreen */
    public SplashScreen() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackGroundPanel = new javax.swing.JPanel();
        Lines = new javax.swing.JLabel();
        DoctorsTeams = new javax.swing.JLabel();
        LoadingLabel = new javax.swing.JLabel();
        LoadingBar = new javax.swing.JProgressBar();
        LoadngValue = new javax.swing.JLabel();
        BackgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BackGroundPanel.setBackground(new java.awt.Color(0, 255, 255));
        BackGroundPanel.setPreferredSize(new java.awt.Dimension(1550, 880));
        BackGroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Lines.setIcon(new javax.swing.ImageIcon(getClass().getResource("/splashscreenexample/Assets/6502197_preview-removebg-preview.png"))); // NOI18N
        BackGroundPanel.add(Lines, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 370, 430, 60));

        DoctorsTeams.setIcon(new javax.swing.ImageIcon(getClass().getResource("/splashscreenexample/Assets/male-medical-professional-clinic-doctor-260nw-1927935119-removebg-preview.png"))); // NOI18N
        BackGroundPanel.add(DoctorsTeams, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 630, 480, 230));

        LoadingLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        LoadingLabel.setForeground(new java.awt.Color(255, 255, 255));
        LoadingLabel.setText("Loading .....");
        BackGroundPanel.add(LoadingLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 820, 280, -1));
        BackGroundPanel.add(LoadingBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 860, 1550, -1));

        LoadngValue.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LoadngValue.setForeground(new java.awt.Color(255, 255, 255));
        LoadngValue.setText("0%");
        BackGroundPanel.add(LoadngValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(1500, 830, 50, -1));

        BackgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/splashscreenexample/Assets/Frame 7.png"))); // NOI18N
        BackGroundPanel.add(BackgroundImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1550, 880));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BackGroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BackGroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        SplashScreen sp = new SplashScreen ();
        sp.setVisible(true);
       
        try {
            for(int i=0;i<=100;i++){
                Thread.sleep(100);
                sp.LoadngValue.setText(i + "%");
                
                if(i==10){
                    sp.LoadingLabel.setText("Turning On Modules...");
                }
                if(i==20){
                    sp.LoadingLabel.setText("Loading Modules...");
                }
                if(i==50){
                    sp.LoadingLabel.setText("Connecting to Database...");
                }
                if(i==70){
                    sp.LoadingLabel.setText("Connecting Successful");
                }
                if(i==80){
                    sp.LoadingLabel.setText("Launching PROPENVAK");
                }
                sp.LoadingBar.setValue(i);
            }
        } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
        }
          new Cobakosong().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackGroundPanel;
    private javax.swing.JLabel BackgroundImage;
    private javax.swing.JLabel DoctorsTeams;
    private javax.swing.JLabel Lines;
    private javax.swing.JProgressBar LoadingBar;
    private javax.swing.JLabel LoadingLabel;
    private javax.swing.JLabel LoadngValue;
    // End of variables declaration//GEN-END:variables

}
