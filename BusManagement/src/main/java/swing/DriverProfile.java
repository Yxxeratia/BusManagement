package swing;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.JTextField;


public class DriverProfile extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JButton bankAccountButton;
	private JLabel lblName;
	private JTextField nameField;
	private JLabel lblID;
	private JTextField idField;
	private JLabel lblTel;
	private JTextField telField;
	private JLabel lblShift;
	private JTextField shiftField;
	private JLabel lblCurrentStatus;
	private JTextField currentStatusField;
	private JLabel lblbankName;
	private JTextField bankNameField;
	private JLabel lblBankNumber;
	private JTextField bankNumberField;
	private JPanel bankAccountPanel;
	
	
	public JButton getBankAccountButton() {
		return bankAccountButton;
	}
	
	public JTextField getnameField() {
		return nameField;
	}
	public JTextField getIDField() {
		return idField;
	}
	public JTextField getTelField() {
		return telField;
	}
	public JTextField getCurrentStatusField() {
		return currentStatusField;
	}
	public JTextField getBankNameField() {
		return bankNameField;
	}
	public JTextField getBankNumberField() {
		return bankNumberField;
	}
	
	public JPanel getBankAccountPanel() {
		return bankAccountPanel;
	}
	/**
	 * Create the panel.
	 */
	public DriverProfile() {
		setLayout(null);
		
		//add button
		bankAccountButton = new JButton("Bank Account");
		bankAccountButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		bankAccountButton.setBounds(68, 296, 176, 33);
		add(bankAccountButton);
		
		lblName = new JLabel("Name:");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblName.setBounds(68, 41, 50, 25);
		add(lblName);
		
		nameField = new JTextField();
		nameField.setBounds(179, 46, 96, 19);
		add(nameField);
		nameField.setColumns(10);
		
		lblID = new JLabel("Id:");
		lblID.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblID.setBounds(68, 93, 45, 13);
		add(lblID);
		
		idField = new JTextField();
		idField.setBounds(179, 92, 96, 19);
		add(idField);
		idField.setColumns(10);
		
		lblTel = new JLabel("Tel:");
		lblTel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTel.setBounds(68, 142, 45, 13);
		add(lblTel);
		
		telField = new JTextField();
		telField.setBounds(179, 141, 96, 19);
		add(telField);
		telField.setColumns(10);
		
		lblShift = new JLabel("Shift:");
		lblShift.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblShift.setBounds(68, 189, 45, 13);
		add(lblShift);
		
		shiftField = new JTextField();
		shiftField.setBounds(179, 188, 96, 19);
		add(shiftField);
		shiftField.setColumns(10);
		
		lblCurrentStatus = new JLabel("Current status:");
		lblCurrentStatus.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCurrentStatus.setBounds(68, 237, 96, 19);
		add(lblCurrentStatus);
		
		currentStatusField = new JTextField();
		currentStatusField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		currentStatusField.setBounds(179, 239, 96, 19);
		add(currentStatusField);
		currentStatusField.setColumns(10);
		
		bankAccountPanel = new JPanel();
		bankAccountPanel.setBounds(68, 347, 229, 113);
		add(bankAccountPanel);
		bankAccountPanel.setLayout(null);
		bankAccountPanel.setVisible(false);
		
		lblBankNumber = new JLabel("Bank number:");
		lblBankNumber.setBounds(10, 10, 96, 13);
		bankAccountPanel.add(lblBankNumber);
		lblBankNumber.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		bankNameField = new JTextField();
		bankNameField.setBounds(116, 9, 96, 19);
		bankAccountPanel.add(bankNameField);
		bankNameField.setColumns(10);
		
		lblbankName = new JLabel("Bank name:");
		lblbankName.setBounds(10, 50, 89, 25);
		bankAccountPanel.add(lblbankName);
		lblbankName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		bankNumberField = new JTextField();
		bankNumberField.setBounds(116, 55, 96, 19);
		bankAccountPanel.add(bankNumberField);
		bankNumberField.setColumns(10);
	}
}
