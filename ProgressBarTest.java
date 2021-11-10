import javax.swing.*;
import java.awt.*;

public class ProgressBarTest extends JFrame{

	// progress bar = Visual aid to let the user know that an operation is processing
	
	JProgressBar bar = new JProgressBar(0,100); // 0~100까지가 디폴트
	
	ProgressBarTest(){
		
		bar.setValue(0);
		bar.setBounds(0, 0, 420, 50);
		bar.setStringPainted(true);
		bar.setFont(new Font("MV Boli",Font.BOLD,25));
		bar.setForeground(Color.red);
		bar.setBackground(Color.black);
		
		this.add(bar);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(420,420);
		this.setLayout(null);
		this.setVisible(true);
		
		fill();
	}
	
	public void fill() {
		int counter = 0;
		
		while(counter<=100) {
			bar.setValue(counter);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			counter += 1;
		}
		bar.setString("Done! :) ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ProgressBarTest();
	}

}
