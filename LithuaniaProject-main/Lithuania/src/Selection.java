import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;

/*
 * @author Sebastien Hughes and Isabel Haut
 */
public class Selection extends Abstract_DataDisplay {

	public static final Dimension FIRST_SCREEN_SIZE = new Dimension(1500, 830);

	ArrayList<ImageButton> List_Button = new ArrayList<ImageButton>();
	ArrayList<JLabel> myLabel = new ArrayList<JLabel>();

	Color myBlue = new Color(245, 224, 143);
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
		CreateLabels();
		dis_Caption();

		frame_Selection.setVisible(true);
		frame_Selection.repaint();
		frame_Selection.revalidate();

	}

	public void AddSearches() {
		// If statement for proximaty to current location to determine relevant number
		// of image buttons
		for (int i = 0; i < 6; i++) {

			System.out.println("Gimme Doz Image" + (i + 1));

		}
	}

	public void CreateImageButtons() {
		// If statement for proximaty to current location to determine relevant number
		// of image buttons
		for (int i = 0; i < 6; i++) {

			System.out.println("Creating Image Button" + i);
			List_Button.add(new ImageButton("Lithuania/src/Images/TrakaiCastle.PNG"));

		}
	}

	public void CreateLabels() {
		// If statement for proximaty to current location to determine relevant number
		// of image buttons
		for (int i = 0; i < 6; i++) {
			// System.out.println("Creating Label " + i);
			JLabel label = new JLabel("" + i);

			myLabel.add(label);

		}
	}

	@Override
	void dis_Image() {
		Insets insets = panel_Selection.getInsets();
		// If statement for proximaty to current location to determine relevant number
		// of image buttons
		for (int i = 0; i < List_Button.size(); i++) {
			Dimension sizeTwo = List_Button.get(i).Button.getPreferredSize();
			System.out.println(sizeTwo);
			System.out.println("Placing Image Button " + (i + 1));
			if (i >= 3) {
				List_Button.get(i).Button.setBounds(100 + (470 * (i - 3)) + insets.left, 405 + insets.bottom,
						sizeTwo.width, sizeTwo.height);
				panel_Selection.add(List_Button.get(i).Button);

			} else {
				List_Button.get(i).Button.setBounds(100 + (470 * i) + insets.left, 20 + insets.bottom, sizeTwo.width,
						sizeTwo.height);
				panel_Selection.add(List_Button.get(i).Button);
			}
		}
	}

	@Override
	void dis_Caption() {
		Insets insets = panel_Selection.getInsets();

		for (int i = 0; i < myLabel.size(); i++) {
			System.out.println("Creating Label" + i);
			myLabel.get(i).setVisible(true);

			myLabel.get(i).setPreferredSize(new Dimension(100, 50));
			Dimension sizeThree = myLabel.get(i).getPreferredSize();
			myLabel.get(i).setFont(new Font("American Typewriter", Font.BOLD, 25));

			myLabel.get(i).setText("Label " + (i + 1));
			if (i >= 3) {
				myLabel.get(i).setBounds(225 + (470 * (i - 3)) + insets.left, 685 + insets.bottom + sizeThree.height,
						sizeThree.width, sizeThree.height);

			} else {
				myLabel.get(i).setBounds(225 + (470 * i) + insets.left, 345 + insets.bottom, sizeThree.width,
						sizeThree.height);
			}
			panel_Selection.add(myLabel.get(i));
			myLabel.get(i).setVisible(true);
		}
	}

	@Override
	void dis_HighPrio() {
		// TODO Auto-generated method stub

	}

}
