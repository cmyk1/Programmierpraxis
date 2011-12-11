import java.util.Scanner;

/**
 * @author Thomas Rieder
 * @matrikelnummer 1125403
 * @date 2011-12-11
 * @description 8. �bungsbeispiel
 *   
 */

public class FilterFactory implements Factory {
	/**
	 * Standardkonstruktor
	 */
	public FilterFactory() { }
	
	/**
	 * liest die Parameter f�r die Filteroperationen ein und gibt die jeweilige Operation zur�ck
	 * @return jeweilige Filteroperation (derzeit nur median)
	 */
	public Operation create(Scanner scanner) throws FactoryException {
		String filter = null;
		Operation ret = null;
		
		if(scanner.hasNext()) {
			filter = scanner.next();
			if(filter.equals("median")) {
				ret = new MedianOperation();
			} else {
				throw new FactoryException("wrong parameters");
			}
		} else {
			throw new FactoryException("wrong parameters");
		}
		
		return ret;
		
	}
}
