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
	
		
	
		
//		
//		
//		ImageIcon img = null;
//		try {
//			img = new ImageIcon(new URL("file:///C:/Users/hautid/git/LithuaniaProject/LithuaniaProject-main/Images/MySquare.PNG"));
//		} catch (MalformedURLException e) {
//			e.printStackTrace();
//		}
//		JLabel jlPic = new JLabel(img);
//
//		jlPic.setPreferredSize(new Dimension(300,100));
//		
//		panel.add(jlPic, BorderLayout.CENTER);
//		
		
		
		JButton germanyButton = new JButton("GERMANY");
		germanyButton.setPreferredSize(new Dimension(200, 100)); //sets the size of the Germany button with (width, height)
		frame.add(panel, BorderLayout.NORTH); //adds the panel and centers it
		germanyButton.setFont(new Font("American Typewriter", Font.BOLD, 20)); // sets the font for the Germany Button 
		Dimension size = germanyButton.getPreferredSize();
		germanyButton.setBounds (500, 300, size.width, size.height); //will let you place button anywhere you want based on coordinates 
		panel.add(germanyButton); //adds the Germany button to the panel
		
		JButton russiaButton = new JButton("RUSSIA");
		russiaButton.setPreferredSize(new Dimension(200, 100)); //sets the size of the Russia button with (width, height)
		frame.add(panelTwo); //adds the panel and centers it
		russiaButton.setFont(new Font("American Typewriter", Font.BOLD, 20)); //sets the font for the Russia Button
		Dimension sizeTwo = russiaButton.getPreferredSize();
		russiaButton.setBounds (1000, 300, sizeTwo.width, sizeTwo.height); //will let you place button anywhere you want based on coordinates 
		panelTwo.add(russiaButton, BorderLayout.SOUTH); //adds the Russia button to the panel
		
		frame.setVisible(true);
		
		//frame.pack(); //fits the frame to the size of the two buttons
		
	}
}
