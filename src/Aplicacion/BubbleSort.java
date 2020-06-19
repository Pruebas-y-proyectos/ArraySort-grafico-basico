
/**
* 
* @author Javier Delgado Rodriguez
*/
package Aplicacion;

import javax.swing.JFrame;

public class BubbleSort {

	public BubbleSort(JFrame jframe, SortArray sa) {
		boolean needNextPass = true;
		for (int i = 0; i < sa.NUM_BARS && needNextPass; i++) {
			needNextPass = false;
			for (int j = 0; j < sa.NUM_BARS - 1 - i; j++) {
				if (sa.n[j] > sa.n[j + 1]) {
					int temp = sa.n[j];
					sa.n[j] = sa.n[j + 1];
					sa.n[j + 1] = temp;
					needNextPass = true;
				}
				sa.barraMayorCiclo = j + 1; // pinta la barra en ordenacion
				Delay.delay(50);
				jframe.repaint();
			}
		}
		sa.barraMayorCiclo = -1;// evita que pinte barras al final del sort
	}
}
