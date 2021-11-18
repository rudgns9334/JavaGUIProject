import javax.swing.*;
import java.awt.*;

public class GraphicsPanel extends JPanel{

	Image image;
	
	GraphicsPanel(){
		image = new ImageIcon("back.jpg").getImage();
		this.setPreferredSize(new Dimension(500,500));
	}
	
	public void paint(Graphics g) {
		
		Graphics2D g2D = (Graphics2D) g;

		/* 선긋기 */		
//		g2D.setPaint(Color.blue);
//		g2D.setStroke(new BasicStroke(5));
//		g2D.drawLine(0, 0, 500, 500);

		/* 사각형 그리기 */
//		g2D.setPaint(Color.pink);
//		g2D.drawRect(0,0,100,200);
//		g2D.fillRect(0,0,100,200);
		
		/* 원 그리기 */
//		g2D.setPaint(Color.orange);
//		g2D.drawOval(0,0,100,100);
//		g2D.fillOval(0,0,100,100);
		
		/* 원 범위 지정해서 그리기 */
//		g2D.setPaint(Color.red);
//		g2D.drawArc(0,0,100,100,0,180); // 크기 100짜리 0도(5번째 파라미터)에서 시작해서 시계방향으로 180(6번째 파라미터)도만큼
//		g2D.fillArc(0,0,100,100,0,180);
//		g2D.setPaint(Color.white);
//		g2D.fillArc(0,0,100,100,180,180);
		
		/* 도형 그리기 */
//		int[] xPoints = {150, 250, 350};
//		int[] yPoints = {300, 150, 300};
//		g2D.setPaint(Color.yellow);
//		g2D.drawPolygon(xPoints, yPoints, 3);
//		g2D.fillPolygon(xPoints, yPoints, 3);
		
		/* 글씨 쓰기 */
//		g2D.setPaint(Color.magenta);
//		g2D.setFont(new Font("Ink Free", Font.BOLD, 50));
//		g2D.drawString("I can't English. XD", 50, 50);
		
		/* 이미지 넣기 */
//		g2D.drawImage(image, 0, 0, null);
	}
}
