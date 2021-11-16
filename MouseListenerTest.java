import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseListenerTest extends JFrame implements MouseListener{

	JLabel label;
	JLabel label2;
	ImageIcon check;
	ImageIcon circle;
	ImageIcon smile;
	ImageIcon x;
	
	MouseListenerTest(){
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(600,600);
		this.setLayout(null);
		
		label = new JLabel();
		label.setBounds(0,0,100,100);
		label.setBackground(Color.red);
		label.setOpaque(true);
		label.addMouseListener(this);
		
		check = new ImageIcon("check.jpg");
		circle = new ImageIcon("circle.jpg");
		smile = new ImageIcon("smile.png");
		x = new ImageIcon("x.png");
		
		label2 = new JLabel();
		label2.setBounds(100, 0, 500, 500);
		label2.setIcon(x);
		
		this.add(label);
		this.add(label2);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseListenerTest();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// Invoked when the mouse button has been clicked (pressed and released) on a component
		//System.out.println("너는 마우스를 click해부렀어");
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// Invoked when the mouse enters a component
		System.out.println("너는 컴포넌트에 enter해부렀어");
		label.setBackground(Color.blue);
		label2.setIcon(smile);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// Invoked when the mouse exits a component
		System.out.println("너는 컴포넌트에서 exit해부렀어");
		label.setBackground(Color.red);
		label2.setIcon(x);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// Invoked when a mouse button has been pressed on a component
		System.out.println("너는 마우스를 press해부렀어");
		label.setBackground(Color.yellow);
		label2.setIcon(circle);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// Invoked when a mouse button has been released on a component
		System.out.println("너는 마우스를 release해부렀어");
		label.setBackground(Color.green);
		label2.setIcon(check);
	}

}
