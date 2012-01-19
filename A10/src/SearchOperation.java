import java.util.Iterator;

/**
 * @author Thomas Rieder
 * @matrikelnummer 1125403
 * @date 2012-01-19
 * @description 10. �bungsbeispiel
 * 
 */

public class SearchOperation implements Operation {
	// Bilderspeicher
	private MetricSet<AsciiImage> saved;

	// Metrik
	private Metric<AsciiImage> m;

	/**
	 * Standardkonstruktor der den Bildspeicher und die zu verwendende Metrik
	 * �bergeben bekommt
	 * 
	 * @param saved
	 *            Bilderspeicher
	 * @param m
	 *            Metrik
	 */
	public SearchOperation(MetricSet<AsciiImage> saved, Metric<AsciiImage> m) {
		this.saved = saved;
		this.m = m;
	}

	/**
	 * Durchsucht den Bilderspeicher mittels der Metrik und liefert das Ergebnis
	 * zur�ck (bei mehreren Ergebnissen wird nur ein Bild zur�ckgegeben)
	 * 
	 * @param img
	 *            Bild mit dem gesucht wird
	 * @return Resultat der Suche
	 */
	public AsciiImage execute(AsciiImage img) throws OperationException {
		MetricSet<AsciiImage> set = saved.search(img, m);
		Iterator<AsciiImage> it = set.iterator();
		AsciiImage ret;

		// es soll immer nur ein Element zur�ckgegeben werden
		if (it.hasNext()) {
			ret = new AsciiImage(it.next());
		} else {
			throw new OperationException();
		}

		return ret;
	}
}
