/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cakeshopms;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import javax.swing.JOptionPane;

public class CusDetails extends javax.swing.JFrame {
    Connection Con = null;
   PreparedStatement pst = null;
   ResultSet Rs = null;
   Statement St = null;
   
   
    public CusDetails() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        NameTxt = new javax.swing.JTextField();
        PhnoTxt = new javax.swing.JTextField();
        yes = new javax.swing.JRadioButton();
        no = new javax.swing.JRadioButton();
        SaveBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        MsgTxt = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setText("Customer Details");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, 33));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 51));
        jLabel2.setText("Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 114, 80, 24));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 51));
        jLabel3.setText("PhNumber");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 187, 80, 24));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 51));
        jLabel4.setText("Candles");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 258, 80, 24));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 51));
        jLabel5.setText("Message");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 80, 24));
        jPanel1.add(NameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 111, 214, 32));
        jPanel1.add(PhnoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 179, 214, 32));

        yes.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(yes);
        yes.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        yes.setText("Yes");
        jPanel1.add(yes, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 261, 50, -1));

        no.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(no);
        no.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        no.setText("No");
        jPanel1.add(no, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 261, 50, -1));

        SaveBtn.setBackground(new java.awt.Color(255, 160, 168));
        SaveBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SaveBtn.setForeground(new java.awt.Color(102, 0, 51));
        SaveBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        SaveBtn.setText("Save");
        SaveBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SaveBtnMouseClicked(evt);
            }
        });
        jPanel1.add(SaveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 510, 95, 34));

        MsgTxt.setColumns(20);
        MsgTxt.setRows(5);
        jScrollPane1.setViewportView(MsgTxt);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 250, 155));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\varsh\\OneDrive\\Pictures\\cake\\olaf-happy.gif")); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 302, 445));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\varsh\\OneDrive\\Pictures\\cake\\bg6.jpg")); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 811, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
String can;
    private void SaveBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveBtnMouseClicked
       String name=NameTxt.getText();
       String phno=PhnoTxt.getText();
       String candles=NameTxt.getText();
       String msg=MsgTxt.getText();
         if(name.isEmpty() || phno.isEmpty() || candles.isEmpty() || msg.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Missing Info!!","Error",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
              try{
               // CountIteams();
               Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cakedb","root","");
               PreparedStatement Save= Con.prepareStatement("insert into cusdetails (name,phno,candles,msg) values(?,?,?,?)");
               
               Save.setString(1, NameTxt.getText());
               Save.setString(2, PhnoTxt.getText());
              if(yes.isSelected())
              {
                  can="Yes";
              }
               if(no.isSelected())
              {
                  can="No";
              }
               Save.setString(3, can);
               Save.setString(4, MsgTxt.getText());
                
                int row = Save.executeUpdate();
                JOptionPane.showMessageDialog(this, "Customer Details Added");
                Con.close();
                
            }catch(Exception Ex)
            {
                 JOptionPane.showMessageDialog(this, Ex);
            }
               System.exit(1);
        }
    }//GEN-LAST:event_SaveBtnMouseClicked

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CusDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea MsgTxt;
    private javax.swing.JTextField NameTxt;
    private javax.swing.JTextField PhnoTxt;
    private javax.swing.JButton SaveBtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton no;
    private javax.swing.JRadioButton yes;
    // End of variables declaration//GEN-END:variables

   
}

 
