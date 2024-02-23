package algebra;

/**
 * Thrown when an operation requiring a square matrix is performed 
 * on a matrix that is not square.
*/
public class NonSquareMatrixException extends collections2d.MatrixException {

	/**
	 *
	 */
	private static final long serialVersionUID = 4981377443385723044L;

	public NonSquareMatrixException() {
		super();
	}

	public NonSquareMatrixException(String msg) {
		super(msg);
	}

	public NonSquareMatrixException(int rowSize, int columnSize) {
		super(messageDifferentDimensions(rowSize,columnSize));
	}

	private static String messageDifferentDimensions(int r, int c) {
		return "Matrix " + r + "x" + c + " was given";
	}
}
