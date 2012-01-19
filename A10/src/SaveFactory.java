import java.util.Scanner;

/**
 * @author Thomas Rieder
 * @matrikelnummer 1125403
 * @date 2012-01-19
 * @description 10. �bungsbeispiel
 * 
 */

public class SaveFactory implements Factory {
	// Bilderspeicher
	private MetricSet<AsciiImage> saved;

	/**
	 * Standardkonstruktur der den Bilderspeicher �bergeben bekommt
	 * 
	 * @param saved
	 *            Bilderspeicher
	 */
	public SaveFactory(MetricSet<AsciiImage> saved) {
		this.saved = saved;
	}

	/**
	 * Erzeugt eine neue SaveOperation
	 * 
	 * @param scanner
	 *            unben�tzt
	 * @return parametrisierte SaveOperation
	 */
	public Operation create(Scanner scanner) throws FactoryException {
		return new SaveOperation(saved);
	}
}
