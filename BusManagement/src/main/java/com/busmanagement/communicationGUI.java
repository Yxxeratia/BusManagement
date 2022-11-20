package com.busmanagement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.*;

public class communicationGUI implements ActionListener{
	static JLabel label;
	static JTextField mess;
	static JButton send;
	static JPanel panel;
	static JLabel text;
	static JLabel confirm;
	
	public static void main(String[] args) {
//		JFrame frame = new JFrame();
//		frame.setSize(500, 300);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		
//		panel = new JPanel();
//		frame.add(panel); 
				
		label = new JLabel("Manager");
		label.setBounds(10, 20, 80, 25);
		panel.add(label);
		text = new JLabel("Text");
		text.setBounds(10, 100, 80, 25);
		panel.add(text);
		
		mess = new JTextField(30);
		mess.setBounds(100, 100, 200, 25);
		panel.add(mess);
		
		send = new JButton("Send");
		send.setBounds(320, 100, 80, 25);
		panel.add(send);
		send.addActionListener(new communicationGUI());
		
		confirm = new JLabel();
		confirm.setBounds(10, 150, 250, 25);
		panel.add(confirm);
		
		panel.setLayout(null);
//		frame.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		confirm.setText("Message is successfully sent.");	
	}
}

