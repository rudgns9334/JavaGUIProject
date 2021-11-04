import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckBoxTest extends JFrame implements ActionListener{

	JButton button;
	JCheckBox checkBox;
	ImageIcon xIcon;
	ImageIcon checkIcon;
	
	CheckBoxTest(){
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		xIcon = new ImageIcon("x.png");
		checkIcon = new ImageIcon("check.jpg");
		
		button = new JButton();
		button.setText("submit");
		button.addActionListener(this);
		
		checkBox = new JCheckBox();
		checkBox.setText("HI");
		checkBox.setFocusable(false); // check했을 때 주위에 그 이상한 테두리 안생기게
		checkBox.setFont(new Font("Consolas", Font.PLAIN,35));
		checkBox.setIcon(xIcon);
		checkBox.setSelectedIcon(checkIcon);
		
		this.add(button);
		this.add(checkBox);
		this.pack();
		this.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CheckBoxTest();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button) {
			System.out.println(checkBox.isSelected());
		}
	}

}
