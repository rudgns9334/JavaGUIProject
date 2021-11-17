import javax.swing.*;
import java.awt.*;

public class DragAndDropTest extends JFrame{

	DragPanel dragPanel = new DragPanel();
	
	
	DragAndDropTest(){
		this.add(dragPanel);
		this.setTitle("Drag & Drop demo");
		this.setSize(600, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DragAndDropTest();
	}

}
