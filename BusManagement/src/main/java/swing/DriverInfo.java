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
	private JTextField textFieldName;
	private JTextField textFieldIdDriverPanel;
	private JTextField textFieldSearchDriverPanel;
	private JButton btnBackDriverPanel;
	private JButton btnRemoveDriverPanel;
	private JButton btnSearchDriverPanel;
	private JButton btnAddDriverPanel;
	
	public JButton getBackDriverPanelButton() {
		return btnBackDriverPanel;
	}
	public JButton getRemoveDriverPanelButton() {
		return btnRemoveDriverPanel;
	}
	public JButton getSearchDriverPanelButton() {
		return btnSearchDriverPanel;
	}
	public JButton getAddDriverPanelButton() {
		return btnAddDriverPanel;
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
				"ID", "Name", "Telephone Number", "Shift", "Bank Name", "Bank Number", "Status", "Salary"
			}
		));
		tblDriver.getColumnModel().getColumn(7).setResizable(false);
		
		btnBackDriverPanel = new JButton("Back");
		btnBackDriverPanel.setBackground(new Color(128, 255, 128));
		btnBackDriverPanel.setBounds(20, 412, 85, 21);
		add(btnBackDriverPanel);
		
		btnRemoveDriverPanel = new JButton("Remove");
		btnRemoveDriverPanel.setBackground(new Color(128, 255, 128));
		btnRemoveDriverPanel.setBounds(122, 412, 85, 21);
		add(btnRemoveDriverPanel);
		
		btnSearchDriverPanel = new JButton("Search");
		btnSearchDriverPanel.setBackground(new Color(128, 255, 128));
		btnSearchDriverPanel.setBounds(574, 25, 85, 21);
		add(btnSearchDriverPanel);
		
		textFieldSearchDriverPanel = new JTextField();
		textFieldSearchDriverPanel.setBounds(468, 26, 96, 19);
		add(textFieldSearchDriverPanel);
		textFieldSearchDriverPanel.setColumns(10);

		JPanel addDriverPanel = new JPanel();
		addDriverPanel.setBounds(669, 10, 216, 413);
		add(addDriverPanel);
		addDriverPanel.setLayout(null);
		
		btnAddDriverPanel = new JButton("Add");
		btnAddDriverPanel.setBounds(72, 382, 85, 21);
		btnAddDriverPanel.setBackground(new Color(255, 255, 255));
		addDriverPanel.add(btnAddDriverPanel);
		
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
		
		textFieldName = new JTextField();
		textFieldName.setBounds(107, 118, 96, 19);
		textFieldName.setColumns(10);
		addDriverPanel.add(textFieldName);
		
		textFieldIdDriverPanel = new JTextField();
		textFieldIdDriverPanel.setBounds(107, 80, 96, 19);
		textFieldIdDriverPanel.setColumns(10);
		addDriverPanel.add(textFieldIdDriverPanel);
		
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
