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
	private BufferedImage imageSearch;
	
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
		btnAddRoutePanel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAddRoutePanel.setBackground(new Color(255, 255, 255));
		btnAddRoutePanel.setBounds(73, 257, 85, 21);
		btnAddRoute.add(btnAddRoutePanel);
		
		textFieldDescription = new JTextField();
		textFieldDescription.setColumns(10);
		textFieldDescription.setBounds(107, 228, 96, 19);
		btnAddRoute.add(textFieldDescription);
		
		textFieldTotalDistance = new JTextField();
		textFieldTotalDistance.setColumns(10);
		textFieldTotalDistance.setBounds(107, 190, 96, 19);
		btnAddRoute.add(textFieldTotalDistance);
		
		textFieldTicketPrice = new JTextField();
		textFieldTicketPrice.setColumns(10);
		textFieldTicketPrice.setBounds(107, 152, 96, 19);
		btnAddRoute.add(textFieldTicketPrice);
		
		textFieldTicketCount = new JTextField();
		textFieldTicketCount.setColumns(10);
		textFieldTicketCount.setBounds(107, 114, 96, 19);
		btnAddRoute.add(textFieldTicketCount);
		
		textFieldRouteNumber = new JTextField();
		textFieldRouteNumber.setColumns(10);
		textFieldRouteNumber.setBounds(107, 80, 96, 19);
		btnAddRoute.add(textFieldRouteNumber);
		
		JLabel lblAddRoute = new JLabel("Add Route");
		lblAddRoute.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddRoute.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAddRoute.setBounds(53, 10, 97, 38);
		btnAddRoute.add(lblAddRoute);
		
		JLabel lblNumberRoutePanel = new JLabel("Route Number");
		lblNumberRoutePanel.setBounds(10, 75, 87, 28);
		btnAddRoute.add(lblNumberRoutePanel);
		
		JLabel lblTicketCount = new JLabel("Ticket Count");
		lblTicketCount.setBounds(10, 109, 87, 28);
		btnAddRoute.add(lblTicketCount);
		
		JLabel lblTicketPrice = new JLabel("Ticket Price");
		lblTicketPrice.setBounds(10, 147, 97, 28);
		btnAddRoute.add(lblTicketPrice);
		
		JLabel lblTotalDistance = new JLabel("Total Distance");
		lblTotalDistance.setBounds(10, 185, 87, 28);
		btnAddRoute.add(lblTotalDistance);
		
		JLabel lblDescription = new JLabel("Description");
		lblDescription.setBounds(10, 223, 87, 28);
		btnAddRoute.add(lblDescription);
		
		JComboBox comboBoxRoutes = new JComboBox();
		comboBoxRoutes.setBounds(107, 346, 96, 21);
		btnAddRoute.add(comboBoxRoutes);
		
		JComboBox comboBoxBusStops = new JComboBox();
		comboBoxBusStops.setBounds(107, 395, 96, 21);
		btnAddRoute.add(comboBoxBusStops);
		
		JButton btnAddBusStop = new JButton("Add");
		btnAddBusStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAddBusStop.setBackground(Color.WHITE);
		btnAddBusStop.setBounds(73, 439, 85, 21);
		btnAddRoute.add(btnAddBusStop);
		
		JLabel lblAddBusStop = new JLabel("Add Bus Stop");
		lblAddBusStop.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddBusStop.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAddBusStop.setBounds(53, 288, 131, 38);
		btnAddRoute.add(lblAddBusStop);
		
		textFieldSearchRoute = new JTextField();
		textFieldSearchRoute.setColumns(10);
		textFieldSearchRoute.setBounds(354, 19, 96, 19);
		add(textFieldSearchRoute);
		
		JPanel panel = new JPanel();
		panel.setBounds(500, 48, 159, 193);
		add(panel);
		panel.setLayout(null);
		
		JTextArea txtrBusStops = new JTextArea();
		txtrBusStops.setRows(2);
		txtrBusStops.setBounds(10, 65, 139, 118);
		panel.add(txtrBusStops);
		
		JLabel lblBusStops = new JLabel("Bus Stops");
		lblBusStops.setHorizontalAlignment(SwingConstants.CENTER);
		lblBusStops.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblBusStops.setBounds(29, 10, 97, 38);
		panel.add(lblBusStops);
	}
}
