/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hotel.management;

import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Jitender
 */
public class reservation extends javax.swing.JFrame {

    DefaultTableModel model;

    /**
     * Creates new form reservation
     */
    public reservation() {
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

        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        anuj = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        ro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton5.setBackground(new java.awt.Color(0, 0,0,80));
        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Back");
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 40));

        jLabel2.setFont(new java.awt.Font("Lucida Calligraphy", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("      Hotel Management System");
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 90));

        search.setBackground(new java.awt.Color(204, 0, 0));
        search.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        search.setForeground(new java.awt.Color(255, 255, 255));
        search.setText("Search.....");
        search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchMouseExited(evt);
            }
        });
        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchKeyReleased(evt);
            }
        });
        getContentPane().add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 170, 30));

        jButton4.setBackground(new java.awt.Color(0, 0,0,80));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Check Out");
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 140, 40));

        jButton6.setBackground(new java.awt.Color(0, 0,0,80));
        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Show Guest");
        jButton6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 130, 40));

        anuj.setBackground(new java.awt.Color(204, 0, 0));
        anuj.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Room No ", "Check In", "Check Out"
            }
        ));
        anuj.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        anuj.setRowHeight(30);
        anuj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                anujMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(anuj);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 640, 330));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/management/red1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 524));
        getContentPane().add(ro, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 100, -1, 10));

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void update() {
        

                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_management", "root", "Anuj0806$");
                    String sql = "select * from reservation";
                    PreparedStatement pst = con.prepareStatement(sql);
                    ResultSet rs = pst.executeQuery(sql);
                    DefaultTableModel model = (DefaultTableModel) anuj.getModel();
                    model.setRowCount(0);
                    while (rs.next()) {
                        model.addRow(new String[]{rs.getString(1), rs.getString(2), rs.getString(3)});
                    }

                    con.close();

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, e);
                }
           
    }

    public void search1(String str) {
        model = (DefaultTableModel) anuj.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
        anuj.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(str));
    }
    private void anujMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_anujMouseClicked
        DefaultTableModel tblModel = (DefaultTableModel) anuj.getModel();
        String id = tblModel.getValueAt(anuj.getSelectedRow(), 0).toString();
        ro.setText(id);
    }//GEN-LAST:event_anujMouseClicked

    private void searchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseEntered
        search.setText("");
    }//GEN-LAST:event_searchMouseEntered

    private void searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseClicked

    }//GEN-LAST:event_searchMouseClicked

    private void searchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseExited
        search.setText("Search......");
    }//GEN-LAST:event_searchMouseExited

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased
        String value = search.getText();
        search1(value);
    }//GEN-LAST:event_searchKeyReleased

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String check = ro.getText();
        if ("".equals(check)) {
            JOptionPane.showMessageDialog(null, "Please Select the Row that you want to Checkout");
        } else {

            try {
                String ro1 = ro.getText();
                Class.forName("com.mysql.cj.jdbc.Driver");
                java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_management", "root", "Anuj0806$");
                String sql = "select room_no,class,beds,floor,nonac,prize from duplicateroom where room_no=?";
                PreparedStatement pst = conn.prepareStatement(sql);
                pst.setString(1, ro1);
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    String room = rs.getString("room_no");
                    String class1 = rs.getString("class");
                    String beds = rs.getString("beds");
                    String floor = rs.getString("floor");
                    String nonac = rs.getString("nonac");
                    String prize = rs.getString("prize");
                    try {
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_management", "root", "Anuj0806$");
                        String sql1 = "insert into room values(?,?,?,?,?,?)";
                        PreparedStatement ptst = conn.prepareStatement(sql1);
                        ptst.setString(1, room);
                        ptst.setString(2, class1);
                        ptst.setString(3, beds);
                        ptst.setString(4, floor);
                        ptst.setString(5, nonac);
                        ptst.setString(6, prize);
                        ptst.executeUpdate();
                        //JOptionPane.showMessageDialog(this, "Room Added succesfully");
                        conn.close();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(this, "This room numner is already exist");
                        // nul();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No Guest Found");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            //-----------------------------------------------------------------------------------------------
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_management", "root", "Anuj0806$");
                String sql = "delete from reservation where room_no=?";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1, ro.getText());
                pst.execute();
                //JOptionPane.showMessageDialog(this, "Data deleted sucessfully");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
            //===========================================================================================================
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_management", "root", "Anuj0806$");
                String sql = "delete from duplicateroom where room_no=?";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1, ro.getText());
                pst.execute();
                JOptionPane.showMessageDialog(this, "You sucessfully Checked Out");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }

        }

        update();

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        adminloginpage ad = new adminloginpage();
        ad.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_management", "root", "Anuj0806$");
            String sql1 = "select * from reservation";
            PreparedStatement ptst = conn.prepareStatement(sql1);
//            ptst.setString(1,search.getText());
            ResultSet rs1 = ptst.executeQuery();
            if (rs1.next()) {

                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_management", "root", "Anuj0806$");
                    String sql = "select * from reservation";
                    PreparedStatement pst = con.prepareStatement(sql);
                    ResultSet rs = pst.executeQuery(sql);
                    DefaultTableModel model = (DefaultTableModel) anuj.getModel();
                    model.setRowCount(0);
                    while (rs.next()) {
                        model.addRow(new String[]{rs.getString(1), rs.getString(2), rs.getString(3)});
                    }

                    con.close();

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, e);
                }
            } else {
                JOptionPane.showMessageDialog(null, "No Guest Found");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new reservation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable anuj;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel ro;
    private javax.swing.JTextField search;
    // End of variables declaration//GEN-END:variables
}
