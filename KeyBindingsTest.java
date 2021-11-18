import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class KeyBindingsTest extends JFrame{

	// Key Bindings = 	bind an Action to a KeyStroke
	//					don't require you to click a component to give it focus
	//					all Swing components use Key Bindings
	//					increased flexibility compared to KeyListeners
	//					can assign key strokes to individual Swing components
	//					more difficult to utilize and set up !!
	
	JLabel label;
	Action upAction;
	Action downAction;
	Action leftAction;
	Action rightAction;
	
	KeyBindingsTest(){
		this.setTitle("KeyBinding Demo");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(420, 420);
		this.setLayout(null);
		
		label = new JLabel();
		label.setBackground(Color.red);
		label.setBounds(100, 100, 100, 100);
		label.setOpaque(true);
		
		upAction = new UpAction();
		downAction = new DownAction();
		leftAction = new LeftAction();
		rightAction = new RightAction();
		
		label.getInputMap().put(KeyStroke.getKeyStroke('w'), "upAction");
		label.getActionMap().put("upAction", upAction);
		label.getInputMap().put(KeyStroke.getKeyStroke('s'), "downAction");
		label.getActionMap().put("downAction", downAction);
		label.getInputMap().put(KeyStroke.getKeyStroke('a'), "leftAction");
		label.getActionMap().put("leftAction", leftAction);
		label.getInputMap().put(KeyStroke.getKeyStroke('d'), "rightAction");
		label.getActionMap().put("rightAction", rightAction);
		
		this.add(label);
		this.setVisible(true);
	}
	
	public class UpAction extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			label.setLocation(label.getX(), label.getY()-10);
		}
	}
	
	public class DownAction extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			label.setLocation(label.getX(), label.getY()+10);
		}
	}
	
	public class LeftAction extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			label.setLocation(label.getX()-10, label.getY());
		}
	}
	
	public class RightAction extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			label.setLocation(label.getX()+10, label.getY());
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new KeyBindingsTest();
	}

}
