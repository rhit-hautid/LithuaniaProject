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

public class MapWindow  {
	
	//Instantiated components 
	JFrame mapWindow;
	JPanel mapPanel;
	
	public MapWindow() {
	
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
}
