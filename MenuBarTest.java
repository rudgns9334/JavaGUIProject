import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class MenuBarTest extends JFrame implements ActionListener{

	JMenuBar menuBar;
	JMenu fileMenu;
	JMenu editMenu;
	JMenu helpMenu;
	JMenuItem loadItem;
	JMenuItem saveItem;
	JMenuItem exitItem;
	ImageIcon loadIcon;
	ImageIcon saveIcon;
	ImageIcon exitIcon;
	
	MenuBarTest(){
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(new FlowLayout());
		
		loadIcon = new ImageIcon("smile.png");
		saveIcon = new ImageIcon("check.jpg");
		exitIcon = new ImageIcon("x.png");
		
		menuBar = new JMenuBar();
		
		fileMenu = new JMenu("File");
		editMenu = new JMenu("Edit");
		helpMenu = new JMenu("Help");
		
		loadItem = new JMenuItem("Load");
		saveItem = new JMenuItem("Save");
		exitItem = new JMenuItem("Exit");
		
		loadItem.addActionListener(this);
		saveItem.addActionListener(this);
		exitItem.addActionListener(this);
		
		loadItem.setIcon(loadIcon);
		saveItem.setIcon(saveIcon);
		exitItem.setIcon(exitIcon);
		
		fileMenu.setMnemonic(KeyEvent.VK_F); // Alt + f for file
		editMenu.setMnemonic(KeyEvent.VK_E); // Alt + e for edit
		helpMenu.setMnemonic(KeyEvent.VK_H); // Alt + h for help
		loadItem.setMnemonic(KeyEvent.VK_L); // l for load
		saveItem.setMnemonic(KeyEvent.VK_S); // s for save
		exitItem.setMnemonic(KeyEvent.VK_E); // e for exit
		
		
		fileMenu.add(loadItem);
		fileMenu.add(saveItem);
		fileMenu.add(exitItem);
		
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(helpMenu);
		this.setJMenuBar(menuBar);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MenuBarTest();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==loadItem) {
			System.out.println("*muyahooooo* you loaded a file");
		}
		if(e.getSource()==saveItem) {
			System.out.println("*muyahooooo* you saved a file");
		}
		if(e.getSource()==exitItem) {
			System.exit(0);
		}
	}

}
