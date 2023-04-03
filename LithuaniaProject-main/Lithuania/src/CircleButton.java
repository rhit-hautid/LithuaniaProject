import javax.swing.JButton;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.geom.Point2D;
import java.awt.FontMetrics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * 
 * CircleButton is a custom JButton that is circular in shape. The button
 * changes color when the mouse is over it or when it is pressed. This class
 * overrides methods such as paintComponent, contains, and getPreferredSize to
 * change the button's appearance and behavior. CircleButton is also designed to
 * handle mouse events such as mousePressed, mouseReleased, mouseExited, and
 * mouseMoved.
 */

public class CircleButton extends JButton {

	private boolean mouseOver = false;
	private boolean mousePressed = false;

	/**
	 * Constructs a CircleButton with specified text. Sets the button's opaque,
	 * focus painted, and border painted properties to false. Adds a MouseAdapter to
	 * handle mouse events.
	 *
	 * @param text the text that the button displays
	 */

	public CircleButton(String text) {
		super(text);
		setOpaque(false);
		setFocusPainted(false);
		setBorderPainted(false);

		MouseAdapter mouseListener = new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent me) {
				if (contains(me.getX(), me.getY())) {
					mousePressed = true;
					repaint();
				}
			}

			@Override
			public void mouseReleased(MouseEvent me) {
				mousePressed = false;
				repaint();
			}

			@Override
			public void mouseExited(MouseEvent me) {
				mouseOver = false;
				mousePressed = false;
				repaint();
			}

			@Override
			public void mouseMoved(MouseEvent me) {
				mouseOver = contains(me.getX(), me.getY());
				repaint();
			}
		};

		addMouseListener(mouseListener);
		addMouseMotionListener(mouseListener);
	}

	/**
	 * Returns the diameter of the button.
	 *
	 * @return the diameter of the button
	 */

	private int getDiameter() {
		int diameter = Math.min(getWidth(), getHeight());
		return diameter;
	}

	/**
	 * Returns the preferred size of the button.
	 *
	 * @return the preferred size of the button
	 */

	@Override
	public Dimension getPreferredSize() {
		FontMetrics metrics = getGraphics().getFontMetrics(getFont());
		int minDiameter = 10 + Math.max(metrics.stringWidth(getText()), metrics.getHeight());
		return new Dimension(minDiameter, minDiameter);
	}

	/**
	 * Returns whether the button contains the specified point.
	 *
	 * @param x the x-coordinate of the point
	 * @param y the y-coordinate of the point
	 * @return true if the button contains the specified point, false otherwise
	 */

	@Override
	public boolean contains(int x, int y) {
		int radius = getDiameter() / 2;
		return Point2D.distance(x, y, getWidth() / 2, getHeight() / 2) < radius;
	}

	/**
	 * Paints the button on the specified Graphics context. The button is filled
	 * with a color and is outlined with a circle. The text of the button is drawn
	 * in the center of the button.
	 *
	 * @param g the Graphics context to paint on
	 */
	
	@Override
	public void paintComponent(Graphics g) {

		int diameter = getDiameter();
		int radius = diameter / 2;

		if (mousePressed) {
			g.setColor(Color.LIGHT_GRAY);
		} else {
			g.setColor(Color.WHITE);
		}
		g.fillOval(getWidth() / 2 - radius, getHeight() / 2 - radius, diameter, diameter);

		if (mouseOver) {
			g.setColor(Color.BLUE);
		} else {
			g.setColor(Color.BLACK);
		}
		g.drawOval(getWidth() / 2 - radius, getHeight() / 2 - radius, diameter, diameter);

		g.setColor(Color.BLACK);
		g.setFont(getFont());
		FontMetrics metrics = g.getFontMetrics(getFont());
		int stringWidth = metrics.stringWidth(getText());
		int stringHeight = metrics.getHeight();
		g.drawString(getText(), getWidth() / 2 - stringWidth / 2, getHeight() / 2 + stringHeight / 4);
	}
}