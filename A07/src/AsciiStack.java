/**
 * @author Thomas Rieder
 * @matrikelnummer 1125403
 * @date 2011-12-11
 * @description L�sung f�r das 7. �bungsbeispiel 
 *              
 */

public class AsciiStack {
	private AsciiStackNode head;

	/**
	 * Konstruktur f�r den stack
	 * 
	 * @param increment
	 *            Gr��e des Stacks; Schritte in denen der Stack
	 *            vergr��ert/verkleinert wird
	 */
	public AsciiStack() {
		this.head = null;
	}


	/**
	 * @return true falls der Stack leer ist
	 */
	public boolean empty() {
		return head == null;
	}

	/**
	 * Entfernt das oberste Element vom Stack
	 * 
	 * @return das oberste Element des Stacks
	 */
	public AsciiImage pop() {
		if(head == null) {
			return null;
		} else {
			AsciiImage ret = head.getImage();
			head = head.getNext();
			return ret;
		}
	}

	/**
	 * Gibt das oberste Element zur�ck ohne es zu entfernen
	 * 
	 * @return das oberste Element des Stacks
	 */
	public AsciiImage peek() {
		return head == null ? null : head.getImage();
	}

	/**
	 * F�gt dem Stack ein Element hinzu
	 * 
	 * @param img
	 *            Element das dem Stack hinzugef�gt wird
	 */
	public void push(AsciiImage img) {
		head = new AsciiStackNode(img, head);
	}

	/**
	 * Liefert die Anzahl der Element im Stack zur�ck
	 * 
	 * @return Anzahl der Elemente im Stack
	 */
	public int size() {
		return head == null ? 0 : head.size();
	}
}
