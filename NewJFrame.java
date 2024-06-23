
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author tuann
 */
public class NewJFrame extends javax.swing.JFrame {
    List<TraKiem> list = new ArrayList<>();
        String strDbUrl = "jdbc:sqlserver://localhost:1433; "
                + "databaseName=PTPM_FINALLY_JAVA_MOB1024;"  //Cấu hình theo tên database muốn kết nối
                + "user=sa;"                
                + "password=123456;"       //Cấu hình theo mật khẩu tài khoản sa
                + "encrypt=true;trustServerCertificate=true";
    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
        setLocationRelativeTo(null);
        Load();
    }
   
    public void Load(){
        try {
            Connection con =  DriverManager.getConnection(strDbUrl);
            list.clear();
            String sql = "SELECT * FROM SinhVien";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
            int ID = rs.getInt(1);
            String Ma = rs.getString(2);
            String Ten = rs.getString(3);
            boolean gt = rs.getBoolean(4);
            int Tuoi = rs.getInt(5);
            TraKiem tk = new TraKiem(ID, Ma, Ten, gt, Tuoi);
            list.add(tk);
            }
            con.close();
        } catch (Exception e) {
            System.out.println("Loi ket noi"+e);
        }
       LoadTable();
    }
    
    public void LoadTable(){
        DefaultTableModel model = (DefaultTableModel) tbTT.getModel();
        model.setRowCount(0);
        for (TraKiem tk : list) {
            String gioiTinh = "Nu";
            if (tk.isGioiTinh()) {
                gioiTinh = "Nam";
            }
         model.addRow(new Object[]{tk.getID(), tk.getMa(), tk.getTen(), gioiTinh, tk.getTuoi()});
        }
    }
    
    public void Click(){
      int chon = tbTT.getSelectedRow();
      TraKiem tk = list.get(chon);
      txtID.setText(String.valueOf(tk.getID()));
      txtMa.setText(tk.getMa());
      txtTen.setText(tk.getTen());
      txtTuoi.setText(String.valueOf(tk.getTuoi()));
      boolean gt = tk.isGioiTinh();
        if (gt == true) {
            rdNam.setSelected(true);
        } else {
            rdNu.setSelected(true);
        }
    }
    
    public boolean check(String ma){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getMa().equalsIgnoreCase(ma)) {
                return true;
            }
        }
        return false;
    }
    
    public void Save(){
        if (check(txtMa.getText()) == true) {
            JOptionPane.showMessageDialog(this, "Ma sinh vien bi trung lap??");
        } else {
        try {
            if (txtMa.getText().isEmpty() || txtTen.getText().isEmpty() 
                    || buttonGroup1.getSelection() == null || txtTuoi.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Ban chua nhap day du thong tin??");
            } else {
            Connection con = DriverManager.getConnection(strDbUrl);
            String luu = "INSERT INTO SinhVien VALUES (?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(luu);
            ps.setString(1, txtMa.getText());
            ps.setString(2, txtTen.getText());
            ps.setInt(3, rdNam.isSelected()?1:0);
            ps.setInt(4, Integer.parseInt(txtTuoi.getText()));
            ps.executeUpdate();
            Load();
            con.close();
            JOptionPane.showMessageDialog(this, "Ban da luu thong cong!!");
            }
        } catch (Exception e) {
            System.out.println("Loi ket noi"+ e);
        }
        }
    }
    
       public void New(){
      txtID.setText("");
      txtMa.setText("");
      txtTen.setText("");
      txtTuoi.setText("");
      buttonGroup1.clearSelection();
    }
    
    public void Update(){
        try {
            if (txtMa.getText().isEmpty() || txtTen.getText().isEmpty() 
                    || buttonGroup1.getSelection() == null || txtTuoi.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Ban chua nhap du thong tin cap nhat??");
            } else {
            Connection con = DriverManager.getConnection(strDbUrl);
            String up = "UPDATE SinhVien SET Ten = ?, GioiTinh = ?, Tuoi = ? WHERE Ma = ?";
            PreparedStatement ps = con.prepareStatement(up);
            ps.setString(1, txtTen.getText());
            ps.setInt(2, rdNam.isSelected()?1:0);
            ps.setInt(3, Integer.parseInt(txtTuoi.getText()));
            ps.setString(4, txtMa.getText());
            ps.executeUpdate();
            Load();
            con.close();
            JOptionPane.showMessageDialog(this, "Ban da cap nhat thanh cong??");
            }
        } catch (Exception e) {
            System.out.println("Loi ket noi"+e);
        }
    }
    
    public void Xoa(){
        try {
            if (txtMa.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Ban chua nhap ma can xoa??");
            } else {
            Connection con = DriverManager.getConnection(strDbUrl);
            String de = "DELETE FROM SinhVien WHERE Ma = ?";
            PreparedStatement ps = con.prepareStatement(de);
            ps.setString(1, txtMa.getText());
            ps.executeUpdate();
            Load();
            con.close();
            JOptionPane.showMessageDialog(this, "Ban da xoa thanh cong!!");
            }
        } catch (Exception e) {
            System.out.println("Loi ket noi"+e);
        }
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtMa = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTuoi = new javax.swing.JTextField();
        rdNam = new javax.swing.JRadioButton();
        rdNu = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbTT = new javax.swing.JTable();
        txtSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        txtUpdate = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Quan LY");

        jLabel2.setText("ID");

        jLabel3.setText("Ma");

        txtID.setEditable(false);

        jLabel4.setText("GioiTinh");

        jLabel5.setText("Tuoi");

        buttonGroup1.add(rdNam);
        rdNam.setText("Nam");

        buttonGroup1.add(rdNu);
        rdNu.setText("Nu");

        tbTT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Ma", "Ten", "GioiTinh", "Tuoi"
            }
        ));
        tbTT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbTTMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbTT);

        txtSave.setText("Save");
        txtSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSaveActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        txtUpdate.setText("UpDate");
        txtUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUpdateActionPerformed(evt);
            }
        });

        jLabel6.setText("Ten");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNew)
                        .addGap(18, 18, 18)
                        .addComponent(txtSave))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete)))
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTen, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                            .addComponent(txtMa)
                            .addComponent(txtID))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(5, 5, 5)
                                .addComponent(rdNam)
                                .addGap(18, 18, 18)
                                .addComponent(rdNu, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(rdNam)
                    .addComponent(rdNu)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtTuoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNew)
                    .addComponent(txtSave))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(txtUpdate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbTTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTTMouseClicked
        // TODO add your handling code here:
      Click(); 
    }//GEN-LAST:event_tbTTMouseClicked

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        // TODO add your handling code here:
      New();
    }//GEN-LAST:event_btnNewActionPerformed

    private void txtSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSaveActionPerformed
        // TODO add your handling code here:
     Save();
    }//GEN-LAST:event_txtSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
    Xoa();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUpdateActionPerformed
        // TODO add your handling code here:
    Update();
    }//GEN-LAST:event_txtUpdateActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNew;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdNam;
    private javax.swing.JRadioButton rdNu;
    private javax.swing.JTable tbTT;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtMa;
    private javax.swing.JButton txtSave;
    private javax.swing.JTextField txtTen;
    private javax.swing.JTextField txtTuoi;
    private javax.swing.JButton txtUpdate;
    // End of variables declaration//GEN-END:variables
}
