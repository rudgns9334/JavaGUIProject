import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class SelectFileTest extends JFrame implements ActionListener{

	//JFileChooser = A GUI mechanism that let's a user choose a file (helpful for opening or saving files)
	
	JButton button;
	
	SelectFileTest(){
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		button = new JButton("Select File");
		button.addActionListener(this);
		
		this.add(button);
		this.pack();
		this.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SelectFileTest();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button) {
			JFileChooser fileChooser = new JFileChooser();
			
			fileChooser.setCurrentDirectory(new File("."));
			
			int response = fileChooser.showOpenDialog(null);//select file to open open시 0을 리턴 close시 1을 리턴
			//int response = fileChooser.showSaveDialog(null); // select file to save
			
			if(response == JFileChooser.APPROVE_OPTION) {
				File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
				System.out.println(file);
			}
		}
	}

}
