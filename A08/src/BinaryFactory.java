import java.util.Scanner;

/**
 * @author Thomas Rieder
 * @matrikelnummer 1125403
 * @date 2011-12-11
 * @description 8. �bungsbeispiel
 *   
 */

public class BinaryFactory implements Factory {
	/**
	 * Standardkonstruktor
	 */
	public BinaryFactory() { }
	
	/**
	 * Liest die Parameter f�r eine BinaryOperation ein und gibt diese zur�ck
	 * @return BinaryOperation mit den eingelesenen Parametern
	 */
	public Operation create(Scanner scanner) throws FactoryException {
		String s = null;
		
		if(scanner.hasNext()) {
			s = scanner.next();
			if(s.length() > 1) {
				throw new FactoryException();
			}
		} else {
			throw new FactoryException();
		}
		
		
		return new BinaryOperation(s.charAt(0));
	}
}
