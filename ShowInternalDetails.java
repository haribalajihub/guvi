package studentinformationsystem;

import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import net.proteanit.sql.DbUtils;

public class ShowInternalDetails extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    Statement st=null;
    String sql=null;
    DefaultTableModel model;
    ArrayList al;
    public ShowInternalDetails() 
    {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2,
        size.height / 2 - getHeight() / 2);
        setResizable(false);
        setTitle("Current Internal Assesment Details");
        //tblCIA.setDefaultRenderer(Object.class, new MyTableRenderer());
        tblCIA.setColumnSelectionAllowed(true);
        tblCIA.setRowSelectionAllowed(true);        
        BindCombo();        
        //cellValidation();     
        tblCIA.setEnabled(false);
    }
  
    private void BindCombo()
    {
        try
        {
            conn = dbconnect.java_db();
             st=conn.createStatement();
             sql="SELECT DISTINCT(SEM) FROM SEMESTER ORDER BY SEM";
             rs=st.executeQuery(sql);              
              while(rs.next())
             {            
                 cmbSem.addItem(rs.getString(1));         
             }
        } catch (SQLException ex) {
            Logger.getLogger(ShowInternalDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
        for(int i=1;i<tblCIA.getColumnCount();i++)
            cmbCIA.addItem(tblCIA.getColumnName(i));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtRegno = new javax.swing.JTextField();
        cmdUpdate = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        cmdReset = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCIA = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtCIA1TotalPass = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCIA1TotalFail = new javax.swing.JTextField();
        txtCIA2TotalPass = new javax.swing.JTextField();
        txtCIA2TotalFail = new javax.swing.JTextField();
        txtCIA3TotalPass = new javax.swing.JTextField();
        txtCIA3TotalFail = new javax.swing.JTextField();
        txtCIA4TotalPass = new javax.swing.JTextField();
        txtCIA4TotalFail = new javax.swing.JTextField();
        cmbCIA = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cmdColumnEnabled = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtStudentName = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        cmbSem = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setBackground(new java.awt.Color(0, 51, 153));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentinformationsystem/adminin.jpg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Regno");

        txtRegno.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtRegno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegnoActionPerformed(evt);
            }
        });
        txtRegno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRegnoKeyReleased(evt);
            }
        });

        cmdUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentinformationsystem/update icon.png"))); // NOI18N
        cmdUpdate.setText("Update");
        cmdUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdUpdateActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentinformationsystem/delete_16x16.gif"))); // NOI18N
        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        cmdReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentinformationsystem/erase-128.png"))); // NOI18N
        cmdReset.setText("Reset");
        cmdReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdResetActionPerformed(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentinformationsystem/back.png"))); // NOI18N
        jButton7.setText("Back");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 102, 255));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Students Internal Details");

        tblCIA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Subject", "CIA-1", "CIA-2", "CIA-3", "CIA-4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCIA.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblCIA.setRowHeight(50);
        tblCIA.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tblCIAFocusLost(evt);
            }
        });
        tblCIA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCIAMouseClicked(evt);
            }
        });
        tblCIA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblCIAKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblCIAKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tblCIAKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(tblCIA);
        if (tblCIA.getColumnModel().getColumnCount() > 0) {
            tblCIA.getColumnModel().getColumn(0).setResizable(false);
        }

        jPanel3.setBackground(new java.awt.Color(0, 102, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 0));
        jLabel2.setText("TOTAL PASS");

        txtCIA1TotalPass.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("TOTAL FAIL");

        txtCIA1TotalFail.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        txtCIA2TotalPass.setEditable(false);
        txtCIA2TotalPass.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        txtCIA2TotalFail.setEditable(false);
        txtCIA2TotalFail.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        txtCIA3TotalPass.setEditable(false);
        txtCIA3TotalPass.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        txtCIA3TotalFail.setEditable(false);
        txtCIA3TotalFail.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        txtCIA4TotalPass.setEditable(false);
        txtCIA4TotalPass.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        txtCIA4TotalFail.setEditable(false);
        txtCIA4TotalFail.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(28, 28, 28)
                        .addComponent(txtCIA1TotalFail, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(28, 28, 28)
                        .addComponent(txtCIA1TotalPass, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCIA2TotalPass, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                    .addComponent(txtCIA2TotalFail))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCIA3TotalPass, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(txtCIA3TotalFail))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCIA4TotalPass, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(txtCIA4TotalFail))
                .addGap(43, 43, 43))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 2, Short.MAX_VALUE)
                        .addComponent(txtCIA3TotalPass, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCIA3TotalFail, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(txtCIA2TotalFail, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCIA1TotalPass, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCIA2TotalPass, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCIA1TotalFail, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtCIA4TotalPass, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCIA4TotalFail, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        cmbCIA.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbCIAItemStateChanged(evt);
            }
        });
        cmbCIA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCIAActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Current CIA");

        cmdColumnEnabled.setText("Set Enabled");
        cmdColumnEnabled.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdColumnEnabledActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1142, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbCIA, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28)
                        .addComponent(cmdColumnEnabled, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbCIA, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdColumnEnabled, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Student Name");

        txtStudentName.setEditable(false);
        txtStudentName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtStudentName.setForeground(new java.awt.Color(255, 51, 51));
        txtStudentName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStudentNameActionPerformed(evt);
            }
        });
        txtStudentName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtStudentNameKeyReleased(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("SEM");

        cmbSem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbSem.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbSemItemStateChanged(evt);
            }
        });
        cmbSem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtRegno, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addGap(12, 12, 12)
                        .addComponent(txtStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel17)
                        .addGap(18, 18, 18)
                        .addComponent(cmbSem, 0, 125, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(cmdReset, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(cmdUpdate)
                        .addGap(30, 30, 30))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(6, 6, 6))
                    .addComponent(cmdUpdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmdReset, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1, 1, 1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(8, 8, 8))
                    .addComponent(cmbSem)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtRegno)
                    .addComponent(txtStudentName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setBounds(0, 0, 1251, 747);
    }// </editor-fold>//GEN-END:initComponents

    private void txtRegnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRegnoActionPerformed

    private void txtRegnoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRegnoKeyReleased

        try {
            String sql = "select * from information where student_id=? ";

            pst = conn.prepareStatement(sql);
            pst.setString(1, txtRegno.getText());
            rs = pst.executeQuery();
            /*Pradeesh Code*/
            if(rs.next())
                    {
                        String fname = rs.getString("first_name");                
                        String mname = rs.getString("middle_name");                
                        String lname = rs.getString("last_name");
                        String fullname=fname.toUpperCase()+" "+mname.toUpperCase()+"."+lname.toUpperCase();
                        txtStudentName.setText(fullname);
                        tblCIA.setEnabled(true);                        
                    }
            else
            {
            
                    txtStudentName.setText("");
                    tblCIA.setEnabled(false);                    
                
            }
            /*Pradeesh Code*/
        } catch (Exception e) {

        } finally {

            try {

                rs.close();
                pst.close();

            } catch (Exception e) {

            }
        }


    }//GEN-LAST:event_txtRegnoKeyReleased

    private void cmdResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdResetActionPerformed
       txtRegno.setText("");
       txtStudentName.setText("");
       clearTable();
       getSubjects(cmbSem.getSelectedItem().toString());
       
    }//GEN-LAST:event_cmdResetActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void cmdUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdUpdateActionPerformed
       ArrayList<Internal> internallist=new ArrayList();
       String currentsem=cmbSem.getSelectedItem().toString();
        if(txtRegno.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please Give the Regno Number");
            txtRegno.requestFocus();
        }
        else
        {
          if(tblCIA.getCellEditor().stopCellEditing())
          {
             int rollno=Integer.parseInt(txtRegno.getText());
             
             int rowcount=tblCIA.getRowCount();
             int columncount=tblCIA.getColumnCount();         
             String CIA="";
             Object cia=null;
             int column;
             
             
             for(int i=0;i<rowcount;i++)
             {
                 for(int j=0;j<columncount;j++)
                 {
                      
                     if(tblCIA.getValueAt(i, j)!=null)
                     {                                                                                  
                          //System.out.println("[Row,Column,CIA]="+"["+i+","+j+"]"+tblCIA.getValueAt(i, j)+","+tblCIA.getColumnName(j));
                          Internal internalobj=new Internal();                   
                          if(tblCIA.getValueAt(i, 1)!=null)
                          {                                                
                            if(!tblCIA.getColumnName(j).equals("Subject"))
                            {
                                 CIA=tblCIA.getColumnName(j);
                                 internalobj.setCIA(CIA);
                                 internalobj.setCurrentSem(currentsem);
                                 internalobj.setRollno(rollno);
                                 internalobj.setSubjectName(tblCIA.getValueAt(i, 0).toString());                                   
                                 internalobj.setMark(Integer.parseInt(tblCIA.getValueAt(i, 1).toString()));
                                 internallist.add(internalobj);
                            }                        
                          }
                          if(tblCIA.getValueAt(i, 2)!=null)
                          {                                                
                            if(!tblCIA.getColumnName(j).equals("Subject"))
                            {
                                 CIA=tblCIA.getColumnName(j);
                                 internalobj.setCIA(CIA);
                                 internalobj.setCurrentSem(currentsem);
                                 internalobj.setRollno(rollno);
                                 internalobj.setSubjectName(tblCIA.getValueAt(i, 0).toString());                                   
                                 internalobj.setMark(Integer.parseInt(tblCIA.getValueAt(i, 2).toString()));
                                 internallist.add(internalobj);
                            }                        
                          }
                          if(tblCIA.getValueAt(i, 3)!=null)
                          {                                                
                            if(!tblCIA.getColumnName(j).equals("Subject"))
                            {
                                 CIA=tblCIA.getColumnName(j);
                                 internalobj.setCIA(CIA);
                                 internalobj.setCurrentSem(currentsem);
                                 internalobj.setRollno(rollno);
                                 internalobj.setSubjectName(tblCIA.getValueAt(i, 0).toString());                                   
                                 internalobj.setMark(Integer.parseInt(tblCIA.getValueAt(i, 3).toString()));
                                 internallist.add(internalobj);
                            }                        
                          }
                          if(tblCIA.getValueAt(i, 4)!=null)
                          {                                                
                            if(!tblCIA.getColumnName(j).equals("Subject"))
                            {
                                 CIA=tblCIA.getColumnName(j);
                                 internalobj.setCIA(CIA);
                                 internalobj.setCurrentSem(currentsem);
                                 internalobj.setRollno(rollno);
                                 internalobj.setSubjectName(tblCIA.getValueAt(i, 0).toString());                                   
                                 internalobj.setMark(Integer.parseInt(tblCIA.getValueAt(i, 4).toString()));
                                 internallist.add(internalobj);
                            }                        
                          }
                 
                     }   
                  }
              }
             /*System.out.println("ROLLNO"+"\t"+"SUBJECTNAME"+"\t\t"+"CIA"+"\t"+"MARK");
             for(Internal obj:internallist)
             {
                 System.out.println(obj.getRollno()+"\t"+obj.getSubjectName()+"\t\t"+obj.getCIA()+"\t"+obj.getMark());
             }
             */
             System.out.println("ROLLNO"+"\t"+"SUBJECTNAME"+"\t\t"+"CIA"+"\t"+"MARK");
             for(int i=0;i<internallist.size();i++)
             {
                 System.out.println(internallist.get(i).getRollno()+"\t"+internallist.get(i).getSubjectName()+"\t"+internallist.get(i).getCIA()+"\t"+internallist.get(i).getMark());
             }
             try
             {
             for(int i=0;i<internallist.size();i++)
             {
                 pst=conn.prepareStatement("INSERT INTO INTERNAL (SEM,ROLL_NO,SUBJECTNAME,CIA,MARK) VALUES(?,?,?,?,?)");
                 pst.setString(1, internallist.get(i).getCurrentSem());
                 pst.setInt(2,internallist.get(i).getRollno());
                 pst.setString(3,internallist.get(i).getSubjectName());
                 pst.setString(4, internallist.get(i).getCIA());
                 pst.setInt(5, internallist.get(i).getMark());
                 pst.executeUpdate();
             }
             }
             catch(SQLException sqle)
             {
                 System.out.println(sqle.getMessage());
             }
        } 
        
      
      
    }//GEN-LAST:event_cmdUpdateActionPerformed
    }
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       
        new AdminPage().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtStudentNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStudentNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStudentNameActionPerformed

    private void txtStudentNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStudentNameKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStudentNameKeyReleased

    private void cmbSemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSemActionPerformed
       clearTable();  
       String sem=cmbSem.getSelectedItem().toString();
       getSubjects(sem);
       tableAlignment();
        /*ChangeHeader changeheader=new ChangeHeader(sem);
        ArrayList<Semester> al=changeheader.getList();
         int columncount=tblCIA.getColumnCount();
        System.out.println(columncount) ;
          for(int i=0;i<columncount;i++)
         {
             model=(DefaultTableModel) tblCIA.getModel();
             TableColumn tc=tblCIA.getColumnModel().getColumn(i);
             tblCIA.removeColumn(tc);
             tblCIA.revalidate();
         }
         for(int i=0;i<al.size();i++)
           {
              model=(DefaultTableModel) tblCIA.getModel();
              model.addColumn(al.get(i).getSubjectcode());   
              //System.out.println(al.get(i).getSubjectcode());
           }
       tblCIA.setModel(model);*/
    }//GEN-LAST:event_cmbSemActionPerformed
    void getSubjects(String sem)
    {       
       ChangeHeader changeheader=new ChangeHeader(sem);
       ArrayList<Semester> al=changeheader.getList();
       model=(DefaultTableModel)tblCIA.getModel();   
       Object row[]=new Object[al.size()];
       for(int i=0;i<al.size();i++)
       {
          row[0]=al.get(i).getSubjectname();
          model.addRow(row);
       }
       tblCIA.setModel(model); 
    }
    void clearTable()
    {
        model=(DefaultTableModel)tblCIA.getModel();
        model.getDataVector().removeAllElements();
        //revalidate();
    }
    void tableAlignment()
    {                
        tblCIA.setFont(new Font("Tahoma",Font.BOLD,18));
        tblCIA.setShowGrid(true);        
        tblCIA.getColumnModel().getColumn(0).setMaxWidth(600);
        tblCIA.getColumnModel().getColumn(1).setMaxWidth(150);
        tblCIA.getColumnModel().getColumn(2).setMaxWidth(150);
        tblCIA.getColumnModel().getColumn(3).setMaxWidth(150);
        tblCIA.getColumnModel().getColumn(4).setMaxWidth(150);
        tblCIA.getTableHeader().setForeground(Color.blue);
    }
    private void cmbSemItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbSemItemStateChanged
    
    }//GEN-LAST:event_cmbSemItemStateChanged

    private void tblCIAKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblCIAKeyPressed
       cellValidation();  
    }//GEN-LAST:event_tblCIAKeyPressed

    private void tblCIAKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblCIAKeyReleased
        TableEditor tableeditor=new TableEditor();
        int passcount=tableeditor.getPasscount();
        int failcount=tableeditor.getFailcount();
        txtCIA1TotalPass.setText(Integer.toString(passcount));
        txtCIA1TotalFail.setText(Integer.toString(failcount));
    }//GEN-LAST:event_tblCIAKeyReleased

    private void tblCIAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblCIAKeyTyped
        
       
    }//GEN-LAST:event_tblCIAKeyTyped

    private void tblCIAFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tblCIAFocusLost
        int currentRow=tblCIA.getEditingRow();
        int currentColumn=tblCIA.getEditingColumn();
         
    }//GEN-LAST:event_tblCIAFocusLost

    private void cmbCIAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCIAActionPerformed
        /*model=(DefaultTableModel) tblCIA.getColumnModel();
        TableColumn mycolumn=tblCIA.getColumn(columnName);*/
        
        
    }//GEN-LAST:event_cmbCIAActionPerformed

    private void tblCIAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCIAMouseClicked
        if(txtRegno.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please Give the Register Number");
            txtRegno.requestFocus();
        }
        else
        {
            tblCIA.setEnabled(true);
        }
    }//GEN-LAST:event_tblCIAMouseClicked

    private void cmbCIAItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbCIAItemStateChanged
       
    }//GEN-LAST:event_cmbCIAItemStateChanged

    private void cmdColumnEnabledActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdColumnEnabledActionPerformed
        String CIA=cmbCIA.getSelectedItem().toString();
        model=(DefaultTableModel) tblCIA.getModel();
        model.setColumnCount(2);        
        TableColumnModel tcm=tblCIA.getColumnModel();
        TableColumn tc=tcm.getColumn(1);
        tc.setHeaderValue(CIA);
                
        
        
    }//GEN-LAST:event_cmdColumnEnabledActionPerformed
  private void cellValidation()
    {                
        /*model=(DefaultTableModel)tblCIA.getModel();
        int currentRow=tblCIA.getEditingRow();
        int currentColumn=tblCIA.getEditingColumn();
        tblCIA.changeSelection(currentRow, currentColumn, false, false);*/
        JTextField textField=new JTextField();                
        TableEditor tableeditor=new TableEditor();
        TableColumnModel columnmodel=tblCIA.getColumnModel();        
        TableColumn col1=columnmodel.getColumn(1);        
        col1.setCellEditor(tableeditor);        
        TableColumn col2=columnmodel.getColumn(2);
        col2.setCellEditor(tableeditor);        
        TableColumn col3=columnmodel.getColumn(3);
        col3.setCellEditor(tableeditor);        
        TableColumn col4=columnmodel.getColumn(4);
        col4.setCellEditor(tableeditor);     
        
     }
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
            java.util.logging.Logger.getLogger(ShowInternalDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShowInternalDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShowInternalDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowInternalDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShowInternalDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbCIA;
    private javax.swing.JComboBox<String> cmbSem;
    private javax.swing.JButton cmdColumnEnabled;
    private javax.swing.JButton cmdReset;
    private javax.swing.JButton cmdUpdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCIA;
    private javax.swing.JTextField txtCIA1TotalFail;
    private javax.swing.JTextField txtCIA1TotalPass;
    private javax.swing.JTextField txtCIA2TotalFail;
    private javax.swing.JTextField txtCIA2TotalPass;
    private javax.swing.JTextField txtCIA3TotalFail;
    private javax.swing.JTextField txtCIA3TotalPass;
    private javax.swing.JTextField txtCIA4TotalFail;
    private javax.swing.JTextField txtCIA4TotalPass;
    private javax.swing.JTextField txtRegno;
    private javax.swing.JTextField txtStudentName;
    // End of variables declaration//GEN-END:variables
 private javax.swing.JTable jTable1;
    private ImageIcon format = null;
    String filename = null;
    byte[] person_image = null;

}

    
   

