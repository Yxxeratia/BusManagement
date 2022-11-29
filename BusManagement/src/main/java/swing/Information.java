package swing;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.SwingConstants;

public class Information extends JPanel{
	public Information() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{219, 184, 0};
		gridBagLayout.rowHeights = new int[]{47, 61, 61, 61, 43, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JButton driverTom = new JButton("Driver Tom");
		driverTom.setBackground(new Color(240, 240, 240));
		driverTom.setForeground(new Color(0, 0, 0));
		driverTom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(basePane,"1");
			}
		});
		driverTom.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_driverTom = new GridBagConstraints();
		gbc_driverTom.fill = GridBagConstraints.VERTICAL;
		gbc_driverTom.anchor = GridBagConstraints.EAST;
		gbc_driverTom.insets = new Insets(0, 0, 5, 5);
		gbc_driverTom.gridx = 0;
		gbc_driverTom.gridy = 1;
		add(driverTom, gbc_driverTom);
		
		JButton driverJerry = new JButton("Driver Jerry");
		driverJerry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(basePane,"2");
			}
		});
		driverJerry.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_driverJerry = new GridBagConstraints();
		gbc_driverJerry.anchor = GridBagConstraints.WEST;
		gbc_driverJerry.fill = GridBagConstraints.VERTICAL;
		gbc_driverJerry.insets = new Insets(0, 0, 5, 0);
		gbc_driverJerry.gridx = 1;
		gbc_driverJerry.gridy = 1;
		add(driverJerry, gbc_driverJerry);
		
		JButton bus51 = new JButton("   Bus 51   ");
		bus51.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(basePane,"3");
			}
		});
		bus51.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_bus51 = new GridBagConstraints();
		gbc_bus51.anchor = GridBagConstraints.EAST;
		gbc_bus51.fill = GridBagConstraints.VERTICAL;
		gbc_bus51.insets = new Insets(0, 0, 5, 5);
		gbc_bus51.gridx = 0;
		gbc_bus51.gridy = 2;
		add(bus51, gbc_bus51);
		
		JButton bus14 = new JButton("   Bus 14    ");
		bus14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(basePane,"4");
			}
		});
		bus14.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_bus14 = new GridBagConstraints();
		gbc_bus14.anchor = GridBagConstraints.WEST;
		gbc_bus14.fill = GridBagConstraints.VERTICAL;
		gbc_bus14.insets = new Insets(0, 0, 5, 0);
		gbc_bus14.gridx = 1;
		gbc_bus14.gridy = 2;
		add(bus14, gbc_bus14);
		
		JButton route51 = new JButton(" Route 51 ");
		route51.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(basePane,"");
			}
		});
		route51.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_route51 = new GridBagConstraints();
		gbc_route51.anchor = GridBagConstraints.EAST;
		gbc_route51.fill = GridBagConstraints.VERTICAL;
		gbc_route51.insets = new Insets(0, 0, 5, 5);
		gbc_route51.gridx = 0;
		gbc_route51.gridy = 3;
		add(route51, gbc_route51);
		
		route14 = new JButton("  Route 14  ");
		route14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(basePane,"");
			}
		});
		route14.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_route14 = new GridBagConstraints();
		gbc_route14.insets = new Insets(0, 0, 5, 0);
		gbc_route14.fill = GridBagConstraints.VERTICAL;
		gbc_route14.anchor = GridBagConstraints.WEST;
		gbc_route14.gridx = 1;
		gbc_route14.gridy = 3;
		add(route14, gbc_route14);
		
		JButton back = new JButton("Back");
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(basePane,"");
			}
		});
		back.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_back = new GridBagConstraints();
		gbc_back.anchor = GridBagConstraints.EAST;
		gbc_back.gridx = 1;
		gbc_back.gridy = 4;
		add(back, gbc_back);
	}
	private static final long serialVersionUID = 1L;
	private JButton route14;
	
	public static void main(String[] args) {

	}

}
