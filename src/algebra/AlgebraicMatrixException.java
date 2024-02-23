package algebra;

/**
 * Superclass AlgebraicMatrixException that represents a general exception that can
 * occur when operating with numeric matrices.
 */
public class AlgebraicMatrixException extends collections2d.MatrixException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7308678653296119010L;

	public AlgebraicMatrixException() {
		super();
	}

	public AlgebraicMatrixException(String msg) {
		super(msg);
	}

}
