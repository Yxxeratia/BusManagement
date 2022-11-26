package swing;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class busmanager extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Create the panel.
	 */
	public busmanager() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Plate number: ");
		lblNewLabel.setBounds(33, 33, 68, 18);
		add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(111, 33, 96, 19);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblSeats = new JLabel("Seats:");
		lblSeats.setBounds(33, 62, 68, 18);
		add(lblSeats);
		
		JLabel lblNewLabel_1_1 = new JLabel("Fuel capacity:");
		lblNewLabel_1_1.setBounds(33, 90, 68, 18);
		add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Driver:");
		lblNewLabel_1_2.setBounds(33, 118, 68, 18);
		add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Ticket price:");
		lblNewLabel_1_3.setBounds(33, 146, 68, 18);
		add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Tickets count:");
		lblNewLabel_1_4.setBounds(33, 174, 68, 18);
		add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Route: ");
		lblNewLabel_1_5.setBounds(33, 202, 68, 18);
		add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("Location:");
		lblNewLabel_1_6.setBounds(33, 230, 68, 18);
		add(lblNewLabel_1_6);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(111, 62, 96, 19);
		add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(111, 90, 96, 19);
		add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(111, 118, 96, 19);
		add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(111, 146, 96, 19);
		add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(111, 174, 96, 19);
		add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(111, 202, 96, 19);
		add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(111, 230, 96, 19);
		add(textField_7);

	}
}
