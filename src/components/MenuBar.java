package components;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MenuBar extends JPanel{
	
	private JButton btnTimThongTinKhach;
	private JButton btnChuongTrinhKhuyenMai;
	private JButton btnXemHanhTrinh;
	private JButton btnDangXuat;
	public  JPanel jpnWEST;
	public MenuBar()
	{
	    jpnWEST = new JPanel();
		jpnWEST.setBackground(Color.darkGray);
		JPanel jpnOptionsMenu = new JPanel();
		jpnOptionsMenu.setLayout(new BoxLayout(jpnOptionsMenu, BoxLayout.Y_AXIS));
		jpnWEST.setBorder(BorderFactory.createLineBorder(Color.green));
		jpnWEST.add(jpnOptionsMenu);
		
		// Tim Thong Tin Khach
		JPanel jpnBtnTim = new JPanel();
		jpnBtnTim.setBorder(new EmptyBorder(10, 22, 10, 10));
		
		btnTimThongTinKhach = new JButton("Tìm Thông Tin Khách");
		btnTimThongTinKhach.setPreferredSize(new Dimension(300, 40));
		btnTimThongTinKhach.setFont(new Font("Helvetica Neue", 0, 23));
		jpnBtnTim.add(btnTimThongTinKhach);
		
		
		
		// Dat Ve 
				JPanel jpnBtnDatVe = new JPanel();
				jpnBtnDatVe.setBorder(new EmptyBorder(30, 22, 10, 10));
				
				btnChuongTrinhKhuyenMai = new JButton("Đặt Vé");
				btnChuongTrinhKhuyenMai.setPreferredSize(new Dimension(300, 40));
				btnChuongTrinhKhuyenMai.setFont(new Font("Helvetica Neue", 0, 23));
				jpnBtnDatVe.add(btnChuongTrinhKhuyenMai);
		
		
		
		// Tim Chuong Trinh Khuyen Mai
		JPanel jpnBtnKhuyenMai = new JPanel();
		jpnBtnKhuyenMai.setBorder(new EmptyBorder(30, 22, 10, 10));
		
		btnChuongTrinhKhuyenMai = new JButton("Chương Trình Khuyến Mãi");
		btnChuongTrinhKhuyenMai.setPreferredSize(new Dimension(300, 40));
		btnChuongTrinhKhuyenMai.setFont(new Font("Helvetica Neue", 0, 23));
		jpnBtnKhuyenMai.add(btnChuongTrinhKhuyenMai);
		
		
		
		// Xem Hanh Trinh Hom Nay
		JPanel jpnBtnHanhTrinh = new JPanel();
		jpnBtnHanhTrinh.setBorder(new EmptyBorder(30, 22, 10, 10));
		
		btnXemHanhTrinh = new JButton("Xem Hành Trình Hôm Nay");
		btnXemHanhTrinh.setPreferredSize(new Dimension(300, 40));
		btnXemHanhTrinh.setFont(new Font("Helvetica Neue", 0, 23));
		jpnBtnHanhTrinh.add(btnXemHanhTrinh);
		
		
		// Dang Xuat
		
		JPanel jpnBtnDangXuat = new JPanel();
		jpnBtnDangXuat.setBorder(new EmptyBorder(300, 22, 20, 20));
		btnDangXuat = new JButton("Đăng Xuất");
		btnDangXuat.setFont(new Font("Helvetica Neue", 0, 23));
		btnDangXuat.setPreferredSize(new Dimension(300, 40));
		
		jpnBtnDangXuat.add(btnDangXuat);
		
		
		jpnOptionsMenu.add(jpnBtnTim);
		jpnOptionsMenu.add(jpnBtnKhuyenMai);
		jpnOptionsMenu.add(jpnBtnHanhTrinh);
		jpnOptionsMenu.add(jpnBtnDangXuat);
	}

}
