package Aplicacion;

import javax.swing.JFrame;

import Sort.Bubble;

public class Visualizador {

	private static JFrame frame;
	private SortArray sortArray;
	static Visualizador visualizador;

	public Visualizador() {
		frame = new JFrame("Visualizador del metodo BubbleSort");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);

		sortArray = new SortArray();
		frame.add(sortArray);
		sortArray.repaint();

		frame.pack();
		frame.setVisible(true);

		Delay.delay(2000);
		sortArray.shuffleArray(frame);
		Delay.delay(2000);
		Bubble.bubbleSort(frame, SortArray.n);

	}

	public static void main(String[] args) {
		visualizador = new Visualizador();
	}
}
