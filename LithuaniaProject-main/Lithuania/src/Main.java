import java.awt.BorderLayout;
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

public class Main {

	public static final Dimension FIRST_SCREEN_SIZE = new Dimension(1500, 1000);

	public static void main(String[] args) {
		
		JFrame frame = new JFrame(); //creates a new frame
		JPanel panel = new JPanel(); //creates a new panel
		JPanel panelTwo = new JPanel(); //creates a new panel


		frame.setSize(FIRST_SCREEN_SIZE);
		frame.setTitle("Home");

		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		
	
		
		
		//code to put an image on a window
		ImageIcon img = null;
		img = new ImageIcon("Lithuania/src/MySquare.PNG"); //all images should have the Lithuania/src/FileNamePNG
		JLabel jlPic = new JLabel(img);

		Dimension size = jlPic.getPreferredSize(); 
		jlPic.setBounds (1000, 300, size.width, size.height); //will let you place image anywhere you want based on coordinates 
		panel.add(jlPic, BorderLayout.CENTER); //add image to the panel
		
		
		
		String[] choices = { "CHOICE 1","CHOICE 2", "CHOICE 3","CHOICE 4","CHOICE 5","CHOICE 6"}; //drop down button with options 

	    final JComboBox<String> cb = new JComboBox<String>(choices);

	    cb.setVisible(true);
	    panel.add(cb);

// this is an optional OK button that can be implemented but i think its redundant as we will have a submit button
//	    JButton btn = new JButton("OK"); 
//	    panel.add(btn);
		
		
		
		JButton germanyButton = new JButton("GERMANY");
		germanyButton.setPreferredSize(new Dimension(200, 100)); //sets the size of the Germany button with (width, height)
		frame.add(panel, BorderLayout.NORTH); //adds the panel and centers it
		germanyButton.setFont(new Font("American Typewriter", Font.BOLD, 20)); // sets the font for the Germany Button 
		Dimension sizeTwo = germanyButton.getPreferredSize();
		germanyButton.setBounds (500, 300, sizeTwo.width, sizeTwo.height); //will let you place button anywhere you want based on coordinates 
		panel.add(germanyButton); //adds the Germany button to the panel
		
		JButton russiaButton = new JButton("RUSSIA");
		russiaButton.setPreferredSize(new Dimension(200, 100)); //sets the size of the Russia button with (width, height)
		frame.add(panelTwo); //adds the panel and centers it
		russiaButton.setFont(new Font("American Typewriter", Font.BOLD, 20)); //sets the font for the Russia Button
		Dimension sizeThree = russiaButton.getPreferredSize();
		russiaButton.setBounds (1000, 300, sizeThree.width, sizeThree.height); //will let you place button anywhere you want based on coordinates 
		panelTwo.add(russiaButton, BorderLayout.SOUTH); //adds the Russia button to the panel
		
		frame.setVisible(true);
		
		//frame.pack(); //fits the frame to the size of the two buttons
		
	}
}
