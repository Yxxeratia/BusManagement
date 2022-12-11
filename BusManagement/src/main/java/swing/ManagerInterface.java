package swing;

import java.awt.Font;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Icon;
import javax.swing.JTextField;

public class ManagerInterface extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BufferedImage imageBus;
	private BufferedImage imageDriver;
	private BufferedImage imageRoute;
	private BufferedImage imageLogOut;
	private BufferedImage imageAssign;
	private JButton btnBus;
	private JButton btnDriver;
	private JButton btnRoute;
	private JButton btnlogOut;
	private JButton btnAssign;
	
	
	public JButton getBusButton() {
		return btnBus;
	}
	
	public JButton getDriverButton() {
		return btnDriver;
	}
	
	public JButton getRouteButton() {
		return btnRoute;
	}
	public JButton getlogOutButton() {
		return btnlogOut;
	}
	public JButton getAssignButton() {
		return btnAssign;
	}
	
	/**
	 * Create the panel.
	 */
	
	
	public ManagerInterface() {
		setBackground(new Color(128, 255, 128));
		try {
			imageBus = ImageIO.read(getClass().getResource("/bus2.png"));
			setLayout(null);
		}
		catch(Exception e) {
			System.out.println("Image not found");
		}
		
		try {
			imageDriver = ImageIO.read(getClass().getResource("/Driver.png"));
			setLayout(null);
		}
		catch(Exception e) {
			System.out.println("Image not found");
		}
		try {
			imageLogOut = ImageIO.read(getClass().getResource("/logout.png"));
			setLayout(null);
		}
		catch(Exception e) {
			System.out.println("Image not found");
		}
		try {
			imageAssign = ImageIO.read(getClass().getResource("/assign.png"));
			setLayout(null);
		}
		catch(Exception e) {
			System.out.println("Image not found");
		}
		
		try {
			imageRoute = ImageIO.read(getClass().getResource("/route.png"));
			setLayout(null);
			
			{
				btnDriver = new JButton(new ImageIcon(imageDriver));
				btnDriver.setBackground(new Color(255, 255, 255));
				btnDriver.setFont(new Font("Tahoma", Font.BOLD, 45));
				btnDriver.setBounds(233, 10, 223, 447);
				add(btnDriver);
			}
			{
				btnBus = new JButton(new ImageIcon(imageBus));
				btnBus.setBackground(new Color(255, 255, 255));
				btnBus.setForeground(new Color(0, 0, 0));
				btnBus.setFont(new Font("Tahoma", Font.BOLD, 45));
				btnBus.setBounds(10, 10, 213, 447);
				add(btnBus);
			}
			
			{
				btnRoute = new JButton(new ImageIcon(imageRoute));
				btnRoute.setBackground(new Color(255, 255, 255));
				btnRoute.setFont(new Font("Tahoma", Font.BOLD, 45));
				btnRoute.setBounds(463, 10, 223, 447);
				add(btnRoute);
			}
			
			{
				
				btnlogOut = new JButton(new ImageIcon(imageLogOut));
				btnlogOut.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				btnlogOut.setBackground(new Color(255, 255, 255));
				btnlogOut.setFont(new Font("Tahoma", Font.PLAIN, 15));
				btnlogOut.setBounds(696, 255, 203, 203);
				add(btnlogOut);
			}
			
			btnAssign = new JButton(new ImageIcon(imageAssign));
			btnAssign.setBackground(new Color(255, 255, 255));
			btnAssign.setFont(new Font("Tahoma", Font.PLAIN, 15));
			btnAssign.setBounds(696, 10, 203, 203);
			add(btnAssign);
			
			JLabel lblNewLabel = new JLabel("Bus");
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setBounds(10, 456, 213, 29);
			add(lblNewLabel);
			
			JLabel lblDriver = new JLabel("Driver");
			lblDriver.setHorizontalAlignment(SwingConstants.CENTER);
			lblDriver.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblDriver.setBounds(233, 456, 223, 29);
			add(lblDriver);
			
			JLabel lblRoute = new JLabel("Route");
			lblRoute.setHorizontalAlignment(SwingConstants.CENTER);
			lblRoute.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblRoute.setBounds(463, 456, 223, 29);
			add(lblRoute);
			
			JLabel lblLogout = new JLabel("Logout");
			lblLogout.setHorizontalAlignment(SwingConstants.CENTER);
			lblLogout.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblLogout.setBounds(696, 456, 203, 29);
			add(lblLogout);
			
			JLabel lblAssign = new JLabel("Assign");
			lblAssign.setHorizontalAlignment(SwingConstants.CENTER);
			lblAssign.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblAssign.setBounds(696, 216, 203, 29);
			add(lblAssign);
			
		}
		catch(Exception e) {
			System.out.println("Image not found");
		
		}
	}
}
