import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.*;

public class TestPanel extends JFrame{
	TestPanel(){
		//JPanel = a GUI component that functions as a container to hold other components
		ImageIcon icon = new ImageIcon("random.JPG");
		
		JLabel label = new JLabel("Hello World");
		label.setIcon(icon);
		label.setVerticalAlignment(JLabel.BOTTOM);
		label.setHorizontalAlignment(JLabel.RIGHT);
		label.setBounds(0, 0, 75, 75);
		
		JPanel redPanel = new JPanel();
		redPanel.setBackground(Color.red);
		redPanel.setBounds(0, 0, 250, 250);
		redPanel.setLayout(null);
		
		JPanel bluePanel = new JPanel();
		bluePanel.setBackground(Color.blue);
		bluePanel.setBounds(250, 0, 250, 250);
		redPanel.setLayout(null);
		
		JPanel greenPanel = new JPanel();
		greenPanel.setBackground(Color.green);
		greenPanel.setBounds(0, 250, 500, 250);
		greenPanel.setLayout(null);
		
		setTitle("PanelTest");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		setSize(750,750);
		setVisible(true);
		greenPanel.add(label);
		add(redPanel);
		add(bluePanel);
		add(greenPanel);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TestPanel();
	}

}
