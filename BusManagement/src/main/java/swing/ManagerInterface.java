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

public class ManagerInterface extends JPanel {
	private BufferedImage imageBus;
	private BufferedImage imageDriver;
	private BufferedImage imageRoute;
	
	private JButton btnBus;
	private JButton btnDriver;
	private JButton btnRoute;
	
	
	
	public JButton getBusButton() {
		return btnBus;
	}
	
	public JButton getDriverButton() {
		return btnDriver;
	}
	
	public JButton getRouteButton() {
		return btnRoute;
	}
	
	/**
	 * Create the panel.
	 */
	
	
	public ManagerInterface() {
		setBackground(new Color(255, 255, 255));
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
			imageRoute = ImageIO.read(getClass().getResource("/route.png"));
			setLayout(null);
			{
				btnBus = new JButton("Bus");
				btnBus.setBackground(new Color(151, 255, 255));
				btnBus.setForeground(new Color(0, 0, 0));
				btnBus.setFont(new Font("Tahoma", Font.BOLD, 45));
				btnBus.setBounds(10, 140, 213, 101);
				add(btnBus);
			}
			JLabel lblBus = new JLabel(new ImageIcon(imageBus));
			
				lblBus.setBounds(10, 10, 213, 417);
				add(lblBus);
				{
					btnDriver = new JButton("Driver");
					btnDriver.setBackground(new Color(255, 89, 89));
					btnDriver.setFont(new Font("Tahoma", Font.BOLD, 45));
					btnDriver.setBounds(233, 140, 223, 101);
					add(btnDriver);
				}
				JLabel lblDriver = new JLabel(new ImageIcon(imageDriver));
				
					lblDriver.setBounds(233, 10, 223, 417);
					add(lblDriver);
					{
						btnRoute = new JButton("Route");
						btnRoute.setBackground(new Color(223, 223, 223));
						btnRoute.setFont(new Font("Tahoma", Font.BOLD, 45));
						btnRoute.setBounds(466, 140, 223, 101);
						add(btnRoute);
					}
						{
							JButton btnlogOut = new JButton("Log Out");
							btnlogOut.setFont(new Font("Tahoma", Font.PLAIN, 15));
							btnlogOut.setBounds(588, 390, 101, 37);
							add(btnlogOut);
						}
						JLabel lblRoute = new JLabel(new ImageIcon(imageRoute));
						
							lblRoute.setBounds(466, 10, 223, 417);
							add(lblRoute);
			
			
		}
		catch(Exception e) {
			System.out.println("Image not found");
		
	}
		

}
}
