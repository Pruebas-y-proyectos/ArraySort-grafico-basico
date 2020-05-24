package Sort;

import javax.swing.JFrame;

import Aplicacion.Delay;
import Aplicacion.SortArray;

public class Bubble {

	public static void bubbleSort(JFrame j, int[] n) {
		for (int i = 0; i < SortArray.NUM_BARS; i++) {
			for (int k = 0; k < SortArray.NUM_BARS - 1 - i; k++) {
				if (n[k] > n[k + 1]) {
					int temp = n[k];
					n[k] = n[k + 1];
					n[k + 1] = temp;
				}
				Delay.delay(1);
				j.repaint();
			}
		}
	}
}
