import java.awt.*;
import javax.swing.*;

public class FlowLayoutTest extends JFrame{

	// Layout Manger = Defines the natural layout for components within a container
	
	// FlowLayout =	places components in a row, sized at their preferred size.
	//				If the horizontal space in the container is too small,
	//				the FlowLayout class uses the next available row.
	
	FlowLayoutTest(){
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500,500);
		// LEADING : 왼쪽 정렬, CENTER : 가운데 정렬, TRAILING : 오른쪽 정렬
		setLayout(new FlowLayout(FlowLayout.CENTER,10,10));// 두번째 파라미터 수평 간격, 세번째 파라미터 수직 간격
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(100,250));
		panel.setBackground(Color.lightGray);
		panel.setLayout(new FlowLayout());
		
		panel.add(new JButton("1"));
		panel.add(new JButton("2"));
		panel.add(new JButton("3"));
		panel.add(new JButton("4"));
		panel.add(new JButton("5"));
		panel.add(new JButton("6"));
		panel.add(new JButton("7"));
		panel.add(new JButton("8"));
		panel.add(new JButton("9"));
		
		add(panel);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FlowLayoutTest();
	}

}
