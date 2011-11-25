/**
 * @author Thomas Rieder
 * @matrikelnummer 1125403
 * @date 2011-11-25
 * @description L�sung f�r das 6. �bungsbeispiel (AsciiShop #5)
 *              AsciiStack-Klasse
 */

public class AsciiStack {
	// Stack
	private AsciiImage[] stack;

	// Schritte in denen der Stack vergr��ert/verkleinert wird
	private int increment;

	// Arrayindex des obersten Elements
	private int topElement = -1;

	/**
	 * Konstruktur f�r den stack
	 * 
	 * @param increment
	 *            Gr��e des Stacks; Schritte in denen der Stack
	 *            vergr��ert/verkleinert wird
	 */
	public AsciiStack(int increment) {
		stack = new AsciiImage[increment];
		this.increment = increment;
	}

	/**
	 * Gibt die Gr��e des Stacks zur�ck
	 * 
	 * @return Gr��e des Stacks
	 */
	public int capacity() {
		return stack.length;
	}

	/**
	 * @return true falls der Stack leer ist
	 */
	public boolean empty() {
		return topElement == -1;
	}

	/**
	 * Entfernt das oberste Element vom Stack
	 * 
	 * @return das oberste Element des Stacks
	 */
	public AsciiImage pop() {
		if (topElement == -1) {
			// Stack ist leer
			return null;
		} else if (topElement < (capacity() - increment) && capacity() != increment) {
			// Stack muss verkleinert werden
			AsciiImage ret = new AsciiImage(stack[topElement]);
			AsciiImage[] stackminus = new AsciiImage[capacity() - increment];
			for (int i = 0; i < stackminus.length; i++) {
				stackminus[i] = new AsciiImage(stack[i]);
			}
			topElement--;
			stack = stackminus;
			return ret;
		} else {
			// normaler pop
			AsciiImage ret = new AsciiImage(stack[topElement]);
			stack[topElement] = null;
			topElement--;
			return ret;
		}
	}

	/**
	 * Gibt das oberste Element zur�ck ohne es zu entfernen
	 * 
	 * @return das oberste Element des Stacks
	 */
	public AsciiImage peek() {
		return topElement == -1 ? null : stack[topElement];
	}

	/**
	 * F�gt dem Stack ein Element hinzu
	 * 
	 * @param img
	 *            Element das dem Stack hinzugef�gt wird
	 */
	public void push(AsciiImage img) {
		if (topElement == -1) {
			// Stack bekommt sein 1. Element
			stack[0] = new AsciiImage(img);
			topElement = 0;
		} else if (capacity() - 1 == topElement) {
			// Stack muss vergr��ert werden
			AsciiImage[] stackplus = new AsciiImage[capacity() + increment];
			for (int i = 0; i < stack.length; i++) {
				stackplus[i] = new AsciiImage(stack[i]);
			}
			stackplus[topElement + 1] = new AsciiImage(img);
			stack = stackplus;
			topElement++;
		} else {
			// normaler push
			stack[topElement + 1] = new AsciiImage(img);
			topElement++;
		}
	}

	/**
	 * Liefert die Anzahl der Element im Stack zur�ck
	 * 
	 * @return Anzahl der Elemente im Stack
	 */
	public int size() {
		return topElement < 0 ? 0 : topElement + 1;
	}
}
