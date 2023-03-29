import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
	JButton searchButton = new JButton("Search");

	public HomePage(JFrame mainFrame, JPanel mainPanel) {

		this.frame = mainFrame;
		this.panel = mainPanel;

		panel.setLayout(null); // Takes off automatic placement, lets you position where you specifically want
								// objects on screen

		
		Insets insets = panel.getInsets(); //gives you positioning terms for the computer to reference
		
		String[] choices = { "CHOICE 1", "CHOICE 2", "CHOICE 3", "CHOICE 4", "CHOICE 5", "CHOICE 6" }; // list of down
																										// button
																										// options

		final JComboBox<String> dropDownButton = new JComboBox<String>(choices); // creates a new drop down button

		dropDownButton.setPreferredSize(new Dimension(400, 70)); // sets the size of the Germany button with (width,
																	// height)
		Dimension sizeTwo = dropDownButton.getPreferredSize();
		dropDownButton.setBounds(255 + insets.left, 275 + insets.bottom, sizeTwo.width, sizeTwo.height); // will let
																											// you place
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

		dropDownButtonTwo.setPreferredSize(new Dimension(400, 70)); // sets the size of the Germany button with (width,
																	// height)
		Dimension sizeThree = dropDownButtonTwo.getPreferredSize();
		dropDownButtonTwo.setBounds(255 + insets.left, 375 + insets.bottom, sizeThree.width, sizeThree.height); // will
																													// let
																													// you
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

		dropDownButtonThree.setPreferredSize(new Dimension(400, 70)); // sets the size of the Germany button with
																		// (width,
																		// height)
		Dimension sizeFour = dropDownButtonThree.getPreferredSize();
		dropDownButtonThree.setBounds(255 + insets.left, 475 + insets.bottom, sizeFour.width, sizeFour.height); // will
																													// let
																													// you
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

		searchButton.addActionListener(new ButtonListener1());
		searchButton.setPreferredSize(new Dimension(400, 70)); // sets the size
																// of the
																// Germany
																// button with
																// (width,
																// height)
		frame.add(panel, BorderLayout.NORTH); // adds the panel and centers it
		searchButton.setFont(new Font("American Typewriter", Font.BOLD, 20)); // sets the font for the Germany Button
		Dimension sizeFive = searchButton.getPreferredSize();
		searchButton.setBounds(255 + insets.left, 575 + insets.bottom, sizeFive.width, sizeFive.height); // will
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
		panel.add(searchButton); // adds the button to the panel

		// code to put an image on a window
		ImageIcon img = new ImageIcon("Lithuania/src/Images/MySquare.PNG"); // all images should have the
		// Lithuania/src/FileNamePNG
		JLabel jlPic = new JLabel(img);

		Dimension size = jlPic.getPreferredSize();

		

		jlPic.setBounds(200 + insets.left, 125 + insets.bottom, size.width, size.height); // will let you place
		// image anywhere you
		// want based on
		// coordinates

		panel.add(jlPic); // add image to the panel

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
				JFrame frameSelection = new JFrame("frameSelection");
				frameSelection.setSize(FIRST_SCREEN_SIZE);
				frameSelection.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frameSelection.setVisible(true);// creates a new frame;
				// new SecondFrame();
			}
		}

	}
}
