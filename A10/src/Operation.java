/**
 * @author Thomas Rieder
 * @matrikelnummer 1125403
 * @date 2012-01-19
 * @description 10. �bungsbeispiel
 * 
 */

public interface Operation {

	/**
	 * Executes this Operation and returns the result as new AsciiImage. The
	 * passed AsciiImage is not modified by this method. If there are arguments
	 * required, they need to be passed via the constructor.
	 * 
	 * @param img
	 *            The AsciiImage to use as basis for executing the Operation, it
	 *            will remain unchanged
	 * @return A new AsciiImage reflecting the result of the executed Operation
	 * @throws OperationException
	 *             Thrown if a problem occurs, while executing the Operation
	 */
	AsciiImage execute(AsciiImage img) throws OperationException;

}
