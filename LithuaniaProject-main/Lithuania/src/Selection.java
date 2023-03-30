import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Selection {
	
	public static final Dimension FIRST_SCREEN_SIZE = new Dimension(1500, 1000);
	
	ArrayList<ImageButton> List_Button = new ArrayList<ImageButton>();
	
	Color myBlue = new Color(231, 248, 252); // Color blue
	JFrame frame_Selection;
	JPanel panel_Selection;
			
	public Selection() {
		
		this.frame_Selection = new JFrame("frameSelection");
		this.panel_Selection = new JPanel();
		
		frame_Selection.setSize(FIRST_SCREEN_SIZE);
		frame_Selection.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame_Selection.add(panel_Selection, BorderLayout.CENTER);
		
		panel_Selection.setBackground(myBlue);
		panel_Selection.setSize(FIRST_SCREEN_SIZE);
		
		CreateImageButtons();
		PlaceImageButtons();
		
		
		frame_Selection.setVisible(true);
		
	}

	public void CreateImageButtons() {
		//If statement for proximaty to current location to determine relevant number of image buttons
		for (int i = 0; i < 6; i++) {	
			
		System.out.println("Creating Image Button" + i);
		List_Button.add(new ImageButton(frame_Selection, panel_Selection));
		
		}
	}
	
	public void PlaceImageButtons() {
		//If statement for proximaty to current location to determine relevant number of image buttons
		for (int i = 0; i <List_Button.size(); i++) {
			System.out.println("Placing Image Button " + i);
			panel_Selection.add(List_Button.get(i).Button);
		}
		
	}
	
	
		
}
