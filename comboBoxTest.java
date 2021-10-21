import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class comboBoxTest extends JFrame implements ActionListener{

	// JComboBox = A component that combines a button or editable field and a drop-down list
	
	JComboBox comboBox;
	
	comboBoxTest(){
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.setLayout(new FlowLayout());
			
			String[] animals = {"dog", "cat", "bird"};
			//Integer[] index = {1,2,3}; //숫자를 항목으로 넣고 싶을 때는 Integer사용
			
			comboBox = new JComboBox(animals);
			comboBox.addActionListener(this);
			//comboBox.setEditable(true); //각 항목 편집 가능
			//System.out.println(comboBox.getItemCount()); //항목 개수
			//comboBox.addItem("horse"); // 항목 추가하기
			//comboBox.insertItemAt("pig",0); // 0번째 자리에 pig 추가한다.
			//comboBox.setSelectedIndex(0); //default 선택지 지정
			//comboBox.removeItem("cat"); // 항목 제거
			//comboBox.removeItemAt(0); // index 0번 항목 제거
			//comboBox.removeAllItems(); // 모든 항목 제거
			
			this.add(comboBox);
			this.pack();
			this.setVisible(true);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new comboBoxTest();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==comboBox) {
			System.out.println(comboBox.getSelectedItem());
		//	System.out.println(comboBox.getSelectedIndex()); // 말그대로 몇번째 요소인지
		}
	}

}
