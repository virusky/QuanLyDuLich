package components;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.FocusAdapter;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class HistoryBill{

	public JPanel lichsudh;
	
	private JTextField jtfFind;
	
	private JButton btnFind;

	private JTable table;
	
	private JLabel lblTenKhach;
	private JLabel lblMaChuyenBay;
	private JLabel lblGiaTien;
	
	private DefaultComboBoxModel cbModel;


	/**
	 * Create the frame.
	 */
	public HistoryBill() {
	
		lichsudh = new JPanel();
		lichsudh.setBorder(new EmptyBorder(5, 5, 5, 5));
		lichsudh.setLayout(null);
		
		jtfFind = new JTextField("Nhập số điện thoại hoặc tên khách hàng");
//		jtfFind.addFocusListener(new FocusAdapter() {
//			@Override
//			public void focusGained(FocusEvent arg0) {
//				if (jtfFind.getText().equals("Nhập số điện thoại hoặc tên khách hàng")) {
//		        	jtfFind.setText("");
//		        	jtfFind.setForeground(Color.BLACK);
//		        }
//				jtfFind.setForeground(Color.GRAY);
//	        	jtfFind.setText("Search");
//			}
//		});
		jtfFind.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		jtfFind.setBounds(207, 98, 675, 49);
		jtfFind.setColumns(10);
		jtfFind.addFocusListener(new FocusListener() {
		    @Override
		    public void focusGained(FocusEvent e) {
		        if (jtfFind.getText().equals("Nhập số điện thoại hoặc tên khách hàng")) {
		        	jtfFind.setText("");
		        }
		        jtfFind.setForeground(Color.BLACK);
		    }
		    @Override
		    public void focusLost(FocusEvent e) {
		    	if (jtfFind.getText().equals("")) {
		        	jtfFind.setText("Nhập số điện thoại hoặc tên khách hàng");
		        	jtfFind.setForeground(Color.GRAY);
		        }
		    }
		});
		
		lichsudh.add(jtfFind);
		
		btnFind = new JButton("Tìm");
		btnFind.setBackground(Color.decode("#3BE2AB"));
		btnFind.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		btnFind.setBounds(962, 97, 194, 49);
		lichsudh.add(btnFind);
		
		JLabel lblNewLabel = new JLabel("Tìm kiếm thông tin");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(Color.decode("#F19C99"));
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBorder(new LineBorder(Color.decode("#F8CECC"), 2, true));
		lblNewLabel.setBounds(207, 58, 194, 41);
		lichsudh.add(lblNewLabel);
		
		table = new JTable();
		table.setBounds(207, 308, 949, 486);
		lichsudh.add(table);
		
		JComboBox comboBoxLoai = new JComboBox();
		comboBoxLoai.setEditable(true);
		comboBoxLoai.getEditor().getEditorComponent().setBackground(Color.decode("#F8CECC"));
		String loai[] = {"Bình Thường", "Tốt", "Thượng Hạng"};
		cbModel = new DefaultComboBoxModel(loai);
		comboBoxLoai.setModel(cbModel);
		comboBoxLoai.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		comboBoxLoai.setBounds(962, 268, 194, 41);
		lichsudh.add(comboBoxLoai);
		
		lblTenKhach = new JLabel("Huỳnh Trọng Mẫn");
		lblTenKhach.setOpaque(true);
		lblTenKhach.setHorizontalAlignment(SwingConstants.CENTER);
		lblTenKhach.setForeground(Color.BLACK);
		lblTenKhach.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblTenKhach.setBorder(new LineBorder(Color.decode("#F8CECC"), 2, true));
		lblTenKhach.setBackground(new Color(241, 156, 153));
		lblTenKhach.setBounds(207, 268, 264, 41);
		lichsudh.add(lblTenKhach);
		
		lblMaChuyenBay = new JLabel("Mã Chuyến Bay");
		lblMaChuyenBay.setOpaque(true);
		lblMaChuyenBay.setHorizontalAlignment(SwingConstants.CENTER);
		lblMaChuyenBay.setForeground(Color.BLACK);
		lblMaChuyenBay.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblMaChuyenBay.setBorder(new LineBorder(Color.decode("#F8CECC"), 2, true));
		lblMaChuyenBay.setBackground(new Color(241, 156, 153));
		lblMaChuyenBay.setBounds(471, 268, 269, 41);
		lichsudh.add(lblMaChuyenBay);
		
		lblGiaTien = new JLabel("400$");
		lblGiaTien.setOpaque(true);
		lblGiaTien.setHorizontalAlignment(SwingConstants.CENTER);
		lblGiaTien.setForeground(Color.BLACK);
		lblGiaTien.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblGiaTien.setBorder(new LineBorder(Color.decode("#F8CECC"), 2, true));
		lblGiaTien.setBackground(new Color(241, 156, 153));
		lblGiaTien.setBounds(740, 268, 222, 40);
		lichsudh.add(lblGiaTien);

	}
}
