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
		setBounds(100, 100, 771, 529);
		
		/*login panel*/
		Login loginPane = new Login();
		JButton btnLogin = loginPane.getLoginButton();
		JTextField usernameField = loginPane.getUsernameField();
		JPasswordField passwordField = loginPane.getPasswordField();
		JComboBox<Object> comboBoxRole = loginPane.getComboBoxRole();
		
		
		/*driver profile panel*/
		DriverProfile driverProfilePane = new DriverProfile();
		JTextField nameField = driverProfilePane.getnameField();
		JTextField idField = driverProfilePane.getIDField();
		JTextField telField = driverProfilePane.getTelField();
		JTextField currentStatusField = driverProfilePane.getCurrentStatusField();
		JTextField bankNameField = driverProfilePane.getBankNameField();
		JTextField bankNumberField = driverProfilePane.getBankNumberField();
		JButton btnBankAccount = driverProfilePane.getBankAccountButton();
		JPanel bankAccountPane = driverProfilePane.getBankAccountPanel();
		
		/*base panel*/
		JPanel basePane = new JPanel();
		CardLayout card = new CardLayout();
		
		
		basePane.setLayout(card);
        basePane.add("1", loginPane);
        basePane.add("2", driverProfilePane);
        card.show(basePane, "1");
        getContentPane().add(basePane);
        
        
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
                
                try(PreparedStatement stmt = dbConn.getConn().prepareStatement("SELECT * FROM dbo.fn_verify_user('" + username + "')");) {
                    ResultSet rs = stmt.executeQuery();    
                    while(rs.next()) {
                        //login successful
                        if(username.equals(rs.getString("id"))) {
                        	if (comboBoxRole.getSelectedItem() == "Driver") {
                            	//setExtendedState(JFrame.MAXIMIZED_BOTH);
                            	card.show(basePane, "2");
                            }               
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
        
        //add action listener for bank account button
        btnBankAccount.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		bankNameField.setText("VCB");
        		bankNumberField.setText("97146022");
        		bankAccountPane.setVisible(true);
        	}
        });
	}
}
