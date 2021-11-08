import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

public class SliderTest extends JFrame implements ChangeListener{
	
//	JSlider = GUI component that lets user enter a value by using an adjustable sliding knob on a track
	
	JPanel panel;
	JLabel label;
	JSlider slider;
	
	SliderTest(){
		panel = new JPanel();
		label = new JLabel();
		slider = new JSlider(0,100,50); // 0에서 100까지 시작지점은 50부터
		
		slider.setPreferredSize(new Dimension(400,200));
		
		slider.setPaintTicks(true);
		slider.setMinorTickSpacing(10); // 10칸마다 작은 표시창
		
		slider.setPaintTicks(true);
		slider.setMajorTickSpacing(25); // 25칸마다 큰 표시창
		
		slider.setPaintLabels(true); // 숫자 표시
		slider.setFont(new Font("MV Boli", Font.PLAIN, 15));
		label.setFont(new Font("MV Boli", Font.PLAIN, 25));
		
		slider.setOrientation(SwingConstants.VERTICAL); // 세로로 슬라이더
		slider.setOrientation(SwingConstants.HORIZONTAL); // 가로로 슬라이더
		
		label.setText("Temp = "+ slider.getValue());
		
		slider.addChangeListener(this);
		
		panel.add(slider);
		panel.add(label);
		this.add(panel);
		this.setSize(420,420);
		this.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SliderTest();
	}

	@Override
	public void stateChanged(ChangeEvent arg0) {
		// TODO Auto-generated method stub
		label.setText("Temp = "+ slider.getValue());
	}

}
