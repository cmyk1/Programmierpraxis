import java.util.Scanner;

/**
 * @author Thomas Rieder
 * @matrikelnummer 1125403
 * @date 2011-12-16
 * @description 9. �bungsbeispiel
 * 
 */

public interface Factory {
	/**
	 * Create Methode f�r alle Factories
	 * 
	 * @param scanner
	 *            Scanner von dem gelesen wird
	 * @return jeweilige Operation
	 * @throws FactoryException
	 *             wird bei einem Eingabefehler geworfen
	 */
	public Operation create(Scanner scanner) throws FactoryException;
}
