import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class newWindowTest extends JFrame implements ActionListener{

	JButton button = new JButton("New Window");
	
	newWindowTest(){
		
		button.setBounds(100, 160, 200, 40);
		button.setFocusable(false);
		button.addActionListener(this);
		
		this.add(button);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(420,420);
		this.setLayout(null);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new newWindowTest();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button) {
			this.dispose();
			MainGUI main = new MainGUI(); // 만들어 놓은 아무 GUI나 적용해보즈아
		}
	}

}