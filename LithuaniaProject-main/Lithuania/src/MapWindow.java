import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * @author Isabel Haut
 */

public class MapWindow {

	// Instantiated components
	public HashMap<String, ArrayList<Integer>> LocationMap = new HashMap<String, ArrayList<Integer>>();

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
		
		int[][] castleButtonCoordinates = { 
				{ 75, 220 }, // Klaipeda Castle button coordinates
				{ 270, 338 }, // Panemune Castle button coordinates
				{ 299, 338 }, // Raudone Castle button coordinates
				{ 385, 375 }, // Raundovaris Castle button coordinates
				{ 430, 435 }, // Kaunas Castle button coordinates
				{ 498, 103 }, // Birzai Castle button coordinates
				{ 485, 315 }, // Siesikai Castle button coordinates
				{ 604, 460 }, // Medininkai Castle button coordinates
				{ 615, 525 }, // Norviliskes Castle button coordinates
				{ 515, 455 }, // Trakai Castle button coordinates
		};
		//System.out.println("hello" + buttonCoordinates[1][1]);
		String[] cityNames = { "Klaipedos", "Telsiai", "Taurages", "Saiauliai", "Panevezio", "Kauno", "Utenos",
				"Vilniaus", "Alytaus", "Marijampoles" };
		
		
		String[] castleNames = { "Klaipeda", "Panemune", "Raudone", "Raundovaris", "Kaunas", "Birzai", "Siesikai",
				"Medininkai", "Norviliskes", "Trakai" };
		
	    // Calculate and print the distance between each castle and each city
	    for (int i = 0; i < buttonCoordinates.length; i++) {
	        for (int j = 0; j < castleButtonCoordinates.length; j++) {
	            int x1 = buttonCoordinates[i][0];
	            int y1 = buttonCoordinates[i][1];
	            int x2 = castleButtonCoordinates[j][0];
	            int y2 = castleButtonCoordinates[j][1];
	            
	            double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	            
	            System.out.println("Distance between " + (cityNames[i]) + " and " + (castleNames[i]) + " is " + distance + " pixels");
	        }
	    }
	
		for (int i = 0; i < 10; i++) {
			
			ArrayList<Integer> new_ArrayList = new ArrayList<Integer>();
			
			new_ArrayList.add(buttonCoordinates[i][0]);
			new_ArrayList.add(buttonCoordinates[i][1]);
			
			
			//System.out.println(buttonCoordinates[i][0] +" "+ buttonCoordinates[i][1]);
			//System.out.println("Array List " + new_ArrayList);

			LocationMap.put(cityNames[i], new_ArrayList);
			
			//new_ArrayList.clear();
		}
		
		// adds 10 of my circle buttons to the window
		for (int i = 0; i < 10; i++) {
			circleButton[i] = new CircleButton(null);
			circleButton[i].setBounds(buttonCoordinates[i][0], buttonCoordinates[i][1], 20, 20);
			mapPanel.add(circleButton[i]);
			circleButton[i].repaint();
			circleButton[i].setName(cityNames[i]);
			circleButton[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					for(int i = 0; i < cityNames.length; i++) {
						if (e.getSource().toString().contains(cityNames[i])) {
							label.setText(" City: " + cityNames[i]);
						}
					}
				}
			});
		}


		// adds 10 of my circle buttons to the window for the castles
		for (int i = 0; i < 10; i++) {
			circleButton[i] = new CircleButton(null);
			circleButton[i].setBounds(castleButtonCoordinates[i][0], castleButtonCoordinates[i][1], 10, 10);
			mapPanel.add(circleButton[i]);
			circleButton[i].repaint();
			circleButton[i].setName(cityNames[i]);
			circleButton[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					for(int i = 0; i < cityNames.length; i++) {
						if (e.getSource().toString().contains(cityNames[i])) {
							label.setText(" City: " + cityNames[i]);
						}
					}
				}
			});
		}

		// adds 10 of my circle buttons to the window
		for (int i = 0; i < 10; i++) {
			circleButton[i] = new CircleButton(null);
			circleButton[i].setBounds(buttonCoordinates[i][0], buttonCoordinates[i][1], 20, 20);
			mapPanel.add(circleButton[i]);
			circleButton[i].repaint();
			circleButton[i].setName(cityNames[i]);
			circleButton[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					for(int i = 0; i < cityNames.length; i++) {
						if (e.getSource().toString().contains(cityNames[i])) {
							label.setText(" City: " + cityNames[i]);
						}
					}
				}
			});
		}
		// add image of map to the panel
		ImageIcon myMap = new ImageIcon("Lithuania/src/Images/LithuanianMap.PNG");
		JLabel jlPic = new JLabel(myMap);
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
	public JLabel getLabel() {
		return label;
	}
	public void setLabel(JLabel label) {
		this.label = label;
	}
	public HashMap<String, ArrayList<Integer>> getLocationMap() {
		return LocationMap;
	}
}