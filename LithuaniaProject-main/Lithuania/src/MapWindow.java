import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
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
	CircleButton[] circleButton = new CircleButton[10];

	public MapWindow() {

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

		// adds 10 of my circle buttons to the window
		for (int i = 0; i < 10; i++) {
			circleButton[i] = new CircleButton(null);
			circleButton[i].setBounds(buttonCoordinates[i][0], buttonCoordinates[i][1], 20, 20);
			mapPanel.add(circleButton[i]);
			System.out.println(circleButton);
			circleButton[i].repaint();
		}

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
		mapPanel.setVisible(true);

	}

}
