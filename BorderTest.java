
import javax.swing.*;

public class BorderTest extends JFrame {
	BorderTest(){
		setTitle("bordertest");
		JPanel p = new JPanel();
		p.setLayout(null);
		JButton b1 = new JButton("hello");
		b1.setBounds(10,10,60,30);
		p.add(b1);
		add(p);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,100);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BorderTest();
	}

}
