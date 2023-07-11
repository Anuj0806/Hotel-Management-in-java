/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hotel.management;

import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Random;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/**
 *
 * @author Jitender
 */
public class updatedetail extends javax.swing.JFrame {

    String username2;
    String otp;

    /**
     * Creates new form updatedetail
     */
    public updatedetail() {
        initComponents();
    }

    updatedetail(String user) {
         initComponents();
        this.username2 = user;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton7 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        search = new javax.swing.JTextField();
        jotp = new javax.swing.JTextField();
        jmail = new javax.swing.JTextField();
        jphone = new javax.swing.JTextField();
        jname = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jadd = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton7.setBackground(new java.awt.Color(255, 0, 0));
        jButton7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Back");
        jButton7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 40));

        jLabel2.setFont(new java.awt.Font("Lucida Calligraphy", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Hotel Management System");
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 850, 90));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Email");
        jLabel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 140, 40));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Name");
        jLabel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 140, 40));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Phone");
        jLabel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 140, 40));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Address");
        jLabel10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 140, 40));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Verify OTP");
        jLabel11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 560, 140, 40));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Email");
        jLabel12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 140, 40));

        jButton6.setBackground(new java.awt.Color(255, 0, 0));
        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Submit");
        jButton6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 490, 120, 40));

        jButton4.setBackground(new java.awt.Color(255, 0, 0));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Verify OTP");
        jButton4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 630, 120, 40));

        jButton8.setBackground(new java.awt.Color(255, 0, 0));
        jButton8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Reset");
        jButton8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 490, 120, 40));

        jButton9.setBackground(new java.awt.Color(255, 0, 0));
        jButton9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Search Details");
        jButton9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, 130, 40));

        search.setBackground(new java.awt.Color(0, 0,0,80));
        search.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        search.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 180, 40));

        jotp.setBackground(new java.awt.Color(0, 0,0,80));
        jotp.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jotp.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jotp, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 560, 180, 40));

        jmail.setBackground(new java.awt.Color(0, 0,0,80));
        jmail.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jmail.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 410, 180, 40));

        jphone.setBackground(new java.awt.Color(0, 0,0,80));
        jphone.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jphone.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 180, 40));

        jname.setBackground(new java.awt.Color(0, 0,0,80));
        jname.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jname.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jname, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 180, 40));

        jadd.setBackground(new java.awt.Color(0, 0,0,80));
        jadd.setColumns(20);
        jadd.setForeground(new java.awt.Color(255, 255, 255));
        jadd.setRows(5);
        jScrollPane1.setViewportView(jadd);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/management/red1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

        public void otpgenerte(){
         Random rand=new Random();
         otp=String.valueOf(rand.nextInt(999999));
        
        
                String email=jmail.getText();
                String message = "For Update data into Database. The otp is :- "+otp;
		String subject = "Hotel Management System";
		String to = email;
		String from = "anuj9896388147@gmail.com";
		
	sendEmail(message,subject,to,from);
//		sendAttach(message,subject,to,from);
	}

	//this is responsible to send the message with attachment
	private static void sendEmail(String message, String subject, String to, String from) {

		//Variable for gmail
		String host="smtp.gmail.com";
		
		//get the system properties
		Properties properties = System.getProperties();
		System.out.println("PROPERTIES "+properties);
		
		//setting important information to properties object
		
		//host set
		properties.put("mail.smtp.host", host);
		properties.put("mail.smtp.port","465");
		properties.put("mail.smtp.ssl.enable","true");
		properties.put("mail.smtp.auth","true");
		
		//Step 1: to get the session object..
		Session session=Session.getInstance(properties, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {				
				return new PasswordAuthentication("anuj9896388147@gmail.com","zdkpfmdqwzhxstkg");
			}			
		});
		
		session.setDebug(true);
		
		//Step 2 : compose the message [text,multi media]
		MimeMessage m = new MimeMessage(session);
		
		try {
		
		//from email
		m.setFrom(from);
		
		//adding recipient to message
		m.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
		
		//adding subject to message
		m.setSubject(subject);
		m.setText(message);
		
		//step 3 
		Transport.send(m);
		System.out.println("send sucessfully .................");
		
		
		}catch (Exception e) {
			e.printStackTrace();
		}
    }
        public void nul() {
        search.setText(null);
        jmail.setText(null);
        jname.setText(null);               
        jphone.setText(null);
        jadd.setText(null);
    }
    
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
         guestloginpage ad = new guestloginpage(username2);
        ad.username1 = username2;
        ad.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
         String val = search.getText();
        if (val.equals(username2)) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_management", "root", "Anuj0806$");
                String sql = "select Name,phone,address,email from guest where Email=?";
                PreparedStatement pst = conn.prepareStatement(sql);
                pst.setString(1, search.getText());
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    jname.setText(rs.getString("Name"));                   
                    jphone.setText(rs.getString("phone"));           
                    jadd.setText(rs.getString("address"));
                    jmail.setText(rs.getString("email"));
                   
                } else {
                    JOptionPane.showMessageDialog(null, "no data found");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        } else {
            JOptionPane.showMessageDialog(null, "wrong email");
            search.setText(null);
        }

    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       String name = jname.getText();
        String last = jphone.getText();
        String radio = jadd.getText();
        String contact = jmail.getText();
        String mail = search.getText();
       if ("".equals(name) || "".equals(last) || "".equals(radio) || "".equals(contact) ||"".equals(mail)) {
            JOptionPane.showConfirmDialog(this, "All fields are Mandotory");
        }
       else{
       String val = search.getText();
        if (val.equals(username2)) {
           otpgenerte();  
           JOptionPane.showMessageDialog(null, "Otp is send on your resister Email ID");
        } else {
            JOptionPane.showMessageDialog(null, "wrong email");
        }
       }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        nul();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String otp1=jotp.getText();
       
if("".equals(otp1)){
         JOptionPane.showMessageDialog(null, "You have not enter otp");
}
else{
        if(otp1.endsWith(otp))
        {
        String val = search.getText();
        if (val.equals(username2)) {

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                try ( java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_management", "root", "Anuj0806$")) {
                    String sql = "update guest set name=?,phone=?,address=?,email=? where email=?";
                    PreparedStatement ptst = conn.prepareStatement(sql);
                    ptst.setString(1, jname.getText());                   
                    ptst.setString(2, jphone.getText());
                    ptst.setString(3, jadd.getText());
                    ptst.setString(4, jmail.getText());
                   
                    ptst.setString(5, search.getText());

                    ptst.executeUpdate();
                    JOptionPane.showMessageDialog(this, "update Data succesfully");
                } catch (HeadlessException e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            } catch (HeadlessException | ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(this, "Updated Email is already register in our system");
                //JOptionPane.showMessageDialog(this, e);
            }

//**************************************************************************************************8
            
            guestloginpage ad = new guestloginpage();
            ad.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "wrong email");
        }
      }
        else{
            JOptionPane.showMessageDialog(null, "Enter otp is wrong");
            jotp.setText(null);
        }
}
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(updatedetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updatedetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updatedetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updatedetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updatedetail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jadd;
    private javax.swing.JTextField jmail;
    private javax.swing.JTextField jname;
    private javax.swing.JTextField jotp;
    private javax.swing.JTextField jphone;
    private javax.swing.JTextField search;
    // End of variables declaration//GEN-END:variables
}