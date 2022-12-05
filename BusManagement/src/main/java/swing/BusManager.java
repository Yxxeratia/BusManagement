package swing;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.Color;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.image.BufferedImage;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BusManager extends JPanel {
	private JTable tblBusManager;
	private JTextField textFieldTotal;
	private JTextField textFieldSearchBusManagerPanel;
	private JButton btnBackBusManagerPanel;
	private JButton btnRemoveBusManagerPanel;
	private JButton btnSearchBusManagerPanel;
	private JButton btnAssign;
	private BufferedImage imageSearch;
	private JComboBox<Object> comboBoxRoutes;
	private JComboBox<Object> comboBoxBuses;
	private JComboBox<Object> comboBoxDrivers;

	public JButton getBackBusManagerPanelButton() {
		return btnBackBusManagerPanel;
	}
	public JButton getRemoveBusManagerPanelButton() {
		return btnRemoveBusManagerPanel;
	}
	public JButton getSearchBusManagerPanelButton() {
		return btnSearchBusManagerPanel;
	}
	public JButton getAssignButton() {
		return btnAssign;
	}
	public JComboBox<Object> getRoutesComboBox() {
		return comboBoxRoutes;
	}
	public JComboBox<Object> getBusesComboBox() {
		return comboBoxBuses;
	}
	public JComboBox<Object> getDriversComboBox() {
		return comboBoxDrivers;
	}
	public JTable getBusManagerTable() {
		return tblBusManager;
	}
	
	
	
	/**
	 * Create the panel.
	 */
	public BusManager() {
		setBackground(new Color(128, 255, 128));
		setLayout(null);
		
		JScrollPane scrollBusManagerPane = new JScrollPane();
		scrollBusManagerPane.setBounds(10, 39, 649, 413);
		add(scrollBusManagerPane);
		
		tblBusManager = new JTable();
		scrollBusManagerPane.setViewportView(tblBusManager);
		tblBusManager.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Route", "Bus", "Driver"//, "Fuel Capacity", "Seats", "Ticket Count", "Ticket Price", "Revenue"
			}
		));
		//image
		try {
			imageSearch = ImageIO.read(getClass().getResource("/searchicon.png"));
			setLayout(null);
		}
		catch(Exception e) {
			System.out.println("Image not found");
		}
		
		tblBusManager.getColumnModel().getColumn(2).setResizable(false);
		
		btnBackBusManagerPanel = new JButton("Back");
		btnBackBusManagerPanel.setBackground(new Color(255, 255, 255));
		btnBackBusManagerPanel.setBounds(25, 462, 85, 21);
		add(btnBackBusManagerPanel);
		
		btnRemoveBusManagerPanel = new JButton("Remove");
		btnRemoveBusManagerPanel.setBackground(new Color(255, 255, 255));
		btnRemoveBusManagerPanel.setBounds(120, 462, 85, 21);
		add(btnRemoveBusManagerPanel);
		
		btnSearchBusManagerPanel = new JButton(new ImageIcon(imageSearch));
		btnSearchBusManagerPanel.setBackground(new Color(255, 255, 255));
		btnSearchBusManagerPanel.setBounds(629, 8, 30, 21);
		add(btnSearchBusManagerPanel);
		
		textFieldSearchBusManagerPanel = new JTextField();
		textFieldSearchBusManagerPanel.setColumns(10);
		textFieldSearchBusManagerPanel.setBounds(523, 9, 96, 19);
		add(textFieldSearchBusManagerPanel);
		
		textFieldTotal = new JTextField();
		textFieldTotal.setBounds(563, 463, 96, 19);
		add(textFieldTotal);
		textFieldTotal.setColumns(10);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTotal.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotal.setBounds(508, 465, 45, 13);
		add(lblTotal);
		
		JPanel panelAssign = new JPanel();
		panelAssign.setBounds(669, 39, 190, 237);
		add(panelAssign);
		panelAssign.setLayout(null);
		
		comboBoxRoutes = new JComboBox();
		comboBoxRoutes.setBounds(88, 69, 92, 21);
		panelAssign.add(comboBoxRoutes);
		
		comboBoxBuses = new JComboBox();
		comboBoxBuses.setBounds(88, 113, 92, 21);
		panelAssign.add(comboBoxBuses);
		
		comboBoxDrivers = new JComboBox();
		comboBoxDrivers.setBounds(88, 157, 92, 21);
		panelAssign.add(comboBoxDrivers);
		
		JLabel lblRoutes = new JLabel("Routes");
		lblRoutes.setHorizontalAlignment(SwingConstants.LEFT);
		lblRoutes.setBounds(22, 73, 45, 13);
		panelAssign.add(lblRoutes);
		
		JLabel lblBuses = new JLabel("Buses");
		lblBuses.setHorizontalAlignment(SwingConstants.LEFT);
		lblBuses.setBounds(22, 117, 45, 13);
		panelAssign.add(lblBuses);
		
		JLabel lblDrivers = new JLabel("Drivers");
		lblDrivers.setHorizontalAlignment(SwingConstants.LEFT);
		lblDrivers.setBounds(22, 161, 45, 13);
		panelAssign.add(lblDrivers);
		
		JLabel lblAssign = new JLabel("Assign");
		lblAssign.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAssign.setHorizontalAlignment(SwingConstants.CENTER);
		lblAssign.setBounds(65, 22, 64, 27);
		panelAssign.add(lblAssign);
		
		btnAssign = new JButton("Assign");
		btnAssign.setBounds(49, 206, 85, 21);
		panelAssign.add(btnAssign);

	}
}
