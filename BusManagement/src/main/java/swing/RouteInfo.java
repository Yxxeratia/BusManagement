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
	private JTable tblRoute;
	private JTextField textFieldDescription;
	private JTextField textFieldTotalDistance;
	private JTextField textFieldStop2;
	private JTextField textFieldTicketCount;
	private JTextField textFieldIdRoutePanel;
	private JTextField textFieldSearchRoutePanel;
	private JButton btnBackRoutePanel;
	private JButton btnRemoveRoutePanel;
	private JButton btnSearchRoutePanel;
	private JButton btnAddRoutePanel;
	
	public JButton getBackRoutePanelButton() {
		return btnBackRoutePanel;
	}
	public JButton getRemoveRoutePanelButton() {
		return btnRemoveRoutePanel;
	}
	public JButton getSearchRoutePanelButton() {
		return btnSearchRoutePanel;
	}
	public JButton getAddRoutePanelButton() {
		return btnAddRoutePanel;
	}
	/**
	 * Create the panel.
	 */
	public RouteInfo() {
		setBackground(new Color(128, 255, 128));
		setLayout(null);
		
		JScrollPane scrollRoutePane = new JScrollPane();
		scrollRoutePane.setBounds(10, 49, 649, 331);
		add(scrollRoutePane);
		
		tblRoute = new JTable();
		scrollRoutePane.setViewportView(tblRoute);
		tblRoute.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
					"Route Number", "Ticket Count", "Ticket price", "Total Distance", "Description"
			
			}
		));
		tblRoute.getColumnModel().getColumn(5).setResizable(false);
		
		btnBackRoutePanel = new JButton("Back");
		btnBackRoutePanel.setBackground(new Color(128, 255, 128));
		btnBackRoutePanel.setBounds(27, 402, 85, 21);
		add(btnBackRoutePanel);
		
		btnRemoveRoutePanel = new JButton("Remove");
		btnRemoveRoutePanel.setBackground(new Color(128, 255, 128));
		btnRemoveRoutePanel.setBounds(122, 402, 85, 21);
		add(btnRemoveRoutePanel);
		
		btnSearchRoutePanel = new JButton("Search");
		btnSearchRoutePanel.setBackground(new Color(128, 255, 128));
		btnSearchRoutePanel.setBounds(572, 18, 85, 21);
		add(btnSearchRoutePanel);
		
		JPanel addRoutePanel = new JPanel();
		addRoutePanel.setBounds(669, 0, 216, 402);
		add(addRoutePanel);
		addRoutePanel.setLayout(null);
		
		btnAddRoutePanel = new JButton("Add");
		btnAddRoutePanel.setBackground(new Color(255, 255, 255));
		btnAddRoutePanel.setBounds(72, 358, 85, 21);
		addRoutePanel.add(btnAddRoutePanel);
		
		textFieldDescription = new JTextField();
		textFieldDescription.setColumns(10);
		textFieldDescription.setBounds(107, 228, 96, 19);
		addRoutePanel.add(textFieldDescription);
		
		textFieldTotalDistance = new JTextField();
		textFieldTotalDistance.setColumns(10);
		textFieldTotalDistance.setBounds(107, 190, 96, 19);
		addRoutePanel.add(textFieldTotalDistance);
		
		textFieldStop2 = new JTextField();
		textFieldStop2.setColumns(10);
		textFieldStop2.setBounds(107, 152, 96, 19);
		addRoutePanel.add(textFieldStop2);
		
		textFieldTicketCount = new JTextField();
		textFieldTicketCount.setColumns(10);
		textFieldTicketCount.setBounds(107, 114, 96, 19);
		addRoutePanel.add(textFieldTicketCount);
		
		textFieldIdRoutePanel = new JTextField();
		textFieldIdRoutePanel.setColumns(10);
		textFieldIdRoutePanel.setBounds(107, 80, 96, 19);
		addRoutePanel.add(textFieldIdRoutePanel);
		
		JLabel lblAddRoute = new JLabel("Add Route");
		lblAddRoute.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddRoute.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAddRoute.setBounds(53, 10, 97, 38);
		addRoutePanel.add(lblAddRoute);
		
		JLabel lblNumberRoutePanel = new JLabel("Route Number");
		lblNumberRoutePanel.setBounds(10, 75, 67, 28);
		addRoutePanel.add(lblNumberRoutePanel);
		
		JLabel lblTicketCount = new JLabel("Ticket Count");
		lblTicketCount.setBounds(10, 109, 67, 28);
		addRoutePanel.add(lblTicketCount);
		
		JLabel lblTicketPrice = new JLabel("Ticket Price");
		lblTicketPrice.setBounds(10, 147, 97, 28);
		addRoutePanel.add(lblTicketPrice);
		
		JLabel lblTotalDistance = new JLabel("Total Distance");
		lblTotalDistance.setBounds(10, 185, 67, 28);
		addRoutePanel.add(lblTotalDistance);
		
		JLabel lblDescription = new JLabel("Description");
		lblDescription.setBounds(10, 223, 67, 28);
		addRoutePanel.add(lblDescription);
		
		textFieldSearchRoutePanel = new JTextField();
		textFieldSearchRoutePanel.setColumns(10);
		textFieldSearchRoutePanel.setBounds(466, 19, 96, 19);
		add(textFieldSearchRoutePanel);
	}
}
