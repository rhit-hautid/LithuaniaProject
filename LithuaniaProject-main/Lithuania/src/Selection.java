import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Insets;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;


/*
 * @author Sebastien Hughes
 */
public class Selection extends Abstract_DataDisplay{
	
	public static final Dimension FIRST_SCREEN_SIZE = new Dimension(1500, 830);
	
	ArrayList<ImageButton> List_Button = new ArrayList<ImageButton>();
	
	
	Color myBlue = new Color(231, 248, 252); // Color blue
	JFrame frame_Selection;
	JPanel panel_Selection;
			
	public Selection() {
		
		this.frame_Selection = new JFrame("Selection Screen");
		this.panel_Selection = new JPanel();
		
		panel_Selection.setLayout(null);
		
		frame_Selection.setSize(FIRST_SCREEN_SIZE);
		frame_Selection.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame_Selection.add(panel_Selection, BorderLayout.CENTER);
		
		panel_Selection.setBackground(myBlue);
		panel_Selection.setSize(FIRST_SCREEN_SIZE);
		
		AddSearches();
		CreateImageButtons();
		dis_Image();
		dis_Caption();
		
		
		frame_Selection.setVisible(true);
		
	}
	
	public void AddSearches() {
		//If statement for proximaty to current location to determine relevant number of image buttons
		for (int i = 0; i < 6; i++) {	
			
		System.out.println("Gimme Doz Image" + (i+1));
		
		}
	}

	public void CreateImageButtons() {
		//If statement for proximaty to current location to determine relevant number of image buttons
		for (int i = 0; i < 6; i++) {	
			
		System.out.println("Creating Image Button" + i);
		List_Button.add(new ImageButton(frame_Selection, panel_Selection,"Lithuania/src/Images/TrakaiCastle.PNG"));
		
		}
	}

	@Override
	void dis_Image() {
		Insets insets = panel_Selection.getInsets();
		//If statement for proximaty to current location to determine relevant number of image buttons
		for (int i = 0; i <List_Button.size(); i++) {
			Dimension sizeTwo = List_Button.get(i).Button.getPreferredSize();
			System.out.println(sizeTwo);
			System.out.println("Placing Image Button " + (i+1));
			if(i >= 3) {
				List_Button.get(i).Button.setBounds(100 + (470*(i-3)) + insets.left, 405 + insets.bottom, sizeTwo.width, sizeTwo.height);
				panel_Selection.add(List_Button.get(i).Button);
				
			} else {
				List_Button.get(i).Button.setBounds(100 + (470*i) + insets.left, 20 + insets.bottom, sizeTwo.width, sizeTwo.height);
				panel_Selection.add(List_Button.get(i).Button);
			}
		}
	}

	@Override
	void dis_Caption() {
		for (int i = 0; i < 6; i++) {	
			
			System.out.println("Creating Image Button" + i);
			panel_Selection.add(new JLabel("Gimme the Juice"));
			
			}
	}

	@Override
	void dis_HighPrio() {
		// TODO Auto-generated method stub
		
	}
	
	
		
}
