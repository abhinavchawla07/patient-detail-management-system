/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class reception extends javax.swing.JFrame {

    
    DataInputStream dis;
    DataOutputStream dos;
    String pid;
    /**
     * Creates new form reception
     */
    String uname;
    public reception(String user) {
        initComponents();
        this.uname=user;
        jLabel7.setText("Welcome, " + user);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate ld = LocalDate.now();
        jTextField8.setText(dtf.format(ld));
        new Thread(new client()).start();
        jPanel1.setVisible(true);
        jPanel2.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        chgpwd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabel1.setText("NAME");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 3, 50, 20);

        jLabel2.setText("AGE");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 40, 50, 30);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2);
        jTextField2.setBounds(70, 40, 300, 30);

        jLabel3.setText("GENDER");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 80, 60, 30);

        jLabel4.setText("PHONE NO.");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 120, 70, 20);

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField4);
        jTextField4.setBounds(70, 120, 300, 30);

        jLabel5.setText("ADDRESS");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(0, 160, 70, 30);

        jButton1.setText("REGISTER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(70, 330, 120, 23);
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 144, 0, 0);

        jTextField8.setEditable(false);
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField8);
        jTextField8.setBounds(70, 270, 300, 30);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(70, 0, 300, 30);

        jLabel10.setText("DATE");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(0, 270, 50, 30);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(70, 160, 300, 96);

        buttonGroup2.add(jRadioButton3);
        jRadioButton3.setText("Male");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton3);
        jRadioButton3.setBounds(70, 90, 93, 23);

        buttonGroup2.add(jRadioButton4);
        jRadioButton4.setText("Female");
        jPanel1.add(jRadioButton4);
        jRadioButton4.setBounds(170, 90, 59, 23);

        buttonGroup2.add(jRadioButton5);
        jRadioButton5.setText("Other");
        jPanel1.add(jRadioButton5);
        jRadioButton5.setBounds(280, 90, 53, 23);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 140, 420, 380);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setText("Welcome");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 250, 70);

        jButton2.setText("LOGOUT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(740, 20, 120, 23);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("ADD NEW PATIENT");
        jRadioButton1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton1ItemStateChanged(evt);
            }
        });
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(10, 100, 140, 23);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("SEARCH FOR EXISTING");
        jRadioButton2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton2ItemStateChanged(evt);
            }
        });
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(470, 100, 160, 23);

        jPanel2.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("ENTER REGISTRATION NUMBER");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(10, 20, 210, 30);

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField6);
        jTextField6.setBounds(220, 20, 130, 30);

        jButton3.setText("OK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(190, 80, 80, 23);

        jPanel3.setLayout(null);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("ENTER REGISTRATION NUMBER");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(10, 20, 210, 30);

        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField9);
        jTextField9.setBounds(220, 20, 130, 30);

        jButton4.setText("OK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4);
        jButton4.setBounds(190, 80, 80, 23);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(450, 130, 390, 250);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(450, 130, 390, 250);

        chgpwd.setText("Change password");
        chgpwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chgpwdActionPerformed(evt);
            }
        });
        getContentPane().add(chgpwd);
        chgpwd.setBounds(740, 60, 120, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String name = jTextField1.getText();
        int age = Integer.parseInt(jTextField2.getText());
        String phone = jTextField4.getText();
        String address = jTextArea1.getText();
        String gender=null;
        if(jRadioButton1.isSelected())
             gender = "M";
        else if(jRadioButton2.isSelected())
             gender = "F";
        else if(jRadioButton3.isSelected())
             gender = "O";
                    

        try {
            dos.writeUTF("pdetails add");
            System.out.println("adding");
            dos.writeUTF(name);
            dos.writeUTF(age+"");
            dos.writeUTF(gender);
            dos.writeUTF(phone);
            dos.writeUTF(address);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField4.setText("");
        jTextArea1.setText("");
        
        
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        receptionlogin rl = new receptionlogin();
        rl.setVisible(true);
        rl.setSize(1000, 1000);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed

// TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton1ItemStateChanged
        if (jRadioButton1.isSelected()) {
            jPanel1.setVisible(true);
        } else {
            jPanel1.setVisible(false);} // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ItemStateChanged

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
//DO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      String PID = jTextField6.getText();
      int pid=Integer.parseInt(PID);
try {
           
           dos.writeUTF("rsearch patient");
//           System.out.println(""+PID);
           dos.writeUTF(PID);
           
        } catch (Exception e) {
            e.printStackTrace();
        }
    // TODO add your handling code here:// TO  // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jRadioButton2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton2ItemStateChanged
      if(jRadioButton2.isSelected())
         jPanel2.setVisible(true);
      else
         jPanel2.setVisible(false); 
// TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ItemStateChanged

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void chgpwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chgpwdActionPerformed
       r_chg_pwd cp=new r_chg_pwd(uname);
       cp.setVisible(true);
        cp.setSize(500,500);//change password code
// TODO add your handling code here:
    }//GEN-LAST:event_chgpwdActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed


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
            java.util.logging.Logger.getLogger(reception.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reception.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reception.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reception.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new reception().setVisible(true);
            }
        });
    }

    
    public class client implements Runnable{


        @Override
        public void run() {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
              try {
            Socket sock
                    = new Socket(Credentials.ip, 8000);
            System.out.println("Connected to Server");
            dis = new DataInputStream(sock.getInputStream());
            dos = new DataOutputStream(sock.getOutputStream());

//            dos.writeUTF(" hello server\r\n");
            while (true) {
                String s = dis.readUTF();
//                System.out.println("Server: " + s);
                if(s.equals("added successfully"))
                {
//                    System.out.println("fin "+s);
                    JOptionPane.showMessageDialog(rootPane, "Patient added successfully\nRegistration number: "+dis.readUTF()+"\nDoctor: "+dis.readUTF());
                }
                else if(s.equals("Patient Found"))
                {
                    pid=dis.readUTF();
                    String name=dis.readUTF();
                    int age=Integer.parseInt(dis.readUTF());
                    String gender=dis.readUTF();
                    String phone=dis.readUTF();
                    String address=dis.readUTF();
                    String current_date=dis.readUTF();
                  
                    String doctor=dis.readUTF();
                    String cc =dis.readUTF();
                    String inv =dis.readUTF();
                    String dia=dis.readUTF();
                    String pres=dis.readUTF();
                    String nad=dis.readUTF();
                    JOptionPane.showMessageDialog(rootPane, "Patient found");
                    
                    Patient_Details pd = new Patient_Details("r",pid,name,age,gender,phone,address,current_date,doctor,cc,inv,dia,pres,nad);
                    pd.setVisible(true);
                    pd.setSize(1000,1000);
                                        
                }
                else if(s.equals("not found"))
                {
                    JOptionPane.showMessageDialog(rootPane, "Patient Not found");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton chgpwd;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
