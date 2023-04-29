import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * 
 * The CircleButtonDemo class demonstrates the use of a custom JButton
 * implementation, CircleButton. It creates a JFrame with a CircleButton that,
 * when clicked, prints a message to the console.
 */
public class CircleButtonDemo {
	/**
	 * The main method creates a JFrame with a CircleButton that, when clicked,
	 * prints a message to the console.
	 * 
	 * @param args An array of command-line arguments for the application. Not used
	 *             in this implementation.
	 */
	
	/*
	 * @author Isabel Haut 
	 */
	
	public static void main(String[] args) {

		JFrame frame = new JFrame("Circle Button Demo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel myCircleLabel = new JLabel("Exciting circle button:");

		CircleButton myCircleButton = new CircleButton("Click me!");
		myCircleButton.addActionListener(new ActionListener() {

			/**
			 * The actionPerformed method is called when the CircleButton is clicked. It
			 * prints a message to the console.
			 * 
			 * @param e The ActionEvent object containing information about the event that
			 *          occurred.
			 */
			public void actionPerformed(ActionEvent e) {
				System.out.println("Clicked!");
			}
		});

		JPanel panel = new JPanel();
		panel.add(myCircleLabel);
		panel.add(myCircleButton);

		frame.add(panel);

		frame.setSize(300, 150);
		frame.setVisible(true);
	}

}
