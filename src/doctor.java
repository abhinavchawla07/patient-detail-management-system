
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class doctor extends javax.swing.JFrame {

    /**
     * Creates new form doctor
     */
    DataInputStream dis;
    DataOutputStream dos;
    String uname;
    public doctor(String name, String user) {
        initComponents();
        new Thread(new client()).start();
        this.setSize(600,400);
        this.setLocation(410,200);
        this.uname=user;
        jLabel1.setText("Welcome Dr. "+name);
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
        jButton2 = new javax.swing.JButton();
        chgpwd = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Welcome,");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 31, 270, 50);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("LOGOUT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(403, 21, 90, 30);

        chgpwd.setText("Change password");
        chgpwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chgpwdActionPerformed(evt);
            }
        });
        getContentPane().add(chgpwd);
        chgpwd.setBounds(400, 60, 120, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("ENTER REGISTRATION NUMBER");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(140, 94, 190, 40);

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField6);
        jTextField6.setBounds(141, 134, 200, 30);

        jButton3.setText("OK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(199, 202, 80, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hand-at-paper-in-hospital_23-2147767820.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 550, 350);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        receptionlogin rl = new receptionlogin();
        rl.setVisible(true);
        rl.setSize(1000, 1000);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        //DO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String PID = jTextField6.getText();
        try {
            dos.writeUTF("dsearch patient");
            dos.writeUTF(uname);
            dos.writeUTF(PID);
        } catch (Exception e) {
            e.printStackTrace();
        } jTextField6.setText("");  // TODO add your handling code here:// TO  // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed
        
    private void chgpwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chgpwdActionPerformed
        d_chg_pwd cp=new d_chg_pwd(uname);
        cp.setVisible(true);
        cp.setSize(500,500);//change password code
        // TODO add your handling code here:
    }//GEN-LAST:event_chgpwdActionPerformed

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
            java.util.logging.Logger.getLogger(doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new doctor().setVisible(true);
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

//            dos.writeBytes(" hello server\r\n");
                while (true) {
                    String s = dis.readUTF();
                    if(s.equals("patient found"))
                    {
                       String pid=dis.readUTF();
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
                    
                    Patient_Details pd = new Patient_Details("d",pid,name,age,gender,phone,address,current_date,doctor,cc,inv,dia,pres,nad);
                    pd.setVisible(true);
                    }
                    else if(s.equals("not allowed"))
                    {
                        JOptionPane.showMessageDialog(rootPane, "Access Denied");
                    }
                    else if(s.equals("not found"))
                    {
                        JOptionPane.showMessageDialog(rootPane, "Patient Not Found");
                    }
                    
                }
            } catch (Exception e) {
            }
        }
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton chgpwd;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
