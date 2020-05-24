package Aplicacion;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

// TODO: Auto-generated Javadoc
/**
 * The Class SortArray.
 */
public class SortArray extends JPanel {

	private static final long serialVersionUID = 1L;
	public static int[] n;
	public final static int WIN_WIDTH = 1280;
	public final static int WIN_HEIGHT = 720;
	public final static int BAR_WIDTH = 5;
	public final static int NUM_BARS = WIN_WIDTH / BAR_WIDTH;

	/**
	 * Constructor de iniciar el array con numeros ordenados.
	 */
	public SortArray() {
		n = new int[NUM_BARS];
		for (int i = 0; i < NUM_BARS; i++) {
			n[i] = i;
		}
		setBackground(Color.DARK_GRAY);
	}

	/**
	 * Desordena un Array.
	 *
	 * @param j el JFrame principal
	 */
	public void shuffleArray(JFrame j) {
		Random rng = new Random();
		for (int i = 0; i < NUM_BARS; i++) {
			int swapWidthIndex = rng.nextInt(NUM_BARS - 1);
			int temp = n[i];
			n[i] = n[swapWidthIndex];
			n[swapWidthIndex] = temp;
			Delay.delay(3);
			j.repaint();
		}
	}

	/**
	 * Pinta los componentes.
	 *
	 * @param g the g
	 */
	@Override
	public void paintComponent(Graphics g) {
		Graphics2D graphics = (Graphics2D) g;
		super.paintComponent(graphics);
		graphics.setColor(Color.WHITE);
		for (int i = 0; i < NUM_BARS; i++) {
			int height = n[i] * 2;
			int xBegin = i + (BAR_WIDTH - 1) * i;
			int yBegin = WIN_HEIGHT - height;
			graphics.fillRect(xBegin, yBegin, BAR_WIDTH, height);
		}
	}

	/**
	 * Gets the preferred size.
	 *
	 * @return the preferred size
	 */
	@Override
	public Dimension getPreferredSize() {
		return new Dimension(WIN_WIDTH, WIN_HEIGHT);
	}
}
