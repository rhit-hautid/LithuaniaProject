import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class ImageButton{
	
	JButton Button =  new JButton("Image Here");
	

	public ImageButton(JFrame frame_Selection, JPanel panel_Selection) {
		
		System.out.println("Test ImageButton");
		Button.setPreferredSize(new Dimension(370, 370));
		Button.addActionListener(new ButtonListener2());
		
	}
	
	
	
	public class ButtonListener2 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub

			if (e.getSource() == Button) {
				Button.setBackground(Color.CYAN);
				
			}
		}

	}
}
