package components;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class InfomationTours {
	public JPanel thongtinkhach;
	
	
	private JLabel jlbTenNhanVien;
	private JLabel jlbTenChiNhanh;
	private JLabel jlbTenKhach;
	private JLabel jlbNumCMND;
	private JLabel jlbNumberPhone;
	
	private JLabel jlbTenDiaDiem;
	private JLabel jlbTenPhuongTien;
	private JLabel jlbTenKhachSan;
	
	private JTextArea jtaGioKhoiHanh;
	private JTextArea jtaGioQuayVe;
	
	private JButton btnEditDiaDiem;
	private JButton btnEditPhuongTien;
	private JButton btnEditKhachSan;
	private JButton jtbDatVe;
	
	
	public InfomationTours()
	{	
				thongtinkhach = new JPanel();
		//NORTH
				JPanel jpnNORTH = new JPanel();
//				jpnNORTH.setBackground(Color.darkGray);
				thongtinkhach.add(jpnNORTH, BorderLayout.NORTH);
				
				JPanel jpnNhanVien = new JPanel();

				jpnNhanVien.setLayout(new BoxLayout(jpnNhanVien, BoxLayout.Y_AXIS));
				jpnNhanVien.setBorder(BorderFactory.createLineBorder(Color.black));
				jpnNORTH.add(jpnNhanVien);
				
				JPanel jpnLine1 = new JPanel();
				jpnNhanVien.add(jpnLine1);
				jpnLine1.setLayout(new BoxLayout(jpnLine1, BoxLayout.X_AXIS));
				
				JLabel jlbNhanVien = new JLabel("Nhân Viên: ");
				jlbNhanVien.setFont(new Font("Helvetica Neue", 0, 23));
				
				jlbTenNhanVien = new JLabel("Trọng Mẫn");
				jlbTenNhanVien.setFont(new Font("Helvetica Neue", 0, 23));
				jpnLine1.add(jlbNhanVien);
				jpnLine1.add(jlbTenNhanVien);
				
				
				JPanel jpnLine2 = new JPanel();
				jpnNhanVien.add(jpnLine2);
				jpnLine2.setLayout(new BoxLayout(jpnLine2, BoxLayout.X_AXIS));
				
				JLabel jlbChiNhanh = new JLabel("Chi Nhánh: ");
				jlbChiNhanh.setFont(new Font("Helvetica Neue", 0, 23));
				jlbTenChiNhanh = new JLabel("12 Nguyễn Văn Bảo");
				jlbTenChiNhanh.setFont(new Font("Helvetica Neue", 0, 23));
				jpnLine2.add(jlbChiNhanh);
				jpnLine2.add(jlbTenChiNhanh);
				// NORTH
			//	controlPanel.add(jpnWEST, BorderLayout.WEST);
				

//				JPanel jpnBtnTim = new JPanel();
//				jpnBtnTim.setBorder(new EmptyBorder(10, 22, 10, 10));
//				
//				btnTimThongTinKhach = new JButton("Tìm Thông Tin Khách");
//				btnTimThongTinKhach.setPreferredSize(new Dimension(300, 40));
//				btnTimThongTinKhach.setFont(new Font("Helvetica Neue", 0, 23));
//				jpnBtnTim.add(btnTimThongTinKhach);
//				
//				
//				JPanel jpnBtnKhuyenMai = new JPanel();
//				jpnBtnKhuyenMai.setBorder(new EmptyBorder(30, 22, 10, 10));
//				
//				btnChuongTrinhKhuyenMai = new JButton("Chương Trình Khuyến Mãi");
//				btnChuongTrinhKhuyenMai.setPreferredSize(new Dimension(300, 40));
//				btnChuongTrinhKhuyenMai.setFont(new Font("Helvetica Neue", 0, 23));
//				jpnBtnKhuyenMai.add(btnChuongTrinhKhuyenMai);
//				
//				
//				JPanel jpnBtnHanhTrinh = new JPanel();
//				jpnBtnHanhTrinh.setBorder(new EmptyBorder(30, 22, 10, 10));
//				
//				btnXemHanhTrinh = new JButton("Xem Hành Trình Hôm Nay");
//				btnXemHanhTrinh.setPreferredSize(new Dimension(300, 40));
//				btnXemHanhTrinh.setFont(new Font("Helvetica Neue", 0, 23));
//				jpnBtnHanhTrinh.add(btnXemHanhTrinh);
//				
//				
//				JPanel jpnBtnTimThongTinDonHang = new JPanel();
//				jpnBtnTimThongTinDonHang.setBorder(new EmptyBorder(30, 22, 10, 10));
//				
//				btnTimThongTinDonHang = new JButton("Tìm Thông Tin Đơn Hàng");
//				btnTimThongTinDonHang.setPreferredSize(new Dimension(300, 40));
//				btnTimThongTinDonHang.setFont(new Font("Helvetica Neue", 0, 23));
//				jpnBtnTimThongTinDonHang.add(btnTimThongTinDonHang);
//				
//				
//				JPanel jpnBtnXemLichLamTrongNgay = new JPanel();
//				jpnBtnXemLichLamTrongNgay.setBorder(new EmptyBorder(30, 22, 10, 10));
//				
//				btnXemLichLamTrongNgay = new JButton("Xem Lịch Làm Trong Ngày");
//				btnXemLichLamTrongNgay.setPreferredSize(new Dimension(300, 40));
//				btnXemLichLamTrongNgay.setFont(new Font("Helvetica Neue", 0, 23));
//				jpnBtnXemLichLamTrongNgay.add(btnXemLichLamTrongNgay);
//				
//				
//				JPanel jpnBtnDangXuat = new JPanel();
//				jpnBtnDangXuat.setBorder(new EmptyBorder(200, 22, 20, 20));
//				
//				btnDangXuat = new JButton("Đăng Xuất");
//				btnDangXuat.setFont(new Font("Helvetica Neue", 0, 23));
//				btnDangXuat.setPreferredSize(new Dimension(300, 40));
//				
//				jpnBtnDangXuat.add(btnDangXuat);
//				
				// WEST
				

				
				
				// CENTER
				JPanel jpnCENTER = new JPanel();
//				jpnCENTER.setBackground(Color.darkGray);
				thongtinkhach.add(jpnCENTER,BorderLayout.CENTER);
				
				JPanel jpnCENTER_Y_AXIS = new JPanel();
				jpnCENTER_Y_AXIS.setLayout(new BoxLayout(jpnCENTER_Y_AXIS, BoxLayout.PAGE_AXIS));
				jpnCENTER.add(jpnCENTER_Y_AXIS);
				
				JPanel jpnTenCty = new JPanel();

				

				JLabel jlbTenCty = new JLabel("Cty Du Lịch KenKen");

				jlbTenCty.setFont(new Font("Helvetica Neue", 0, 25));
				jlbTenCty.setForeground(Color.BLUE);
				jpnTenCty.add(jlbTenCty);
				
				
				JPanel jpnKetQuaTimKiem = new JPanel();
				jpnKetQuaTimKiem.setPreferredSize(new Dimension(1000, 600));
				jpnKetQuaTimKiem.setLayout(new BoxLayout(jpnKetQuaTimKiem, BoxLayout.Y_AXIS));
				jpnKetQuaTimKiem.setBorder(BorderFactory.createTitledBorder("Kết Quả Tìm Kiếm"));
				
				JLabel jlbThongTinKH = new JLabel("Thông Tin Khách Hàng");
				jlbThongTinKH.setBorder(new EmptyBorder(0, 0, 15, 0));
				jlbThongTinKH.setForeground(Color.red);
				jlbThongTinKH.setFont(new Font("Helvetica Neue", 0, 23));
				jpnKetQuaTimKiem.add(jlbThongTinKH);
				
				JPanel jpnThongTinKhach = new JPanel();
				jpnThongTinKhach.setLayout(new BoxLayout(jpnThongTinKhach, BoxLayout.X_AXIS));
				
				JLabel jlbKhach = new JLabel("Tên Khách: ");
				jlbKhach.setMaximumSize(new Dimension(125, 40));
				jlbKhach.setFont(new Font("Helvetica Neue", 0, 23));
				jlbTenKhach = new JLabel("Dĩ Khang");
				jlbTenKhach.setFont(new Font("Helvetica Neue", 0, 23));
				jpnThongTinKhach.add(jlbKhach);
				jpnThongTinKhach.add(jlbTenKhach);
				
				JPanel jpnCMND = new JPanel();
				jpnCMND.setLayout(new BoxLayout(jpnCMND, BoxLayout.X_AXIS));
				JLabel jlbCMND = new JLabel("CMND: ");
				jlbCMND.setMaximumSize(new Dimension(140, 40));
				jlbCMND.setFont(new Font("Helvetica Neue", 0, 23));
				jlbNumCMND = new JLabel("123456");
				jlbNumCMND.setFont(new Font("Helvetica Neue", 0, 23));
				jpnCMND.add(jlbCMND);
				jpnCMND.add(jlbNumCMND);
				
				JPanel jpnSDT = new JPanel();
				jpnSDT.setLayout(new BoxLayout(jpnSDT, BoxLayout.X_AXIS));
				JLabel jlbSDT = new JLabel("Phone: ");
				jlbSDT.setMaximumSize(new Dimension(90, 40));
				jlbSDT.setFont(new Font("Helvetica Neue", 0, 23));
				jlbNumberPhone = new JLabel("0969025915");
				jlbNumberPhone.setFont(new Font("Helvetica Neue", 0, 23));
				jpnSDT.add(jlbSDT);
				jpnSDT.add(jlbNumberPhone);
				
				
				jpnKetQuaTimKiem.add(jpnThongTinKhach);
				jpnKetQuaTimKiem.add(jpnCMND);
				jpnKetQuaTimKiem.add(jpnSDT);
				
				
				JLabel jlbThongTinHanhTrinh = new JLabel("Thông Tin Hành Trình");
				jlbThongTinHanhTrinh.setBorder(new EmptyBorder(0, 0, 15, 0));
				jlbThongTinHanhTrinh.setForeground(Color.red);
				jlbThongTinHanhTrinh.setFont(new Font("Helvetica Neue", 0, 23));
				jpnKetQuaTimKiem.add(jlbThongTinHanhTrinh);
				
				JPanel jpnDiaDiem = new JPanel();
				jpnDiaDiem.setLayout(new BoxLayout(jpnDiaDiem, BoxLayout.X_AXIS));
				JPanel _jpnDiaDiem = new JPanel();
				_jpnDiaDiem.setLayout(new BoxLayout(_jpnDiaDiem, BoxLayout.X_AXIS));
				
				JLabel jlbDiaDiem = new JLabel("Địa Điểm: ");
				jlbDiaDiem.setForeground(Color.blue);
				jlbDiaDiem.setFont(new Font("Helvetica Neue", 0, 23));
				jlbTenDiaDiem = new JLabel("Phú Quốc");
				jlbTenDiaDiem.setFont(new Font("Helvetica Neue", 0, 23));
				_jpnDiaDiem.add(jlbDiaDiem);
				_jpnDiaDiem.add(jlbTenDiaDiem);
				_jpnDiaDiem.setMaximumSize(new Dimension(590, 40));
				_jpnDiaDiem.setBorder(BorderFactory.createLineBorder(Color.black));
				
				btnEditDiaDiem = new JButton("Edit");
				btnEditDiaDiem.setFont(new Font("Helvetica Neue", 0, 23));
				
				jpnDiaDiem.add(_jpnDiaDiem);
				jpnDiaDiem.add(btnEditDiaDiem);
				jpnKetQuaTimKiem.add(jpnDiaDiem);
				
				JPanel jpnPhuongTien = new JPanel();
				jpnPhuongTien.setLayout(new BoxLayout(jpnPhuongTien, BoxLayout.X_AXIS));
				JPanel _jpnPhuongTien = new JPanel();
				_jpnPhuongTien.setLayout(new BoxLayout(_jpnPhuongTien, BoxLayout.X_AXIS));
				
				JLabel jlbPhuongTien = new JLabel("Phương Tiện: ");
				jlbPhuongTien.setForeground(Color.blue);
				jlbPhuongTien.setFont(new Font("Helvetica Neue", 0, 23));
				jlbTenPhuongTien = new JLabel("Máy bay");
				jlbTenPhuongTien.setFont(new Font("Helvetica Neue", 0, 23));
				_jpnPhuongTien.add(jlbPhuongTien);
				_jpnPhuongTien.add(jlbTenPhuongTien);
				_jpnPhuongTien.setMaximumSize(new Dimension(590, 40));
				_jpnPhuongTien.setBorder(BorderFactory.createLineBorder(Color.black));
				
				btnEditPhuongTien = new JButton("Edit");
				btnEditPhuongTien.setFont(new Font("Helvetica Neue", 0, 23));
				
				jpnPhuongTien.add(_jpnPhuongTien);
				jpnPhuongTien.add(btnEditPhuongTien);
				jpnKetQuaTimKiem.add(jpnPhuongTien);
				
				
				JPanel jpnKhachSan = new JPanel();
				
				
				jpnKhachSan.setLayout(new BoxLayout(jpnKhachSan, BoxLayout.X_AXIS));
				JPanel _jpnKhachSan = new JPanel();
				_jpnKhachSan.setLayout(new BoxLayout(_jpnKhachSan, BoxLayout.X_AXIS));
				
				JLabel jlbKhachSan = new JLabel("Khách Sạn: ");
				jlbKhachSan.setForeground(Color.blue);
				jlbKhachSan.setFont(new Font("Helvetica Neue", 0, 23));
				jlbTenKhachSan = new JLabel("11 Trần Quốc Tuấn");
				jlbTenKhachSan.setFont(new Font("Helvetica Neue", 0, 23));
				_jpnKhachSan.add(jlbKhachSan);
				_jpnKhachSan.add(jlbTenKhachSan);
				_jpnKhachSan.setMaximumSize(new Dimension(590, 40));
				_jpnKhachSan.setBorder(BorderFactory.createLineBorder(Color.black));
				
				btnEditKhachSan = new JButton("Edit");
				btnEditKhachSan.setFont(new Font("Helvetica Neue", 0, 23));
				
				jpnKhachSan.add(_jpnKhachSan);
				jpnKhachSan.add(btnEditKhachSan);
				jpnKetQuaTimKiem.add(jpnKhachSan);
				
				JPanel jpnBottom = new JPanel();
				jpnBottom.setLayout(new BoxLayout(jpnBottom, BoxLayout.X_AXIS));
				
				JPanel jpnKhoiHanh = new JPanel();
				jpnKhoiHanh.setBorder(BorderFactory.createLineBorder(Color.black));
				jpnKhoiHanh.setLayout(new BoxLayout(jpnKhoiHanh, BoxLayout.Y_AXIS));
				
				JLabel jlbKhoiHanh = new JLabel("Khởi Hành");
				jlbKhoiHanh.setForeground(Color.red);
				jlbKhoiHanh.setFont(new Font("Helvetica Neue", 0, 23));
				
				jtaGioKhoiHanh =  new JTextArea("11111111111111111111111111111111111111111111111111111111111111111");
				jtaGioKhoiHanh.setEditable(false);
				jtaGioKhoiHanh.setLineWrap(true);
				jtaGioKhoiHanh.setFont(new Font("Helvetica Neue", 0, 23));
				jpnKhoiHanh.add(jlbKhoiHanh);
				jpnKhoiHanh.add(jtaGioKhoiHanh);
				
				JPanel jpnQuayVe = new JPanel();
				jpnQuayVe.setBorder(BorderFactory.createLineBorder(Color.black));
				jpnQuayVe.setLayout(new BoxLayout(jpnQuayVe, BoxLayout.Y_AXIS));
				
				JLabel jlbQuayVe = new JLabel("Quay Về");
				jlbQuayVe.setForeground(Color.red);
				jlbQuayVe.setFont(new Font("Helvetica Neue", 0, 23));
				
				jtaGioQuayVe = new JTextArea("111111111111111111111111111111111111111111111111111111111111111111111111111111");
				jtaGioQuayVe.setLineWrap(true);
				jtaGioQuayVe.setEditable(false);
				jtaGioQuayVe.setFont(new Font("Helvetica Neue", 0, 23));
				jpnQuayVe.add(jlbQuayVe);
				jpnQuayVe.add(jtaGioQuayVe);
				
				jpnBottom.add(jpnQuayVe);
				jpnBottom.add(jpnKhoiHanh);
				
				jpnKetQuaTimKiem.add(jpnBottom);
				
				jtbDatVe = new JButton("Đặt Vé");
				jtbDatVe.setBackground(Color.decode("#3BE2AB"));
				jtbDatVe.setPreferredSize(new Dimension(120, 120));
				jtbDatVe.setFont(new Font("Helvetica Neue", 0, 23));
				
				jpnCENTER_Y_AXIS.add(jpnTenCty);
				jpnCENTER_Y_AXIS.add(jpnKetQuaTimKiem);
				jpnCENTER.add(jtbDatVe);
				// CENTER
	}

}
