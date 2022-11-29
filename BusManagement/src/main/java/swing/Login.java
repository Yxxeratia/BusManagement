package swing;

import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.image.BufferedImage;


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
	private BufferedImage image;
	
	
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
	
    
	public Login() {
		setBackground(new Color(128, 255, 128));
		setLayout(null);
		
		lblUsername = new JLabel("Username:");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblUsername.setBounds(448, 183, 87, 38);
		add(lblUsername);
		
		lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPassword.setBounds(448, 216, 87, 32);
		add(lblPassword);
		
		usernameField = new JTextField();
		usernameField.setBackground(new Color(255, 255, 255));
		usernameField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		usernameField.setBounds(531, 194, 118, 19);
		add(usernameField);
		usernameField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		passwordField.setBounds(531, 224, 118, 19);
		passwordField.setEchoChar('*');
		add(passwordField);
		
		btnLogin = new JButton("Login");
		btnLogin.setBackground(new Color(255, 255, 255));
		btnLogin.setForeground(new Color(0, 0, 0));
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnLogin.setBounds(531, 258, 118, 38);
		add(btnLogin);
		
		try {
			image = ImageIO.read(getClass().getResource("/busIcon.png"));
			JLabel lblProfile = new JLabel(new ImageIcon(image));
		
			lblProfile.setBounds(10, 10, 419, 437);
			add(lblProfile);
			
			JLabel lblHead = new JLabel("BMS");
			lblHead.setBounds(416, 56, 303, 90);
			add(lblHead);
			lblHead.setHorizontalAlignment(SwingConstants.CENTER);
			lblHead.setFont(new Font("Tahoma", Font.BOLD, 32));
		}
		catch(Exception e) {
			System.out.println("Image not found");
		}
	}
}
