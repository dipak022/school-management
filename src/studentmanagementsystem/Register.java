/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagementsystem;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Register extends javax.swing.JFrame {
      String Username="root";
        String password=null;
        String url="jdbc:mysql://127.0.0.1/school";
        Connection connection = null;
        PreparedStatement pre;
        

    /**
     * Creates new form Register
     */
    public Register() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Rusername = new javax.swing.JTextField();
        RFullname = new javax.swing.JTextField();
        Rphone = new javax.swing.JTextField();
        Rconfirmpassword = new javax.swing.JPasswordField();
        Rmale = new javax.swing.JRadioButton();
        Rfemale = new javax.swing.JRadioButton();
        Rpassword = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(new java.awt.Color(51, 153, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 204));
        jLabel1.setText("            Register");

        jLabel2.setText("Full Name ");

        jLabel3.setText("Username");

        jLabel5.setText("Confirm Password");

        jLabel6.setText("Password");

        jLabel7.setText("       Gender");

        jButton1.setText("Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Rmale.setText("Male");
        Rmale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RmaleActionPerformed(evt);
            }
        });

        Rfemale.setText("Female");
        Rfemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RfemaleActionPerformed(evt);
            }
        });

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel8.setText("Phone ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(228, Short.MAX_VALUE)
                .addComponent(Rmale, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(Rfemale)
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(47, 47, 47)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Rconfirmpassword, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(RFullname, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Rphone, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Rusername, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Rpassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(RFullname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Rusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Rphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Rpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Rconfirmpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Rmale)
                    .addComponent(Rfemale)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(96, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String Fullname =RFullname.getText();
        String Usernames =Rusername.getText();
        String Phone =Rphone.getText();
        String Password =Rpassword.getText();
        String cPassword =Rconfirmpassword.getText();
        String Gender =null;
        if(Rmale.isSelected()){
            Gender="Male";
        }if(Rfemale.isSelected()){
            Gender="Female";
        }
        
        // save database 
      
       // String Quary="insart into register(Full Name,User Name,Phone Number,Password,Gender)values('"+Fullname+"','"+Usernames+"','"+Phone+"','"+Password+"','"+cPassword+"','"+Gender+"')";
         	 	 	 	 
       try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null,"Exception "+e);
        }
          try{
            connection = (Connection) DriverManager.getConnection(url, Username, password);
            JOptionPane.showMessageDialog(null,"Connect Database  ");
            insert(Fullname,Usernames,Phone,Password,cPassword,Gender);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Exception "+e);
        }
       
         
            
           // try {
                
               // pre=(PreparedStatement)connection.prepareStatement(Quary);
                //pre.execute();
               // JOptionPane.showMessageDialog(null," Successfully save data strore database.");
           // } catch (SQLException ex) {
                //JOptionPane.showMessageDialog(null," Not Save Data In databse ");
           // }
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void RmaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RmaleActionPerformed
        if(Rmale.isSelected()){
            Rfemale.setSelected(false);
        }
    }//GEN-LAST:event_RmaleActionPerformed

    private void RfemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RfemaleActionPerformed
        // TODO add your handling code here:
         if(Rfemale.isSelected()){
            Rmale.setSelected(false);
        }
    }//GEN-LAST:event_RfemaleActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Login login = new Login();
        login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }
    
    public void insert(String Fname, String Usename,String phon,String pass,String Cpass,String gender) { 
     
            //String sql = "INSERT INTO register(Full Name,User Name,Phone Number,Password,Gender) VALUES(Fname,Usename,phon,pass,gender)";
        
 
      
            if(pass.equals(Cpass)){
                try{
                    connection = (Connection) DriverManager.getConnection(url, Username, password);
                   // String sql = "INSERT INTO register(name,username,phone,Password,Gender) VALUES(Fname,Usename,phon,pass,gender)";
                    String sql = "INSERT INTO registerr(name,username,phone,Password,Gender) VALUES(?,?,?,?,?)";
                   pre = connection.prepareStatement(sql);  	 	 	 	 
                  pre.setString(1, Fname);
                  pre.setString(2, Usename);
                  pre.setString(3, phon);
                  pre.setString(4, pass);
                  pre.setString(5, gender); 
                
                  if(pre.executeUpdate()>0){
                      JOptionPane.showMessageDialog(null,"Information Save The Database Successfully.");
                  }else{
                      JOptionPane.showMessageDialog(null,"Information Not Save The Database Successfully.");
                  }
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null,"Exception is"+e);
                }
            }
            else{
                  JOptionPane.showMessageDialog(null,"Password Is Not Match Please Try Again .");
            }
    }
      
     
        
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField RFullname;
    private javax.swing.JPasswordField Rconfirmpassword;
    private javax.swing.JRadioButton Rfemale;
    private javax.swing.JRadioButton Rmale;
    private javax.swing.JPasswordField Rpassword;
    private javax.swing.JTextField Rphone;
    private javax.swing.JTextField Rusername;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables

   // private java.sql.Connection connect() {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}
}

