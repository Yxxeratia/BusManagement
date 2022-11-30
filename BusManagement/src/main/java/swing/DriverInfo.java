package swing;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DriverInfo extends JPanel {
	private JTable tblDriver;
	private JTextField textFieldStatus;
	private JTextField textFieldShift;
	private JTextField textFieldBankNumber;
	private JTextField textFieldBankName;
	private JTextField textFieldTelephoneNumber;
	private JTextField textFieldDriverName;
	private JTextField textFieldDriverId;
	private JTextField textFieldSearchDriver;
	private JButton btnBackDriver;
	private JButton btnRemoveDriver;
	private JButton btnSearchDriver;
	private JButton btnAddDriver;
	
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
	
	public JTextField getStatusField() {
		return textFieldStatus;
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
		scrollDriverPane.setBounds(10, 56, 649, 346);
		add(scrollDriverPane);
		
		tblDriver = new JTable();
		scrollDriverPane.setViewportView(tblDriver);
		tblDriver.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Name", "Telephone Number", "Bank Name", "Bank Number","Shift", "Status"
			}
		));
		tblDriver.getColumnModel().getColumn(6).setResizable(false);
		
		btnBackDriver = new JButton("Back");
		btnBackDriver.setBackground(new Color(128, 255, 128));
		btnBackDriver.setBounds(20, 412, 85, 21);
		add(btnBackDriver);
		
		btnRemoveDriver = new JButton("Remove");
		btnRemoveDriver.setBackground(new Color(128, 255, 128));
		btnRemoveDriver.setBounds(122, 412, 85, 21);
		add(btnRemoveDriver);
		
		btnSearchDriver = new JButton("Search");
		btnSearchDriver.setBackground(new Color(128, 255, 128));
		btnSearchDriver.setBounds(574, 25, 85, 21);
		add(btnSearchDriver);
		
		textFieldSearchDriver = new JTextField();
		textFieldSearchDriver.setBounds(468, 26, 96, 19);
		add(textFieldSearchDriver);
		textFieldSearchDriver.setColumns(10);

		JPanel addDriverPanel = new JPanel();
		addDriverPanel.setBounds(669, 10, 216, 413);
		add(addDriverPanel);
		addDriverPanel.setLayout(null);
		
		btnAddDriver = new JButton("Add");
		btnAddDriver.setBounds(72, 382, 85, 21);
		btnAddDriver.setBackground(new Color(255, 255, 255));
		addDriverPanel.add(btnAddDriver);
		
		textFieldStatus = new JTextField();
		textFieldStatus.setBounds(107, 310, 96, 19);
		textFieldStatus.setColumns(10);
		addDriverPanel.add(textFieldStatus);
		
		textFieldShift = new JTextField();
		textFieldShift.setBounds(107, 272, 96, 19);
		textFieldShift.setColumns(10);
		addDriverPanel.add(textFieldShift);
		
		textFieldBankNumber = new JTextField();
		textFieldBankNumber.setBounds(107, 234, 96, 19);
		textFieldBankNumber.setColumns(10);
		addDriverPanel.add(textFieldBankNumber);
		
		textFieldBankName = new JTextField();
		textFieldBankName.setBounds(107, 194, 96, 19);
		textFieldBankName.setColumns(10);
		addDriverPanel.add(textFieldBankName);
		
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
		
		JLabel lblTelephoneNumber = new JLabel("Telephone Number");
		lblTelephoneNumber.setBounds(10, 151, 97, 28);
		addDriverPanel.add(lblTelephoneNumber);
		
		JLabel lblBankName = new JLabel("Bank Name");
		lblBankName.setBounds(10, 189, 67, 28);
		addDriverPanel.add(lblBankName);
		
		JLabel lblBankNumber = new JLabel("Bank Number");
		lblBankNumber.setBounds(10, 229, 67, 28);
		addDriverPanel.add(lblBankNumber);
		
		JLabel lblShift = new JLabel("Shift");
		lblShift.setBounds(10, 267, 67, 28);
		addDriverPanel.add(lblShift);
		
		JLabel lblStatus = new JLabel("Status");
		lblStatus.setBounds(10, 305, 67, 28);
		addDriverPanel.add(lblStatus);
		
		JLabel lblAddDriver = new JLabel("Add Driver");
		lblAddDriver.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddDriver.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAddDriver.setBounds(60, 10, 97, 38);
		addDriverPanel.add(lblAddDriver);
	}
}
