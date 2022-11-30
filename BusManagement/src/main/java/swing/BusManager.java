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
	private JTextField textFieldTotal;
	private JTextField textFieldSearchBusManagerPanel;
	private JButton btnBackBusManagerPanel;
	private JButton btnRemoveBusManagerPanel;
	private JButton btnSearchBusManagerPanel;

	public JButton getBackBusManagerPanelButton() {
		return btnBackBusManagerPanel;
	}
	public JButton getRemoveBusManagerPanelButton() {
		return btnRemoveBusManagerPanel;
	}
	public JButton getSearchBusManagerPanelButton() {
		return btnSearchBusManagerPanel;
	}
	/**
	 * Create the panel.
	 */
	public BusManager() {
		setBackground(new Color(128, 255, 128));
		setLayout(null);
		
		JScrollPane scrollBusManagerPane = new JScrollPane();
		scrollBusManagerPane.setBounds(10, 39, 649, 341);
		add(scrollBusManagerPane);
		
		table = new JTable();
		scrollBusManagerPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				 "Plate Number", "Driver", "Location", "Fuel Capacity", "Seats", "Route", "Ticket Count", "Price Ticket","Revenue"
			}
		));
		table.getColumnModel().getColumn(6).setResizable(false);
		
		btnBackBusManagerPanel = new JButton("Back");
		btnBackBusManagerPanel.setBackground(new Color(128, 255, 128));
		btnBackBusManagerPanel.setBounds(27, 402, 85, 21);
		add(btnBackBusManagerPanel);
		
		btnRemoveBusManagerPanel = new JButton("Remove");
		btnRemoveBusManagerPanel.setBackground(new Color(128, 255, 128));
		btnRemoveBusManagerPanel.setBounds(122, 402, 85, 21);
		add(btnRemoveBusManagerPanel);
		
		btnSearchBusManagerPanel = new JButton("Search");
		btnSearchBusManagerPanel.setBackground(new Color(128, 255, 128));
		btnSearchBusManagerPanel.setBounds(574, 8, 85, 21);
		add(btnSearchBusManagerPanel);
		
		textFieldSearchBusManagerPanel = new JTextField();
		textFieldSearchBusManagerPanel.setColumns(10);
		textFieldSearchBusManagerPanel.setBounds(468, 9, 96, 19);
		add(textFieldSearchBusManagerPanel);
		
		textFieldTotal = new JTextField();
		textFieldTotal.setBounds(563, 390, 96, 19);
		add(textFieldTotal);
		textFieldTotal.setColumns(10);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTotal.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotal.setBounds(508, 392, 45, 13);
		add(lblTotal);

	}
}
