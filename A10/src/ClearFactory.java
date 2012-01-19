import java.util.Scanner;

/**
 * @author Thomas Rieder
 * @matrikelnummer 1125403
 * @date 2012-01-19
 * @description 10. �bungsbeispiel
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
