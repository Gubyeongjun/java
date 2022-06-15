package week13;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;

public class IndepClassListener extends JFrame {
	public IndepClassListener(){
		setTitle("Action �̺�Ʈ ������ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				if(b.getText().equals("Action"))
					b.setText("�׼�");
				else
					b.setText("Action");
			}
		});
		c.add(btn);
		
		setSize(250, 120);
		setVisible(true);
	}
	
	/*private class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			if(b.getText().equals("Action"))
				b.setText("�׼�");
			else
				b.setText("Action");
		}
	}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new IndepClassListener();
	}

}
