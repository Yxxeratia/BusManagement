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
	private JTextField textFieldLocation;
	private JTextField textFieldPlateNumber;
	private JTextField textFieldIdBusPanel;
	private JTextField textFieldSearchBusPanel;
	private JButton btnBackBusPanel;
	private JButton btnRemoveBusPanel;
	private JButton btnSearchBusPanel;
	private JButton btnAddBusPanel;
	
	public JButton getBackBusPanelButton() {
		return btnBackBusPanel;
	}
	public JButton getRemoveBusPanelButton() {
		return btnRemoveBusPanel;
	}
	public JButton getSearchBusPanelButton() {
		return btnSearchBusPanel;
	}
	public JButton getAddBusPanelButton() {
		return btnAddBusPanel;
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
		tblBus.getColumnModel().getColumn(6).setResizable(false);
		
		btnBackBusPanel = new JButton("Back");
		btnBackBusPanel.setBackground(new Color(128, 255, 128));
		btnBackBusPanel.setBounds(27, 402, 85, 21);
		add(btnBackBusPanel);
		
		btnRemoveBusPanel = new JButton("Remove");
		btnRemoveBusPanel.setBackground(new Color(128, 255, 128));
		btnRemoveBusPanel.setBounds(122, 402, 85, 21);
		add(btnRemoveBusPanel);
		
		btnSearchBusPanel = new JButton("Search");
		btnSearchBusPanel.setBackground(new Color(128, 255, 128));
		btnSearchBusPanel.setBounds(574, 22, 85, 21);
		add(btnSearchBusPanel);
		
		textFieldRevenueTotal = new JTextField();
		textFieldRevenueTotal.setBounds(563, 403, 96, 19);
		add(textFieldRevenueTotal);
		textFieldRevenueTotal.setColumns(10);
		
		JLabel lblTotalRevenue = new JLabel("Total");
		lblTotalRevenue.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTotalRevenue.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotalRevenue.setBounds(509, 405, 45, 13);
		add(lblTotalRevenue);
		
		textFieldSearchBusPanel = new JTextField();
		textFieldSearchBusPanel.setColumns(10);
		textFieldSearchBusPanel.setBounds(468, 23, 96, 19);
		add(textFieldSearchBusPanel);
		
		JPanel addBusPanel = new JPanel();
		addBusPanel.setBounds(669, 10, 216, 413);
		add(addBusPanel);
		addBusPanel.setLayout(null);
		
		btnAddBusPanel = new JButton("Add");
		btnAddBusPanel.setBackground(new Color(255, 255, 255));
		btnAddBusPanel.setBounds(60, 371, 85, 21);
		addBusPanel.add(btnAddBusPanel);
		
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
		
		textFieldLocation = new JTextField();
		textFieldLocation.setColumns(10);
		textFieldLocation.setBounds(107, 147, 96, 19);
		addBusPanel.add(textFieldLocation);
		
		textFieldPlateNumber = new JTextField();
		textFieldPlateNumber.setColumns(10);
		textFieldPlateNumber.setBounds(107, 109, 96, 19);
		addBusPanel.add(textFieldPlateNumber);
		
		textFieldIdBusPanel = new JTextField();
		textFieldIdBusPanel.setColumns(10);
		textFieldIdBusPanel.setBounds(107, 75, 96, 19);
		addBusPanel.add(textFieldIdBusPanel);
	}
}
