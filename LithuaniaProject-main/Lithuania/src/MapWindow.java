import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * @author Isabel Haut
 */

public class MapWindow {

	// Instantiated components
	JFrame mapWindow;
	JPanel mapPanel;
	JLabel label;
	CircleButton[] circleButton = new CircleButton[10];

	public MapWindow(JLabel updateableLabel) {
		this.label = updateableLabel;

		JFrame mapWindow = new JFrame("Map Window");
		JPanel mapPanel = new JPanel();
		mapPanel.setLayout(null);
		mapWindow.add(mapPanel);

		int[][] buttonCoordinates = { 
				{ 105, 250 }, // Klaipedos button coordinates
				{ 185, 180 }, // Telsiai button coordinates
				{ 215, 315 }, // Taurages button coordinates
				{ 320, 180 }, // Saiauliai button coordinates
				{ 513, 180 }, // Panevezio button coordinates
				{ 410, 400 }, // Kauno button coordinates
				{ 610, 265 }, // Utenos button coordinates
				{ 548, 440 }, // Vilniaus button coordinates
				{ 423, 545 }, // Alytaus button coordinates
				{ 305, 475 }, // Marijampoles button coordinates
		};

		String[] countryNames = { "Klaipedos", "Telsiai", "Taurages", "Saiauliai", "Panevezio", "Kauno", "Utenos",
				"Vilniaus", "Alytaus", "Marijampoles" };

		// adds 10 of my circle buttons to the window
		for (int i = 0; i < 10; i++) {
			circleButton[i] = new CircleButton(null);
			circleButton[i].setBounds(buttonCoordinates[i][0], buttonCoordinates[i][1], 20, 20);
			mapPanel.add(circleButton[i]);
			circleButton[i].repaint();
			circleButton[i].setName(countryNames[i]);
			circleButton[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					for(int i = 0; i < countryNames.length; i++) {
						if (e.getSource().toString().contains(countryNames[i])) {
							label.setText(" City: " + countryNames[i]);
						}
					}
				}
			});
		}

		// add image of map to the panel
		ImageIcon mySquare = new ImageIcon("Lithuania/src/Images/LithuanianMap.PNG");
		JLabel jlPic = new JLabel(mySquare);
		Dimension size = jlPic.getPreferredSize();
		jlPic.setBounds(0, 0, size.width, size.height);
		mapPanel.add(jlPic);

		mapWindow.setSize(810, 700);
		
		// moves the mapWindow to appear on the right side of the screen
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		mapWindow.setLocation(dim.width/2-mapWindow.getSize().width/8, dim.height/2-mapWindow.getSize().height/2);
		
		// makes the window a fixed size that the user cannot change
		mapWindow.setResizable(false);
		mapPanel.setBackground(Color.WHITE);
		mapWindow.setVisible(true);
		mapPanel.setVisible(true);

	}
}