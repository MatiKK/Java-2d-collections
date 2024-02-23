package collections2d;

/**
 * Superclass MatrixException that represents a general exception that can
 * occur when operating with matrices.
 */
public abstract class MatrixException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9131152397251624504L;

	public MatrixException() {
		super();
	}

	public MatrixException(String msg) {
		super(msg);
	}
}