import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorChooserTest extends JFrame implements ActionListener{

	// JColorChooser = A GUI mechanism that let's a user choose a color
	
	JButton button;
	JLabel label;
	
	ColorChooserTest(){
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		button = new JButton("Pick a color");
		button.addActionListener(this);
		
		label = new JLabel();
		label.setBackground(Color.white);
		label.setText("This is some text XD");
		label.setFont(new Font("MV Boli",Font.PLAIN,100));
		label.setOpaque(true);

		this.add(button);
		this.add(label);
		this.pack();
		this.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ColorChooserTest();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button) {
			JColorChooser colorChooser = new JColorChooser();
			
			Color color = JColorChooser.showDialog(null, "Pick a color...I guess", Color.black);
			
			label.setForeground(color);
			//label.setBackground(color);
		}
	}

}
