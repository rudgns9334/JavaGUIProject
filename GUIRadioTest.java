import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import javax.swing.JFrame;

public class GUIRadioTest extends JFrame implements ActionListener{
	JRadioButton pizzaButton;
	JRadioButton hamburgerButton;
	JRadioButton hotdogButton;
	GUIRadioTest(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		pizzaButton = new JRadioButton("pizza");
		hamburgerButton = new JRadioButton("hamburger");
		hotdogButton = new JRadioButton("hotdog");
		
		ButtonGroup group = new ButtonGroup();
		group.add(pizzaButton);
		group.add(hamburgerButton);
		group.add(hotdogButton);
		
		pizzaButton.addActionListener(this);
		hamburgerButton.addActionListener(this);
		hotdogButton.addActionListener(this);
		
		add(pizzaButton);
		add(hamburgerButton);
		add(hotdogButton);
		
		pack();
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GUIRadioTest();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==pizzaButton) {
			System.out.println("You ordered pizza!");
		}
		else if(e.getSource()==hamburgerButton) {
			System.out.println("You ordered hamburger!");
		}
		else if(e.getSource()==hotdogButton) {
			System.out.println("You ordered hotdog!");
		}
	}

}
