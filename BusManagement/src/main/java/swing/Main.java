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

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.CardLayout;

public class Main extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JPanel basePane;
	private JPanel loginPane;
	private JPanel busPane;
	
	private JTextField usernameField;
	private JPasswordField passwordField;

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
		setBounds(100, 100, 597, 404);
		
		/*login panel*/
		loginPane = new JPanel();
		loginPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		//setContentPane(loginPane);
		loginPane.setLayout(null);
				
		//username
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUsername.setBounds(156, 114, 85, 37);
		loginPane.add(lblUsername);
		
		usernameField = new JTextField();
		usernameField.setBounds(268, 125, 96, 19);
		loginPane.add(usernameField);
		usernameField.setColumns(10);
			
		//password
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPassword.setBounds(156, 179, 72, 37);
		loginPane.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(268, 190, 96, 19);
		loginPane.add(passwordField);
		
		//login button
		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnLogin.setBounds(387, 271, 108, 37);
		loginPane.add(btnLogin);
		
		
		/*bus management panel*/
		busPane = new JPanel();
		busPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		//setContentPane(busPane);
		busPane.setLayout(null);
		
		/*base panel*/
		basePane = new JPanel();
		CardLayout card = new CardLayout();
		
		basePane.setLayout(card);
        basePane.add("1", loginPane);
        basePane.add("2", busPane);
        card.show(basePane, "1");
        passwordField.setEchoChar('*');
        getContentPane().add(basePane);
        
        
        /*add action listeners*/
        
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
                
                setExtendedState(JFrame.MAXIMIZED_BOTH);
                card.show(basePane, "2");
                return;
        	}
        });
           
  
	}
}
