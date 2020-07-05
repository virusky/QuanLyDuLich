package screen;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.AbstractBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Color;
import java.awt.Component;
import java.awt.SystemColor;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;

public class Login {

	public JPanel login;
	
	private JTextField jtfSoDienThoai;
	private JTextField jtfMatKhau;
	
	private JButton btnDangKi;
	private JButton btnDangNhap;
	
	
	private ButtonGroup btnGroup;
	private JRadioButton rdbtnQuanLi;
	private JRadioButton rdbtnNhanVien;
	
	private JComboBox cbChiNhanh;
	private DefaultComboBoxModel dfComboxModelChiNhanh;

	/**
	 * Launch the application.
	 * @throws UnsupportedLookAndFeelException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws ClassNotFoundException 
	 */
	

	/**
	 * Create the frame.
	 */
	public Login() {
	
		login = new JPanel();
		login.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		login.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cty du lịch KenKen");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBorder(new RoundedBorder(Color.BLACK, 20));
		lblNewLabel.setBackground(Color.decode("#3BE2AB"));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblNewLabel.setBounds(12, 13, 287, 92);
		login.add(lblNewLabel);
		
		//Format các dòng text xuống dòng trong jlabel
		JLabel lblNewLabel_1 = new JLabel(String.format("<html><body style=\"text-align: justify;  text-justify: inter-word;\">%s</body></html>","Chào mừng bạn đến với phần mềm quản lí du lịch của công ty KenKen"));
		lblNewLabel_1.setForeground(Color.decode("#F19C99"));
		lblNewLabel_1.setBorder(new LineBorder(Color.BLACK, 3, true));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(602, 13, 387, 92);
		login.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Chi nhánh");
		lblNewLabel_2.setOpaque(true);
		lblNewLabel_2.setBackground(Color.decode("#F19C99"));
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setBorder(new LineBorder(Color.decode("#F8CECC"), 2, true));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(511, 171, 170, 35);
		login.add(lblNewLabel_2);
		
		cbChiNhanh = new JComboBox();
		cbChiNhanh.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		dfComboxModelChiNhanh = new DefaultComboBoxModel(new String[] {"Gò Vấp", "Bình Thạnh", "Quận 10", "Thủ Đức", "Quận 1", "Quận 4"});
		cbChiNhanh.setModel(dfComboxModelChiNhanh);
		cbChiNhanh.setBounds(511, 205, 570, 45);
		login.add(cbChiNhanh);
		
		JLabel lblNewLabel_2_1 = new JLabel("Số điện thoại");
		lblNewLabel_2_1.setOpaque(true);
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setForeground(Color.BLACK);
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblNewLabel_2_1.setBorder(new LineBorder(Color.decode("#F8CECC"), 2, true));
		lblNewLabel_2_1.setBackground(new Color(241, 156, 153));
		lblNewLabel_2_1.setBounds(511, 289, 170, 35);
		login.add(lblNewLabel_2_1);
		
		jtfSoDienThoai = new JTextField();
		jtfSoDienThoai.setBounds(511, 324, 570, 45);
		login.add(jtfSoDienThoai);
		jtfSoDienThoai.setColumns(10);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Mật khẩu");
		lblNewLabel_2_1_1.setOpaque(true);
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1.setForeground(Color.BLACK);
		lblNewLabel_2_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblNewLabel_2_1_1.setBorder(new LineBorder(Color.decode("#F8CECC"), 2, true));
		lblNewLabel_2_1_1.setBackground(new Color(241, 156, 153));
		lblNewLabel_2_1_1.setBounds(511, 370, 170, 35);
		login.add(lblNewLabel_2_1_1);
		
		jtfMatKhau = new JTextField();
		jtfMatKhau.setColumns(10);
		jtfMatKhau.setBounds(511, 405, 570, 45);
		login.add(jtfMatKhau);
		
		JLabel lblNewLabel_3 = new JLabel("Bạn là");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_3.setBounds(511, 480, 83, 35);
		login.add(lblNewLabel_3);
		
		rdbtnQuanLi = new JRadioButton("Quản Lí");
		
		rdbtnQuanLi.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		rdbtnQuanLi.setBounds(602, 486, 125, 25);
		login.add(rdbtnQuanLi);
		
		rdbtnNhanVien = new JRadioButton("Nhân Viên");
		rdbtnNhanVien.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		rdbtnNhanVien.setBounds(745, 486, 182, 25);
		login.add(rdbtnNhanVien);
		
		btnGroup = new ButtonGroup();
		btnGroup.add(rdbtnQuanLi);
		btnGroup.add(rdbtnNhanVien);
		
		btnDangNhap = new JButton("Đăng Nhập");
		btnDangNhap.setBackground(Color.decode("#3BE2AB"));
		btnDangNhap.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		btnDangNhap.setBounds(519, 562, 562, 53);
		login.add(btnDangNhap);
		
		btnDangKi = new JButton("Tạo Tài Khoản Mới ");
		btnDangKi.setBackground(Color.decode("#fed700"));	
		btnDangKi.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		btnDangKi.setBounds(519, 639, 562, 53);
		login.add(btnDangKi);

	}
	
	
	//class custom boder radius jlabel 
	public class RoundedBorder extends AbstractBorder {

        private final Color color;
        private final int gap;

        public RoundedBorder(Color c, int g) {
            color = c;
            gap = g;
        }

        @Override
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setColor(color);
            g2d.draw(new RoundRectangle2D.Double(x, y, width - 1, height - 1, gap, gap));
            g2d.dispose();
        }

        @Override
        public Insets getBorderInsets(Component c) {
            return (getBorderInsets(c, new Insets(gap, gap, gap, gap)));
        }

        @Override
        public Insets getBorderInsets(Component c, Insets insets) {
            insets.left = insets.top = insets.right = insets.bottom = gap / 2;
            return insets;
        }

        @Override
        public boolean isBorderOpaque() {
            return false;
        }
    }
}
