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
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JTextArea;

public class RouteInfo extends JPanel {
	private JTable tblRoute;
	private JTextField textFieldDescription;
	private JTextField textFieldTotalDistance;
	private JTextField textFieldTicketPrice;
	private JTextField textFieldTicketCount;
	private JTextField textFieldRouteNumber;
	private JTextField textFieldSearchRoute;
	private JButton btnBackRoute;
	private JButton btnRemoveRoute;
	private JButton btnSearchRoute;
	private JButton btnAddRoutePanel;
	private JButton btnAddBusStopToRoute;
	private JButton btnRemoveBusStopFromRoute;
	private JButton btnRemoveBusStop;
	private BufferedImage imageSearch;
	private JComboBox<Object> comboBoxRoutes;
	private JComboBox<Object> comboBoxBusStopsToAdd;
	private JComboBox<Object> comboBoxRouteBusStops; 
	private JComboBox<Object> comboBoxBusStops;
	private JLabel lblRouteNumber;
	
	public JButton getBackRouteButton() {
		return btnBackRoute;
	}
	public JButton getRemoveRouteButton() {
		return btnRemoveRoute;
	}
	public JButton getSearchRouteButton() {
		return btnSearchRoute;
	}
	public JButton getAddRouteButton() {
		return btnAddRoutePanel;
	}
	
	public JButton getAddBusStopToRouteButton() {
		return btnAddBusStopToRoute;
	}
	
	public JButton removeBusStopFromRouteButton() {
		return btnRemoveBusStopFromRoute;
	}
	
	public JButton removeBusStopButton() {
		return btnRemoveBusStop;
	}
	public JTextField getRouteNumberField() {
		return textFieldRouteNumber;
	}
	
	public JTextField getTicketCountField() {
		return textFieldTicketCount;
	}
	
	public JTextField getTicketPriceField() {
		return textFieldTicketPrice;
	}
	
	public JTextField getTotalDistanceField() {
		return textFieldTotalDistance;
	}
	
	public JTextField getDescriptionField() {
		return textFieldDescription;
	}
	
	public JTextField getSearchField() {
		return textFieldSearchRoute;
	}
	
	public JTable getRouteTable() {
		return tblRoute;
	}
	
	public JComboBox<Object> getRoutesComboBox() {
		return comboBoxRoutes;
	}
	
	public JComboBox<Object> getBusStopsToAddComboBox() {
		return comboBoxBusStopsToAdd;
	}
	
	public JComboBox<Object> getRouteBusStopsComboBox() {
		return comboBoxRouteBusStops;
	}
	public JComboBox<Object> getBusStopsComboBox() {
		return comboBoxBusStops;
	}
	public JLabel getRouteNumberLabel() {
		return lblRouteNumber;
	}
	
