/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hotel.management;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
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
public class addnewemployee extends javax.swing.JFrame {

    int lastid;
    int last;
    /**
     * Creates new form addnewemployee
     */
    public addnewemployee() {
        initComponents();
         password();
         getlastid();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jpassword = new javax.swing.JTextField();
        jmail = new javax.swing.JTextField();
        jcontact = new javax.swing.JTextField();
        jname = new javax.swing.JTextField();
        jid = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jadd = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton6.setBackground(new java.awt.Color(0, 0,0,80));
        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Back");
        jButton6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Calligraphy", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("     Hotel Management System");
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 90));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Name");
        jLabel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 140, 40));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Address");
        jLabel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 140, 40));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Phone");
        jLabel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 140, 40));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Email");
        jLabel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, 140, 40));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Password");
        jLabel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 510, 140, 40));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Employee ID");
        jLabel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 140, 40));

        jButton3.setBackground(new java.awt.Color(255, 0, 0));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Reset");
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 590, 120, 40));

        jButton4.setBackground(new java.awt.Color(255, 0, 0));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Add Employee");
        jButton4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 590, 130, 40));

        jpassword.setEditable(false);
        jpassword.setBackground(new java.awt.Color(0, 0,0,80));
        jpassword.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 510, 180, 40));

        jmail.setBackground(new java.awt.Color(0, 0,0,80));
        jmail.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 440, 180, 40));

        jcontact.setBackground(new java.awt.Color(0, 0,0,80));
        jcontact.setForeground(new java.awt.Color(255, 255, 255));
        jcontact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jcontactKeyPressed(evt);
            }
        });
        getContentPane().add(jcontact, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, 180, 40));

        jname.setBackground(new java.awt.Color(0, 0,0,80));
        jname.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jname, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 180, 40));

        jid.setEditable(false);
        jid.setBackground(new java.awt.Color(0, 0,0,80));
        jid.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jid, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 180, 40));

        jadd.setBackground(new java.awt.Color(0, 0,0,80));
        jadd.setColumns(20);
        jadd.setForeground(new java.awt.Color(255, 255, 255));
        jadd.setRows(5);
        jScrollPane1.setViewportView(jadd);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/management/red1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

     public void getlastid() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_management", "root", "Anuj0806$");
            String sql = "select max(employeeid) from employee";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery(sql);
            if (rs.next()) {
                lastid = rs.getInt(1);
                lastid++;
                jid.setText(Integer.toString(lastid));

            } else {

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }

    }
    
    
    public void password(){
        int len=10;
        String valid="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder st=new StringBuilder();
        Random rand=new Random();
        while(0<len--){
            st.append(valid.charAt(rand.nextInt(valid.length())));
        }
        jpassword.setText(st.toString());
    }
    public void welcome_update(){
                String email=jmail.getText();
                String pass=jpassword.getText();
                String message = "Congratulations you are appointed as a new staff of our hotel"           
                        +"\nYour Email id is :-"+email
                        +"\nYour Password is :-"+pass;
		String subject = "Hotel Management System";
		String to = email;
		String from = "anuj9896388147@gmail.com";
		
	sendemail(message,subject,to,from);
//		sendAttach(message,subject,to,from);
	}

	//this is responsible to send the message with attachment
	private static void sendemail(String message, String subject, String to, String from) {

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
        jname.setText(null);        
        jcontact.setText(null);        
        jadd.setText(null);
        jmail.setText(null);
        jpassword.setText(null);
        jid.setText(null);
    }
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
     
         String name = jname.getText();
        String contact = jcontact.getText();       
        String adderss = jadd.getText();
        String mail = jmail.getText();
        String pass = jpassword.getText();
        String set1 = jid.getText();

        if ("".equals(name) || "".equals(contact) || "".equals(adderss) || "".equals(mail) || "".equals(pass) || "".equals(set1)) {
            JOptionPane.showConfirmDialog(this, "All fields are Mandotory");
        }
        else{
       
        try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_management", "root", "Anuj0806$");
                String sql = "insert into employee values(?,?,?,?,?,?)";               
                PreparedStatement ptst = conn.prepareStatement(sql);
                ptst.setString(1, jid.getText());
                ptst.setString(2, jname.getText());
                ptst.setString(3, jadd.getText());                                          
                ptst.setString(4, jcontact.getText());             
                ptst.setString(5, jmail.getText());
                ptst.setString(6, jpassword.getText());               
                ptst.executeUpdate();                
                conn.close();
                //welcome_update();
                JOptionPane.showMessageDialog(this, "Add new employee succesfull");
//                adminpage ad = new adminpage();
//                ad.setVisible(true);
//                dispose();
                

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Your email is already register in our system");
                nul();
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jcontactKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jcontactKeyPressed
      // TODO add your handling code here:
        String phoneNumber = jcontact.getText();
        //set length of the string
        int length = phoneNumber.length();
        char c = evt.getKeyChar();
        //check for number 0 to 9
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
            //check for length of number is not greater than 10 digits
            if (length < 10) {
                jcontact.setEditable(true);
            } else {
                //not editr if length is more than 10 digit
                jcontact.setEditable(false);
            }
        } else {
            //now allow for key back space and delete
            if (evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
                //allow edit
                jcontact.setEditable(true);
            } else {
                jcontact.setEditable(false);
            }
        }
    }//GEN-LAST:event_jcontactKeyPressed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        adminpage ad=new adminpage();
        ad.setVisible(true);
        dispose();
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
            java.util.logging.Logger.getLogger(addnewemployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addnewemployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addnewemployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addnewemployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addnewemployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jadd;
    private javax.swing.JTextField jcontact;
    private javax.swing.JTextField jid;
    private javax.swing.JTextField jmail;
    private javax.swing.JTextField jname;
    private javax.swing.JTextField jpassword;
    // End of variables declaration//GEN-END:variables
}
