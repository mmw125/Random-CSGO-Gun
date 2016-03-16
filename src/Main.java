import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
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
		ArrayList<String> ctGuns = new ArrayList<String>();
		ArrayList<String> tGuns = new ArrayList<String>();
		
		
		Random rand = new Random();
		frame = new JFrame("Random Guns");
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
				int i = rand.nextInt(ctGuns.size());
				gun.setText("CT: " + ctGuns.get(i));
				frame.revalidate();
			}
		});
		panel.add(ct);
		
		JButton te = new JButton("Terrorists");
		te.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int i = rand.nextInt(tGuns.size());
				gun.setText("T: " + tGuns.get(i));
				frame.revalidate();
			}
		});
		panel.add(te);
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader("config/config.txt"));
			String line;
			int state = 0;
			while((line = reader.readLine()) != null) {
				if(line.equals("ct:")) {
					state = 1;
				} else if(line.equals("t:")) {
					state = 2;
				} else if(line.equals("both:")) {
					state = 3;
				} else if(line.trim().equals("")) {
					//do nothing
				} else if(state == 1) {
					ctGuns.add(line);
				} else if(state == 2) {
					tGuns.add(line);
				} else if(state == 3) {
					ctGuns.add(line);
					tGuns.add(line);
				}
			}
			reader.close();
		} catch (IOException e1) {
			e1.printStackTrace();
			gun.setText("Could not load config file. It should be in config/config.txt");
			ct.setEnabled(false);
			te.setEnabled(false);
		}
		
		frame.getContentPane().add(panel, BorderLayout.WEST);
		frame.setSize(300, 100);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
