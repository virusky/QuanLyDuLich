package screen;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import components.MenuBar;
import components.HistoryBill;
import components.InfomationTours;
import screen.Login;
import screen.RegistrationForm;
import screen.SignUp;

public class Root extends JFrame  {
	

	private JPanel controlMain;
	

	

	private JButton btnTimThongTinKhach;
	private JButton btnChuongTrinhKhuyenMai;
	private JButton btnXemHanhTrinh;
	private JButton btnTimThongTinDonHang;
	private JButton btnXemLichLamTrongNgay;
	private JButton btnDangXuat;

	
	
	
	
	
	
	
	MenuBar menuBar;
	RegistrationForm formDangKy;
	Login _screenLogin;
	InfomationTours _thongtinchuyenbay;
	HistoryBill _historyBill;
	SignUp _signUp;
	
	private void getInstance()
	{
		menuBar = new MenuBar();
		formDangKy = new RegistrationForm();
		_screenLogin = new Login();
		_thongtinchuyenbay = new InfomationTours();
		_historyBill = new HistoryBill();
		_signUp = new SignUp();
		
		
				
	}
	
	public void ShowLogin()
	{
		setTitle("Đăng Nhập");
		Invisible();
		_screenLogin.login.setVisible(true);
		setContentPane(_screenLogin.login);
		
	}
	public void ShowHistoryBill()
	{
		setTitle("Lịch Sử Đơn Hàng");
		Invisible();
		_historyBill.lichsudh.setVisible(true);
		
		setContentPane(_historyBill.lichsudh);
	}
	
	public void ShowRegistrationForm()
	{
		setTitle("Lịch Sử Đơn Hàng");
		Invisible();
		formDangKy._RegistrationForm.setVisible(true);
		setContentPane(formDangKy._RegistrationForm);
	}
	
	public void ShowLogup()
	{
		setTitle("Đăng Ký");
		Invisible();
		_signUp._logup.setVisible(true);
		setContentPane(_signUp._logup);
	}
	private void Invisible()
	{
		menuBar.jpnWEST.setVisible(false);
		formDangKy._RegistrationForm.setVisible(false);
		_screenLogin.login.setVisible(false);
		
		
	}
	private void initUI() { 
		
		
	   
	    setSize(1400, 900);
	    setLocationRelativeTo(null);
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
	    
//	    controlMain = new JPanel();
//	    controlMain.setLayout(new BorderLayout());
//	    setContentPane(controlMain);
	    //createLayout();
	}

	
	
	public Root()
	{
		getInstance();
		initUI();
		
		//createLayout();
	}
	public static void main(String[] args) {
		Root _root = new Root();
		_root.setVisible(true);
		//_root.ShowLogin();
		_root.ShowRegistrationForm();
		//_root.ShowHistoryBill();
		//_root.ShowLogup();
	
		
		
		
	}
}
