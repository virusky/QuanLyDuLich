package screen;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SignUp{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPasswordField txtPass;
	private JTextField txtPhone;
	private JPasswordField txtRePass;
	private JTextField txtEtoken;
	private JButton btnCancel;
	private JButton btnSubmit;
	private JTextArea txtMess;
	
	public JPanel _logup;


	public SignUp() {
		
		//North
				JPanel pnlNorth;
				_logup = new JPanel();
				_logup.setLayout(null);
				//_logup.add(pnlNorth = new JPanel(), BorderLayout.NORTH);
				//pnlNorth.setPreferredSize(new Dimension(0,100));
				//pnlNorth.setLayout(null);
				_logup.setBackground(Color.WHITE);
				
				
				JLabel lblTitle;
				_logup.add(lblTitle = new JLabel("   ĐĂNG KÝ TÀI KHOẢN NHÂN VIÊN"));
				lblTitle.setFont( new Font("Times new roman", Font.BOLD, 30));
				lblTitle.setOpaque(true); // bật cho phép vẽ pixel (mặc định false)
				lblTitle.setForeground(Color.black);
				lblTitle.setBackground(Color.decode("#3be3ab"));
				lblTitle.setBounds(180, 10, 550, 50);// set vị trí (x,y,width, height)
				
//				//Center
//				JPanel pnlCenter;
//				_logup.add(pnlCenter = new JPanel(), BorderLayout.CENTER);
//				pnlCenter.setLayout(null);
//				pnlCenter.setBackground(Color.WHITE);
				
				JLabel lblPhone, lblPass, lblRePass, lblEtoken;
				
				_logup.add(lblPhone =  new JLabel("Số điện thoại"));
				_logup.add(lblPass = new JLabel("Mật khẩu"));
				_logup.add(lblRePass = new JLabel("Xác nhận mật khẩu"));
				_logup.add(lblEtoken = new JLabel("EToken"));
				
				
				_logup.add(txtPhone = new JTextField());
				_logup.add(txtPass = new JPasswordField());
				_logup.add(txtRePass = new JPasswordField());
				_logup.add(txtEtoken = new JTextField());
				
				_logup.add(btnCancel = new JButton("Hủy"));
				_logup.add(btnSubmit = new JButton("Đăng ký"));
				
				JTextArea txtAttention;
				_logup.add(txtAttention = new JTextArea("Liên Hệ Quản Lý Của Bạn\nĐể Được Cấp EToken.\nVui Lòng Xác Nhận Thông\nTin Trước Khi Hoàn Tất\nĐăng Ký."));
				_logup.add(txtMess = new JTextArea());
				
				lblPhone.setFont( new Font("Times new roman", Font.BOLD, 20));
				lblPass.setFont( new Font("Times new roman", Font.BOLD, 20));
				lblRePass.setFont( new Font("Times new roman", Font.BOLD, 20));
				lblEtoken.setFont( new Font("Times new roman", Font.BOLD, 20));
				
				txtPhone.setFont( new Font("Times new roman", Font.BOLD, 20));
				txtPass.setFont( new Font("Times new roman", Font.BOLD, 20));
				txtRePass.setFont( new Font("Times new roman", Font.BOLD, 20));
				txtEtoken.setFont( new Font("Times new roman", Font.BOLD, 20));
				
				btnCancel.setFont( new Font("Times new roman", Font.BOLD, 20));
				btnSubmit.setFont( new Font("Times new roman", Font.BOLD, 20));
				
				
				txtAttention.setFont(new Font("Arial", Font.ITALIC,16));
				txtAttention.setBorder(null);
				txtAttention.setEditable(false);
				txtAttention.setBackground(null);
				
				txtMess.setEditable(false);
				txtMess.setBorder(null);
				txtMess.setForeground(Color.red);
				txtMess.setFont(new Font("Arial", Font.ITALIC, 14));
				txtMess.setBackground(null);
				
				btnCancel.setBorder(null);
				btnSubmit.setBorder(null);
				
				btnCancel.setBackground(Color.decode("#fed700"));
				btnSubmit.setBackground(Color.decode("#3be3ab"));
				
				txtPhone.setBorder(BorderFactory.createLineBorder(Color.decode("#f8cecc")));
				txtPass.setBorder(BorderFactory.createLineBorder(Color.decode("#f8cecc")));
				txtRePass.setBorder(BorderFactory.createLineBorder(Color.decode("#f8cecc")));
				txtEtoken.setBorder(BorderFactory.createLineBorder(Color.decode("#f8cecc")));
				
				lblPhone.setOpaque(true); // Bật chế độ cho phép vẽ pixel
				lblPhone.setBackground(Color.decode("#f8cecc"));
				lblPhone.setBorder(BorderFactory.createLineBorder(Color.decode("#f29a96")));
				
				lblPass.setOpaque(true);
				lblPass.setBackground(Color.decode("#f8cecc"));
				lblPass.setBorder(BorderFactory.createLineBorder(Color.decode("#f29a96")));
				
				lblRePass.setOpaque(true);
				lblRePass.setBackground(Color.decode("#f8cecc"));
				lblRePass.setBorder(BorderFactory.createLineBorder(Color.decode("#f29a96")));
				
				lblEtoken.setOpaque(true);
				lblEtoken.setBackground(Color.decode("#f8cecc"));
				lblEtoken.setBorder(BorderFactory.createLineBorder(Color.decode("#f29a96")));
			
				lblPhone.setBounds(50, 100, 180, 30);
				txtPhone.setBounds(50, 130, 400, 35);
				
				lblPass.setBounds(50, 180, 180, 30);
				txtPass.setBounds(50, 210, 400, 35);
				
				lblRePass.setBounds(50,260, 180, 30);
				txtRePass.setBounds(50, 290, 400, 35);
				
				lblEtoken.setBounds(50, 340, 180, 30);
				txtEtoken.setBounds(50, 370, 400, 35);
				
				btnCancel.setBounds(200, 430, 120, 35);
				btnSubmit.setBounds(330, 430, 120, 35);
				
				txtAttention.setBounds(600, 130, 200, 200);
				txtMess.setBounds(600,350,210,100);
	}
	
	//điều iện đầu vào dữ liệu
	public boolean valiData() {
		String phone = txtPhone.getText().trim();
		char [] pass = txtPass.getPassword();
		char []repass = txtRePass.getPassword();
		boolean k = false;
		boolean t = false;
		String eToken= txtEtoken.getText().trim();
		
		//Biểu thức chính quy số điện thoại
		if (phone.length() <= 0 || !phone.matches("0[0-9]{9}")) {
			showMessage("Lỗi: Số điện thoại sai !", txtPhone);
			return false;
		}
		
		//xét điều kiên password
		if (pass.length < 6) {
			showMessage("Lỗi: Mật khẩu phải ít nhất 6 ký tự\nPhải có ít nhât 1 ký tự viết hoa\nÍt nhất 1 chữ số", txtPass);
			return false;
		}
		if (pass.length != repass.length) {
			showMessage("Lỗi: Nhập lại mật khẩu sai !", txtRePass);
			return false;
		}
		for (int i = 0; i < pass.length; i++) {
				if (pass[i] != repass[i]) {
					showMessage("Lỗi: Nhập lại mật khẩu sai !", txtRePass);
					return false;
				}
				if (pass[i] >= 65 && pass[i] <= 90) {
					k = true;
				}
				if (pass[i] >= 48 && pass[i] <= 57) {
					t = true;
				}
		}
		if (k == false || t == false) {
			showMessage("Lỗi: Mật khẩu phải ít nhất 6 ký tự\nPhải có ít nhât 1 ký tự viết hoa\nÍt nhất 1 chữ số", txtPass);
			return false;
		}
		
		//kiểm tra EToken đã nhập chưa
		if (eToken.length() <= 0) {
			showMessage("Lỗi: Chưa nhập EToken !", txtRePass);
			return false;
		}
		
		return true;
	}
	
	//xóa rỗng
	public void removeTxt() {
		txtPhone.setText("");
		txtPass.setText("");
		txtRePass.setText("");
		txtEtoken.setText("");
	}
	
	//thông báo lỗi
	public void showMessage(String mess, JTextField txtF) {
		txtMess.setText(mess);
		txtF.requestFocus();
	}
	


}
