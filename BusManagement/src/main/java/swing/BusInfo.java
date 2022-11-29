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

public class BusInfo extends JPanel {
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_2;
	
	
	
	/**
	 * Create the panel.
	 */
	public BusInfo() {
		setBackground(new Color(128, 255, 128));
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 50, 649, 347);
		add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				 "Plate Number", "Location", "Fuel Capacity", "Seats", "Ticket Count", "Price Ticket","Revenue"
			}
		));
		table.getColumnModel().getColumn(6).setResizable(false);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBackground(new Color(128, 255, 128));
		btnBack.setBounds(27, 402, 85, 21);
		add(btnBack);
		
		JButton btnRemove = new JButton("Remove");
		btnRemove.setBackground(new Color(128, 255, 128));
		btnRemove.setBounds(122, 402, 85, 21);
		add(btnRemove);
		
		textField = new JTextField();
		textField.setBounds(563, 403, 96, 19);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Total");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(509, 405, 45, 13);
		add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(669, 10, 216, 413);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblId_1 = new JLabel("ID");
		lblId_1.setBounds(10, 70, 67, 28);
		panel.add(lblId_1);
		
		JLabel lblPlateNumber = new JLabel("Plate Number");
		lblPlateNumber.setBounds(10, 104, 67, 28);
		panel.add(lblPlateNumber);
		
		JLabel lblLocation = new JLabel("Location");
		lblLocation.setBounds(10, 142, 67, 28);
		panel.add(lblLocation);
		
		JLabel lblSeats = new JLabel("Seats");
		lblSeats.setBounds(10, 180, 67, 28);
		panel.add(lblSeats);
		
		JLabel lblTicketPrice = new JLabel("Ticket Price");
		lblTicketPrice.setBounds(10, 218, 67, 28);
		panel.add(lblTicketPrice);
		
		JLabel lblTicketCount = new JLabel("Ticket Count");
		lblTicketCount.setBounds(10, 256, 67, 28);
		panel.add(lblTicketCount);
		
		JLabel lblFuelCapacity = new JLabel("Fuel Capacity");
		lblFuelCapacity.setBounds(10, 294, 67, 28);
		panel.add(lblFuelCapacity);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(107, 299, 96, 19);
		panel.add(textField_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(107, 261, 96, 19);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(107, 223, 96, 19);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(107, 185, 96, 19);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(107, 147, 96, 19);
		panel.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(107, 109, 96, 19);
		panel.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(107, 75, 96, 19);
		panel.add(textField_8);
		
		JLabel lblAddBus = new JLabel("Add Bus");
		lblAddBus.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddBus.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAddBus.setBounds(60, 10, 97, 38);
		panel.add(lblAddBus);
		
		JButton btnNewButton_1 = new JButton("Add");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setBounds(60, 371, 85, 21);
		panel.add(btnNewButton_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(468, 23, 96, 19);
		add(textField_2);
		
		JButton btnSearhch = new JButton("Search");
		btnSearhch.setBackground(new Color(128, 255, 128));
		btnSearhch.setBounds(574, 22, 85, 21);
		add(btnSearhch);

	}
}
