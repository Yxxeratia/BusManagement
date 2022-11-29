package swing;

import javax.swing.JPanel;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.swing.JLabel;
import javax.swing.Icon;


//Dat's panel

public class DriverInterface extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JButton btnLogout;
	private JButton btnMessage;
	private JButton btnRequestLeave;
	private JButton btnProfile;
	private JButton btnCheckIn;
	private JButton btnCheckOut;
	private BufferedImage image;
	
	public JButton getLogoutButton() {
		return btnLogout;
	}
	
	public JButton getMessageButton() {
		return btnMessage;
	}
	public JButton getRequestLeaveButton() {
		return btnRequestLeave;
	}
	public JButton getProfileButton() {
		return btnProfile;
	}
	public JButton getCheckInButton() {
		return btnCheckIn;
	}
	public JButton getCheckOutButton() {
		return btnCheckOut;
	}
	/**
	 * Create the panel.
	 */
	public DriverInterface() {
		setLayout(null);
		
		btnLogout = new JButton("Logout");
		btnLogout.setFont(new Font("Tahoma", Font.PLAIN, 14));

		btnLogout.setBounds(66, 66, 132, 53);
		add(btnLogout);
		
		btnMessage = new JButton("Message");
		btnMessage.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnMessage.setBounds(517, 66, 121, 53);
		add(btnMessage);
		
		btnRequestLeave = new JButton("Request Leave");
		btnRequestLeave.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnRequestLeave.setBounds(66, 320, 132, 53);
		add(btnRequestLeave);
		
		btnProfile = new JButton("Profile");
		btnProfile.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnProfile.setBounds(292, 320, 121, 53);
		add(btnProfile);
		
		btnCheckIn = new JButton("Check In");
		btnCheckIn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCheckIn.setBounds(517, 320, 105, 21);
		add(btnCheckIn);
		
		btnCheckOut = new JButton("Check Out");
		btnCheckOut.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCheckOut.setBounds(517, 352, 105, 21);
		add(btnCheckOut);
		
		//get image
		try {
			image = ImageIO.read(getClass().getResource("/b.png"));
			JLabel lblProfile = new JLabel(new ImageIcon(image));
			lblProfile.setBounds(249, 66, 258, 207);
			add(lblProfile);
		}
		catch(Exception e) {
			System.out.println("Image not found");
		}
	}
}
