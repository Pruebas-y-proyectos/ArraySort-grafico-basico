
/**
* 
* @author Javier Delgado Rodriguez
*/
package Aplicacion;

import javax.swing.JFrame;

public class MainAplicacion {

	private JFrame frame;
	private SortArray sortArray = new SortArray();
	public BubbleSort bubble;

	// Metodo main.
	public static void main(String[] args) {
		MainAplicacion visualizador = new MainAplicacion();
		visualizador.frame.setVisible(true);
	}

	/**
	 * Instancia un nuevo MainAplicacion().
	 */
	public MainAplicacion() {
		initialize();

		sortArray = new SortArray();
		frame.add(sortArray);
		sortArray.repaint();

		frame.pack();
		frame.setVisible(true);

		Delay.delay(2000);
		sortArray.shuffleArray(frame);
		Delay.delay(2000);
		bubble = new BubbleSort(frame, sortArray);

	}

	/**
	 * Elementos iniciados en el JFrame.
	 */
	private void initialize() {
		frame = new JFrame("Visualizador del metodo Bubble Sort");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
	}
}
