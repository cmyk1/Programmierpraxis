/**
 * @author Thomas Rieder
 * @matrikelnummer 1125403
 * @date 2012-01-19
 * @description 10. �bungsbeispiel
 * 
 */

public class CreateOperation implements Operation {

	private int x, y;
	private String charset;

	/**
	 * Standardkonstruktor f�r eine CreateOperation
	 * 
	 * @param x
	 *            Breite
	 * @param y
	 *            H�he
	 * @param charset
	 *            g�ltige Zeichen
	 */
	public CreateOperation(int x, int y, String charset) {
		this.x = x;
		this.y = y;
		this.charset = charset;
	}

	/**
	 * F�hrt die Create-Operation durch und gibt das erstelle AsciiBild zur�ck
	 * 
	 * @param img
	 *            wird ignoriert (Angabe)
	 * @return neu erzeugtes AsciiImage
	 */
	public AsciiImage execute(AsciiImage img) throws OperationException {
		return new AsciiImage(x, y, charset);
	}
}
