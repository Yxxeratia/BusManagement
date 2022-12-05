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
			imageAssign = ImageIO.read(getClass().getResource("/assignicon.png"));
			setLayout(null);
		}
		catch(Exception e) {
			System.out.println("Image not found");
		}
		
		try {
			imageRoute = ImageIO.read(getClass().getResource("/route.png"));
			setLayout(null);
			{
				btnBus = new JButton(new ImageIcon(imageBus));
				btnBus.setBackground(new Color(255, 255, 255));
				btnBus.setForeground(new Color(0, 0, 0));
				btnBus.setFont(new Font("Tahoma", Font.BOLD, 45));
				btnBus.setBounds(10, 10, 213, 475);
				add(btnBus);
			}
			
			{
				btnDriver = new JButton(new ImageIcon(imageDriver));
				btnDriver.setBackground(new Color(255, 255, 255));
				btnDriver.setFont(new Font("Tahoma", Font.BOLD, 45));
				btnDriver.setBounds(233, 10, 223, 475);
				add(btnDriver);
			}
			
			{
				btnRoute = new JButton(new ImageIcon(imageRoute));
				btnRoute.setBackground(new Color(255, 255, 255));
				btnRoute.setFont(new Font("Tahoma", Font.BOLD, 45));
				btnRoute.setBounds(463, 10, 223, 475);
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
				btnlogOut.setBounds(696, 255, 203, 230);
				add(btnlogOut);
			}
			
			btnAssign = new JButton(new ImageIcon(imageAssign));
			btnAssign.setBackground(new Color(255, 255, 255));
			btnAssign.setFont(new Font("Tahoma", Font.PLAIN, 15));
			btnAssign.setBounds(696, 10, 203, 235);
			add(btnAssign);
			
		}
		catch(Exception e) {
			System.out.println("Image not found");
		
		}
	}
}
