/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import Controller.HanghoaDAO;
import Model.hangHoa;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author THANH TAI
 */
public class HangHoaview extends javax.swing.JFrame {
    HanghoaDAO dao = new HanghoaDAO();
    private ArrayList<hangHoa> list = new ArrayList<hangHoa>();
    DefaultTableModel model;
    //private int selectedIndex;
    HanghoaDAO stDao = new HanghoaDAO();
    /**
     * Creates new form HangHoaview
     */
    public HangHoaview() {
        initComponents();
        this.setLocationRelativeTo(null);
        list = (ArrayList<hangHoa>) new HanghoaDAO().getAll(); // tao danh sach hang hoa tu viec nhan du lieu trong csdl
        model = (DefaultTableModel) jTable1.getModel();
        showTable();// hien thi thong tin trong danh sach
        setResizable(false);
        
    }
    public void resetFrom(){
    txtMaSP.setText("");
    txtTenSP.setText("");
    txtDonGia.setText("");
    }
    public hangHoa getModel(){
       hangHoa st = new hangHoa();
       st.setMASP(txtMaSP.getText().trim());
       st.setTenSP(txtTenSP.getText().trim());
       st.setDongia(txtDonGia.getText().trim());
        return st;
    }
    public void showTable() {
        DefaultTableModel tbModel = (DefaultTableModel) jTable1.getModel();
    tbModel.setRowCount(0);
    for (hangHoa st : dao.getAll()){
        Object dataRow[] = new Object[3];
        dataRow[0] = st.getMASP();
        dataRow[1] = st.getTenSP();
        dataRow[2] = st.getDongia();
        tbModel.addRow(dataRow);
        }
    }

    public void showResult() {
        hangHoa s = list.get(list.size() - 1); // gan s = csdl cuoi cung (vua duoc them vao)
        model.addRow(new Object[]{ // them vao bang model
            s.getMASP(), s.getTenSP(), s.getDongia()
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMaSP = new javax.swing.JTextField();
        txtTenSP = new javax.swing.JTextField();
        txtDonGia = new javax.swing.JTextField();
        btnThemSanPham = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnSangTrang = new javax.swing.JButton();
        btnxoa = new javax.swing.JButton();
        btnxoa1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MaSP", "TenSP", "DonGia"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setBackground(new java.awt.Color(102, 204, 0));
        jLabel1.setFont(new java.awt.Font("Montserrat", 2, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Mã Sản Phẩm");
        jLabel1.setOpaque(true);

        jLabel2.setBackground(new java.awt.Color(102, 204, 0));
        jLabel2.setFont(new java.awt.Font("Montserrat", 2, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Tên Sản Phâm");
        jLabel2.setOpaque(true);

        jLabel3.setBackground(new java.awt.Color(102, 204, 0));
        jLabel3.setFont(new java.awt.Font("Montserrat", 2, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Đơn giá");
        jLabel3.setOpaque(true);

        btnThemSanPham.setBackground(new java.awt.Color(102, 204, 0));
        btnThemSanPham.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        btnThemSanPham.setForeground(new java.awt.Color(255, 255, 0));
        btnThemSanPham.setText("Add");
        btnThemSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemSanPhamActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(102, 204, 0));
        btnReset.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        btnReset.setForeground(new java.awt.Color(255, 255, 0));
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnSangTrang.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        btnSangTrang.setText("Sang trang Thanh Toán");
        btnSangTrang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSangTrangActionPerformed(evt);
            }
        });

        btnxoa.setBackground(new java.awt.Color(102, 204, 0));
        btnxoa.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        btnxoa.setForeground(new java.awt.Color(255, 255, 0));
        btnxoa.setText("Delete");
        btnxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoaActionPerformed(evt);
            }
        });

        btnxoa1.setBackground(new java.awt.Color(102, 204, 0));
        btnxoa1.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        btnxoa1.setForeground(new java.awt.Color(255, 255, 0));
        btnxoa1.setText("Update");
        btnxoa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoa1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSangTrang, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(btnThemSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnxoa)
                                .addGap(20, 20, 20)
                                .addComponent(btnxoa1)
                                .addGap(18, 18, 18)
                                .addComponent(btnReset)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtTenSP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtMaSP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtDonGia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(12, 12, 12)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTenSP)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnThemSanPham)
                            .addComponent(btnReset)
                            .addComponent(btnxoa)
                            .addComponent(btnxoa1))
                        .addGap(68, 68, 68)
                        .addComponent(btnSangTrang, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(89, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemSanPhamActionPerformed
        hangHoa s = new hangHoa(); // tao doi tuong hang hoa 
        s.setMASP(txtMaSP.getText()); // set gia tri MASP tu text 
        s.setTenSP(txtTenSP.getText()); // set gia tri 
        s.setDongia(txtDonGia.getText());
        list.add(s);
//        dao.add(s);
        // them vao danh sach hang hoa
        // luu vao database
//        if (dao.add(s)) {
//            JOptionPane.showMessageDialog(rootPane, "Add Success!");
//            
//        } else {
//            JOptionPane.showMessageDialog(rootPane, "Add Fail!");
//        }

        // hien thi ket qua ra man hinh
        showResult();    
        
        resetFrom();// TODO add your handling code here:
    }//GEN-LAST:event_btnThemSanPhamActionPerformed

    // event button reset
    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtTenSP.setText("");
        txtMaSP.setText("");
        txtDonGia.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSangTrangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSangTrangActionPerformed
        new ThanhToanview().setVisible(true);
        this.dispose();                // TODO add your handling code here:
    }//GEN-LAST:event_btnSangTrangActionPerformed

    private void btnxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoaActionPerformed
        
        if(txtMaSP.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Bạn chưa nhập mã SP");
            
        }else{
        if(stDao.delete(txtMaSP.getText())>0){
            System.out.println("Xóa Thanh Cong");
            }     
        }
        showTable();
        showResult();  
        resetFrom();
    }//GEN-LAST:event_btnxoaActionPerformed

    private void btnxoa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoa1ActionPerformed
        hangHoa st = getModel();
        if(stDao.update(st)>0){
            System.out.println("Sửa Thanh Cong");
        }
        showTable();
        showResult();  
        resetFrom();
    }//GEN-LAST:event_btnxoa1ActionPerformed

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
            java.util.logging.Logger.getLogger(HangHoaview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HangHoaview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HangHoaview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HangHoaview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HangHoaview().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSangTrang;
    private javax.swing.JButton btnThemSanPham;
    private javax.swing.JButton btnxoa;
    private javax.swing.JButton btnxoa1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextField txtMaSP;
    private javax.swing.JTextField txtTenSP;
    // End of variables declaration//GEN-END:variables
}
