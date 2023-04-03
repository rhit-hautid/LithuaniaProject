import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MapWindow {
	
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
