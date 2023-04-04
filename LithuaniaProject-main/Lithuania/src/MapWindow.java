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
				{ 105, 250 }, // first button coordinates
				{ 180, 180 }, // second button coordinates
				{ 140, 140 }, // third button coordinates
				{ 160, 160 }, // fourth button coordinates
				{ 180, 180 }, // fifth button coordinates
				{ 200, 200 }, // sixth button coordinates
				{ 220, 220 }, // seventh button coordinates
				{ 240, 240 }, // eighth button coordinates
				{ 260, 260 }, // ninth button coordinates
				{ 280, 280 }, // tenth button coordinates
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
