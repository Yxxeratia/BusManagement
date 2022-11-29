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

public class RouteInfo extends JPanel {
	private JTable table;
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
	public RouteInfo() {
		setBackground(new Color(128, 255, 128));
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 49, 649, 331);
		add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
					"Route ID", "Stop 1", "Stop 2","Stop 3","Stop 4","Stop 5"
			
			}
		));
		table.getColumnModel().getColumn(5).setResizable(false);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setBackground(new Color(128, 255, 128));
		btnNewButton.setBounds(27, 402, 85, 21);
		add(btnNewButton);
		
		JButton btnRemove = new JButton("Remove");
		btnRemove.setBackground(new Color(128, 255, 128));
		btnRemove.setBounds(122, 402, 85, 21);
		add(btnRemove);
		
		JPanel panel = new JPanel();
		panel.setBounds(669, 0, 216, 402);
		add(panel);
		panel.setLayout(null);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(107, 266, 96, 19);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(107, 228, 96, 19);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(107, 190, 96, 19);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(107, 152, 96, 19);
		panel.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(107, 114, 96, 19);
		panel.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(107, 80, 96, 19);
		panel.add(textField_8);
		
		JLabel lblAddBus = new JLabel("Add Route");
		lblAddBus.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddBus.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAddBus.setBounds(53, 10, 97, 38);
		panel.add(lblAddBus);
		
		JButton btnNewButton_1 = new JButton("Add");
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setBounds(72, 358, 85, 21);
		panel.add(btnNewButton_1);
		
		JLabel lblId = new JLabel("Route ID");
		lblId.setBounds(10, 75, 67, 28);
		panel.add(lblId);
		
		JLabel lblName = new JLabel("Stop 1");
		lblName.setBounds(10, 109, 67, 28);
		panel.add(lblName);
		
		JLabel lblTelephoneNumber = new JLabel("Stop 2");
		lblTelephoneNumber.setBounds(10, 147, 97, 28);
		panel.add(lblTelephoneNumber);
		
		JLabel lblBankName = new JLabel("Stop 3");
		lblBankName.setBounds(10, 185, 67, 28);
		panel.add(lblBankName);
		
		JLabel lblBankNumber = new JLabel("Stop 4");
		lblBankNumber.setBounds(10, 223, 67, 28);
		panel.add(lblBankNumber);
		
		JLabel lblShift = new JLabel("Stop 5");
		lblShift.setBounds(10, 261, 67, 28);
		panel.add(lblShift);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(466, 19, 96, 19);
		add(textField);
		
		JButton btnSearhch = new JButton("Search");
		btnSearhch.setBackground(new Color(128, 255, 128));
		btnSearhch.setBounds(572, 18, 85, 21);
		add(btnSearhch);

	}
}
