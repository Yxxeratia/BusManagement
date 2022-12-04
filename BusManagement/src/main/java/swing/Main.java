package swing;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.PatternSyntaxException;

import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;

//Main frame

public class Main extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		});
	}

	
	
	
	/**
	 * Create the frame.
	 */
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 917, 530);
		
		
		
		/*login panel*/
		Login loginPane = new Login();
		JButton btnLogin = loginPane.getLoginButton();
		JTextField usernameField = loginPane.getUsernameField();
		JPasswordField passwordField = loginPane.getPasswordField();
		
		
		
		/*manager interface*/
		ManagerInterface managerPane = new ManagerInterface();
		JButton btnBus = managerPane.getBusButton();
		JButton btnDriver = managerPane.getDriverButton();
		JButton btnRoute = managerPane.getRouteButton();
		JButton btnlogOut = managerPane.getlogOutButton();
		JButton btnAssign = managerPane.getAssignButton();
		
		
		
		/*bus info*/
		BusInfo busPane = new BusInfo();
		JButton btnBackBus = busPane.getBackBusButton();
		JButton btnRemoveBus = busPane.getRemoveBusButton();
		JButton btnSearchBus = busPane.getSearchBusButton();
		JButton btnAddBus = busPane.getAddBusButton();
		JTextField textFieldBusId = busPane.getBusIdField();
		JTextField textFieldPlateNumber = busPane.getPlateNumberField();
		JTextField textFieldSeats = busPane.getSeatsField();
		JTextField textFieldFuelCapacity = busPane.getFuelCapacityField();
		JTextField textFieldSearchBus = busPane.getSearchField();
		JTable tblBus = busPane.getBusTable();
		//table model
        DefaultTableModel tblBusModel = (DefaultTableModel) tblBus.getModel(); 
        //row sorter
        TableRowSorter<DefaultTableModel> sorterBus = new TableRowSorter<DefaultTableModel>(tblBusModel);
        tblBus.setRowSorter(sorterBus);
    
				
		/*driver info*/
		DriverInfo driverPane = new DriverInfo();
		JButton btnBackDriver = driverPane.getBackDriverButton();
		JButton btnRemoveDriver = driverPane.getRemoveDriverButton();
		JButton btnSearchDriver = driverPane.getSearchDriverButton();
		JButton btnAddDriver = driverPane.getAddDriverButton();
		JTextField textFieldDriverId = driverPane.getDriverIdField();
		JTextField textFieldDriverName = driverPane.getDriverNameField();
		JTextField textFieldTelNumber = driverPane.getTelephoneNumberField();
		JTextField textFieldShift = driverPane.getShiftField();
		JTextField textFieldSearchDriver = driverPane.getSearchField();
		JTable tblDriver = driverPane.getDriverTable();
		//table model
        DefaultTableModel tblDriverModel = (DefaultTableModel) tblDriver.getModel(); 
        //row sorter
        TableRowSorter<DefaultTableModel> sorterDriver = new TableRowSorter<DefaultTableModel>(tblDriverModel);
        tblDriver.setRowSorter(sorterDriver);
		
        
        
        
		/*route info*/
		RouteInfo routePane = new RouteInfo();
		JButton btnBackRoute = routePane.getBackRouteButton();
		JButton btnRemoveRoute = routePane.getRemoveRouteButton();
		JButton btnSearchRoute = routePane.getSearchRouteButton();
		JButton btnAddRoute = routePane.getAddRouteButton();
		JTextField textFieldRouteNumber = routePane.getRouteNumberField();
		JTextField textFieldTicketCount = routePane.getTicketCountField();
		JTextField textFieldTicketPrice = routePane.getTicketPriceField();
		JTextField textFieldTotalDistance = routePane.getTotalDistanceField();
		JTextField textFieldDescription = routePane.getDescriptionField();
		JTextField textFieldSearchRoute = routePane.getSearchField();
		JTable tblRoute = routePane.getRouteTable();
		//table model
        DefaultTableModel tblRouteModel = (DefaultTableModel) tblRoute.getModel(); 
        //row sorter
        TableRowSorter<DefaultTableModel> sorterRoute = new TableRowSorter<DefaultTableModel>(tblRouteModel);
        tblRoute.setRowSorter(sorterRoute);
   
	 
        
		/*bus manager*/
		BusManager busManagerPane = new BusManager();
		JButton btnBackBusManagerPanel = busManagerPane.getBackBusManagerPanelButton();
		JButton btnRemoveBusManagerPanel = busManagerPane.getRemoveBusManagerPanelButton();
		JButton btnSearchBusManagerPanel = busManagerPane.getSearchBusManagerPanelButton();
		
		
		
		
		/*base panel*/
		JPanel basePane = new JPanel();
		CardLayout card = new CardLayout();
		basePane.setLayout(card);
        basePane.add("1", loginPane);
        basePane.add("2", managerPane);
        basePane.add("3", busPane);
        basePane.add("4", driverPane);
        basePane.add("5", routePane);
        basePane.add("6", busManagerPane);
        card.show(basePane, "1");
        getContentPane().add(basePane);
        
	      
        
        /*ACTION LISTENERS*/
        
        /*LOGIN PANEL*/
        //add action listener for login button
        btnLogin.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
                
                if(username.isEmpty()) {
                    JOptionPane.showMessageDialog(loginPane, "Username is missing", "Login Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                
                if(password.isEmpty()) {
                    JOptionPane.showMessageDialog(loginPane, "Password is missing", "Login Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                
                //connect to DB
                DBConnection dbConn = new DBConnection();
                
                try(PreparedStatement stmt = dbConn.getConn().prepareStatement("SELECT * FROM dbo.fn_verify_user('" +username+ "', '"+password+"')");) {
                    ResultSet rs = stmt.executeQuery();    
                    while(rs.next()) {
                        //login successful
                        if(username.equals(rs.getString("username")) && password.equals(rs.getString("password"))) {
                            usernameField.setText("");
                            passwordField.setText("");
                            card.show(basePane, "2");
                            return;
                        }               
                    }
                    //login failed
                    JOptionPane.showMessageDialog(loginPane, "Credentials do not match", "Login Error", JOptionPane.ERROR_MESSAGE);               
                } 
                catch(Exception ex) {
                    System.out.println(ex);
                }
        	}
                
        });
        
        /*MANAGER INTERFACE*/ 
        //on clicking bus button
        btnBus.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		//empty all text fields
                textFieldBusId.setText("");
    			textFieldPlateNumber.setText("");
    			textFieldSeats.setText("");
    			textFieldFuelCapacity.setText("");
        		textFieldSearchBus.setText("");
        		
        		
        		
        		//connect to DB
                DBConnection dbConn = new DBConnection();
                try(PreparedStatement statement = dbConn.getConn().prepareStatement("SELECT * FROM DIMbuses");) {      	
                	ResultSet rs = statement.executeQuery();
                	
                	while (rs.next()) {
                		Object busId = rs.getString("bus_id");
            			Object plateNumber = rs.getString("plate_number");
            			Object seats = rs.getString("seat_count");
            			Object fuelCapacity = rs.getString("fuel_capacity");
            			Object status = (rs.getInt("available") == 1) ? "Available" : "Busy";
            			
            			Object[] row = {busId, plateNumber, fuelCapacity, seats, status};
            			tblBusModel.addRow(row);
                	}  	
                }
                catch(Exception ex) {
                	System.out.println(ex);
                }
                
        		card.show(basePane, "3");
        	}
        });
        //on clicking driver button
        btnDriver.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		//empty all text fields
                textFieldDriverId.setText("");
    			textFieldDriverName.setText("");
    			textFieldTelNumber.setText("");
    			textFieldShift.setText("");
        		textFieldSearchDriver.setText("");
        		
        		//connect to DB
                DBConnection dbConn = new DBConnection();
                try(PreparedStatement statement = dbConn.getConn().prepareStatement("SELECT * FROM DIMemployees WHERE role_id = 3");) {      	
                	ResultSet rs = statement.executeQuery();
                	
                	while (rs.next()) {
                		Object driverId = rs.getString("employee_id");
            			Object driverName = rs.getString("employee_name");
            			Object telNum = rs.getString("tel");
            			Object shift = rs.getString("shift");
            			Object status = (rs.getInt("available") == 1) ? "Available" : "Busy";
            			
            			Object[] row = {driverId, driverName, telNum, shift, status};
            			tblDriverModel.addRow(row);
                	}  	
                }
                catch(Exception ex) {
                	System.out.println(ex);
                }
        		card.show(basePane, "4");
        	}
        });  
       
        //on clicking route button
        btnRoute.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		
        		//empty all text fields
                textFieldRouteNumber.setText("");
    			textFieldTicketCount.setText("");
    			textFieldTicketPrice.setText("");
    			textFieldTotalDistance.setText("");
    			textFieldDescription.setText("");
        		
        		
        		//connect to DB
                DBConnection dbConn = new DBConnection();
                try(PreparedStatement statement = dbConn.getConn().prepareStatement("SELECT * FROM DIMroutes");) {      	
                	ResultSet rs = statement.executeQuery();
                	
                	while (rs.next()) {
                		Object routeNumber = rs.getString("route_number");
            			Object ticketCount = rs.getString("ticket_count");
            			Object ticketPrice = rs.getString("ticket_price");
            			Object totalDistance = rs.getString("total_distance");
            			Object description = rs.getString("description");
            			
            			Object[] row = {routeNumber, ticketCount, ticketPrice, totalDistance, description};
            			tblRouteModel.addRow(row);
                	}  	
                }
                catch(Exception ex) {
                	System.out.println(ex);
                }
        		card.show(basePane, "5");
        	}
        });
        //on clicking logout button
        btnlogOut.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		card.show(basePane, "1");
        	}
        });
        
      //on clicking assign button
        btnAssign.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		card.show(basePane, "6");
        	}
        });
      
        
        
        /*BUS PANEL*/
        //on clicking back button 
        btnBackBus.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		//unfilter table
        		sorterBus.setRowFilter(null);
        		
                int totalRow = tblBus.getRowCount();
                int count = 0;
                //delete all records in table model
                while (count < totalRow) {
                	tblBusModel.removeRow(0);
                	count++;
                }
        		card.show(basePane, "2");
        	}
        });
        //on clicking add button
        btnAddBus.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {        		
        		//some fields are empty
        		if (textFieldBusId.getText().isEmpty() || textFieldPlateNumber.getText().isEmpty() || textFieldSeats.getText().isEmpty() 
                		|| textFieldFuelCapacity.getText().isEmpty()) {
                	JOptionPane.showMessageDialog(busPane, "Fields cannot be empty", "Login Error", JOptionPane.ERROR_MESSAGE);  
                }
        		else {
        			String busId = textFieldBusId.getText();
        			String plateNumber = textFieldPlateNumber.getText();
        			String seats = textFieldSeats.getText();
        			String fuelCapacity = textFieldFuelCapacity.getText();
        			String status = "Available";
        			
        			//connect to DB
                    DBConnection dbConn = new DBConnection();
                    try(CallableStatement statement = dbConn.getConn().prepareCall("{call dbo.sp_add_bus(?, ?, ?, ?)}");) {
                    	statement.setInt(1, Integer.parseInt(busId));
                    	statement.setString(2, plateNumber);
                    	statement.setFloat(3, Float.parseFloat(fuelCapacity));
                    	statement.setInt(4, Integer.parseInt(seats));
                    	statement.execute();
                    	
	                    //add row to table
	                    Object[] row = {busId, plateNumber, fuelCapacity, seats, status};
	                    tblBusModel.addRow(row);
	                    JOptionPane.showMessageDialog(tblBus, "Bus added!");
                    }
                    
                    catch(Exception ex) {
                    	System.out.println(ex);
                    }
        		}
        		
        	}
        });
        //on clicking remove button
        btnRemoveBus.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {         
                if(tblBus.getSelectedRow() > -1) {
                	//id of selected bus
                    String busId = (String) tblBusModel.getValueAt(tblBus.getSelectedRow(), 0);
                    //connect to DB
                    DBConnection dbConn = new DBConnection();
                    try(CallableStatement statement = dbConn.getConn().prepareCall("{call dbo.sp_remove_bus(?)}");) {
                    	statement.setInt(1, Integer.parseInt(busId));
                    	statement.execute();
                    	
                    	//remove selected row from the model
                        tblBusModel.removeRow(tblBus.getSelectedRow());
                    	JOptionPane.showMessageDialog(tblBus, "Bus removed!");
                    }    
                    catch(Exception ex) {
                    	System.out.println(ex);
                    }
                }   
        	}
        });
        //on clicking search button
        btnSearchBus.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
                //searched bus
                String searchedBus = textFieldSearchBus.getText();
                
                //does not sort
                if (searchedBus.length() == 0) {
                    //unfilter
                    sorterBus.setRowFilter(null);
                	
                }
                else {
                    try {
                    	//list of filters
                    	List<RowFilter<Object, Object>> filters = new ArrayList<RowFilter<Object, Object>>(2);
                    	filters.add(RowFilter.regexFilter(searchedBus, 0));
                    	filters.add(RowFilter.regexFilter("(?i)" + searchedBus, 4));
                    	//add all into 1 or filter
                    	RowFilter<Object, Object> rf = RowFilter.orFilter(filters);
                    	
                        //filter by any column
                        sorterBus.setRowFilter(rf);
                    }
                    catch(PatternSyntaxException pse) {
                        System.out.println(pse);
                    }
                }
                
        	}
        });
        /*DRIVER PANEL*/
        
        //on clicking back button driver panel
        btnBackDriver.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		
        	//unfilter table
        		sorterDriver.setRowFilter(null);
            		
                int totalRow = tblDriver.getRowCount();
                int count = 0;
                //delete all records in table model
                while (count < totalRow) {
                	tblDriverModel.removeRow(0);
                	count++;
                 }
        		card.show(basePane, "2");
        	}
        });
        //on clicking add button
        btnAddDriver.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {        		
        		//some fields are empty
        		if (textFieldDriverId.getText().isEmpty() || textFieldDriverName.getText().isEmpty() || textFieldTelNumber.getText().isEmpty() 
                		|| textFieldShift.getText().isEmpty()) {
                	JOptionPane.showMessageDialog(driverPane, "Fields cannot be empty", "Login Error", JOptionPane.ERROR_MESSAGE);  
                }
        		else {
        			String driverId = textFieldDriverId.getText();
        			String driverName = textFieldDriverName.getText();
        			String telNumber = textFieldTelNumber.getText();
        			String shift = textFieldShift.getText();
        			String status = "Available";
        			
        			//connect to DB
                    DBConnection dbConn = new DBConnection();
                    try(CallableStatement statement = dbConn.getConn().prepareCall("{call dbo.sp_add_driver(?, ?, ?, ?)}");) {
                    	statement.setInt(1, Integer.parseInt(driverId));
                    	statement.setString(2, driverName);
                    	statement.setString(3, telNumber);
                    	statement.setString(4,shift);
                    	
                    	statement.execute();
                    	
	                    //add row to table
	                    Object[] row = {driverId, driverName, telNumber, shift, status};
	                    tblDriverModel.addRow(row);
	                    JOptionPane.showMessageDialog(tblDriver, "Driver added!");
                    }
                    
                    catch(Exception ex) {
                    	System.out.println(ex);
                    }
        		}
        		
        	}
        });
        
      //on clicking remove button
        btnRemoveDriver.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {         
                if(tblDriver.getSelectedRow() > -1) {
                	//id of selected driver
                    String driverId = (String) tblDriverModel.getValueAt(tblDriver.getSelectedRow(), 0);
                    //connect to DB
                    DBConnection dbConn = new DBConnection();
                    try(CallableStatement statement = dbConn.getConn().prepareCall("{call dbo.sp_remove_driver(?)}");) {
                    	statement.setInt(1, Integer.parseInt(driverId));
                    	statement.execute();
                    	
                    	//remove selected row from the model
                        tblDriverModel.removeRow(tblDriver.getSelectedRow());
                    	JOptionPane.showMessageDialog(tblDriver, "Driver removed!");
                    }    
                    catch(Exception ex) {
                    	System.out.println(ex);
                    }
                }   
        	}
        });
        //on clicking search button
        btnSearchDriver.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
                //searched driver
                String searchedDriver = textFieldSearchDriver.getText();
                
                //does not sort
                if (searchedDriver.length() == 0) {
                    //unfilter
                    sorterDriver.setRowFilter(null);
                	
                }
                else {
                    try {
                    	//list of filters
                    	List<RowFilter<Object, Object>> filters = new ArrayList<RowFilter<Object, Object>>(2);
                    	filters.add(RowFilter.regexFilter(searchedDriver, 0));
                    	filters.add(RowFilter.regexFilter("(?i)" + searchedDriver, 4));
                    	//add all into 1 or filter
                    	RowFilter<Object, Object> rf = RowFilter.orFilter(filters);
                    	
                        //filter by any column
                        sorterDriver.setRowFilter(rf);
                    }
                    catch(PatternSyntaxException pse) {
                        System.out.println(pse);
                    }
                }
                
        	}
        });
        /*ROUTE PANEL*/
        //on clicking back button route panel
        btnBackRoute.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		//unfilter table
        		sorterRoute.setRowFilter(null);
            		
                int totalRow = tblRoute.getRowCount();
                int count = 0;
                //delete all records in table model
                while (count < totalRow) {
                	tblRouteModel.removeRow(0);
                	count++;
                 }
        		card.show(basePane, "2");
        	}
        });
        
      //on clicking add button
        btnAddRoute.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {        		
        		//some fields are empty
        		if (textFieldRouteNumber.getText().isEmpty() || textFieldTicketCount.getText().isEmpty() || textFieldTicketPrice.getText().isEmpty() 
                		|| textFieldTotalDistance.getText().isEmpty()|| textFieldDescription.getText().isEmpty()) {
                	JOptionPane.showMessageDialog(routePane, "Fields cannot be empty", "Login Error", JOptionPane.ERROR_MESSAGE);  
                }
        		else {
        			String routeNumber = textFieldRouteNumber.getText();
        			String ticketCount = textFieldTicketCount.getText();
        			String ticketPrice = textFieldTicketPrice.getText();
        			String totalDistance = textFieldTotalDistance.getText();
        			String description = textFieldDescription.getText();
        			
        			//connect to DB
                    DBConnection dbConn = new DBConnection();
                    try(CallableStatement statement = dbConn.getConn().prepareCall("{call dbo.sp_add_route(?, ?, ?, ?,?)}");) {
                    	statement.setInt(1, Integer.parseInt(routeNumber));
                    	statement.setInt(2, Integer.parseInt(ticketCount));
                    	statement.setFloat(3, Float.parseFloat(ticketPrice));
                    	statement.setInt(4, Integer.parseInt(totalDistance));
                    	statement.setString(5, description);
                    	statement.execute();
                    	
	                    //add row to table
	                    Object[] row = {routeNumber, ticketCount, ticketPrice, totalDistance, description};
	                    tblRouteModel.addRow(row);
	                    JOptionPane.showMessageDialog(tblRoute, "Route added!");
                    }
                    
                    catch(Exception ex) {
                    	System.out.println(ex);
                    }
        		}
        		
        	}
        });
	
      
        //on clicking remove button
        btnRemoveRoute.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {         
        		if(tblRoute.getSelectedRow() > -1) {
        			//id of selected bus
        			String routeName = (String) tblRouteModel.getValueAt(tblRoute.getSelectedRow(), 0);
        			//connect to DB
        			DBConnection dbConn = new DBConnection();
        			try(CallableStatement statement = dbConn.getConn().prepareCall("{call dbo.sp_remove_route(?)}");) {
        				statement.setInt(1, Integer.parseInt(routeName));
        				statement.execute();
            	
        				//remove selected row from the model
        				tblRouteModel.removeRow(tblRoute.getSelectedRow());
        				JOptionPane.showMessageDialog(tblRoute, "Route removed!");
        			}    
        			catch(Exception ex) {
        				System.out.println(ex);
        			}
        		}   
        	}
        });
        //on clicking search button
        btnSearchRoute.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
                //searched route
                String searchedRoute = textFieldSearchRoute.getText();
                
                //does not sort
                if (searchedRoute.length() == 0) {
                    //unfilter
                    sorterRoute.setRowFilter(null);
                	
                }
                else {
                    try {
                    	//list of filters
                    	List<RowFilter<Object, Object>> filters = new ArrayList<RowFilter<Object, Object>>(2);
                    	filters.add(RowFilter.regexFilter(searchedRoute, 0));
                    	//add all into 1 or filter
                    	RowFilter<Object, Object> rf = RowFilter.orFilter(filters);
                    	
                        //filter by any column
                        sorterRoute.setRowFilter(rf);
                    }
                    catch(PatternSyntaxException pse) {
                        System.out.println(pse);
                    }
                }
                
        	}
        });
        /*ASSIGN PANEL*/
      //on clicking back button assign panel
        btnBackBusManagerPanel.addActionListener(new ActionListener() {
        	
        	public void actionPerformed(ActionEvent e) {
        		
        		card.show(basePane, "2");
        	}
        });
        
        
        
        
		}}

