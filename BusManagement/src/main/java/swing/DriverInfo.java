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
	private JTable table;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public DriverInfo() {
		setBackground(new Color(128, 255, 128));
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 56, 649, 346);
		add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Name", "Telephone Number", "Shift", "Bank Name", "Bank Number", "Status", "Salary"
			}
		));
		table.getColumnModel().getColumn(7).setResizable(false);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBackground(new Color(128, 255, 128));
		btnNewButton.setBounds(20, 412, 85, 21);
		add(btnNewButton);
		
		JButton btnRemove = new JButton("Remove");
		btnRemove.setBackground(new Color(128, 255, 128));
		btnRemove.setBounds(122, 412, 85, 21);
		add(btnRemove);
		
		JPanel panel = new JPanel();
		panel.setBounds(669, 10, 216, 413);
		add(panel);
		panel.setLayout(null);
		
		textField_2 = new JTextField();
		textField_2.setBounds(107, 310, 96, 19);
		textField_2.setColumns(10);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(107, 272, 96, 19);
		textField_3.setColumns(10);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setBounds(107, 234, 96, 19);
		textField_4.setColumns(10);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setBounds(107, 194, 96, 19);
		textField_5.setColumns(10);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setBounds(107, 156, 96, 19);
		textField_6.setColumns(10);
		panel.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setBounds(107, 118, 96, 19);
		textField_7.setColumns(10);
		panel.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setBounds(107, 80, 96, 19);
		textField_8.setColumns(10);
		panel.add(textField_8);
		
		JButton btnNewButton_1 = new JButton("Add");
		btnNewButton_1.setBounds(72, 382, 85, 21);
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		panel.add(btnNewButton_1);
		
		JLabel lblId = new JLabel("ID");
		lblId.setBounds(10, 75, 67, 28);
		panel.add(lblId);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(10, 113, 67, 28);
		panel.add(lblName);
		
		JLabel lblTelephoneNumber = new JLabel("Telephone Number");
		lblTelephoneNumber.setBounds(10, 151, 97, 28);
		panel.add(lblTelephoneNumber);
		
		JLabel lblBankName = new JLabel("Bank Name");
		lblBankName.setBounds(10, 189, 67, 28);
		panel.add(lblBankName);
		
		JLabel lblBankNumber = new JLabel("Bank Number");
		lblBankNumber.setBounds(10, 229, 67, 28);
		panel.add(lblBankNumber);
		
		JLabel lblShift = new JLabel("Shift");
		lblShift.setBounds(10, 267, 67, 28);
		panel.add(lblShift);
		
		JLabel lblStatus = new JLabel("Status");
		lblStatus.setBounds(10, 305, 67, 28);
		panel.add(lblStatus);
		
		JLabel lblAddBus = new JLabel("Add Driver");
		lblAddBus.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddBus.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAddBus.setBounds(60, 10, 97, 38);
		panel.add(lblAddBus);
		
		JButton btnSearhch = new JButton("Search");
		btnSearhch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSearhch.setBackground(new Color(128, 255, 128));
		btnSearhch.setBounds(574, 25, 85, 21);
		add(btnSearhch);
		
		textField = new JTextField();
		textField.setBounds(468, 26, 96, 19);
		add(textField);
		textField.setColumns(10);

	}
}
