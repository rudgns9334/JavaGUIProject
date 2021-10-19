import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class TextfiledTest extends JFrame implements ActionListener{

	// JTextField = A GUI textbox component that can be used to add, set, or get text
	JButton button;
	JTextField textField;
	
	TextfiledTest(){
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());

		button = new JButton("Submit");
		button.addActionListener(this);
		
		textField = new JTextField();
		textField.setPreferredSize(new Dimension(250,40));
		textField.setFont(new Font("Consolas",Font.PLAIN,35));
		textField.setForeground(new Color(0x00FF00));
		textField.setBackground(Color.black);
		textField.setCaretColor(Color.white);//그 눈금자라고해야하나 깜박깜박거리른거
		textField.setText("username");
		textField.setEditable(false);//수정가능하게 아님 못하게
		
		this.add(button);
		this.add(textField);
		this.pack();
		this.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TextfiledTest();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button) {
			System.out.println("Welcome "+ textField.getText());
		}
	}

}
