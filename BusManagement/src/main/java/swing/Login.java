package swing;

import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JPanel {

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
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUsername.setBounds(175, 134, 74, 29);
		add(lblUsername);
		
		lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPassword.setBounds(175, 195, 74, 17);
		add(lblPassword);
		
		usernameField = new JTextField();
		usernameField.setBounds(298, 141, 96, 19);
		add(usernameField);
		usernameField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(298, 196, 96, 19);
		passwordField.setEchoChar('*');
		add(passwordField);
		
		btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnLogin.setBounds(425, 333, 103, 34);
		add(btnLogin);		
		
		lblRole = new JLabel("Role:");
		lblRole.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRole.setBounds(175, 246, 61, 17);
		add(lblRole);
		
		//array containing the roles
		String[] roles = {"Driver", "Manager"};
		comboBoxRole = new JComboBox<Object>(roles);
		comboBoxRole.setFont(new Font("Tahoma", Font.PLAIN, 12));
		comboBoxRole.setBounds(301, 245, 93, 21);
		add(comboBoxRole);
		
		JPanel headPane = new JPanel();
		headPane.setBounds(0, 0, 608, 94);
		add(headPane);
		headPane.setLayout(null);
		
		JLabel lblHead = new JLabel("LOGIN");
		lblHead.setHorizontalAlignment(SwingConstants.CENTER);
		lblHead.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblHead.setBounds(161, 10, 291, 74);
		headPane.add(lblHead);
		
	}
}
