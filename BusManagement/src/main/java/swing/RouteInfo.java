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
	private JTextField textFieldStop5;
	private JTextField textFieldStop4;
	private JTextField textFieldStop3;
	private JTextField textFieldStop2;
	private JTextField textFieldStop1;
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
					"Route ID", "Stop 1", "Stop 2","Stop 3","Stop 4","Stop 5"
			
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
		
		textFieldStop5 = new JTextField();
		textFieldStop5.setColumns(10);
		textFieldStop5.setBounds(107, 266, 96, 19);
		addRoutePanel.add(textFieldStop5);
		
		textFieldStop4 = new JTextField();
		textFieldStop4.setColumns(10);
		textFieldStop4.setBounds(107, 228, 96, 19);
		addRoutePanel.add(textFieldStop4);
		
		textFieldStop3 = new JTextField();
		textFieldStop3.setColumns(10);
		textFieldStop3.setBounds(107, 190, 96, 19);
		addRoutePanel.add(textFieldStop3);
		
		textFieldStop2 = new JTextField();
		textFieldStop2.setColumns(10);
		textFieldStop2.setBounds(107, 152, 96, 19);
		addRoutePanel.add(textFieldStop2);
		
		textFieldStop1 = new JTextField();
		textFieldStop1.setColumns(10);
		textFieldStop1.setBounds(107, 114, 96, 19);
		addRoutePanel.add(textFieldStop1);
		
		textFieldIdRoutePanel = new JTextField();
		textFieldIdRoutePanel.setColumns(10);
		textFieldIdRoutePanel.setBounds(107, 80, 96, 19);
		addRoutePanel.add(textFieldIdRoutePanel);
		
		JLabel lblAddRoute = new JLabel("Add Route");
		lblAddRoute.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddRoute.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAddRoute.setBounds(53, 10, 97, 38);
		addRoutePanel.add(lblAddRoute);
		
		JLabel lblIdRoutePanel = new JLabel("Route ID");
		lblIdRoutePanel.setBounds(10, 75, 67, 28);
		addRoutePanel.add(lblIdRoutePanel);
		
		JLabel lblStop1 = new JLabel("Stop 1");
		lblStop1.setBounds(10, 109, 67, 28);
		addRoutePanel.add(lblStop1);
		
		JLabel lblStop2 = new JLabel("Stop 2");
		lblStop2.setBounds(10, 147, 97, 28);
		addRoutePanel.add(lblStop2);
		
		JLabel lblStop3 = new JLabel("Stop 3");
		lblStop3.setBounds(10, 185, 67, 28);
		addRoutePanel.add(lblStop3);
		
		JLabel lblStop4 = new JLabel("Stop 4");
		lblStop4.setBounds(10, 223, 67, 28);
		addRoutePanel.add(lblStop4);
		
		JLabel lblStop5 = new JLabel("Stop 5");
		lblStop5.setBounds(10, 261, 67, 28);
		addRoutePanel.add(lblStop5);
		
		textFieldSearchRoutePanel = new JTextField();
		textFieldSearchRoutePanel.setColumns(10);
		textFieldSearchRoutePanel.setBounds(466, 19, 96, 19);
		add(textFieldSearchRoutePanel);
	}
}
