package screen;



import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class RegistrationForm {
	
	/* Chưa làm biểu thức chính quy cho tên, địa chỉ
	 * Chưa thêm thuộc tính nào vào Combobox hành trình
	 * chưa xử lý Cái đơn giá cho môi cái hành trình với loại khác nhau
	 * chưa làm tự tổng cộng
	 */
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtName;
	private JTextField txtPhone;
	private JTextField txtCMND;
	private JTextField txtAddress;
	private JTextField txtQuantum;
	private JTextField txtTotal;
	private JRadioButton radMale;
	private JRadioButton radFeMale;
	private JRadioButton radTypeVIP;
	private JRadioButton radTypeNor;
	private JRadioButton radPymentATM;
	private JRadioButton radPymentEWallet;
	private JRadioButton radPymentCash;
	private JComboBox<String> cbbTrip;
	private JTextField txtUnitPrice;
	private JButton btnCancel;
	private JButton btnSubmit;
	private JTextArea txtMess;
	private JPanel pnlNorth;
	public JPanel _RegistrationForm;
	
	public  RegistrationForm() {
		
		buildUI();
	}

	public void buildUI() {
		
		_RegistrationForm = new JPanel();
		//North
		_RegistrationForm.add(pnlNorth = new JPanel(), BorderLayout.NORTH);
		_RegistrationForm.setLayout(null);
		_RegistrationForm.setBackground(Color.WHITE);
		
		
		JLabel lblTitle;
		_RegistrationForm.add(lblTitle = new JLabel("   ĐĂNG KÝ TOUR DU LỊCH"));
		lblTitle.setFont( new Font("Times new roman", Font.BOLD, 30));
		lblTitle.setOpaque(true); // bật cho phép vẽ pixel (mặc định false)
		lblTitle.setForeground(Color.black);
		lblTitle.setBackground(Color.decode("#3be3ab"));
		lblTitle.setBounds(220, 5, 420, 50);// set vị trí (x,y,width, height)
		
		
		
		JLabel lblName, lblPhoneKH, lblCMND, lblAddress, lblSex, lblTrip, lblType, lblQuantum, lblUnitPrice, lblTotal, lblPaymant, lblUnit, lblUnitTT;
		_RegistrationForm.add(lblName = new JLabel("Họ và tên khách hàng"));
		_RegistrationForm.add(lblPhoneKH = new JLabel("Số điện thoại"));
		_RegistrationForm.add(lblCMND = new JLabel("CMND"));
		_RegistrationForm.add(lblSex = new JLabel("Giới tính:"));
		_RegistrationForm.add(lblAddress = new JLabel("Địa chỉ"));
		_RegistrationForm.add(lblTrip = new JLabel("Hành trình:"));
		_RegistrationForm.add(lblType = new JLabel("Loại"));
		_RegistrationForm.add(lblQuantum = new JLabel("Số lượng:"));
		_RegistrationForm.add(lblUnitPrice = new JLabel("Đơn giá:"));
		_RegistrationForm.add(lblPaymant = new JLabel("Chọn phương thức thanh toán:"));
		
		_RegistrationForm.add(lblTotal = new JLabel("Tổng tiền:"));
		lblTotal.setForeground(Color.RED);
		
		_RegistrationForm.add(lblUnitTT = new JLabel("VND"));	
		lblUnitTT.setFont(new Font("Times new roman", Font.ITALIC,14));
		lblUnitTT.setForeground(Color.RED);
		
		_RegistrationForm.add(lblUnit = new JLabel("VND/người"));	
		lblUnit.setFont(new Font("Times new roamn", Font.ITALIC,14));
		
		_RegistrationForm.add(txtName = new JTextField());
		_RegistrationForm.add(txtPhone = new JTextField());
		_RegistrationForm.add(txtCMND = new JTextField());
		_RegistrationForm.add(txtAddress = new JTextField());
		_RegistrationForm.add(txtQuantum = new JTextField());
		_RegistrationForm.add(txtTotal = new JTextField("0"));
		
		_RegistrationForm.add(txtMess = new JTextArea());
		txtMess.setEditable(false);
		txtMess.setBorder(null);
		txtMess.setForeground(Color.red);
		txtMess.setFont(new Font("Arial", Font.ITALIC, 14));
		txtMess.setBackground(null);
		
		_RegistrationForm.add(txtUnitPrice = new JTextField("0"));
		txtUnitPrice.setBorder(null);
		txtUnitPrice.setEditable(false);
		txtUnitPrice.setBackground(null);
		
		_RegistrationForm.add( cbbTrip = new JComboBox<String>());
		
		ButtonGroup grSex = new ButtonGroup();
		grSex.add(radMale = new JRadioButton("Nam"));
		grSex.add(radFeMale = new JRadioButton("Nữ"));
		radMale.setSelected(true);
		
		
		
		ButtonGroup grType = new ButtonGroup();
		grType.add(radTypeVIP = new JRadioButton("VIP"));
		grType.add(radTypeNor = new JRadioButton("Thường"));
		radTypeNor.setSelected(true);
		
		ButtonGroup grPayment = new ButtonGroup();
		grPayment.add(radPymentATM = new JRadioButton("ATM hoặc Thẻ tín dụng"));
		grPayment.add(radPymentEWallet = new JRadioButton("Ví điện tủ"));
		grPayment.add(radPymentCash = new JRadioButton("Tiền mặt"));
		radPymentATM.setSelected(true);
		
		_RegistrationForm.add(radMale);
		_RegistrationForm.add(radFeMale);
		_RegistrationForm.add(radTypeVIP);
		_RegistrationForm.add(radTypeNor);
		_RegistrationForm.add(radPymentATM);
		_RegistrationForm.add(radPymentCash);
		_RegistrationForm.add(radPymentEWallet);
		
		_RegistrationForm.add(btnCancel = new JButton("Hủy"));
		_RegistrationForm.add(btnSubmit = new JButton("Hoàn tất"));
		
		btnCancel.setBorder(null);
		btnSubmit.setBorder(null);
		
		lblName.setFont( new Font("Times new roman", Font.BOLD, 16));
		lblSex.setFont( new Font("Times new roman", Font.BOLD, 16));
		lblCMND.setFont( new Font("Times new roman", Font.BOLD, 16));
		lblPhoneKH.setFont( new Font("Times new roman", Font.BOLD, 16));
		lblAddress.setFont( new Font("Times new roman", Font.BOLD, 16));
		lblTrip.setFont( new Font("Times new roman", Font.BOLD, 16));
		lblType.setFont( new Font("Times new roman", Font.BOLD, 16));
		lblPaymant.setFont( new Font("Times new roman", Font.BOLD, 16));
		lblQuantum.setFont( new Font("Times new roman", Font.BOLD, 16));
		lblUnitPrice.setFont( new Font("Times new roman", Font.BOLD, 16));
		lblTotal.setFont( new Font("Times new roman", Font.BOLD, 16));
		
		txtName.setFont( new Font("Times new roman", Font.BOLD, 16));
		txtAddress.setFont( new Font("Times new roman", Font.BOLD, 16));
		txtCMND.setFont( new Font("Times new roman", Font.BOLD, 16));
		txtPhone.setFont( new Font("Times new roman", Font.BOLD, 16));
		txtQuantum.setFont( new Font("Times new roman", Font.BOLD, 16));
		txtUnitPrice.setFont( new Font("Times new roman", Font.BOLD, 16));
		
		txtTotal.setFont( new Font("Times new roman", Font.BOLD, 16));
		txtTotal.setForeground(Color.RED);
		txtTotal.setBorder(null);
		txtTotal.setEditable(false);
		txtTotal.setOpaque(true);
		txtTotal.setBackground(null);
		
		radFeMale.setFont( new Font("Times new roman", Font.BOLD, 16));
		radMale.setFont( new Font("Times new roman", Font.BOLD, 16));
		radPymentATM.setFont( new Font("Times new roman", Font.BOLD, 16));
		radPymentCash.setFont( new Font("Times new roman", Font.BOLD, 16));
		radPymentEWallet.setFont( new Font("Times new roman", Font.BOLD, 16));
		radTypeNor.setFont( new Font("Times new roman", Font.BOLD, 16));
		radTypeVIP.setFont( new Font("Times new roman", Font.BOLD, 16));
		
		cbbTrip.setFont( new Font("Times new roman", Font.BOLD, 16));
		
		radMale.setBackground(null);
		radFeMale.setBackground(null);
		radPymentATM.setBackground(null);
		radPymentCash.setBackground(null);
		radPymentEWallet.setBackground(null);
		radTypeNor.setBackground(null);
		radTypeVIP.setBackground(null);
		
		txtAddress.setBorder(BorderFactory.createLineBorder(Color.decode("#f8cecc")));
		txtCMND.setBorder(BorderFactory.createLineBorder(Color.decode("#f8cecc")));
		txtName.setBorder(BorderFactory.createLineBorder(Color.decode("#f8cecc")));
		txtPhone.setBorder(BorderFactory.createLineBorder(Color.decode("#f8cecc")));
		txtQuantum.setBorder(BorderFactory.createLineBorder(Color.decode("#f8cecc")));
		
		cbbTrip.setBackground(Color.decode("#f8cecc"));
		cbbTrip.setBorder(null);
		btnCancel.setBackground(Color.decode("#fed700"));
		btnSubmit.setBackground(Color.decode("#3be3ab"));
		
		lblName.setBounds(20, 120, 160, 25);
		txtName.setBounds(180, 120, 300, 25);
		
		lblSex.setBounds(500, 120, 65, 25);
		radMale.setBounds(570, 120, 160, 25);
		radFeMale.setBounds(640, 120, 150, 25);
		
		lblPhoneKH.setBounds(20, 150, 160, 25);
		txtPhone.setBounds(180, 150, 300, 25);
		
		lblCMND.setBounds(500, 150, 65, 25);
		txtCMND.setBounds(570, 150, 250, 25);
		
		lblAddress.setBounds(20, 180, 160, 25);
		txtAddress.setBounds(180, 180, 300, 25);
		
		lblTrip.setBounds(20, 230, 160, 25);
		cbbTrip.setBounds(180, 230, 300, 25);
		
		lblType.setBounds(500, 230, 65, 25);
		radTypeVIP.setBounds(570, 230, 60, 25);
		radTypeNor.setBounds(640, 230, 100, 25);
		
		lblUnitPrice.setBounds(20, 260, 160, 25);
		txtUnitPrice.setBounds(180, 260, 150, 25);
		lblUnit.setBounds(330, 260, 100, 25);
		
		lblQuantum.setBounds(20, 290, 160, 25);
		txtQuantum.setBounds(180, 290, 300, 25);
		
		lblTotal.setBounds(350, 350, 80, 25);
		txtTotal.setBounds(430, 350, 120, 25);
		lblUnitTT.setBounds(550, 350, 100, 25);
		
		lblPaymant.setBounds(20, 400, 230, 25);
		radPymentATM.setBounds(250, 400, 300, 25);
		radPymentEWallet.setBounds(250, 420, 300, 25);
		radPymentCash.setBounds(250,440,300,25);
		
		txtMess.setBounds(50, 500, 900, 30);
		
		btnCancel.setBounds(350, 550, 120, 35);
		btnSubmit.setBounds(480, 550, 120, 35);
		
	
	}  
	
	
	//điều iện đầu vào dữ liệu
	public boolean valiData() {
		String phone = txtPhone.getText().trim();
		String cmnd	= txtCMND.getText().trim();
		String quantum = txtQuantum.getText().trim();
		
		if (phone.length() <= 0 || !phone.matches("0[0-9]{9}")) {
			showMessage("Lỗi: Số điện thoại sai !", txtPhone);
			return false;
		}
		
		if (cmnd.length() <= 0 || !cmnd.matches("[0-9]{9}")) {
			showMessage("Lỗi: CMND sai !", txtCMND);
			return false;
		}
		
		if (quantum.length() <= 0 || !quantum.matches("[0-9]*")) {
			showMessage("Lỗi: Nhập số lượng sai !", txtQuantum);
			return false;
		}
		
		return true;
	}
	//thông báo lỗi
	public void showMessage(String mess, JTextField txtF) {
		txtMess.setText(mess);
		txtF.requestFocus();
	}
	
	//xóa rỗng
	public void removeTxt() {
		txtName.setText("");
		txtAddress.setText("");
		txtCMND.setText("");
		txtPhone.setText("");
		txtQuantum.setText("");
		txtTotal.setText("0");
		txtUnitPrice.setText("0");
		radMale.setSelected(true);
		radPymentATM.setSelected(true);
		radTypeNor.setSelected(true);
		
	}



}
