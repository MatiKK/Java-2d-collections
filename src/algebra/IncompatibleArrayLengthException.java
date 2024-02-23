package algebra;

/**
 * Thrown when attempting to perform a array operation on 
 * array with different lengths, when their length is required
 * to be the same (vector addition, vector subtraction, dot product, etc).
*/
public class IncompatibleArrayLengthException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6669018978829134976L;

	public IncompatibleArrayLengthException() {
		super();
	}

	public IncompatibleArrayLengthException(String msg) {
		super(msg);
	}

	public IncompatibleArrayLengthException(int size1, int size2) {
		super(differentSize(size1, size2));
	}

	private static String differentSize(int a, int b) {
		return "Unsupported operation for vectors of different lengths "+a+" and "+b;
	}

}
