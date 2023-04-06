import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
		
		new Location_Information();
		new HomePage(frame, panel);

	}
}
