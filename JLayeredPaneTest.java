import java.awt.*;
import javax.swing.*;

public class JLayeredPaneTest extends JFrame{

	// JLayeredPane =	Swing container that provides a
	//					third dimension for positioning components
	//					ex. depth, Z-index
	
	JLayeredPaneTest(){
		JLabel label1 = new JLabel();
		label1.setOpaque(true);
		label1.setBackground(Color.RED);
		label1.setBounds(50,50,200,200);
		
		JLabel label2 = new JLabel();
		label2.setOpaque(true);
		label2.setBackground(Color.GREEN);
		label2.setBounds(100,100,200,200);
		
		JLabel label3 = new JLabel();
		label3.setOpaque(true);
		label3.setBackground(Color.BLUE);
		label3.setBounds(150,150,200,200);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0,0,500,500);
		
		//우선순위 : Default < Palette < Modal < PopUp < Drag
//		layeredPane.add(label1, JLayeredPane.DEFAULT_LAYER);
//		layeredPane.add(label2, JLayeredPane.DEFAULT_LAYER);
//		layeredPane.add(label3, JLayeredPane.DRAG_LAYER);
		
		// Integer.valueOf(0)으로 우선순위 가능
		layeredPane.add(label1, Integer.valueOf(0));
		layeredPane.add(label2, Integer.valueOf(2));
		layeredPane.add(label3, Integer.valueOf(1));
		
		this.add(layeredPane);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(new Dimension(500, 500));
		this.setLayout(null);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JLayeredPaneTest();
	}

}
