import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyListenerTest extends JFrame implements KeyListener{

	JLabel label;
	ImageIcon icon;
	
	KeyListenerTest(){
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setLayout(null);
		this.addKeyListener(this);
		
		icon = new ImageIcon("smile.png");
		
		label = new JLabel();
		label.setBounds(0,0,100,100);
		label.setIcon(icon);
		//label.setBackground(Color.red);
		//label.setOpaque(true);
		this.getContentPane().setBackground(Color.black);
		this.add(label);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new KeyListenerTest();
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// KeyPressed = Invoked when a physical key is press down. Uses KeyCode, int output
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// KeyReleased = called whenever a button is released
		System.out.println("You released key char: " + e.getKeyChar());
		System.out.println("You released key code: " + e.getKeyCode()); //아스키코드로 출력!
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// KeyTyped = Invoked when a key is typed. Uses KeyChar, char output
		switch(e.getKeyChar()) {
		case 'a': label.setLocation(label.getX()-1, label.getY());
			break;
		case 'w': label.setLocation(label.getX(), label.getY()-1);
			break;
		case 's': label.setLocation(label.getX(), label.getY()+1);
			break;
		case 'd': label.setLocation(label.getX()+1, label.getY());
			break;
		}
	}

}
