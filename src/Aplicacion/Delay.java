/**
* 
* @author Javier Delgado Rodriguez
*/
package Aplicacion;

public class Delay {

	/**
	 * Delay aplicado en milisegundos
	 *
	 * @param n El tiempo de retardo en milisegundos
	 */
	public static void delay(int n) {
		try {
			Thread.sleep(n);
		} catch (InterruptedException e) {
		}
	}
}
