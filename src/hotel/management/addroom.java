/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hotel.management;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 *
 * @author Jitender
 */
public class addroom extends javax.swing.JFrame {

    ArrayList arr = new ArrayList();

    /**
     * Creates new form addroom
     */
    public addroom() {
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

        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jclass = new javax.swing.JTextField();
        jbed = new javax.swing.JTextField();
        jfloor = new javax.swing.JTextField();
        jac = new javax.swing.JTextField();
        jprize = new javax.swing.JTextField();
        jroom = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(0, 0,0,80));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Back");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 40));

        jLabel2.setFont(new java.awt.Font("Lucida Calligraphy", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Hotel Management System");
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 90));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Class");
        jLabel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 140, 40));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Room No");
        jLabel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 140, 40));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Beds");
        jLabel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 140, 40));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Floor");
        jLabel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 140, 40));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("AC/Non-AC");
        jLabel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 140, 40));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Prize");
        jLabel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 140, 40));

        jclass.setBackground(new java.awt.Color(0, 0,0,80));
        jclass.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jclass, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 180, 40));

        jbed.setBackground(new java.awt.Color(0, 0,0,80));
        jbed.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jbed, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 180, 40));

        jfloor.setBackground(new java.awt.Color(0, 0,0,80));
        jfloor.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jfloor, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 180, 40));

        jac.setBackground(new java.awt.Color(0, 0,0,80));
        jac.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jac, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, 180, 40));

        jprize.setBackground(new java.awt.Color(0, 0,0,80));
        jprize.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jprize, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 430, 180, 40));

        jroom.setBackground(new java.awt.Color(0, 0,0,80));
        jroom.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jroom, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 180, 40));

        jButton8.setBackground(new java.awt.Color(0, 0,0,80));
        jButton8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Add Room");
        jButton8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 510, 130, -1));

        jButton9.setBackground(new java.awt.Color(0, 0,0,80));
        jButton9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Reset Data");
        jButton9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 510, 150, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/management/red1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void nul() {
        jroom.setText(null);
        jclass.setText(null);
        jbed.setText(null);
        jfloor.setText(null);
        jac.setText(null);
        jprize.setText(null);

    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        adminloginpage ad = new adminloginpage();
        ad.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        String name = jroom.getText();
        String adderss = jclass.getText();
        String mail = jbed.getText();
        String pass = jfloor.getText();
        String contact = jac.getText();
        String set1 = jprize.getText();

        if ("".equals(name) || "".equals(contact) || "".equals(adderss) || "".equals(mail) || "".equals(pass) || "".equals(set1)) {
            JOptionPane.showConfirmDialog(this, "All fields are Mandotory");
        } else {

            String re = jroom.getText();
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_management", "root", "Anuj0806$");
                String sql = "select room_no from duplicateroom";
                PreparedStatement ptst = conn.prepareStatement(sql);
                ResultSet rs = ptst.executeQuery();
                while (rs.next()) {

                    String room = rs.getString("room_no");
                    arr.add(room);
                    if (arr.contains(re)== true) {
                        JOptionPane.showConfirmDialog(null, "This Room is booked already");

                    } else {
                        try {
                            Class.forName("com.mysql.cj.jdbc.Driver");
                            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_management", "root", "Anuj0806$");
                            String sql1 = "insert into room values(?,?,?,?,?,?)";
                            PreparedStatement pst = conn.prepareStatement(sql1);
                            pst.setString(1, jroom.getText());
                            pst.setString(2, jclass.getText());
                            pst.setString(3, jbed.getText());
                            pst.setString(4, jfloor.getText());
                            pst.setString(5, jac.getText());
                            pst.setString(6, jprize.getText());
                            pst.executeUpdate();
                            JOptionPane.showMessageDialog(null, "Room Added succesfully");
                            conn.close();
                            nul();
//                            break;
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(this, e);
                            nul();
                        }
                    }

                }
                conn.close();
                // welcome_update();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
                //nul();
            }
//            
//                        try {
//                            Class.forName("com.mysql.cj.jdbc.Driver");
//                            java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_management", "root", "Anuj0806$");
//                            String sql = "insert into room values(?,?,?,?,?,?)";
//                            PreparedStatement ptst = conn.prepareStatement(sql);
//                            ptst.setString(1, jroom.getText());
//                            ptst.setString(2, jclass.getText());
//                            ptst.setString(3, jbed.getText());
//                            ptst.setString(4, jfloor.getText());
//                            ptst.setString(5, jac.getText());
//                            ptst.setString(6, jprize.getText());
//                            ptst.executeUpdate();
//                            JOptionPane.showMessageDialog(this, "Room Added succesfully");
//                            conn.close();
//                            nul();
////                            break;
//                        } catch (Exception e) {
//                            JOptionPane.showMessageDialog(this, e);
//                            nul();
//                        }

        }


    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        nul();
    }//GEN-LAST:event_jButton9ActionPerformed

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
            java.util.logging.Logger.getLogger(addroom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addroom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addroom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addroom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addroom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jac;
    private javax.swing.JTextField jbed;
    private javax.swing.JTextField jclass;
    private javax.swing.JTextField jfloor;
    private javax.swing.JTextField jprize;
    private javax.swing.JTextField jroom;
    // End of variables declaration//GEN-END:variables
}
