package swing;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;

public class Communication extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private JLabel lblManager;
	private JTextField messageField;
	private JButton btnSend;
	private JLabel lblText;
	private JLabel lblConfirm;
	
	
	public JButton getSendButton() {
		return btnSend;
	}
	public JLabel getConfirmLabel() {
		return lblConfirm;
	}
	/**
	 * Create the panel.
	 */
	public Communication() {
		setLayout(null);
		
		lblManager = new JLabel("Manager");
		lblManager.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblManager.setBounds(10, 20, 80, 25);
		add(lblManager);
		lblText = new JLabel("Text");
		lblText.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblText.setBounds(10, 100, 80, 25);
		add(lblText);
		
		messageField = new JTextField(30);
		messageField.setBounds(100, 100, 200, 25);
		add(messageField);
		
		btnSend = new JButton("Send");
		btnSend.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSend.setBounds(320, 100, 80, 25);
		add(btnSend);
		
		lblConfirm = new JLabel();
		lblConfirm.setBounds(10, 150, 250, 25);
		add(lblConfirm);
		
	}

}
