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

public class BusManager extends JPanel {
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public BusManager() {
		setBackground(new Color(128, 255, 128));
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 39, 649, 341);
		add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				 "Plate Number", "Driver", "Location", "Fuel Capacity", "Seats", "Route", "Ticket Count", "Price Ticket","Revenue"
			}
		));
		table.getColumnModel().getColumn(6).setResizable(false);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setBackground(new Color(128, 255, 128));
		btnNewButton.setBounds(27, 402, 85, 21);
		add(btnNewButton);
		
		JButton btnRemove = new JButton("Remove");
		btnRemove.setBackground(new Color(128, 255, 128));
		btnRemove.setBounds(122, 402, 85, 21);
		add(btnRemove);
		
		textField = new JTextField();
		textField.setBounds(563, 390, 96, 19);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Total");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(508, 392, 45, 13);
		add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(468, 9, 96, 19);
		add(textField_1);
		
		JButton btnSearhch = new JButton("Search");
		btnSearhch.setBackground(new Color(128, 255, 128));
		btnSearhch.setBounds(574, 8, 85, 21);
		add(btnSearhch);

	}
}
