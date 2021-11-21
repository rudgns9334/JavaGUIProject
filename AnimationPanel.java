import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class AnimationPanel extends JPanel implements ActionListener{
	
	final int PANEL_WIDTH = 500;
	final int PANEL_HEIGHT = 500;
	Image smile;
	Image backgroundImage;
	Timer timer;
	int xVelocity = 2;
	int yVelocity = 1;
	int x = 0;
	int y = 0;
	
	AnimationPanel(){
		this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
		this.setBackground(Color.black);
		smile = new ImageIcon("smile2.png").getImage();
		backgroundImage = new ImageIcon("back.jpg").getImage();
		timer = new Timer(10, this);
		timer.start();
	}

	public void paint(Graphics g) {
		
		super.paint(g);
		
		Graphics2D g2D = (Graphics2D) g;
		
		g2D.drawImage(backgroundImage, 0, 0, null);
		g2D.drawImage(smile, x, y, null);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(x>=PANEL_WIDTH-smile.getWidth(null) || x<0) {
			xVelocity = xVelocity * (-1);
		}
		x = x + xVelocity;
		
		if(y>=PANEL_HEIGHT-smile.getHeight(null) || y<0) {
			yVelocity = yVelocity * (-1);
		}
		y = y + yVelocity;
		repaint();
	}
}
