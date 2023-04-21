import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * @author Isabel Haut 
 */
public class Main {

	public static final Dimension FIRST_SCREEN_SIZE = new Dimension(1500, 1000);

	public static void main(String[] args) {

		JFrame frame = new JFrame(); // creates a new frame
		JPanel panel = new JPanel(); // creates a new panel
		
	
		frame.setSize(FIRST_SCREEN_SIZE);
		panel.setPreferredSize(FIRST_SCREEN_SIZE);
		frame.setTitle("Home");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// frame.pack(); //fits the frame to the size of the two buttons
		frame.setVisible(true);
		
		new HomePage(frame, panel);

	}
}
