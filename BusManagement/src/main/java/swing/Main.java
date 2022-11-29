package swing;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
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
		setBounds(100, 100, 737, 509);
		
		//getContentPane().setBackground(Color.black);
		
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
		
		/*bus info*/
		BusInfo busPane = new BusInfo();
		
		/*driver info*/
		DriverInfo driverPane = new DriverInfo();
		
		/*route info*/
		RouteInfo routePane = new RouteInfo();
		
		
	
		

		BusManager busManagerPane = new BusManager();
		
		
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
        
        /*
        for (Component component : basePane.getComponents()) {
        	if (component instanceof JPanel) {
        		component.setBackground(Color.black);
        	}
        }*/
        
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
        
        //on clicking bus button
        btnBus.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		card.show(basePane, "3");
        	}
        });
        
      //on clicking driver button
        btnDriver.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		card.show(basePane, "4");
        	}
        });
        
      //on clicking route button
        btnRoute.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		card.show(basePane, "5");
        	}
        });
      
	}
}
