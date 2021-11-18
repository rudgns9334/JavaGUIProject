import java.awt.*;
import javax.swing.*;

public class GraphicsTest extends JFrame{

	GraphicsPanel panel;
	
	GraphicsTest(){
		
		panel = new GraphicsPanel();
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.add(panel);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GraphicsTest();
	}

}
