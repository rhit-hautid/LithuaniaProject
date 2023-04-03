import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/*
 * @author Sebastien Hughes
 */
public class ImageButton{
	
	JButton Button =  new JButton("Image Here");
	int side_value = 330;
	

	public ImageButton(JFrame frame_Selection, JPanel panel_Selection) {
		
		System.out.println("Test ImageButton");
		Button.setPreferredSize(new Dimension(side_value, side_value));
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
