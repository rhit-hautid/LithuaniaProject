import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * @author Isabel Haut
 */

public class HomePage extends Main {

	JFrame frame;
	JPanel panel;
	JPanel panel2;

	public HomePage(JFrame mainFrame, JPanel mainPanel) {

		this.frame = mainFrame;
		this.panel = mainPanel;

		// code to put an image on a window
		ImageIcon img = new ImageIcon("Lithuania/src/Images/MySquare.PNG"); // all images should have the
		// Lithuania/src/FileNamePNG
		JLabel jlPic = new JLabel(img);

		Dimension size = jlPic.getPreferredSize();

		jlPic.setBounds(800, 1000, size.width, size.height); // will let you place
																// image anywhere you
																// want based on
																// coordinates

		panel.add(jlPic); // add image to the panel
		String[] choices = { "CHOICE 1", "CHOICE 2", "CHOICE 3", "CHOICE 4", "CHOICE 5", "CHOICE 6" }; // list of down
																										// button
																										// options

		final JComboBox<String> dropDownButton = new JComboBox<String>(choices); // creates a new drop down button

		dropDownButton.setPreferredSize(new Dimension(200, 50)); // sets the size of the Germany button with (width,
																	// height)
		Dimension sizeTwo = dropDownButton.getPreferredSize();
		dropDownButton.setBounds(500, 300, sizeTwo.width, sizeTwo.height); // will let you place
																			// button anywhere you
																			// want based on
																			// coordinates
		dropDownButton.setVisible(true);
		panel.add(dropDownButton); // adds the drop down button to the

		// this is an optional OK button that can be implemented but i think its
		// redundant as we will have a search button
//	    JButton btn = new JButton("OK"); 
//	    panel.add(btn);

		String[] choicesTwo = { "CHOICE 1", "CHOICE 2", "CHOICE 3", "CHOICE 4", "CHOICE 5", "CHOICE 6" }; // list of
																											// down
																											// button
																											// options

		final JComboBox<String> dropDownButtonTwo = new JComboBox<String>(choicesTwo); // creates a new drop down button

		dropDownButtonTwo.setPreferredSize(new Dimension(200, 50)); // sets the size of the Germany button with (width,
																	// height)
		Dimension sizeThree = dropDownButtonTwo.getPreferredSize();
		dropDownButtonTwo.setBounds(100, 400, sizeThree.width, sizeThree.height); // will let you
																					// place button
																					// anywhere you
																					// want based on
																					// coordinates
		dropDownButtonTwo.setVisible(true);
		panel.add(dropDownButtonTwo); // adds the drop down button to the panel

		// this is an optional OK button that can be implemented but i think its
		// redundant as we will have a search button
//	    JButton btn = new JButton("OK"); 
//	    panel.add(btn);

		String[] choicesThree = { "CHOICE 1", "CHOICE 2", "CHOICE 3", "CHOICE 4", "CHOICE 5", "CHOICE 6" }; // list of
																											// down
																											// button
																											// options

		final JComboBox<String> dropDownButtonThree = new JComboBox<String>(choicesThree); // creates a new drop down
																							// button

		dropDownButtonThree.setPreferredSize(new Dimension(200, 50)); // sets the size of the Germany button with
																		// (width,
																		// height)
		Dimension sizeFour = dropDownButtonThree.getPreferredSize();
		dropDownButtonThree.setBounds(800, 500, sizeFour.width, sizeFour.height); // will let you
																					// place button
																					// anywhere you
																					// want based on
																					// coordinates
		dropDownButtonThree.setVisible(true);
		panel.add(dropDownButtonThree); // adds the drop down button to the panel

		// this is an optional OK button that can be implemented but i think its
		// redundant as we will have a search button
//	    JButton btn = new JButton("OK"); 
//	    panel.add(btn);

		JButton searchButton = new JButton("Search");
		searchButton.setPreferredSize(new Dimension(200, 50)); // sets the size
																// of the
																// Germany
																// button with
																// (width,
																// height)
		frame.add(panel, BorderLayout.NORTH); // adds the panel and centers it
		searchButton.setFont(new Font("American Typewriter", Font.BOLD, 20)); // sets the font for the Germany Button
		Dimension sizeFive = searchButton.getPreferredSize();
		searchButton.setBounds(500, 800, sizeFive.width, sizeFive.height); // will
																			// let
																			// you
																			// place
																			// button
																			// anywhere
																			// you
																			// want
																			// based
																			// on
																			// coordinates
		panel.add(searchButton); // adds the Germany button to the panel
		Color myBlue = new Color(231, 248, 252); // Color blue
		panel.setBackground(myBlue); // sets panel to my custom color
		frame.setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {
		//new SecondFrame();
	}

}
