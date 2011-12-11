/**
 * @author Thomas Rieder
 * @matrikelnummer 1125403
 * @date 2011-12-11
 * @description L�sung f�r das 7. �bungsbeispiel 
 *              
 */

public class ClearOperation implements Operation {
	
	/**
	 * Standardkonstruktor
	 */
	public ClearOperation() { }
	
	/**
	 *  L�scht das gesamte Bild mit der Hintergrundfarbe
	 *  @return gel�schtes Bild
	 */
	public AsciiImage execute(AsciiImage img) throws OperationException {
		char replacement = img.getCharset().charAt(img.getCharset().length() - 1);
		AsciiImage ret = new AsciiImage(img);
		
		for (int i = 0; i < img.getWidth(); i++) {
			for (int j = 0; j < img.getHeight(); j++) {
				ret.setPixel(i, j, replacement);
			}
		}
		
		return ret;
	}
}
