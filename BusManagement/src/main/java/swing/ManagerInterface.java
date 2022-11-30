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

public class ManagerInterface extends JPanel {
	private BufferedImage imageBus;
	private BufferedImage imageDriver;
	private BufferedImage imageRoute;
	private BufferedImage imageLogOut;
	private JButton btnBus;
	private JButton btnDriver;
	private JButton btnRoute;
	private JButton btnlogOut;
	
	
	
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
					btnDriver.setBackground(new Color(255, 89, 89));
					btnDriver.setFont(new Font("Tahoma", Font.BOLD, 45));
					btnDriver.setBounds(233, 10, 223, 475);
					add(btnDriver);
				}
					{
						btnRoute = new JButton(new ImageIcon(imageRoute));
						btnRoute.setBackground(new Color(223, 223, 223));
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
						btnlogOut.setFont(new Font("Tahoma", Font.PLAIN, 15));
						btnlogOut.setBounds(696, 10, 223, 475);
						add(btnlogOut);
						}
			
			
		}
		catch(Exception e) {
			System.out.println("Image not found");
		
	}
		

}
}
