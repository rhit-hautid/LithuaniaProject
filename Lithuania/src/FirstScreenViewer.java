import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Adds buttons to the first screen; can choose between either Germany or Russian Occupancy.
 * 
 * @author Isabel Haut
 *
 */
public class FirstScreenViewer {
	
public static final Dimension FIRST_SCREEN_SIZE = new Dimension(500, 500);

/**
 * Constructs and displays the JFrame which displays two buttons via a
 * PineTreesComponent. 
 * 
 * @param args
 *            Command-line arguments, ignored here.
 */
public static void main(String[] args) {
	
	JFrame frame = new JFrame(); //creates a new frame
	JPanel panel = new JPanel(); //creates a new panel
	JPanel panelTwo = new JPanel(); //creates a new panel


	frame.setSize(FIRST_SCREEN_SIZE);
	frame.setTitle("Choose Either German or Russian Occupancy");

	
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	
	
	JButton germanyButton = new JButton("GERMANY");
	germanyButton.setPreferredSize(new Dimension(200, 100));
	frame.add(panel, BorderLayout.WEST); //adds the panel and centers it
	germanyButton.setFont(new Font("American Typewriter", Font.BOLD, 20)); // sets the font for the Germany Button 
	panel.add(germanyButton);
	
	JButton russiaButton = new JButton("RUSSIA");
	russiaButton.setPreferredSize(new Dimension(200, 100));
	frame.add(panelTwo, BorderLayout.EAST); //adds the panel and centers it
	russiaButton.setFont(new Font("American Typewriter", Font.BOLD, 20)); //sets the font for the Russia Button
	panelTwo.add(russiaButton);
	
	
	frame.pack(); //fits the frame to the size of the two buttons
	
	


	
}
}


