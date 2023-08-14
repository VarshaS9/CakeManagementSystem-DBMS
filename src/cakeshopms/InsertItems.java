/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cakeshopms;

import com.mysql.cj.jdbc.PreparedStatementWrapper;
import java.awt.Component;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.swing.ImageIcon;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import net.proteanit.sql.DbUtils;


public class InsertItems extends javax.swing.JFrame {

   Connection Con = null;
   PreparedStatement pst = null;
   ResultSet Rs = null;
   Statement St = null;
    public InsertItems() {
        initComponents();
        DisplayItems();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TxtName = new javax.swing.JTextField();
        TxtQty = new javax.swing.JTextField();
        TxtPrice = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TxtCat = new javax.swing.JComboBox<>();
        TxtType = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        BrowseBtn = new javax.swing.JButton();
        AddBtn = new javax.swing.JButton();
        DltBtn = new javax.swing.JButton();
        EdtBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ItemTbl = new javax.swing.JTable();
        TxtImg = new javax.swing.JLabel();
        ViewBillsBtn = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TxtSize = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 51));
        jLabel1.setText("Category");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 51));
        jLabel2.setText("Quantity");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 51));
        jLabel3.setText("Price");

        TxtCat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cake", "Pastry" }));

        TxtType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Egg", "Eggless" }));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 51));
        jLabel4.setText("Name");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 51));
        jLabel5.setText("Type");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 51));
        jLabel6.setText("Image");

        BrowseBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BrowseBtn.setForeground(new java.awt.Color(153, 0, 0));
        BrowseBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        BrowseBtn.setText("Browse");
        BrowseBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BrowseBtnMouseClicked(evt);
            }
        });

        AddBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AddBtn.setForeground(new java.awt.Color(153, 0, 0));
        AddBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new product.png"))); // NOI18N
        AddBtn.setText("Add");
        AddBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddBtnMouseClicked(evt);
            }
        });

        DltBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        DltBtn.setForeground(new java.awt.Color(153, 0, 0));
        DltBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        DltBtn.setText("Delete");
        DltBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DltBtnMouseClicked(evt);
            }
        });

        EdtBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EdtBtn.setForeground(new java.awt.Color(153, 0, 0));
        EdtBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/view edit delete product.png"))); // NOI18N
        EdtBtn.setText("Edit");
        EdtBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EdtBtnMouseClicked(evt);
            }
        });

        ItemTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        ItemTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ItemTblMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(ItemTbl);

        TxtImg.setBackground(new java.awt.Color(255, 255, 255));
        TxtImg.setOpaque(true);

        ViewBillsBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ViewBillsBtn.setForeground(new java.awt.Color(153, 0, 0));
        ViewBillsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/View Bills & Order Placed Details.png"))); // NOI18N
        ViewBillsBtn.setText("View Bills");
        ViewBillsBtn.setPreferredSize(new java.awt.Dimension(95, 30));
        ViewBillsBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ViewBillsBtnMouseClicked(evt);
            }
        });

        BackBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BackBtn.setForeground(new java.awt.Color(153, 0, 0));
        BackBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clear.png"))); // NOI18N
        BackBtn.setText("Back");
        BackBtn.setPreferredSize(new java.awt.Dimension(72, 30));
        BackBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackBtnMouseClicked(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\varsh\\OneDrive\\Pictures\\cake\\c1.png")); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 0, 51));
        jLabel8.setText("Items Management");

        TxtSize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 Kg", "500 gm" }));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 0, 51));
        jLabel9.setText("Size");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(79, 79, 79))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TxtCat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtType, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtQty, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtPrice, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtSize, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(158, 158, 158)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtImg, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(BrowseBtn)
                                .addGap(0, 27, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(151, 151, 151)
                                .addComponent(AddBtn)
                                .addGap(18, 18, 18)
                                .addComponent(DltBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(EdtBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(352, 352, 352)
                .addComponent(ViewBillsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(BrowseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(46, 46, 46)))
                                .addGap(16, 16, 16))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtCat, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtName, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtType, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtSize, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtQty, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(TxtImg, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DltBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EdtBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ViewBillsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //Adding table headers
   /* public void addTableHeader()
    {
       DefaultTableModel model = (DefaultTableModel) ItemTbl.getModel();
        Object[] newIdentifiers = new Object[]{"num","name","category","type","quantity","price","image"};
        model.setColumnIdentifiers(newIdentifiers);
        //get image column and override TableCellRender class component method (getTableCellRendererComponent)
        ItemTbl.getColumn("image").setCellRenderer((TableCellRenderer) new myTableCellRenderer());
    }
    
    class myTableCellRenderer implements TableCellRenderer
    {
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column)
        {
           ItemTbl.setRowHeight(60);
           return (Component) value;
        }
    }*/
    
    public ImageIcon ResizePhoto(String ImagePath, byte[] pic)
    {
        ImageIcon MyImage = null;
        if(ImagePath != null)
        {
            MyImage = new ImageIcon(ImagePath);
        }
        else
        {
            MyImage = new ImageIcon(pic);
            
        }
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(TxtImg.getWidth(),TxtImg.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }
    
    
    
    String imgPath;
    private void BrowseBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BrowseBtnMouseClicked
        JFileChooser file=new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter=new FileNameExtensionFilter("*.Images","jpg","png","gif");
        file.addChoosableFileFilter(filter);
        int result = file.showSaveDialog(file);
        if(result == JFileChooser.APPROVE_OPTION)
        {
            File selectedFile = file.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            TxtImg.setIcon(ResizePhoto(path,null));
            imgPath = path;
        }
        else if(result == JFileChooser.CANCEL_OPTION)
        {
            JOptionPane.showMessageDialog(this, "No File Selected");
        }
    }//GEN-LAST:event_BrowseBtnMouseClicked

    private void DisplayItems()
    {
        try{
            Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cakedb","root","");
            St = Con.createStatement();
            Rs = St.executeQuery("Select num,name,category,type,size,quantity,price from insertitem");
            ItemTbl.setModel(DbUtils.resultSetToTableModel(Rs));
        }catch(Exception e)
        {
            
        }
    }
    
    private void Clear()
    {
         TxtName.setText("");
         TxtQty.setText("");
         TxtPrice.setText("");
         TxtImg.setIcon(null);
    }
    
    int Itnum;
    Statement St1= null;
    ResultSet Rs1= null;
    private void CountIteams()
    {
        try{
            St1 = Con.createStatement();
            Rs1 = St1.executeQuery("Select Max(num) from insertitem");
            Rs1.next();
            Itnum= Rs1.getInt(1)+1;
        }catch(Exception e)
        {
            
        }
    }
    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
       JLabel imageLabel = new JLabel();
       ImageIcon imageicon = new ImageIcon(imgPath);
       //Resize img to fixed dimensiond 60*60 (width and height)
       Image imageIc = imageicon.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);
       //Storing imageicon in a jlabel
       imageLabel.setIcon(new ImageIcon(imageIc));
       
       
        if(TxtName.getText().isEmpty() || TxtQty.getText().isEmpty() ||TxtPrice.getText().isEmpty() ||TxtCat.getSelectedIndex()== -1 ||TxtType.getSelectedIndex()== -1 ||TxtSize.getSelectedIndex()== -1)
        {
            JOptionPane.showMessageDialog(this, "Missing Information!!!");
        }
        else
        {
            try{
                CountIteams();
               Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cakedb","root","");
               PreparedStatement Save= Con.prepareStatement("insert into insertitem values(?,?,?,?,?,?,?,?)");
               Save.setInt(1, Itnum);
               Save.setString(2, TxtName.getText());
               Save.setString(3, TxtCat.getSelectedItem().toString());
               Save.setString(4, TxtType.getSelectedItem().toString());
               Save.setString(5, TxtSize.getSelectedItem().toString());
               Save.setInt(6, Integer.valueOf(TxtQty.getText()));
               Save.setInt(7, Integer.valueOf(TxtPrice.getText()));
                InputStream img = new FileInputStream(imgPath);
                Save.setBlob(8, img);
                
                int row = Save.executeUpdate();
                JOptionPane.showMessageDialog(this, "Item Added");
                Con.close();
                DisplayItems();
                Clear();
            }catch(Exception Ex)
            {
                 JOptionPane.showMessageDialog(this, Ex);
            }
        }
    }//GEN-LAST:event_AddBtnMouseClicked
    private void GetItemPhoto()
    {
        String Query="select image from insertitem where num="+Key;
        Statement St;
        ResultSet Rs;
        try{
            Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cakedb","root","");
            St = Con.createStatement();
            Rs= St.executeQuery(Query);
            if(Rs.next())
            {
                TxtImg.setIcon(ResizePhoto(null,Rs.getBytes("image")));
            }
        }catch(Exception e)
        {
            
        }
    }
    int Key=0;
    private void ItemTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ItemTblMouseClicked
        DefaultTableModel model =(DefaultTableModel)ItemTbl.getModel();
        int MyIndex = ItemTbl.getSelectedRow();
        Key = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
        TxtName.setText(model.getValueAt(MyIndex, 1).toString());
        TxtCat.setSelectedItem(model.getValueAt(MyIndex, 2).toString());
        TxtType.setSelectedItem(model.getValueAt(MyIndex, 3).toString());
        TxtSize.setSelectedItem(model.getValueAt(MyIndex, 4).toString());
        TxtQty.setText(model.getValueAt(MyIndex, 5).toString());
        TxtPrice.setText(model.getValueAt(MyIndex, 6).toString());
        GetItemPhoto();
    }//GEN-LAST:event_ItemTblMouseClicked

    private void DltBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DltBtnMouseClicked
       if(Key==0)
       {
           JOptionPane.showMessageDialog(this, "Select the Item");
       }
       else
       {
           try{
               Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cakedb","root","");
               String Query = "Delete from insertitem where num="+Key;
               Statement Del = Con.createStatement();
               Del.executeUpdate(Query);
               JOptionPane.showMessageDialog(this, "Item Deleted");
               DisplayItems();
               Clear();
           }catch(Exception e)
           {
               
           }
       }
    }//GEN-LAST:event_DltBtnMouseClicked

    private void EdtBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EdtBtnMouseClicked
       if(imgPath != null)
       {
           try{
               InputStream img = new FileInputStream(imgPath);
               String UpdateQuery = "Update insertitem set name=?,category=?,type=?,size=?,quantity=?,price=?,image=? where num=?";
               Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cakedb","root","");
               PreparedStatement Ps = Con.prepareStatement(UpdateQuery);
               Ps.setString(1, TxtName.getText());
               Ps.setString(2, TxtCat.getSelectedItem().toString());
               Ps.setString(3, TxtType.getSelectedItem().toString());
               Ps.setString(4, TxtSize.getSelectedItem().toString());
               Ps.setInt(5, Integer.valueOf(TxtQty.getText()));
               Ps.setInt(6, Integer.valueOf(TxtPrice.getText()));
               Ps.setBlob(7, img);
               Ps.setInt(8, Key);
               if(Ps.executeUpdate()==1)
                {
                       DisplayItems();
                       JOptionPane.showMessageDialog(this, "Item Updated");
                }
               else
               {
                   JOptionPane.showMessageDialog(this, "Missing Info");
               }
           }catch(Exception e)
           {
               JOptionPane.showMessageDialog(this, e);
           }
       }
       else
       {
           JOptionPane.showMessageDialog(this, "No Photo Selected");
       }
       imgPath = null;
    }//GEN-LAST:event_EdtBtnMouseClicked

    private void ViewBillsBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewBillsBtnMouseClicked
       ViewSells vs=new ViewSells();
        vs.show(); 
        dispose();
    }//GEN-LAST:event_ViewBillsBtnMouseClicked

    private void BackBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackBtnMouseClicked
        AdminHomePg it=new AdminHomePg();
        it.show();
        dispose();
    }//GEN-LAST:event_BackBtnMouseClicked

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
            java.util.logging.Logger.getLogger(InsertItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertItems().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JButton BackBtn;
    private javax.swing.JButton BrowseBtn;
    private javax.swing.JButton DltBtn;
    private javax.swing.JButton EdtBtn;
    private javax.swing.JTable ItemTbl;
    private javax.swing.JComboBox<String> TxtCat;
    private javax.swing.JLabel TxtImg;
    private javax.swing.JTextField TxtName;
    private javax.swing.JTextField TxtPrice;
    private javax.swing.JTextField TxtQty;
    private javax.swing.JComboBox<String> TxtSize;
    private javax.swing.JComboBox<String> TxtType;
    private javax.swing.JButton ViewBillsBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
