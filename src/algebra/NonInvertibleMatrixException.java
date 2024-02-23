package algebra;

/**
 * Thrown when an attempt is made to invert a matrix that is 
 * non-invertible. This typically occurs when the matrix has a 
 * determinant of zero.
*/
public class NonInvertibleMatrixException extends collections2d.MatrixException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1367368547523422969L;

	public NonInvertibleMatrixException() {
		super();
	}

	public NonInvertibleMatrixException(String msg) {
		super(msg);
	}

}
