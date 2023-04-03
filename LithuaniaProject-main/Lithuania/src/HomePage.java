import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

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
	JButton mapButton = new JButton("Map");

	public HomePage(JFrame mainFrame, JPanel mainPanel) {

		this.frame = mainFrame;
		this.panel = mainPanel;

		// Takes off automatic placement, lets you position where you specifically want
		// objects on screen
		panel.setLayout(null);

		// gives you positioning terms for the computer to reference
		Insets insets = panel.getInsets();

		// Code for DropDown Button One
		String[] choices = { "Venue", "CHOICE 2", "CHOICE 3", "CHOICE 4", "CHOICE 5", "CHOICE 6" };
		final JComboBox<String> dropDownButton = new JComboBox<String>(choices);
		dropDownButton.setPreferredSize(new Dimension(400, 70));
		Dimension sizeTwo = dropDownButton.getPreferredSize();
		dropDownButton.setBounds(215 + insets.left, 275 + insets.bottom, sizeTwo.width, sizeTwo.height);
		dropDownButton.setVisible(true);
		panel.add(dropDownButton);

		
		
		
		// Code for DropDown Button Two
		String[] choicesTwo = { "Number of People", "CHOICE 2", "CHOICE 3", "CHOICE 4", "CHOICE 5", "CHOICE 6" };
		final JComboBox<String> dropDownButtonTwo = new JComboBox<String>(choicesTwo);
		dropDownButtonTwo.setPreferredSize(new Dimension(400, 70));
		Dimension sizeThree = dropDownButtonTwo.getPreferredSize();
		dropDownButtonTwo.setBounds(215 + insets.left, 375 + insets.bottom, sizeThree.width, sizeThree.height);
		dropDownButtonTwo.setVisible(true);
		panel.add(dropDownButtonTwo);

		
		
		
		// Code for DropDown Button Three
		String[] choicesThree = { "Location", "CHOICE 2", "CHOICE 3", "CHOICE 4", "CHOICE 5", "CHOICE 6" };
		final JComboBox<String> dropDownButtonThree = new JComboBox<String>(choicesThree);
		dropDownButtonThree.setPreferredSize(new Dimension(190, 70));
		Dimension sizeFour = dropDownButtonThree.getPreferredSize();
		dropDownButtonThree.setBounds(215 + insets.left, 475 + insets.bottom, sizeFour.width, sizeFour.height);
		dropDownButtonThree.setVisible(true);
		panel.add(dropDownButtonThree);

		
		
		
		// code for search button
		searchButton.addActionListener(new ButtonListener1());
		searchButton.setPreferredSize(new Dimension(400, 70));
		frame.add(panel, BorderLayout.NORTH);
		searchButton.setFont(new Font("American Typewriter", Font.BOLD, 20));
		Dimension sizeFive = searchButton.getPreferredSize();
		searchButton.setBounds(215 + insets.left, 575 + insets.bottom, sizeFive.width, sizeFive.height);
		panel.add(searchButton); 
		
		
		
		
		// code for map button
		mapButton.addActionListener(new ButtonListener1());
		mapButton.setPreferredSize(new Dimension(190, 70)); //
		mapButton.setFont(new Font("American Typewriter", Font.BOLD, 20));
		Dimension sizeNine = mapButton.getPreferredSize();
		mapButton.setBounds(425 + insets.left, 475 + insets.bottom, sizeNine.width, sizeNine.height);
		panel.add(mapButton); 

		
		
		
		// code for my heading
		JLabel label = new JLabel("My label");
		label.setPreferredSize(new Dimension(400, 70));
		Dimension sizeSeven = label.getPreferredSize();
		label.setText("Find A Place To Visit");
		panel.add(label);
		label.setFont(new Font("American Typewriter", Font.BOLD, 20)); 
		label.setBounds(305 + insets.left, 125 + insets.bottom, sizeSeven.width, sizeSeven.height);

		
		
		
		// code for my short description
		JLabel labelTwo = new JLabel("My label");
		labelTwo.setPreferredSize(new Dimension(600, 100));
		Dimension sizeEight = labelTwo.getPreferredSize();
		labelTwo.setText("Come here to explore the beautiful castles of Lithuania"); 
		panel.add(labelTwo);
		labelTwo.setFont(new Font("American Typewriter", Font.BOLD, 15)); 
		labelTwo.setBounds(210 + insets.left, 160 + insets.bottom, sizeEight.width, sizeEight.height);

		
		
		
		// code to put white square image on the window
		ImageIcon mySquare = new ImageIcon("Lithuania/src/Images/MySquare.PNG");
		JLabel jlPic = new JLabel(mySquare);
		Dimension size = jlPic.getPreferredSize();
		jlPic.setBounds(155 + insets.left, 125 + insets.bottom, size.width, size.height);
		panel.add(jlPic);

		
		
		
		// code to put castle image on the window
		ImageIcon CastleHome = new ImageIcon("Lithuania/src/Images/CastleHomePage.PNG");
		JLabel jlPic2 = new JLabel(CastleHome);
		Dimension sizeSix = jlPic2.getPreferredSize();
		jlPic2.setBounds(280 + insets.left, -33 + insets.bottom, sizeSix.width, 200 + sizeSix.height);
		panel.add(jlPic2);

		
			
	
		// Color blue
		Color myBlue = new Color(231, 248, 252);

		// sets panel to my custom color
		panel.setBackground(myBlue);
		// makes frame visible

		frame.setVisible(true);

		
		
		// Creates a new window that contains a map of Lithuania when you click the map
		// button
		mapButton.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent e) {
				
				JFrame mapWindow = new JFrame("Map Window");
				JPanel mapPanel = new JPanel();
				mapPanel.setLayout(null);
				mapWindow.add(mapPanel);

				// add image of map to the panel
				ImageIcon mySquare = new ImageIcon("Lithuania/src/Images/LithuanianMap.PNG");
				JLabel jlPic = new JLabel(mySquare);
				Dimension size = jlPic.getPreferredSize();
				jlPic.setBounds(0, 0, size.width, size.height);
				mapPanel.add(jlPic);

				// set size and visibility of the map window
				mapWindow.setSize(810, 700);
				mapPanel.setBackground(Color.WHITE);
				mapWindow.setVisible(true);
				
				
			
			}
		});

	}

	
	
	
	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	// Sends you to Selection page when Search Button is clicked
	public class ButtonListener1 implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			if (e.getSource() == searchButton) {

				System.out.println("Test");
				new Selection();

			}
		}

	}
}
