package week13;

import javax.swing.JFrame;
import java.awt.*;

public class ContentPaneEx extends JFrame {

	public ContentPaneEx(){
		setTitle("ContentPane°ú JFrame ¿¹Á¦");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(new FlowLayout());
		
		contentPane.add(new Button("OK"));
		contentPane.add(new Button("Cancel"));
		contentPane.add(new Button("Ignore"));
		
		setSize(300, 150);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContentPaneEx cp = new ContentPaneEx();
	}
}
