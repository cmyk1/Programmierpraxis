import java.util.Scanner;

/**
 * @author Thomas Rieder
 * @matrikelnummer 1125403
 * @date 2011-12-16
 * @description 9. �bungsbeispiel
 *   
 */

public class ClearFactory implements Factory {
	/**
	 * Standardkonstruktor
	 */
	public ClearFactory() {	}
	
	/**
	 * Gibt die ClearOperation zum L�schen des Bildes zur�ck
	 */
	public Operation create(Scanner scanner) {
		return new ClearOperation();
	}
}
