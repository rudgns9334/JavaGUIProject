import javax.swing.*;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class SelectDirectoryTest extends JFrame implements ActionListener{

	JLabel label;
	JTextField filepath;
	JButton btn;
	
	public SelectDirectoryTest() {
		
		Container container = getContentPane();
		label = new JLabel("출력 경로 : ");
		filepath = new JTextField();
		filepath.setEnabled(false);
		btn = new JButton("선택");
		btn.addActionListener(this);
		container.add(label);
		container.add(filepath);
		container.add(btn);
		
		BorderLayout borderlayout = new BorderLayout();
		borderlayout.addLayoutComponent(label, BorderLayout.WEST);
		borderlayout.addLayoutComponent(filepath, BorderLayout.CENTER);
		borderlayout.addLayoutComponent(btn, BorderLayout.EAST);
		container.setLayout(borderlayout);
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(300,100);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SelectDirectoryTest();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==btn) {
			JFileChooser jfc = new JFileChooser();
			jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
			jfc.showDialog(this, null);
			File dir = jfc.getSelectedFile();
			filepath.setText(dir==null?"":dir.getPath());
		}
	}
}
