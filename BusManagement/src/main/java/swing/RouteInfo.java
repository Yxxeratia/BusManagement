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
	private JTextField textFieldAddBusStop;
	private JTextField textFieldSchedule;
	private JButton btnBackRoute;
	private JButton btnRemoveRoute;
	private JButton btnSearchRoute;
	private JButton btnAddRoutePanel;
	private JButton btnAddBusStopToRoute;
	private JButton btnRemoveBusStopFromRoute;
	private JButton btnAddBusStop;
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
	
	public JButton getRemoveBusStopFromRouteButton() {
		return btnRemoveBusStopFromRoute;
	}
	
	public JButton getAddBusStopButton() {
		return btnAddBusStop;
	}
	
	public JButton getRemoveBusStopButton() {
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
	
	public JTextField getScheduleField() {
		return textFieldSchedule;
	}
	
	public JTextField getDescriptionField() {
		return textFieldDescription;
	}
	
	public JTextField getSearchField() {
		return textFieldSearchRoute;
	}
	
	public JTextField getAddStopField() {
		return textFieldAddBusStop;
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
					"Route Number", "Ticket Count", "Ticket price", "Total Distance", "Schedule", "Description"
			
			}
		));
		
		try {
			imageSearch = ImageIO.read(getClass().getResource("/searchicon.png"));
			setLayout(null);
		}
		catch(Exception e) {
			System.out.println("Image not found");
		}
		
		tblRoute.getColumnModel().getColumn(5).setResizable(false);
		
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
		btnAddRoutePanel.setBounds(65, 279, 85, 21);
		btnAddRoute.add(btnAddRoutePanel);
		
		textFieldDescription = new JTextField();
		textFieldDescription.setColumns(10);
		textFieldDescription.setBounds(107, 250, 96, 19);
		btnAddRoute.add(textFieldDescription);
		
		textFieldTotalDistance = new JTextField();
		textFieldTotalDistance.setColumns(10);
		textFieldTotalDistance.setBounds(107, 166, 96, 19);
		btnAddRoute.add(textFieldTotalDistance);
		
		textFieldTicketPrice = new JTextField();
		textFieldTicketPrice.setColumns(10);
		textFieldTicketPrice.setBounds(107, 128, 96, 19);
		btnAddRoute.add(textFieldTicketPrice);
		
		textFieldTicketCount = new JTextField();
		textFieldTicketCount.setColumns(10);
		textFieldTicketCount.setBounds(107, 90, 96, 19);
		btnAddRoute.add(textFieldTicketCount);
		
		textFieldRouteNumber = new JTextField();
		textFieldRouteNumber.setColumns(10);
		textFieldRouteNumber.setBounds(107, 52, 96, 19);
		btnAddRoute.add(textFieldRouteNumber);
		
		JLabel lblAddRoute = new JLabel("Add Route");
		lblAddRoute.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddRoute.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAddRoute.setBounds(53, 10, 97, 38);
		btnAddRoute.add(lblAddRoute);
		
		JLabel lblNumberRoutePanel = new JLabel("Route Number");
		lblNumberRoutePanel.setBounds(10, 47, 87, 28);
		btnAddRoute.add(lblNumberRoutePanel);
		
		JLabel lblTicketCount = new JLabel("Ticket Count");
		lblTicketCount.setBounds(10, 85, 87, 28);
		btnAddRoute.add(lblTicketCount);
		
		JLabel lblTicketPrice = new JLabel("Ticket Price");
		lblTicketPrice.setBounds(10, 123, 97, 28);
		btnAddRoute.add(lblTicketPrice);
		
		JLabel lblTotalDistance = new JLabel("Total Distance");
		lblTotalDistance.setBounds(10, 161, 87, 28);
		btnAddRoute.add(lblTotalDistance);
		
		JLabel lblDescription = new JLabel("Description");
		lblDescription.setBounds(10, 245, 87, 28);
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
		
		JLabel lblAddStopToRoute = new JLabel("Add Stop To Route");
		lblAddStopToRoute.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddStopToRoute.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAddStopToRoute.setBounds(0, 298, 213, 38);
		btnAddRoute.add(lblAddStopToRoute);
		
		JLabel lblRoutes = new JLabel("Routes");
		lblRoutes.setBounds(10, 350, 45, 13);
		btnAddRoute.add(lblRoutes);
		
		JLabel lblStops = new JLabel("Bus Stops");
		lblStops.setBounds(10, 399, 58, 13);
		btnAddRoute.add(lblStops);
		
		JLabel lblSchedule = new JLabel("Schedule");
		lblSchedule.setBounds(10, 214, 58, 21);
		btnAddRoute.add(lblSchedule);
		
		textFieldSchedule = new JTextField();
		textFieldSchedule.setBounds(107, 215, 96, 19);
		btnAddRoute.add(textFieldSchedule);
		textFieldSchedule.setColumns(10);
		
		textFieldSearchRoute = new JTextField();
		textFieldSearchRoute.setColumns(10);
		textFieldSearchRoute.setBounds(354, 19, 96, 19);
		add(textFieldSearchRoute);
		
		JPanel panel = new JPanel();
		panel.setBounds(500, 48, 159, 145);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblRouteStops = new JLabel("Route-Stops");
		lblRouteStops.setHorizontalAlignment(SwingConstants.CENTER);
		lblRouteStops.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblRouteStops.setBounds(10, 10, 139, 38);
		panel.add(lblRouteStops);
		
		comboBoxRouteBusStops = new JComboBox();
		comboBoxRouteBusStops.setBounds(67, 72, 82, 21);
		panel.add(comboBoxRouteBusStops);
		
		btnRemoveBusStopFromRoute = new JButton("Remove from Route");
		btnRemoveBusStopFromRoute.setBounds(10, 111, 139, 21);
		panel.add(btnRemoveBusStopFromRoute);
		
		lblRouteNumber = new JLabel("");
		lblRouteNumber.setBounds(68, 49, 70, 13);
		panel.add(lblRouteNumber);
		
		JLabel lblRoute = new JLabel("Route");
		lblRoute.setBounds(10, 49, 45, 13);
		panel.add(lblRoute);
		
		JLabel lblBusStops = new JLabel("Stops");
		lblBusStops.setBounds(10, 74, 45, 13);
		panel.add(lblBusStops);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(500, 203, 159, 127);
		add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblRemoveStops = new JLabel("Remove Stop");
		lblRemoveStops.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblRemoveStops.setHorizontalAlignment(SwingConstants.CENTER);
		lblRemoveStops.setBounds(10, 10, 139, 24);
		panel_1.add(lblRemoveStops);
		
		comboBoxBusStops = new JComboBox();
		comboBoxBusStops.setBounds(10, 55, 139, 21);
		panel_1.add(comboBoxBusStops);
		
		btnRemoveBusStop = new JButton("Remove");
		btnRemoveBusStop.setBounds(36, 96, 85, 21);
		panel_1.add(btnRemoveBusStop);
		
		JPanel panelAddBusStop = new JPanel();
		panelAddBusStop.setLayout(null);
		panelAddBusStop.setBounds(500, 340, 159, 109);
		add(panelAddBusStop);
		
		JLabel lblAddStop = new JLabel("Add Stop");
		lblAddStop.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddStop.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAddStop.setBounds(36, 10, 93, 24);
		panelAddBusStop.add(lblAddStop);
		
		btnAddBusStop = new JButton("Add");
		btnAddBusStop.setBounds(36, 75, 85, 21);
		panelAddBusStop.add(btnAddBusStop);
		
		textFieldAddBusStop = new JTextField();
		textFieldAddBusStop.setBounds(24, 46, 108, 19);
		panelAddBusStop.add(textFieldAddBusStop);
		textFieldAddBusStop.setColumns(10);
	}
}
