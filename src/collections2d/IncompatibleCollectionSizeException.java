package collections2d;

import java.awt.Dimension;

/**
 * Thrown when attempting to add a new row or column to a regular matrix
 * where its size is incompatible with the matrix dimensions.
*/
public class IncompatibleCollectionSizeException extends MatrixException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8780816710462627850L;

	public IncompatibleCollectionSizeException() {
		super();
	}

	public IncompatibleCollectionSizeException(String msg) {
		super(msg);
	}
	
	public IncompatibleCollectionSizeException(Dimension matDimension, int collectionSize, boolean isRow) {
		super(incMatrixDimension(matDimension,collectionSize,isRow));
	}

	private static String incMatrixDimension(Dimension d, int c, boolean isRow) {

		return "Collection of size " + c + " incompatible as " +
		(isRow ? "row":"column") + " in matrix " + (int)d.getWidth() + "x"+(int)d.getHeight();

	}

}
