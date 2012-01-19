/**
 * @author Thomas Rieder
 * @matrikelnummer 1125403
 * @date 2012-01-19
 * @description 10. �bungsbeispiel
 * 
 */

public class CircularBlockGenerator extends BlockGenerator {
	/**
	 * Standardkonstruktor
	 * 
	 * @param size
	 *            Gr��e des Feldes
	 */
	public CircularBlockGenerator(int size) {
		super(size); // me
	}

	/**
	 * Standardkonstruktor
	 */
	public CircularBlockGenerator() {
		super();
	}

	/**
	 * Wendet das "Circular"-Verfahren an und gibt den neuen Wert des Punktes
	 * x/y zur�ck
	 * 
	 * @param img
	 *            Ascii-Bild auf das das Verfahren angewendet wird
	 * @param x
	 *            x-Koordinate
	 * @param y
	 *            y-Koordinate
	 * @return neuer Wert des Pixel nach dem "Circular"-Verfahren
	 */
	public int getPixel(AsciiImage img, int x, int y) {
		String charset = img.getCharset();
		int ret;

		// G�ltigkeitspr�fung
		if (x >= 0 && x < img.getWidth() && y >= 0 && y < img.getHeight()) {
			ret = charset.indexOf(img.getPixel(x, y));
		} else {
			// x/y + img.getWidth() f�r x, y < 0
			ret = charset.indexOf(img.getPixel(
					(x + img.getWidth()) % img.getWidth(),
					(y + img.getHeight()) % img.getHeight()));
		}

		return ret;
	}
}
