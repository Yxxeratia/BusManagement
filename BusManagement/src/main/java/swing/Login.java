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
		
		usernameField = new JTextField();
		usernameField.setBackground(new Color(255, 255, 255));
		usernameField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		usernameField.setBounds(614, 196, 118, 19);
		add(usernameField);
		usernameField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		passwordField.setBounds(614, 236, 118, 19);
		passwordField.setEchoChar('*');
		add(passwordField);
		
		btnLogin = new JButton("Login");
		btnLogin.setBackground(new Color(255, 255, 255));
		btnLogin.setForeground(new Color(0, 0, 0));
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnLogin.setBounds(614, 276, 118, 38);
		add(btnLogin);
		
		try {
			image = ImageIO.read(getClass().getResource("/buslogo.png"));
			JLabel lblLogo = new JLabel(new ImageIcon(image));
		
			lblLogo.setBounds(24, 10, 419, 437);
			add(lblLogo);
		}
		catch(Exception e) {
			System.out.println("Image not found");
		}
		
		try {
			image = ImageIO.read(getClass().getResource("/loginicon.png"));
			JLabel lblLoginIcon = new JLabel(new ImageIcon(image));
		
			lblLoginIcon.setBounds(625, 109, 83, 77);
			add(lblLoginIcon);
		}
		catch(Exception e) {
			System.out.println("Image not found");
		}
		
		try {
			image = ImageIO.read(getClass().getResource("/passwordicon.png"));
			JLabel lblPasswordIcon = new JLabel(new ImageIcon(image));
		
			lblPasswordIcon.setBounds(566, 221, 45, 45);
			add(lblPasswordIcon);
		}
		catch(Exception e) {
			System.out.println("Image not found");
		}
		

		try {
			image = ImageIO.read(getClass().getResource("/usernameicon.png"));
			JLabel lblUserIcon = new JLabel(new ImageIcon(image));
		
			lblUserIcon.setBounds(566, 180, 45, 45);
			add(lblUserIcon);
		}
		catch(Exception e) {
			System.out.println("Image not found");
		}
		
		
		
		
	}
}
