import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

	public static final Dimension FIRST_SCREEN_SIZE = new Dimension(1500, 1000);

	public static void main(String[] args) {
		
		JFrame frame = new JFrame(); // creates a new frame
		JPanel panel = new JPanel(); // creates a new panel
		JPanel panelTwo = new JPanel(); // creates a new panel

		frame.setSize(FIRST_SCREEN_SIZE);
		frame.setTitle("Home");

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
//
//        try {
//            // Load the JPG image file
//            ImageIcon inputFile = new ImageIcon("file:///C:/Users/hautid/git/LithuaniaProject/LithuaniaProject-main/Images/MySquare.PNG");
//            Image image = inputFile.getImage();
//
//            // Display the image width and height
////            System.out.println("Image width: " + image.getWidth());
////            System.out.println("Image height: " + image.getHeight());
//           // frame.add(image);
//        } catch (IOException e) {
//            System.out.println("Error: " + e.getMessage());
//        }
//    }
// new comment
	
		
		
		
		

		JButton germanyButton = new JButton("GERMANY");
		germanyButton.setPreferredSize(new Dimension(200, 100)); // sets the size of the Germany button with (width,
																	// height)
		frame.add(panel, BorderLayout.WEST); // adds the panel and centers it
		germanyButton.setFont(new Font("American Typewriter", Font.BOLD, 20)); // sets the font for the Germany Button
		panel.add(germanyButton); // adds the Germany button to the panel

		JButton russiaButton = new JButton("RUSSIA");
		russiaButton.setPreferredSize(new Dimension(200, 100)); // sets the size of the Russia button with (width,
																// height)
		frame.add(panelTwo); // adds the panel and centers it
		russiaButton.setFont(new Font("American Typewriter", Font.BOLD, 20)); // sets the font for the Russia Button
		panelTwo.add(russiaButton, BorderLayout.CENTER); // adds the Russia button to the panel

		//frame.pack(); // fits the frame to the size of the two buttons

	}
}
