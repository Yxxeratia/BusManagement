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

public class BusManager extends JPanel {
	private JTable table;
	private JTextField textFieldTotal;
	private JTextField textFieldSearchBusManagerPanel;
	private JButton btnBackBusManagerPanel;
	private JButton btnRemoveBusManagerPanel;
	private JButton btnSearchBusManagerPanel;
	private BufferedImage imageSearch;

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
		scrollBusManagerPane.setBounds(10, 39, 649, 413);
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
		//image
		try {
			imageSearch = ImageIO.read(getClass().getResource("/searchicon.png"));
			setLayout(null);
		}
		catch(Exception e) {
			System.out.println("Image not found");
		}
		
		table.getColumnModel().getColumn(6).setResizable(false);
		
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

	}
}
