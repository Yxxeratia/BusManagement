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
	private JTable tblBus;
	private JTextField textFieldRevenueTotal;
	private JTextField textFieldFuelCapacity;
	private JTextField textFieldSeats;
	private JTextField textFieldStatus;
	private JTextField textFieldPlateNumber;
	private JTextField textFieldBusId;
	private JTextField textFieldSearchBus;
	private JButton btnBackBus;
	private JButton btnRemoveBus;
	private JButton btnSearchBus;
	private JButton btnAddBus;
	
	public JButton getBackBusButton() {
		return btnBackBus;
	}
	public JButton getRemoveBusButton() {
		return btnRemoveBus;
	}
	public JButton getSearchBusButton() {
		return btnSearchBus;
	}
	public JButton getAddBusButton() {
		return btnAddBus;
	}
	
	public JTextField getBusIdField() {
		return textFieldBusId;
	}
	
	public JTextField getPlateNumberField() {
		return textFieldPlateNumber;
	}
	
	public JTextField getSeatsField() {
		return textFieldSeats;
	}
	
	public JTextField getFuelCapacityField() {
		return textFieldFuelCapacity;
	}
	
	public JTextField getStatusField() {
		return textFieldStatus;
	}
	
	public JTextField getSearchField() {
		return textFieldSearchBus;
	}
	
	public JTable getBusTable() {
		return tblBus;
	}
	
	
	/**
	 * Create the panel.
	 */
	public BusInfo() {
		setBackground(new Color(128, 255, 128));
		setLayout(null);
		
		JScrollPane scrollBusPane = new JScrollPane();
		scrollBusPane.setBounds(10, 50, 649, 347);
		add(scrollBusPane);
		
		tblBus = new JTable();
		scrollBusPane.setViewportView(tblBus);
		tblBus.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				 "ID", "Plate Number", "Fuel Capacity", "Seats", "Status"
			}
		));
		tblBus.getColumnModel().getColumn(4).setResizable(false);
		
		btnBackBus = new JButton("Back");
		btnBackBus.setBackground(new Color(128, 255, 128));
		btnBackBus.setBounds(27, 402, 85, 21);
		add(btnBackBus);
		
		btnRemoveBus = new JButton("Remove");
		btnRemoveBus.setBackground(new Color(128, 255, 128));
		btnRemoveBus.setBounds(122, 402, 85, 21);
		add(btnRemoveBus);
		
		btnSearchBus = new JButton("Search");
		btnSearchBus.setBackground(new Color(128, 255, 128));
		btnSearchBus.setBounds(574, 22, 85, 21);
		add(btnSearchBus);
		
		textFieldRevenueTotal = new JTextField();
		textFieldRevenueTotal.setBounds(563, 403, 96, 19);
		add(textFieldRevenueTotal);
		textFieldRevenueTotal.setColumns(10);
		
		JLabel lblTotalRevenue = new JLabel("Total");
		lblTotalRevenue.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTotalRevenue.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotalRevenue.setBounds(509, 405, 45, 13);
		add(lblTotalRevenue);
		
		textFieldSearchBus = new JTextField();
		textFieldSearchBus.setColumns(10);
		textFieldSearchBus.setBounds(468, 23, 96, 19);
		add(textFieldSearchBus);
		
		JPanel addBusPanel = new JPanel();
		addBusPanel.setBounds(669, 10, 216, 413);
		add(addBusPanel);
		addBusPanel.setLayout(null);
		
		btnAddBus = new JButton("Add");
		btnAddBus.setBackground(new Color(255, 255, 255));
		btnAddBus.setBounds(60, 371, 85, 21);
		addBusPanel.add(btnAddBus);
		
		JLabel lblAddBus = new JLabel("Add Bus");
		lblAddBus.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddBus.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAddBus.setBounds(60, 10, 97, 38);
		addBusPanel.add(lblAddBus);
		
		JLabel lblIdBusPane = new JLabel("ID");
		lblIdBusPane.setBounds(10, 70, 67, 28);
		addBusPanel.add(lblIdBusPane);
		
		JLabel lblPlateNumber = new JLabel("Plate Number");
		lblPlateNumber.setBounds(10, 104, 67, 28);
		addBusPanel.add(lblPlateNumber);
		
		JLabel lblStatus = new JLabel("Status");
		lblStatus.setBounds(10, 142, 67, 28);
		addBusPanel.add(lblStatus);
		
		JLabel lblSeats = new JLabel("Seats");
		lblSeats.setBounds(10, 180, 67, 28);
		addBusPanel.add(lblSeats);
		
		JLabel lblFuelCapacity = new JLabel("Fuel Capacity");
		lblFuelCapacity.setBounds(10, 294, 67, 28);
		addBusPanel.add(lblFuelCapacity);
		
		textFieldFuelCapacity = new JTextField();
		textFieldFuelCapacity.setColumns(10);
		textFieldFuelCapacity.setBounds(107, 299, 96, 19);
		addBusPanel.add(textFieldFuelCapacity);
		
		textFieldSeats = new JTextField();
		textFieldSeats.setColumns(10);
		textFieldSeats.setBounds(107, 185, 96, 19);
		addBusPanel.add(textFieldSeats);
		
		textFieldStatus = new JTextField();
		textFieldStatus.setColumns(10);
		textFieldStatus.setBounds(107, 147, 96, 19);
		addBusPanel.add(textFieldStatus);
		
		textFieldPlateNumber = new JTextField();
		textFieldPlateNumber.setColumns(10);
		textFieldPlateNumber.setBounds(107, 109, 96, 19);
		addBusPanel.add(textFieldPlateNumber);
		
		textFieldBusId = new JTextField();
		textFieldBusId.setColumns(10);
		textFieldBusId.setBounds(107, 75, 96, 19);
		addBusPanel.add(textFieldBusId);
	}
}
