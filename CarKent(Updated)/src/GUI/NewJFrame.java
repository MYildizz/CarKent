package GUI;


import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gurkan
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    
    public NewJFrame() {
        initComponents();
        j1.setText(null);
        j2.setText(null);
        jPanel3.setVisible(false);
        jPanel2.setVisible(true);
        
      
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        j1 = new javax.swing.JTextField();
        j2 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.CardLayout());

        jPanel2.setLayout(null);

        jRadioButton1.setText("Admin");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButton1);
        jRadioButton1.setBounds(870, 70, 107, 25);

        jRadioButton2.setText("Customer");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButton2);
        jRadioButton2.setBounds(1025, 70, 110, 25);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/0+light_grey_wTexture_3000x3000.jpg"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 0, 1180, 660);

        jPanel1.add(jPanel2, "card2");

        jPanel3.setLayout(null);

        jRadioButton3.setText("Admin");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jRadioButton3);
        jRadioButton3.setBounds(870, 70, 65, 25);

        jRadioButton4.setText("Customer");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jRadioButton4);
        jRadioButton4.setBounds(1025, 70, 83, 25);

        jLabel4.setText("ID");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(860, 200, 60, 16);

        jLabel5.setText("Password");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(860, 250, 80, 16);
        jPanel3.add(j1);
        j1.setBounds(980, 200, 130, 30);
        jPanel3.add(j2);
        j2.setBounds(980, 250, 130, 30);

        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(940, 300, 63, 25);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/0+light_grey_wTexture_3000x3000.jpg"))); // NOI18N
        jPanel3.add(jLabel2);
        jLabel2.setBounds(0, 0, 1180, 660);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel6);
        jPanel6.setBounds(880, 390, 220, 160);

        jPanel1.add(jPanel3, "card3");

        jPanel4.setLayout(null);

        jRadioButton5.setText("Admin");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });
        jPanel4.add(jRadioButton5);
        jRadioButton5.setBounds(870, 70, 65, 25);

        jRadioButton6.setText("Customer");
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });
        jPanel4.add(jRadioButton6);
        jRadioButton6.setBounds(1025, 70, 83, 25);

        jLabel6.setText("Name");
        jPanel4.add(jLabel6);
        jLabel6.setBounds(830, 170, 70, 16);

        jLabel7.setText("Surname");
        jPanel4.add(jLabel7);
        jLabel7.setBounds(830, 210, 60, 16);

        jLabel8.setText("Idendity Number");
        jPanel4.add(jLabel8);
        jLabel8.setBounds(830, 250, 100, 16);

        jLabel9.setText("Profession");
        jPanel4.add(jLabel9);
        jLabel9.setBounds(830, 290, 70, 16);

        jLabel10.setText("Gender");
        jPanel4.add(jLabel10);
        jLabel10.setBounds(830, 330, 41, 16);
        jPanel4.add(jTextField2);
        jTextField2.setBounds(1010, 160, 90, 22);
        jPanel4.add(jTextField3);
        jTextField3.setBounds(1010, 200, 90, 22);
        jPanel4.add(jTextField4);
        jTextField4.setBounds(1010, 240, 90, 22);
        jPanel4.add(jTextField5);
        jTextField5.setBounds(1010, 280, 90, 22);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male\t", "Female" }));
        jPanel4.add(jComboBox1);
        jComboBox1.setBounds(1010, 320, 90, 22);

        jButton2.setText("Next");
        jPanel4.add(jButton2);
        jButton2.setBounds(950, 390, 57, 25);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/0+light_grey_wTexture_3000x3000.jpg"))); // NOI18N
        jPanel4.add(jLabel3);
        jLabel3.setBounds(0, 0, 1180, 650);

        jPanel1.add(jPanel4, "card4");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1175, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 654, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, "card5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        jPanel2.setVisible(false);
        jPanel3.setVisible(true);
        jPanel4.setVisible(false);
        jRadioButton2.setSelected(false);
        jRadioButton3.setSelected(true);
        jRadioButton4.setSelected(false);
        jRadioButton5.setSelected(true);
        jRadioButton6.setSelected(false);
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        jPanel2.setVisible(false);
        jPanel3.setVisible(false);
        jPanel4.setVisible(true);
        jRadioButton2.setSelected(true);
        jRadioButton3.setSelected(false);
        jRadioButton4.setSelected(true);
        jRadioButton5.setSelected(false);
        jRadioButton6.setSelected(true);
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
        jPanel2.setVisible(false);
        jPanel3.setVisible(true);
        jPanel4.setVisible(false);
        jRadioButton2.setSelected(false);
        jRadioButton1.setSelected(true);
        jRadioButton4.setSelected(false);
        jRadioButton5.setSelected(true);
        jRadioButton6.setSelected(false);
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        // TODO add your handling code here:
        jPanel2.setVisible(false);
        jPanel3.setVisible(true);
        jPanel4.setVisible(false);
        jRadioButton2.setSelected(false);
        jRadioButton3.setSelected(true);
        jRadioButton4.setSelected(false);
        jRadioButton1.setSelected(true);
        jRadioButton6.setSelected(false);
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
        jPanel2.setVisible(false);
        jPanel3.setVisible(false);
        jPanel4.setVisible(true);
        jRadioButton2.setSelected(true);
        jRadioButton3.setSelected(false);
        jRadioButton4.setSelected(true);
        jRadioButton5.setSelected(false);
        jRadioButton6.setSelected(true);
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
        // TODO add your handling code here:
        jPanel2.setVisible(false);
        jPanel3.setVisible(false);
        jPanel4.setVisible(true);
        jRadioButton2.setSelected(true);
        jRadioButton3.setSelected(false);
        jRadioButton4.setSelected(true);
        jRadioButton5.setSelected(false);
        jRadioButton6.setSelected(true);
    }//GEN-LAST:event_jRadioButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String s=j1.getText();
        String s2=j2.getText();
        if ((s.equalsIgnoreCase("bygurkan123") && s2.equals("Ankara103")) || (s.equalsIgnoreCase("CrazyBoy") && s2.equals("332211asd"))) {
            JOptionPane.showMessageDialog(rootPane, "Login is successfull, You have transformed to Admin Panel");
            Admin a=new Admin();
            this.setVisible(false);
            a.setVisible(true);
           
            this.setVisible(false);
        }
        else if(s.equals("") || s2.equals(""))
            JOptionPane.showMessageDialog(rootPane, "Please fill in the blanks");
        
        else if((!s.equals("bygurkan123") || !s2.equalsIgnoreCase("Ankara103")))
            JOptionPane.showMessageDialog(rootPane, "ID or PASSWORD is incorrect");
           
       
            
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        // TODO add your handling code here:
        String s=j1.getText();
        String s2=j2.getText();
        if ((s.equalsIgnoreCase("bygurkan123") && s2.equals("Ankara103")) || (s.equalsIgnoreCase("CrazyBoy") && s2.equals("332211asd"))) {
            JOptionPane.showMessageDialog(rootPane, "Login is successfull, You have transformed to Admin Panel");
            Admin a=new Admin();
            this.setVisible(false);
            a.setVisible(true);
           
            this.setVisible(false);
        }
        else if(s.equals("") || s2.equals(""))
            JOptionPane.showMessageDialog(rootPane, "Please fill in the blanks");
        
        else if((!s.equals("bygurkan123") || !s2.equalsIgnoreCase("Ankara103")))
            JOptionPane.showMessageDialog(rootPane, "ID or PASSWORD is incorrect");
    }//GEN-LAST:event_jButton1KeyPressed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField j1;
    private javax.swing.JPasswordField j2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}