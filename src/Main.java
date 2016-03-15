import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {
	public static void main(String[] args) {
		new Main();
	}
	
	private JFrame frame;
	
	public Main() {
		Random rand = new Random();
		frame = new JFrame("Random Gun");
		frame.getContentPane().setLayout(new BorderLayout());
		
		JLabel gun = new JLabel();
		gun.setBackground(Color.BLACK);
		frame.getContentPane().add(gun, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2, 1));

		JButton ct = new JButton("Counter Terrorists");
		ct.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				switch(rand.nextInt(23)) {
				case 0: gun.setText("P2000");
					break;
				case 1: gun.setText("USP-S");
					break;
				case 2: gun.setText("P250");
					break;
				case 3: gun.setText("Desert Eagle");
					break;
				case 4: gun.setText("Dual Brettas");
					break;
				case 5: gun.setText("Five SeveN");
					break;
				case 6: gun.setText("CZ75 Auto");
					break;
				case 7: gun.setText("R8 Revolver");
					break;
				case 8: gun.setText("Nova");
					break;
				case 9: gun.setText("XM1014");
					break;
				case 10: gun.setText("Mag-7");
					break;
				case 11: gun.setText("MP9");
					break;
				case 12: gun.setText("MP7");
					break;
				case 13: gun.setText("UMP-45");
					break;
				case 14: gun.setText("PP-Bizon");
					break;
				case 15: gun.setText("P90");
					break;
				case 16: gun.setText("FAMAS");
					break;
				case 17: gun.setText("M4A4");
					break;
				case 18: gun.setText("M4A1-S");
					break;
				case 19: gun.setText("SSG 08");
					break;
				case 20: gun.setText("AUG");
					break;
				case 21: gun.setText("AWP");
					break;
				case 22: gun.setText("SCAR-20");
					break;
				}
				frame.revalidate();
			}
		});
		panel.add(ct);
		
		JButton te = new JButton("Terrorists");
		te.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int i = rand.nextInt(25);
				switch(i) {
				case 0: gun.setText("Glock-18");
					break;
				case 1: gun.setText("P250");
					break;
				case 2: gun.setText("Desert Eagle");
					break;
				case 3: gun.setText("Dual Brettas");
					break;
				case 4: gun.setText("Tec-9");
					break;
				case 5: gun.setText("CZ75 Auto");
					break;
				case 6: gun.setText("R8 Revolver");
					break;
				case 7: gun.setText("Nova");
					break;
				case 8: gun.setText("XM1014");
					break;
				case 9: gun.setText("MP5");
					break;
				case 10: gun.setText("Sawed-Off");
					break;
				case 11: gun.setText("MAC-10");
					break;
				case 12: gun.setText("MP7");
					break;
				case 13: gun.setText("UMP-45");
					break;
				case 14: gun.setText("PP-Bizon");
					break;
				case 15: gun.setText("P90");
					break;
				case 16: gun.setText("Galil AR");
					break;
				case 17: gun.setText("AK-47");
					break;
				case 18: gun.setText("SSG 08");
					break;
				case 20: gun.setText("SG 553");
					break;
				case 21: gun.setText("AWP");
					break;
				case 22: gun.setText("G3SG1");
					break;
				case 23: gun.setText("M249");
					break;
				case 24: gun.setText("Negev");
					break;
				}
				frame.revalidate();
			}
		});
		panel.add(te);
		
		
		
		frame.getContentPane().add(panel, BorderLayout.WEST);
		frame.setSize(300, 100);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
