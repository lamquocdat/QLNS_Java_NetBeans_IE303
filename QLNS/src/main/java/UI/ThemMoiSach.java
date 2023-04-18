/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import Connect.NXB_Connect;
import Connect.Sach_Connect;
import Model.NXB;
import Model.Sach;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author nguye
 */
public class ThemMoiSach extends javax.swing.JFrame {

    private ArrayList<NXB> dsnxb = null;
    /**
     * Creates new form ThemMoiSach
     */
    public ThemMoiSach(String title) {
        initComponents();
        this.setTitle(title);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        hienThiToanBoNhaXuatBan();
    }

    private void hienThiToanBoNhaXuatBan() {
        NXB_Connect nxbconn = new NXB_Connect();
        dsnxb=nxbconn.layToanBoNhaXuatBan();
        NXBInput.removeAllItems();
        NXB nxb = new NXB();
        nxb.setMaNXB("0");
        nxb.setTenNXB("Tất cả");
        NXBInput.addItem(nxb);
        for(NXB s : dsnxb) NXBInput.addItem(s); 	
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_Top = new javax.swing.JPanel();
        jLabel_Top = new javax.swing.JLabel();
        jPanel_Bottom = new javax.swing.JPanel();
        jButton_ThemSach = new javax.swing.JButton();
        jButton_NhapLai = new javax.swing.JButton();
        jPanel_Center = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel_MaSach = new javax.swing.JLabel();
        jLabel_TenSach = new javax.swing.JLabel();
        jLabel_MaNXB = new javax.swing.JLabel();
        jLabel_TacGia = new javax.swing.JLabel();
        jLabel_GiaBan = new javax.swing.JLabel();
        jLabel_TheLoai = new javax.swing.JLabel();
        jLabel_SoLuong = new javax.swing.JLabel();
        textField_MaSach = new java.awt.TextField();
        textField_TenSach = new java.awt.TextField();
        NXBInput = new javax.swing.JComboBox<NXB>();
        textField_TacGia = new java.awt.TextField();
        textField_GiaBan = new java.awt.TextField();
        textField_TheLoai = new java.awt.TextField();
        textField_SoLuong = new java.awt.TextField();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel_Top.setFont(new java.awt.Font("Segoe UI", 3, 28)); // NOI18N
        jLabel_Top.setForeground(new java.awt.Color(102, 153, 255));
        jLabel_Top.setText(" Thêm Sách");

        javax.swing.GroupLayout jPanel_TopLayout = new javax.swing.GroupLayout(jPanel_Top);
        jPanel_Top.setLayout(jPanel_TopLayout);
        jPanel_TopLayout.setHorizontalGroup(
            jPanel_TopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_TopLayout.createSequentialGroup()
                .addContainerGap(226, Short.MAX_VALUE)
                .addComponent(jLabel_Top)
                .addGap(261, 261, 261))
        );
        jPanel_TopLayout.setVerticalGroup(
            jPanel_TopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TopLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel_Top, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel_Top.setIcon(new ImageIcon("images/add_book_40px.png"));

        getContentPane().add(jPanel_Top, java.awt.BorderLayout.PAGE_START);

        jButton_ThemSach.setBackground(new java.awt.Color(51, 255, 153));
        jButton_ThemSach.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_ThemSach.setForeground(new java.awt.Color(255, 255, 255));
        jButton_ThemSach.setText("Thêm Sách");
        jButton_ThemSach.setMaximumSize(new java.awt.Dimension(150, 40));
        jButton_ThemSach.setMinimumSize(new java.awt.Dimension(150, 40));
        jButton_ThemSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ThemSachActionPerformed(evt);
            }
        });

        jButton_NhapLai.setBackground(new java.awt.Color(255, 255, 102));
        jButton_NhapLai.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_NhapLai.setText("Nhập lại");
        jButton_NhapLai.setMaximumSize(new java.awt.Dimension(150, 40));
        jButton_NhapLai.setMinimumSize(new java.awt.Dimension(150, 40));
        jButton_NhapLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_NhapLaiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_BottomLayout = new javax.swing.GroupLayout(jPanel_Bottom);
        jPanel_Bottom.setLayout(jPanel_BottomLayout);
        jPanel_BottomLayout.setHorizontalGroup(
            jPanel_BottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_BottomLayout.createSequentialGroup()
                .addContainerGap(160, Short.MAX_VALUE)
                .addComponent(jButton_ThemSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(161, 161, 161)
                .addComponent(jButton_NhapLai, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );
        jPanel_BottomLayout.setVerticalGroup(
            jPanel_BottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_BottomLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel_BottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_ThemSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_NhapLai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jButton_ThemSach.setIcon(new ImageIcon("images/add_book_25px.png"));
        jButton_NhapLai.setIcon(new ImageIcon("images/book_and_pencil_25px.png"));

        getContentPane().add(jPanel_Bottom, java.awt.BorderLayout.PAGE_END);

        jSeparator1.setForeground(new java.awt.Color(102, 153, 255));

        jLabel_MaSach.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_MaSach.setText("Mã Sách");

        jLabel_TenSach.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_TenSach.setText("Tên Sách");

        jLabel_MaNXB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_MaNXB.setText("Mã NXB");

        jLabel_TacGia.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_TacGia.setText("Tác Giả");

        jLabel_GiaBan.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_GiaBan.setText("Giá Bán");

        jLabel_TheLoai.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_TheLoai.setText("Thể Loại");

        jLabel_SoLuong.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_SoLuong.setText("Số Lượng");

        jSeparator2.setForeground(new java.awt.Color(102, 153, 255));

        javax.swing.GroupLayout jPanel_CenterLayout = new javax.swing.GroupLayout(jPanel_Center);
        jPanel_Center.setLayout(jPanel_CenterLayout);
        jPanel_CenterLayout.setHorizontalGroup(
            jPanel_CenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CenterLayout.createSequentialGroup()
                .addContainerGap(111, Short.MAX_VALUE)
                .addGroup(jPanel_CenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_CenterLayout.createSequentialGroup()
                        .addGroup(jPanel_CenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_MaSach)
                            .addComponent(jLabel_TenSach)
                            .addComponent(jLabel_MaNXB)
                            .addComponent(jLabel_TacGia)
                            .addComponent(jLabel_GiaBan)
                            .addComponent(jLabel_TheLoai)
                            .addComponent(jLabel_SoLuong))
                        .addGap(67, 67, 67)
                        .addGroup(jPanel_CenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textField_TenSach, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NXBInput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField_TacGia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField_GiaBan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField_TheLoai, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField_SoLuong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(textField_MaSach, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(126, 126, 126))
            .addGroup(jPanel_CenterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_CenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel_CenterLayout.setVerticalGroup(
            jPanel_CenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CenterLayout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel_CenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_MaSach, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textField_MaSach, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel_CenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_TenSach, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textField_TenSach, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel_CenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_MaNXB)
                    .addComponent(NXBInput, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel_CenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_TacGia, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textField_TacGia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel_CenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_GiaBan, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textField_GiaBan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel_CenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_TheLoai, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textField_TheLoai, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel_CenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_SoLuong, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textField_SoLuong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel_MaSach.setIcon(new ImageIcon("images/repository_28px.png"));
        jLabel_TenSach.setIcon(new ImageIcon("images/cbz_28px.png"));
        jLabel_MaNXB.setIcon(new ImageIcon("images/link_28px.png"));
        jLabel_TacGia.setIcon(new ImageIcon("images/customer_28px.png"));
        jLabel_GiaBan.setIcon(new ImageIcon("images/Banknotes_28px.png"));
        jLabel_TheLoai.setIcon(new ImageIcon("images/category_28px.png"));
        jLabel_SoLuong.setIcon(new ImageIcon("images/how_many_quest_28px.png"));

        getContentPane().add(jPanel_Center, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_NhapLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_NhapLaiActionPerformed
        // TODO add your handling code here:
                                textField_MaSach.setText("");
				textField_TenSach.setText("");
				//txtMaNXB.setText("");
				textField_TacGia.setText("");
				textField_GiaBan.setText("");
				textField_TheLoai.setText("");
				textField_SoLuong.setText("");
				
				textField_MaSach.requestFocus();
    }//GEN-LAST:event_jButton_NhapLaiActionPerformed

    private void jButton_ThemSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ThemSachActionPerformed
        // TODO add your handling code here:
        jButton_ThemSach.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(textField_MaSach.getText().length()==0 ||  
						textField_TenSach.getText().length()==0 || textField_TacGia.getText().length()==0 || textField_GiaBan.getText().length()==0 ||
						textField_TheLoai.getText().length()==0 || textField_SoLuong.getText().length()==0) return ;
				
				NXB nxb = (NXB) NXBInput.getSelectedItem();
				Sach s = new Sach();
				s.setMaSach(textField_MaSach.getText());
				s.setTenSach(textField_TenSach.getText());
				s.setMaNXB(nxb.getMaNXB());
				s.setTacGia(textField_TacGia.getText());
				s.setGiaBan(Double.parseDouble(textField_GiaBan.getText()));
				s.setTheLoai(textField_TheLoai.getText());
				s.setSoLuong(Integer.parseInt(textField_SoLuong.getText()));
				
				int x =JOptionPane.showConfirmDialog(null, "Bạn chắc chắn muôn thêm sách", "Xác nhận thêm",JOptionPane.OK_CANCEL_OPTION);
				if(x==JOptionPane.OK_OPTION)
				{
					xuLyThemMoi(s);	
				}
				else return;
				
				
				
			}
		});
    }//GEN-LAST:event_jButton_ThemSachActionPerformed
    
    protected void xuLyThemMoi(Sach s) {
		Sach_Connect themsach = new Sach_Connect();
		int active = themsach.themSachMoi(s);
		if(active > 0 )
		{
			JOptionPane.showMessageDialog(null, "Thêm mới thành công");
                                textField_MaSach.setText("");
				textField_TenSach.setText("");	
				textField_TacGia.setText("");
				textField_GiaBan.setText("");
				textField_TheLoai.setText("");
				textField_SoLuong.setText("");
				textField_MaSach.requestFocus();
                                
                                QuanLySach sachui = new QuanLySach("Quản lý sách");
        sachui.showWindow();
			
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Thêm mới thất bại");
		}
		
	}
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<NXB> NXBInput;
    private javax.swing.JButton jButton_NhapLai;
    private javax.swing.JButton jButton_ThemSach;
    private javax.swing.JLabel jLabel_GiaBan;
    private javax.swing.JLabel jLabel_MaNXB;
    private javax.swing.JLabel jLabel_MaSach;
    private javax.swing.JLabel jLabel_SoLuong;
    private javax.swing.JLabel jLabel_TacGia;
    private javax.swing.JLabel jLabel_TenSach;
    private javax.swing.JLabel jLabel_TheLoai;
    private javax.swing.JLabel jLabel_Top;
    private javax.swing.JPanel jPanel_Bottom;
    private javax.swing.JPanel jPanel_Center;
    private javax.swing.JPanel jPanel_Top;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private java.awt.TextField textField_GiaBan;
    private java.awt.TextField textField_MaSach;
    private java.awt.TextField textField_SoLuong;
    private java.awt.TextField textField_TacGia;
    private java.awt.TextField textField_TenSach;
    private java.awt.TextField textField_TheLoai;
    // End of variables declaration//GEN-END:variables

    void showWindow() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ThemMoiSach("Thêm mới sách").setVisible(true);
            }
        });
    }
}
