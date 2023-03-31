import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/*
 * @author Isabel Haut
 */

public class HomePage extends Main {

	
	JFrame frame;
	JPanel panel;
	JPanel panel2;
	JButton searchButton = new JButton("Search");
	JButton mapButton = new JButton("Map");
	

	public HomePage(JFrame mainFrame, JPanel mainPanel) {

		this.frame = mainFrame;
		this.panel = mainPanel;

		panel.setLayout(null); // Takes off automatic placement, lets you position where you specifically want
								// objects on screen

		
		Insets insets = panel.getInsets(); //gives you positioning terms for the computer to reference
		
		String[] choices = { "Venue", "CHOICE 2", "CHOICE 3", "CHOICE 4", "CHOICE 5", "CHOICE 6" }; // list of down
																										// button
																										// options

		final JComboBox<String> dropDownButton = new JComboBox<String>(choices); // creates a new drop down button

		dropDownButton.setPreferredSize(new Dimension(400, 70)); // sets the size of the Germany button with (width,
																	// height)
		Dimension sizeTwo = dropDownButton.getPreferredSize();
		dropDownButton.setBounds(215 + insets.left, 275 + insets.bottom, sizeTwo.width, sizeTwo.height); // will let
																											// you place
		// button anywhere you
		// want based on
		// coordinates
		dropDownButton.setVisible(true);
		panel.add(dropDownButton); // adds the drop down button to the

		
		
		
		String[] choicesTwo = { "Number of People", "CHOICE 2", "CHOICE 3", "CHOICE 4", "CHOICE 5", "CHOICE 6" }; // list of
																											// down
																											// button
																											// options

		final JComboBox<String> dropDownButtonTwo = new JComboBox<String>(choicesTwo); // creates a new drop down button

		dropDownButtonTwo.setPreferredSize(new Dimension(400, 70)); // sets the size of the Germany button with (width,
																	// height)
		Dimension sizeThree = dropDownButtonTwo.getPreferredSize();
		dropDownButtonTwo.setBounds(215 + insets.left, 375 + insets.bottom, sizeThree.width, sizeThree.height); // will
																													// let
																													// you
		// place button
		// anywhere you
		// want based on
		// coordinates
		dropDownButtonTwo.setVisible(true);
		panel.add(dropDownButtonTwo); // adds the drop down button to the panel


		
		

		String[] choicesThree = { "Location", "CHOICE 2", "CHOICE 3", "CHOICE 4", "CHOICE 5", "CHOICE 6" }; // list of
																											// down
																											// button
																											// options

		final JComboBox<String> dropDownButtonThree = new JComboBox<String>(choicesThree); // creates a new drop down
																							// button

		dropDownButtonThree.setPreferredSize(new Dimension(190, 70)); // sets the size of the Germany button with
																		// (width,
																		// height)
		Dimension sizeFour = dropDownButtonThree.getPreferredSize();
		dropDownButtonThree.setBounds(215 + insets.left, 475 + insets.bottom, sizeFour.width, sizeFour.height); // will
																													// let
																													// you
		// place button
		// anywhere you
		// want based on
		// coordinates
		dropDownButtonThree.setVisible(true);
		panel.add(dropDownButtonThree); // adds the drop down button to the panel

	
		
		
		// code for search button
		searchButton.addActionListener(new ButtonListener1());
		searchButton.setPreferredSize(new Dimension(400, 70));
		frame.add(panel, BorderLayout.NORTH); 
		searchButton.setFont(new Font("American Typewriter", Font.BOLD, 20)); 
		Dimension sizeFive = searchButton.getPreferredSize();
		searchButton.setBounds(215 + insets.left, 575 + insets.bottom, sizeFive.width, sizeFive.height);
		// searchButton.setBackground(Color.BLACK); can change the color of button 
		panel.add(searchButton); // adds the button to the panel
		
		
		
		// code for map button
		mapButton.addActionListener(new ButtonListener1());
		mapButton.setPreferredSize(new Dimension(190, 70)); //
		mapButton.setFont(new Font("American Typewriter", Font.BOLD, 20)); 
		Dimension sizeNine = mapButton.getPreferredSize();
		mapButton.setBounds(425 + insets.left, 475 + insets.bottom, sizeNine.width, sizeNine.height); 
		// searchButton.setBackground(Color.BLACK); can change the color of button 
		panel.add(mapButton); // adds the button to the panel
		

		
		
		//code for my heading 
		JLabel label = new JLabel("My label");
		label.setPreferredSize(new Dimension(400, 70)); 
		Dimension sizeSeven = label.getPreferredSize();
		label.setText("Find A Place To Visit");
		panel.add(label);
		label.setFont(new Font("American Typewriter", Font.BOLD, 20)); // sets the font for the Germany Button
		label.setBounds(305 + insets.left, 125 + insets.bottom, sizeSeven.width, sizeSeven.height);
		
		
		
		//code for my short description 
		JLabel labelTwo = new JLabel("My label");
		labelTwo.setPreferredSize(new Dimension(600, 100)); 
		Dimension sizeEight = labelTwo.getPreferredSize();
		labelTwo.setText("Come here to explore the beautiful castles of Lithuania");  //text can be changed just inserted for layout
		panel.add(labelTwo);
		labelTwo.setFont(new Font("American Typewriter", Font.BOLD, 15)); // sets the font for the Germany Button
		labelTwo.setBounds(210 + insets.left, 160 + insets.bottom, sizeEight.width, sizeEight.height);
		


	
		// code to put an image on a window
		ImageIcon mySquare = new ImageIcon("Lithuania/src/Images/MySquare.PNG"); // all images should have the
		// Lithuania/src/FileNamePNG
		JLabel jlPic = new JLabel(mySquare);

		Dimension size = jlPic.getPreferredSize();

		

		jlPic.setBounds(155 + insets.left, 125 + insets.bottom, size.width, size.height); // will let you place
		// image anywhere you
		// want based on
		// coordinates

		panel.add(jlPic); // add image to the panel
		
		
		
		
		
		
		
		// code to put an image on a window
				ImageIcon CastleHome = new ImageIcon("Lithuania/src/Images/CastleHomePage.PNG"); // all images should have the
				// Lithuania/src/FileNamePNG
				JLabel jlPic2 = new JLabel(CastleHome);

				Dimension sizeSix = jlPic2.getPreferredSize();

				

				jlPic2.setBounds(280 + insets.left, -33 + insets.bottom, sizeSix.width, 200 + sizeSix.height); // will let you place
				// image anywhere you
				// want based on
				// coordinates

				panel.add(jlPic2); // add image to the panel
		
		
		

		Color myBlue = new Color(231, 248, 252); // Color blue
		panel.setBackground(myBlue); // sets panel to my custom color
		frame.setVisible(true);

	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public class ButtonListener1 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub

			if (e.getSource() == searchButton) {
				
				System.out.println("Test");
				new Selection();
				
				// Sends you to Selection page when Search Button is clicked 
				
				
			}
		}

	}
}
