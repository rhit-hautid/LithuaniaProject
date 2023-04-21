import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

/*
 * @author Sebastien Hughes
 */
public class ImageButton {
	
	JButton Button = new JButton();
	int side_value = 330;
	

	public ImageButton(String image) {
		
		ImageIcon ii = new ImageIcon(image);
		Button.setIcon(ii);
		
		//System.out.println("Test ImageButton");
		Button.setPreferredSize(new Dimension(side_value, side_value));
		Button.addActionListener(new ButtonListener2());
		
	}
	
	
	
	public class ButtonListener2 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub

			if (e.getSource() == Button) {
				System.out.println("Test DataScreen");
				new DataScreen();
				
			}
		}

	}
}
