/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Form;

import Model.User;
import Services.UserService;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author pc
 */
public class AddUserFrame extends javax.swing.JFrame {
    UserService userService;
    User user;
    /**
     * Creates new form AddUserFrame
     */
    public AddUserFrame() {
        initComponents();
        setLocationRelativeTo(null);
        userService = new UserService();
        user = new User();
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
        lbAddUser = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbTen = new javax.swing.JLabel();
        lbTaiKhoan = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        lbMatKhau = new javax.swing.JLabel();
        lbSoDT = new javax.swing.JLabel();
        lbNoiDung = new javax.swing.JLabel();
        lbChucVu = new javax.swing.JLabel();
        lbSoThich = new javax.swing.JLabel();
        txtTaiKhoan = new javax.swing.JTextField();
        txtMatKhau = new javax.swing.JTextField();
        txtSoDT = new javax.swing.JTextField();
        cbNgheNhac = new javax.swing.JCheckBox();
        cbXemPhim = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtNoiDung = new javax.swing.JTextArea();
        rdbtAdmin = new javax.swing.JRadioButton();
        rdbtUser = new javax.swing.JRadioButton();
        btBackToList = new javax.swing.JButton();
        btSubmitAdd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbAddUser.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        lbAddUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbAddUser.setText("Thêm mới User");

        lbTen.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTen.setText("Tên");

        lbTaiKhoan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTaiKhoan.setText("Tài Khoản");

        txtTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenActionPerformed(evt);
            }
        });

        lbMatKhau.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbMatKhau.setText("Mật khẩu");

        lbSoDT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbSoDT.setText("Số ĐT");

        lbNoiDung.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbNoiDung.setText("Nội Dung");

        lbChucVu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbChucVu.setText("Chức vụ");

        lbSoThich.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbSoThich.setText("Sở thích");

        cbNgheNhac.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbNgheNhac.setText("Nghe Nhac");

        cbXemPhim.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbXemPhim.setText("Xem phim");

        txtNoiDung.setColumns(20);
        txtNoiDung.setRows(5);
        jScrollPane1.setViewportView(txtNoiDung);

        buttonGroup1.add(rdbtAdmin);
        rdbtAdmin.setText("Admin");

        buttonGroup1.add(rdbtUser);
        rdbtUser.setText("User");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTen, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lbMatKhau, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbTaiKhoan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbSoDT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbNoiDung, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbChucVu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbSoThich, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                            .addComponent(txtTen, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTaiKhoan, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMatKhau, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSoDT, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(9, 9, 9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cbNgheNhac, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(cbXemPhim))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rdbtAdmin)
                                .addGap(18, 18, 18)
                                .addComponent(rdbtUser)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTen)
                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTaiKhoan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbMatKhau))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbSoDT)
                    .addComponent(txtSoDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbNoiDung)
                        .addGap(70, 70, 70))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbChucVu)
                    .addComponent(rdbtAdmin)
                    .addComponent(rdbtUser))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSoThich)
                    .addComponent(cbNgheNhac)
                    .addComponent(cbXemPhim))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        btBackToList.setText("Back");
        btBackToList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBackToListActionPerformed(evt);
            }
        });

        btSubmitAdd.setBackground(new java.awt.Color(255, 153, 51));
        btSubmitAdd.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        btSubmitAdd.setForeground(new java.awt.Color(255, 255, 255));
        btSubmitAdd.setText("Thêm mới");
        btSubmitAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSubmitAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btSubmitAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbAddUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btBackToList, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btBackToList)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbAddUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btSubmitAdd)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenActionPerformed

    private void btBackToListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBackToListActionPerformed
        try {
            new ListUserFrame().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(AddUserFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_btBackToListActionPerformed

    private void btSubmitAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSubmitAddActionPerformed
        user.setTenKH(txtTen.getText());
        user.setTaiKhoan(txtTaiKhoan.getText());
        user.setMatKhau(txtMatKhau.getText());
        user.setSoDT(txtSoDT.getText());
        user.setNoiDungCV(txtNoiDung.getText());
        String soThich = "";
        if(cbNgheNhac.isSelected())
        {
            soThich += "Nghe Nhac";
        }
        if(cbXemPhim.isSelected())
        {
            soThich += "Xem Phim";
        }
        user.setSoThich(soThich);
        String chucVu ="";
        if(rdbtAdmin.isSelected())
        {
            chucVu += "Admin";
        }
        if(rdbtUser.isSelected())
        {
            chucVu += "User";
        }
        user.setChucVu(chucVu);
        userService.addUser(user);
        JOptionPane.showMessageDialog(AddUserFrame.this,"Thêm thành công");
        try {
            
            new ListUserFrame().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(AddUserFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
       this.dispose();
    }//GEN-LAST:event_btSubmitAddActionPerformed

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
            java.util.logging.Logger.getLogger(AddUserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddUserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddUserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddUserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddUserFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBackToList;
    private javax.swing.JButton btSubmitAdd;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox cbNgheNhac;
    private javax.swing.JCheckBox cbXemPhim;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbAddUser;
    private javax.swing.JLabel lbChucVu;
    private javax.swing.JLabel lbMatKhau;
    private javax.swing.JLabel lbNoiDung;
    private javax.swing.JLabel lbSoDT;
    private javax.swing.JLabel lbSoThich;
    private javax.swing.JLabel lbTaiKhoan;
    private javax.swing.JLabel lbTen;
    private javax.swing.JRadioButton rdbtAdmin;
    private javax.swing.JRadioButton rdbtUser;
    private javax.swing.JTextField txtMatKhau;
    private javax.swing.JTextArea txtNoiDung;
    private javax.swing.JTextField txtSoDT;
    private javax.swing.JTextField txtTaiKhoan;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables
}
