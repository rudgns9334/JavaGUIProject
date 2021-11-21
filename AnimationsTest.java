import javax.swing.*;
import java.awt.*;

public class AnimationsTest extends JFrame{

	AnimationPanel panel;
	
	AnimationsTest(){
		
		panel = new AnimationPanel();
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.add(panel);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AnimationsTest();
	}

}
