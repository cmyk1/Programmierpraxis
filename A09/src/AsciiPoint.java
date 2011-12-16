/**
 * @author Thomas Rieder
 * @matrikelnummer 1125403
 * @date 2011-12-16
 * @description 9. �bungsbeispiel
 * 
 */

public class AsciiPoint {
	// x und y Koordinate
	private final int x;
	private final int y;

	/**
	 * Konstruktor
	 * 
	 * @param x
	 *            x-Koordinate
	 * @param y
	 *            y-Koordinate
	 */
	public AsciiPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * Liefert die x-Koordinate zur�ck
	 * 
	 * @return x-Koordinate
	 */
	public int getX() {
		return x;
	}

	/**
	 * Liefert die y-Koordinate zur�ck
	 * 
	 * @return y-Koordinate
	 */
	public int getY() {
		return y;
	}

	/**
	 * �berladene toString-Methode
	 */
	public String toString() {
		return "(" + x + "," + y + ")";
	}
}
