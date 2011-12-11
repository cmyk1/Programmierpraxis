/**
 * @author Thomas Rieder
 * @matrikelnummer 1125403
 * @date 2011-12-11
 * @description L�sung f�r das 7. �bungsbeispiel 
 *              
 */

@SuppressWarnings("serial")
public class OperationException extends Exception {
	/**
	 * Standardkonstruktor
	 */
	public OperationException() {
		super();
	}
	
	/**
	 * Standardkonstruktor mit einer Nachricht
	 * @param message Nachricht
	 */
	public OperationException(String message) {
		super(message);
	}
}
