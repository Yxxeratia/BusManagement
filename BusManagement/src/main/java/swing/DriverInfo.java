package swing;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.Color;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.event.ActionEvent;

public class DriverInfo extends JPanel {
	private JTable tblDriver;
	private JTextField textFieldShift;
	private JTextField textFieldTelephoneNumber;
	private JTextField textFieldDriverName;
	private JTextField textFieldDriverId;
	private JTextField textFieldSearchDriver;
	private JButton btnBackDriver;
	private JButton btnRemoveDriver;
	private JButton btnSearchDriver;
	private JButton btnAddDriver;
	private BufferedImage imageSearch;
	
	public JButton getBackDriverButton() {
		return btnBackDriver;
	}
	public JButton getRemoveDriverButton() {
		return btnRemoveDriver;
	}
	public JButton getSearchDriverButton() {
		return btnSearchDriver;
	}
	public JButton getAddDriverButton() {
		return btnAddDriver;
	}
	
	public JTextField getDriverIdField() {
		return textFieldDriverId;
	}
	
	public JTextField getDriverNameField() {
		return textFieldDriverName;
	}
	
	public JTextField getTelephoneNumberField() {
		return textFieldTelephoneNumber;
	}
	
	public JTextField getShiftField() {
		return textFieldShift;
	}
	

	
	public JTextField getSearchField() {
		return textFieldSearchDriver;
	}
	
	public JTable getDriverTable() {
		return tblDriver;
	}
	
	
	/**
	 * Create the panel.
	 */
	public DriverInfo() {
		setBackground(new Color(128, 255, 128));
		setLayout(null);
		
		JScrollPane scrollDriverPane = new JScrollPane();
		scrollDriverPane.setBounds(10, 56, 649, 387);
		add(scrollDriverPane);
		
		tblDriver = new JTable();
		scrollDriverPane.setViewportView(tblDriver);
		tblDriver.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Name", "Telephone Number","Shift", "Status"
			}
		));
		//image
		try {
			imageSearch = ImageIO.read(getClass().getResource("/searchicon.png"));
			setLayout(null);
		}
		catch(Exception e) {
			System.out.println("Image not found");
		}
		
		tblDriver.getColumnModel().getColumn(4).setResizable(false);
		
		btnBackDriver = new JButton("Back");
		btnBackDriver.setBackground(new Color(255, 255, 255));
		btnBackDriver.setBounds(20, 453, 85, 21);
		add(btnBackDriver);
		
		btnRemoveDriver = new JButton("Remove");
		btnRemoveDriver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRemoveDriver.setBackground(new Color(255, 255, 255));
		btnRemoveDriver.setBounds(114, 453, 85, 21);
		add(btnRemoveDriver);
		
		btnSearchDriver = new JButton(new ImageIcon(imageSearch));
		btnSearchDriver.setBackground(new Color(255, 255, 255));
		btnSearchDriver.setBounds(629, 25, 30, 21);
		add(btnSearchDriver);
		
		textFieldSearchDriver = new JTextField();
		textFieldSearchDriver.setBounds(523, 26, 96, 19);
		add(textFieldSearchDriver);
		textFieldSearchDriver.setColumns(10);

		JPanel addDriverPanel = new JPanel();
		addDriverPanel.setBounds(669, 10, 216, 433);
		add(addDriverPanel);
		addDriverPanel.setLayout(null);
		
		btnAddDriver = new JButton("Add");
		btnAddDriver.setBounds(72, 402, 85, 21);
		btnAddDriver.setBackground(new Color(255, 255, 255));
		addDriverPanel.add(btnAddDriver);
		
		textFieldShift = new JTextField();
		textFieldShift.setBounds(107, 194, 96, 19);
		textFieldShift.setColumns(10);
		addDriverPanel.add(textFieldShift);
		
		textFieldTelephoneNumber = new JTextField();
		textFieldTelephoneNumber.setBounds(107, 156, 96, 19);
		textFieldTelephoneNumber.setColumns(10);
		addDriverPanel.add(textFieldTelephoneNumber);
		
		textFieldDriverName = new JTextField();
		textFieldDriverName.setBounds(107, 118, 96, 19);
		textFieldDriverName.setColumns(10);
		addDriverPanel.add(textFieldDriverName);
		
		textFieldDriverId = new JTextField();
		textFieldDriverId.setBounds(107, 80, 96, 19);
		textFieldDriverId.setColumns(10);
		addDriverPanel.add(textFieldDriverId);
		
		JLabel lblIdDriverPanel = new JLabel("ID");
		lblIdDriverPanel.setBounds(10, 75, 67, 28);
		addDriverPanel.add(lblIdDriverPanel);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(10, 113, 67, 28);
		addDriverPanel.add(lblName);
		
		JLabel lblTelephoneNumber = new JLabel("Tel Number");
		lblTelephoneNumber.setBounds(10, 151, 97, 28);
		addDriverPanel.add(lblTelephoneNumber);
		
		JLabel lblShift = new JLabel("Shift");
		lblShift.setBounds(10, 189, 67, 28);
		addDriverPanel.add(lblShift);
		
		JLabel lblAddDriver = new JLabel("Add Driver");
		lblAddDriver.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddDriver.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAddDriver.setBounds(60, 10, 97, 38);
		addDriverPanel.add(lblAddDriver);
	}
}
