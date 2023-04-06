import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DataScreen extends Abstract_DataDisplay {
	
	public static final Dimension FIRST_SCREEN_SIZE = new Dimension(1500, 830);
	
	Color myBlue = new Color(231, 248, 252); // Color blue
	JFrame frame_DataScreen;
	JPanel panel_DataScreen;
	
	
	public DataScreen() {
		this.frame_DataScreen = new JFrame("frameDataScreen");
		this.panel_DataScreen = new JPanel();
		
		panel_DataScreen.setLayout(null);
		
		frame_DataScreen.setSize(FIRST_SCREEN_SIZE);
		frame_DataScreen.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame_DataScreen.add(panel_DataScreen, BorderLayout.CENTER);
		
		panel_DataScreen.setBackground(myBlue);
		panel_DataScreen.setSize(FIRST_SCREEN_SIZE);
		
		frame_DataScreen.setVisible(true);

	}


	@Override
	void dis_Image() {
		
		
	}


	@Override
	void dis_Caption() {
		// TODO Auto-generated method stub
		
	}


	@Override
	void dis_HighPrio() {
		// TODO Auto-generated method stub
		
	}
}
