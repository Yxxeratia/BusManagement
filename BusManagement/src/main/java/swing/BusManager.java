package swing;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class BusManager extends JPanel {
	private JTextField plateNumberField;
	private JTextField seatsField;
	private JTextField fuelCapacityField;
	private JTextField driverField;
	private JTextField ticketPriceField;
	private JTextField ticketCountField;
	private JTextField routeField;
	private JTextField locationField;

	/**
	 * Create the panel.
	 */
	public BusManager() {
		setLayout(null);
		
		JLabel lblPlateNumber = new JLabel("Plate number: ");
		lblPlateNumber.setBounds(33, 33, 68, 18);
		add(lblPlateNumber);
		
		plateNumberField = new JTextField();
		plateNumberField.setBounds(111, 33, 96, 19);
		add(plateNumberField);
		plateNumberField.setColumns(10);
		
		JLabel lblSeats = new JLabel("Seats:");
		lblSeats.setBounds(33, 62, 68, 18);
		add(lblSeats);
		
		JLabel lblFuelCapacity = new JLabel("Fuel capacity:");
		lblFuelCapacity.setBounds(33, 90, 68, 18);
		add(lblFuelCapacity);
		
		JLabel lblDriver = new JLabel("Driver:");
		lblDriver.setBounds(33, 118, 68, 18);
		add(lblDriver);
		
		JLabel lblTicketPrice = new JLabel("Ticket price:");
		lblTicketPrice.setBounds(33, 146, 68, 18);
		add(lblTicketPrice);
		
		JLabel lblTicketCount = new JLabel("Ticket count:");
		lblTicketCount.setBounds(33, 174, 68, 18);
		add(lblTicketCount);
		
		JLabel lblRoute = new JLabel("Route: ");
		lblRoute.setBounds(33, 202, 68, 18);
		add(lblRoute);
		
		JLabel lblLocation = new JLabel("Location:");
		lblLocation.setBounds(33, 230, 68, 18);
		add(lblLocation);
		
		seatsField = new JTextField();
		seatsField.setColumns(10);
		seatsField.setBounds(111, 62, 96, 19);
		add(seatsField);
		
		fuelCapacityField = new JTextField();
		fuelCapacityField.setColumns(10);
		fuelCapacityField.setBounds(111, 90, 96, 19);
		add(fuelCapacityField);
		
		driverField = new JTextField();
		driverField.setColumns(10);
		driverField.setBounds(111, 118, 96, 19);
		add(driverField);
		
		ticketPriceField = new JTextField();
		ticketPriceField.setColumns(10);
		ticketPriceField.setBounds(111, 146, 96, 19);
		add(ticketPriceField);
		
		ticketCountField = new JTextField();
		ticketCountField.setColumns(10);
		ticketCountField.setBounds(111, 174, 96, 19);
		add(ticketCountField);
		
		routeField = new JTextField();
		routeField.setColumns(10);
		routeField.setBounds(111, 202, 96, 19);
		add(routeField);
		
		locationField = new JTextField();
		locationField.setColumns(10);
		locationField.setBounds(111, 230, 96, 19);
		add(locationField);

	}
}