	/**
	 * Create the panel.
	 */
	public RouteInfo() {
		setBackground(new Color(128, 255, 128));
		setLayout(null);
		
		JScrollPane scrollRoutePane = new JScrollPane();
		scrollRoutePane.setBounds(8, 48, 482, 401);
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
		
		try {
			imageSearch = ImageIO.read(getClass().getResource("/searchicon.png"));
			setLayout(null);
		}
		catch(Exception e) {
			System.out.println("Image not found");
		}
		
		tblRoute.getColumnModel().getColumn(4).setResizable(false);
		
		btnBackRoute = new JButton("Back");
		btnBackRoute.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBackRoute.setBackground(new Color(255, 255, 255));
		btnBackRoute.setBounds(21, 459, 85, 21);
		add(btnBackRoute);
		
		btnRemoveRoute = new JButton("Remove");
		btnRemoveRoute.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRemoveRoute.setBackground(new Color(255, 255, 255));
		btnRemoveRoute.setBounds(116, 459, 85, 21);
		add(btnRemoveRoute);
		
		btnSearchRoute = new JButton(new ImageIcon(imageSearch));
		btnSearchRoute.setBackground(new Color(255, 255, 255));
		btnSearchRoute.setBounds(460, 18, 30, 21);
		add(btnSearchRoute);
		
		JPanel btnAddRoute = new JPanel();
		btnAddRoute.setBounds(669, 10, 216, 470);
		add(btnAddRoute);
		btnAddRoute.setLayout(null);
		
		btnAddRoutePanel = new JButton("Add");
		btnAddRoutePanel.setBackground(new Color(255, 255, 255));
		btnAddRoutePanel.setBounds(65, 248, 85, 21);
		btnAddRoute.add(btnAddRoutePanel);
		
		textFieldDescription = new JTextField();
		textFieldDescription.setColumns(10);
		textFieldDescription.setBounds(107, 215, 96, 19);
		btnAddRoute.add(textFieldDescription);
		
		textFieldTotalDistance = new JTextField();
		textFieldTotalDistance.setColumns(10);
		textFieldTotalDistance.setBounds(107, 177, 96, 19);
		btnAddRoute.add(textFieldTotalDistance);
		
		textFieldTicketPrice = new JTextField();
		textFieldTicketPrice.setColumns(10);
		textFieldTicketPrice.setBounds(107, 139, 96, 19);
		btnAddRoute.add(textFieldTicketPrice);
		
		textFieldTicketCount = new JTextField();
		textFieldTicketCount.setColumns(10);
		textFieldTicketCount.setBounds(107, 101, 96, 19);
		btnAddRoute.add(textFieldTicketCount);
		
		textFieldRouteNumber = new JTextField();
		textFieldRouteNumber.setColumns(10);
		textFieldRouteNumber.setBounds(107, 63, 96, 19);
		btnAddRoute.add(textFieldRouteNumber);
		
		JLabel lblAddRoute = new JLabel("Add Route");
		lblAddRoute.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddRoute.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAddRoute.setBounds(53, 10, 97, 38);
		btnAddRoute.add(lblAddRoute);
		
		JLabel lblNumberRoutePanel = new JLabel("Route Number");
		lblNumberRoutePanel.setBounds(10, 58, 87, 28);
		btnAddRoute.add(lblNumberRoutePanel);
		
		JLabel lblTicketCount = new JLabel("Ticket Count");
		lblTicketCount.setBounds(10, 96, 87, 28);
		btnAddRoute.add(lblTicketCount);
		
		JLabel lblTicketPrice = new JLabel("Ticket Price");
		lblTicketPrice.setBounds(10, 134, 97, 28);
		btnAddRoute.add(lblTicketPrice);
		
		JLabel lblTotalDistance = new JLabel("Total Distance");
		lblTotalDistance.setBounds(10, 172, 87, 28);
		btnAddRoute.add(lblTotalDistance);
		
		JLabel lblDescription = new JLabel("Description");
		lblDescription.setBounds(10, 210, 87, 28);
		btnAddRoute.add(lblDescription);
		
		comboBoxRoutes = new JComboBox();
		comboBoxRoutes.setBounds(107, 346, 96, 21);
		btnAddRoute.add(comboBoxRoutes);
		
		comboBoxBusStopsToAdd = new JComboBox();
		comboBoxBusStopsToAdd.setBounds(107, 395, 96, 21);
		btnAddRoute.add(comboBoxBusStopsToAdd);
		
		btnAddBusStopToRoute = new JButton("Add");
		btnAddBusStopToRoute.setBackground(Color.WHITE);
		btnAddBusStopToRoute.setBounds(65, 439, 85, 21);
		btnAddRoute.add(btnAddBusStopToRoute);
		
		JLabel lblAddBusStop = new JLabel("Add Bus Stop To Route");
		lblAddBusStop.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddBusStop.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAddBusStop.setBounds(0, 290, 203, 38);
		btnAddRoute.add(lblAddBusStop);
		
		JLabel lblRoutes = new JLabel("Routes");
		lblRoutes.setBounds(10, 350, 45, 13);
		btnAddRoute.add(lblRoutes);
		
		JLabel lblStops = new JLabel("Bus Stops");
		lblStops.setBounds(10, 399, 58, 13);
		btnAddRoute.add(lblStops);
		
		textFieldSearchRoute = new JTextField();
		textFieldSearchRoute.setColumns(10);
		textFieldSearchRoute.setBounds(354, 19, 96, 19);
		add(textFieldSearchRoute);
		
		JPanel panel = new JPanel();
		panel.setBounds(500, 48, 159, 203);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblRoutes1 = new JLabel("Routes");
		lblRoutes1.setHorizontalAlignment(SwingConstants.CENTER);
		lblRoutes1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblRoutes1.setBounds(28, 10, 97, 38);
		panel.add(lblRoutes1);
		
		comboBoxRouteBusStops = new JComboBox();
		comboBoxRouteBusStops.setBounds(67, 113, 82, 21);
		panel.add(comboBoxRouteBusStops);
		
		btnRemoveBusStopFromRoute = new JButton("Remove");
		btnRemoveBusStopFromRoute.setBounds(40, 172, 85, 21);
		panel.add(btnRemoveBusStopFromRoute);
		
		lblRouteNumber = new JLabel("");
		lblRouteNumber.setBounds(67, 70, 70, 13);
		panel.add(lblRouteNumber);
		
		JLabel lblRoute = new JLabel("Route");
		lblRoute.setBounds(10, 70, 45, 13);
		panel.add(lblRoute);
		
		JLabel lblBusStops = new JLabel("Stops");
		lblBusStops.setBounds(10, 117, 45, 13);
		panel.add(lblBusStops);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(509, 290, 150, 159);
		add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblBusStops1 = new JLabel("Bus Stops");
		lblBusStops1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblBusStops1.setHorizontalAlignment(SwingConstants.CENTER);
		lblBusStops1.setBounds(26, 10, 93, 24);
		panel_1.add(lblBusStops1);
		
		comboBoxBusStops = new JComboBox();
		comboBoxBusStops.setBounds(26, 62, 103, 21);
		panel_1.add(comboBoxBusStops);
		
		btnRemoveBusStop = new JButton("Remove");
		btnRemoveBusStop.setBounds(34, 128, 85, 21);
		panel_1.add(btnRemoveBusStop);
	}
}
