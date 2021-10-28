import java.awt.*;
import javax.swing.*;

public class TestButton extends JFrame{
	TestButton(){
		// JButton = a button that performs an action when clicked on
		JButton button = new JButton();
		button.setBounds(200, 100, 100, 50);
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		setSize(500,500);
		setVisible(true);
		add(button);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TestButton();
	}

}
