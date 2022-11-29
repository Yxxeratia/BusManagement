package com.busmanagement;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class dat extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public dat() {
		setLayout(null);
		
		JButton btnNewButton = new JButton("log out");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.setBounds(110, 64, 121, 53);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Message");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_1.setBounds(475, 64, 113, 53);
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Request Leave");
		btnNewButton_2.setBounds(110, 363, 105, 53);
		add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Profile");
		btnNewButton_3.setBounds(307, 363, 105, 53);
		add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Check - in");
		btnNewButton_4.setBounds(475, 363, 85, 21);
		add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Check - out");
		btnNewButton_5.setBounds(475, 395, 85, 21);
		add(btnNewButton_5);

	}

}
