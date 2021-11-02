
import java.awt.Color;
import java.awt.Font;

import javax.swing.*;
import javax.swing.border.Border;

public class TestSwing extends JFrame{
	TestSwing(){
		setTitle("Test"); //set title of frame
		
		JLabel label = new JLabel(); // create a label. also you can do that new JLabel("시작");
		ImageIcon bat = new ImageIcon("battery.JPG");
		Border border = BorderFactory.createLineBorder(Color.green,3);
		
		label.setText("Hello world"); // set text of label
		label.setIcon(bat);
		label.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT, CENTER, RIGHT of imageicon
		label.setVerticalTextPosition(JLabel.TOP); // set text TOP, CENTER, BOTTOM of imageicon
		label.setForeground(new Color(0x00FF00)); // set font color of text
		label.setFont(new Font("MV Boli", Font.PLAIN, 20));
		label.setIconTextGap(25); // set gap of text to image
		label.setBackground(Color.red); // set background color
		label.setOpaque(true); // display background color
		label.setBorder(border);
		label.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon + text within label
		label.setHorizontalAlignment(JLabel.CENTER); // set horizontal position of icon + text within label
		//label.setBounds(0,0,250,250); // set x,y position within frame as well as dimensions
		
		add(label);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
		//setResizable(false); // prevent frame from being resized
		//setSize(500,600); // set the x-dimension, and y-dimension of frame
		//setLayout(null);
		setVisible(true); // make frame visible
		pack();
		ImageIcon image = new ImageIcon("battery.JPG"); // create an ImageIcon
		setIconImage(image.getImage()); // change icon of frame
		
		
		
		
		
		//getContentPane().setBackground(new Color(0,255,0)); //0xFFFFFF이런 식도 가능
		//getContentPane().setBackground(Color.green); // change color of background
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TestSwing();
	}

}
