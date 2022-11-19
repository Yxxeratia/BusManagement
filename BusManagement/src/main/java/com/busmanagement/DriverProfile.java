package com.busmanagement;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DriverProfile implements ActionListener {
	private JLabel name, id, tel, shift, status, bankName, bankNumber;
	private JButton bank;
	private JFrame frame;
	private JPanel panel, bPanel;
	
	public DriverProfile() {
		
		frame = new JFrame();
		frame.setTitle("Driver Profile");
		frame.setSize(400, 400);
		
		//add panel
		panel = new JPanel();
		frame.add(panel);
		bPanel = new JPanel();
		bPanel.setVisible(false);
		
		//add label
		name = new JLabel("Name: Tom");
		name.setBounds(50, 0, 250, 100);
		panel.add(name);
		id = new JLabel("Id: 18148");
		id.setBounds(50, 0, 250, 175);
		panel.add(id);
		
		tel = new JLabel("Telephone Number: 0914257933");
		tel.setBounds(50, 0, 250, 250);
		panel.add(tel);
		
		shift = new JLabel("Shift: Day");
		shift.setBounds(50, 0, 250, 325);
		panel.add(shift);
		
		status = new JLabel("Current Status: Check-in");
		status.setBounds(50, 0, 250, 400);
		panel.add(status);
		
		bankName = new JLabel();
		bankName.setBounds(50, 0, 250, 550);
		panel.add(bankName);
		
		bankNumber = new JLabel();
		bankNumber.setBounds(50, 0, 250, 625);
		panel.add(bankNumber);
		
		//add button
		bank = new JButton("Bank Account");
		bank.setBounds(50, 225, 150, 25);
		bank.addActionListener(this);
		panel.add(bank);
		
		//frame properties
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.setLayout(null);
		frame.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		bankName.setText("Bank's Name: VCB");
		bankNumber.setText("Bank Number: 97146022");
	}
	public static void main(String[] args) {
		new DriverProfile();
	}
}
