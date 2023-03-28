import javax.swing.JFrame;
import javax.swing.JPanel;

public abstract class Selection extends HomePage {
	
	JFrame HomePageFrame;
	JPanel panel3;
	
	public JFrame f = new JFrame("Selection Page");

	public Selection(JFrame mainFrame, JPanel mainPanel) {
		super(mainFrame, mainPanel);
		this.HomePageFrame = mainFrame;
		this.panel3 = mainPanel;
	}
	
	
	
	
}
