import java.awt.*;
import javax.swing.*;

public class GridLayoutTest extends JFrame{

	// Layout Manager = Defines the natural layout for components within a container
	
	// GridLayout =	places components in a grid of cells.
	//				Each component takes all the available space within its cell,
	//				and each cell is the same size.

	GridLayoutTest(){
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500,500);
		setLayout(new GridLayout(3,3,10,10));//(행,열,가로간격, 세로간격)
		
		add(new JButton("1"));
		add(new JButton("2"));
		add(new JButton("3"));
		add(new JButton("4"));
		add(new JButton("5"));
		add(new JButton("6"));
		add(new JButton("7"));
		add(new JButton("8"));
		add(new JButton("9"));
		//add(new JButton("10")); // 칸이 맞지않으면 열을 하나 늘려서 추가 적으로 사용(행은 그대로?)
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GridLayoutTest();
	}

}
