package swing;

import javax.swing.*;
import java.awt.Font;


//Tri's panel


public class Login extends JPanel  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblUsername;
	private JLabel lblPassword;
	private JTextField usernameField;
	private JPasswordField passwordField;
	
	private JButton btnLogin;
	
	private JLabel lblRole;
	private JComboBox<Object> comboBoxRole;
	
	
	/**
	 * Create the panel.
	 */
	
	public JButton getLoginButton(){
        return btnLogin;
    }
    
    public JTextField getUsernameField(){
        return usernameField;
    }
    
    public JPasswordField getPasswordField(){
        return passwordField;
    }
	
    public JComboBox<Object> getComboBoxRole() {
    	return comboBoxRole;
    }
    
	public Login() {
		setLayout(null);
		
		lblUsername = new JLabel("Username:");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblUsername.setBounds(172, 170, 87, 38);
		add(lblUsername);
		
		lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPassword.setBounds(172, 243, 87, 32);
		add(lblPassword);
		
		usernameField = new JTextField();
		usernameField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		usernameField.setBounds(318, 181, 96, 19);
		add(usernameField);
		usernameField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		passwordField.setBounds(318, 251, 96, 19);
		passwordField.setEchoChar('*');
		add(passwordField);
		
		btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnLogin.setBounds(490, 388, 118, 38);
		add(btnLogin);		
		
		lblRole = new JLabel("Role:");
		lblRole.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRole.setBounds(172, 301, 76, 32);
		add(lblRole);
		
		//array containing the roles
		String[] roles = {"Driver", "Manager"};
		comboBoxRole = new JComboBox<Object>(roles);
		comboBoxRole.setFont(new Font("Tahoma", Font.PLAIN, 12));
		comboBoxRole.setBounds(321, 308, 93, 21);
		add(comboBoxRole);
		
		JPanel headPane = new JPanel();
		headPane.setBounds(0, 0, 683, 124);
		add(headPane);
		headPane.setLayout(null);
		
		JLabel lblHead = new JLabel("LOGIN");
		lblHead.setHorizontalAlignment(SwingConstants.CENTER);
		lblHead.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblHead.setBounds(194, 10, 303, 90);
		headPane.add(lblHead);
	}
}
