package algebra;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import collections2d.RegularMatrix;

public class AlgebraicMatrix extends RegularMatrix<Number> implements NumericMatrixForAlgebra, Cloneable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8468849696468224276L;
	
	/**
	 * Constructs an empty AlgebraicMatrix instance with an initial capacity of
	 * {@code 3x3}.
	 */

	public AlgebraicMatrix() {
		super();
	}

	/**
	 * Constructs an AlgebraicMatrix with an initial row and column capacity of
	 * {@code val}.
	 * 
	 * @param val the initial row/column capacity of the matrix
	 * @throws IllegalArgumentException if the initial row/column capacity is
	 *                                  negative
	 */
	public AlgebraicMatrix(int val) {
		super(val);
	}

	/**
	 * Constructs an AlgebraicMatrix with an initial row capacity of {@code r} and
	 * an initial column capacity of {@code c}.
	 * 
	 * @param r the initial row capacity of the matrix
	 * @param c the initial column capacity of the matrix
	 * @throws IllegalArgumentException if any of the initial capacities is negative
	 *
	 */
	public AlgebraicMatrix(int r, int c) {
		super(r, c);
	}

	/**
	 * Returns {@code true} if this {@code AlgebraicMatrix} instance is square. A
	 * matrix is square if its number of rows is equal to its number of columns
	 * (case when Matrix dimensions are {@code 0x0} is excluded).
	 * 
	 * @return {@code true} if this is a square matrix
	 */
	public boolean isSquare() {
		return !isEmpty() && rowSize() == columnSize();
	}

	public static AlgebraicMatrix random(int m, int n) {
		if (m < 1 || n < 1)
			throw new IllegalArgumentException("Invalid dimensions for matrix");
		AlgebraicMatrix mat = new AlgebraicMatrix(m, n);
		for (int i = 0; i < m; i++)
			mat.addRow(NumericArrays.randomNumberArray(n, -10, 10));
		return mat;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @throws NullPointerException     {@inheritDoc}
	 * @throws IllegalArgumentException {@inheritDoc}
	 */
	public boolean addRow(Collection<Number> row) {
		if (row.contains(null))
			throw new IllegalArgumentException("The given row contains null elements");
		checkLength(row);
		return super.addRow(row);
	}

	/**
	 * 
	 * @throws NullPointerException     {@inheritDoc}
	 * @throws IllegalArgumentException {@inheritDoc}
	 */
	public boolean addRow(int[] row) {
		Number[] arr = NumericArrays.intToNumberArray(row);
		checkLength(arr);
		return super.addRow(Arrays.asList(arr));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @throws NullPointerException     {@inheritDoc}
	 * @throws IllegalArgumentException {@inheritDoc}
	 */
	public boolean addRow(byte[] row) {
		Number[] arr = NumericArrays.byteToNumberArray(row);
		checkLength(arr);
		return super.addRow(Arrays.asList(arr));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @throws NullPointerException     {@inheritDoc}
	 * @throws IllegalArgumentException {@inheritDoc}
	 */
	public boolean addRow(short[] row) {
		Number[] arr = NumericArrays.shortToNumberArray(row);
		checkLength(arr);
		return super.addRow(Arrays.asList(arr));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @throws NullPointerException     {@inheritDoc}
	 * @throws IllegalArgumentException {@inheritDoc}
	 */
	public boolean addRow(long[] row) {
		Number[] arr = NumericArrays.longToNumberArray(row);
		checkLength(arr);
		return super.addRow(Arrays.asList(arr));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @throws NullPointerException     {@inheritDoc}
	 * @throws IllegalArgumentException {@inheritDoc}
	 */
	public boolean addRow(float[] row) {
		Number[] arr = NumericArrays.floatToNumberArray(row);
		checkLength(arr);
		return super.addRow(Arrays.asList(arr));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @throws NullPointerException     {@inheritDoc}
	 * @throws IllegalArgumentException {@inheritDoc}
	 */
	public boolean addRow(double[] row) {
		Number[] arr = NumericArrays.doubleToNumberArray(row);
		checkLength(arr);
		return super.addRow(Arrays.asList(arr));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @throws NullPointerException     {@inheritDoc}
	 * @throws IllegalArgumentException {@inheritDoc}
	 */
	public <T extends Number> boolean addRow(T[] row) {
		NumericArrays.checkStaticArrayContainsNullElements(row);
		Number[] arr = NumericArrays.generalizedNumberArray(row);
		checkLength(arr);
		return super.addRow(Arrays.asList(arr));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @throws NullPointerException      {@inheritDoc}
	 * @throws IllegalArgumentException  {@inheritDoc}
	 * @throws IndexOutOfBoundsException {@inheritDoc}
	 */
	public void addRow(int index, Collection<Number> row) {
		if (row.contains(null))
			throw new IllegalArgumentException("The given row contains null elements");
		checkLength(row);
		super.addRow(index, row);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @throws NullPointerException      {@inheritDoc}
	 * @throws IllegalArgumentException  {@inheritDoc}
	 * @throws IndexOutOfBoundsException {@inheritDoc}
	 */
	public void addRow(int index, int[] row) {
		Number[] arr = NumericArrays.intToNumberArray(row);
		checkLength(arr);
		super.addRow(index, Arrays.asList(arr));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @throws NullPointerException      {@inheritDoc}
	 * @throws IllegalArgumentException  {@inheritDoc}
	 * @throws IndexOutOfBoundsException {@inheritDoc}
	 */
	public void addRow(int index, byte[] row) {
		Number[] arr = NumericArrays.byteToNumberArray(row);
		checkLength(arr);
		super.addRow(index, Arrays.asList(arr));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @throws NullPointerException      {@inheritDoc}
	 * @throws IllegalArgumentException  {@inheritDoc}
	 * @throws IndexOutOfBoundsException {@inheritDoc}
	 */
	public void addRow(int index, short[] row) {
		Number[] arr = NumericArrays.shortToNumberArray(row);
		checkLength(arr);
		super.addRow(index, Arrays.asList(arr));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @throws NullPointerException      {@inheritDoc}
	 * @throws IllegalArgumentException  {@inheritDoc}
	 * @throws IndexOutOfBoundsException {@inheritDoc}
	 */
	public void addRow(int index, long[] row) {
		Number[] arr = NumericArrays.longToNumberArray(row);
		checkLength(arr);
		super.addRow(index, Arrays.asList(arr));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @throws NullPointerException      {@inheritDoc}
	 * @throws IllegalArgumentException  {@inheritDoc}
	 * @throws IndexOutOfBoundsException {@inheritDoc}
	 */
	public void addRow(int index, float[] row) {
		Number[] arr = NumericArrays.floatToNumberArray(row);
		checkLength(arr);
		super.addRow(index, Arrays.asList(arr));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @throws NullPointerException      {@inheritDoc}
	 * @throws IllegalArgumentException  {@inheritDoc}
	 * @throws IndexOutOfBoundsException {@inheritDoc}
	 */
	public void addRow(int index, double[] row) {
		Number[] arr = NumericArrays.doubleToNumberArray(row);
		checkLength(arr);
		super.addRow(index, Arrays.asList(arr));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @throws NullPointerException      {@inheritDoc}
	 * @throws IllegalArgumentException  {@inheritDoc}
	 * @throws IndexOutOfBoundsException {@inheritDoc}
	 */
	public <T extends Number> void addRow(int index, T[] row) {
		NumericArrays.checkStaticArrayContainsNullElements(row);
		Number[] arr = NumericArrays.generalizedNumberArray(row);
		checkLength(arr);
		super.addRow(index, Arrays.asList(arr));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @throws NullPointerException     {@inheritDoc}
	 * @throws IllegalArgumentException {@inheritDoc}
	 */
	public boolean addColumn(Collection<Number> column) {
		if (column.contains(null))
			throw new IllegalArgumentException("The given column contains null elements");
		checkLength(column);
		return super.addColumn(column);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @throws NullPointerException     {@inheritDoc}
	 * @throws IllegalArgumentException {@inheritDoc}
	 */
	public boolean addColumn(int[] column) {
		Number[] arr = NumericArrays.intToNumberArray(column);
		checkLength(arr);
		return super.addColumn(Arrays.asList(arr));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @throws NullPointerException     {@inheritDoc}
	 * @throws IllegalArgumentException {@inheritDoc}
	 */
	public boolean addColumn(byte[] column) {
		Number[] arr = NumericArrays.byteToNumberArray(column);
		checkLength(arr);
		return super.addColumn(Arrays.asList(arr));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @throws NullPointerException     {@inheritDoc}
	 * @throws IllegalArgumentException {@inheritDoc}
	 */
	public boolean addColumn(short[] column) {
		Number[] arr = NumericArrays.shortToNumberArray(column);
		checkLength(arr);
		return super.addColumn(Arrays.asList(arr));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @throws NullPointerException     {@inheritDoc}
	 * @throws IllegalArgumentException {@inheritDoc}
	 */
	public boolean addColumn(long[] column) {
		Number[] arr = NumericArrays.longToNumberArray(column);
		checkLength(arr);
		return super.addColumn(Arrays.asList(arr));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @throws NullPointerException     {@inheritDoc}
	 * @throws IllegalArgumentException {@inheritDoc}
	 */
	public boolean addColumn(float[] column) {
		Number[] arr = NumericArrays.floatToNumberArray(column);
		checkLength(arr);
		return super.addColumn(Arrays.asList(arr));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @throws NullPointerException     {@inheritDoc}
	 * @throws IllegalArgumentException {@inheritDoc}
	 */
	public boolean addColumn(double[] column) {
		Number[] arr = NumericArrays.doubleToNumberArray(column);
		checkLength(arr);
		return super.addColumn(Arrays.asList(arr));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @throws NullPointerException     {@inheritDoc}
	 * @throws IllegalArgumentException {@inheritDoc}
	 */
	public <T extends Number> boolean addColumn(T[] column) {
		NumericArrays.checkStaticArrayContainsNullElements(column);
		Number[] arr = NumericArrays.generalizedNumberArray(column);
		checkLength(arr);
		return super.addColumn(Arrays.asList(arr));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @throws NullPointerException      {@inheritDoc}
	 * @throws IllegalArgumentException  {@inheritDoc}
	 * @throws IndexOutOfBoundsException {@inheritDoc}
	 */
	public void addColumn(int index, Collection<Number> column) {
		if (column.contains(null))
			throw new IllegalArgumentException("The given column contains null elements");
		checkLength(column);
		super.addRow(index, column);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @throws NullPointerException      {@inheritDoc}
	 * @throws IllegalArgumentException  {@inheritDoc}
	 * @throws IndexOutOfBoundsException {@inheritDoc}
	 */
	public void addColumn(int index, int[] column) {
		Number[] arr = NumericArrays.intToNumberArray(column);
		checkLength(arr);
		super.addColumn(index, Arrays.asList(arr));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @throws NullPointerException      {@inheritDoc}
	 * @throws IllegalArgumentException  {@inheritDoc}
	 * @throws IndexOutOfBoundsException {@inheritDoc}
	 */
	public void addColumn(int index, byte[] column) {
		Number[] arr = NumericArrays.byteToNumberArray(column);
		checkLength(arr);
		super.addColumn(index, Arrays.asList(arr));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @throws NullPointerException      {@inheritDoc}
	 * @throws IllegalArgumentException  {@inheritDoc}
	 * @throws IndexOutOfBoundsException {@inheritDoc}
	 */
	public void addColumn(int index, short[] column) {
		Number[] arr = NumericArrays.shortToNumberArray(column);
		checkLength(arr);
		super.addColumn(index, Arrays.asList(arr));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @throws NullPointerException      {@inheritDoc}
	 * @throws IllegalArgumentException  {@inheritDoc}
	 * @throws IndexOutOfBoundsException {@inheritDoc}
	 */
	public void addColumn(int index, long[] column) {
		Number[] arr = NumericArrays.longToNumberArray(column);
		checkLength(arr);
		super.addColumn(index, Arrays.asList(arr));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @throws NullPointerException      {@inheritDoc}
	 * @throws IllegalArgumentException  {@inheritDoc}
	 * @throws IndexOutOfBoundsException {@inheritDoc}
	 */
	public void addColumn(int index, float[] column) {
		Number[] arr = NumericArrays.floatToNumberArray(column);
		checkLength(arr);
		super.addColumn(index, Arrays.asList(arr));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @throws NullPointerException      {@inheritDoc}
	 * @throws IllegalArgumentException  {@inheritDoc}
	 * @throws IndexOutOfBoundsException {@inheritDoc}
	 */
	public void addColumn(int index, double[] column) {
		Number[] arr = NumericArrays.doubleToNumberArray(column);
		checkLength(arr);
		super.addColumn(index, Arrays.asList(arr));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @throws NullPointerException      {@inheritDoc}
	 * @throws IllegalArgumentException  {@inheritDoc}
	 * @throws IndexOutOfBoundsException {@inheritDoc}
	 */
	public <T extends Number> void addColumn(int index, T[] column) {
		NumericArrays.checkStaticArrayContainsNullElements(column);
		Number[] arr = NumericArrays.generalizedNumberArray(column);
		checkLength(arr);
		super.addColumn(index, Arrays.asList(arr));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @throws NullPointerException      {@inheritDoc}
	 * @throws IllegalArgumentException  {@inheritDoc}
	 * @throws IndexOutOfBoundsException {@inheritDoc}
	 */
	public Collection<Number> setRow(int index, Collection<Number> row) {
		if (row.contains(null))
			throw new IllegalArgumentException("The given row contains null elements");
		checkLength(row);
		return super.setRow(index, row);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @throws NullPointerException      {@inheritDoc}
	 * @throws IllegalArgumentException  {@inheritDoc}
	 * @throws IndexOutOfBoundsException {@inheritDoc}
	 */
	public Collection<Number> setRow(int index, int[] row) {
		Number[] arr = NumericArrays.intToNumberArray(row);
		checkLength(arr);
		return super.setRow(index, Arrays.asList(arr));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @throws NullPointerException      {@inheritDoc}
	 * @throws IllegalArgumentException  {@inheritDoc}
	 * @throws IndexOutOfBoundsException {@inheritDoc}
	 */
	public Collection<Number> setRow(int index, byte[] row) {
		Number[] arr = NumericArrays.byteToNumberArray(row);
		checkLength(arr);
		return super.setRow(index, Arrays.asList(arr));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @throws NullPointerException      {@inheritDoc}
	 * @throws IllegalArgumentException  {@inheritDoc}
	 * @throws IndexOutOfBoundsException {@inheritDoc}
	 */
	public Collection<Number> setRow(int index, short[] row) {
		Number[] arr = NumericArrays.shortToNumberArray(row);
		checkLength(arr);
		return super.setRow(index, Arrays.asList(arr));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @throws NullPointerException      {@inheritDoc}
	 * @throws IllegalArgumentException  {@inheritDoc}
	 * @throws IndexOutOfBoundsException {@inheritDoc}
	 */
	public Collection<Number> setRow(int index, long[] row) {
		Number[] arr = NumericArrays.longToNumberArray(row);
		checkLength(arr);
		return super.setRow(index, Arrays.asList(arr));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @throws NullPointerException      {@inheritDoc}
	 * @throws IllegalArgumentException  {@inheritDoc}
	 * @throws IndexOutOfBoundsException {@inheritDoc}
	 */
	public Collection<Number> setRow(int index, float[] row) {
		Number[] arr = NumericArrays.floatToNumberArray(row);
		checkLength(arr);
		return super.setRow(index, Arrays.asList(arr));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @throws NullPointerException      {@inheritDoc}
	 * @throws IllegalArgumentException  {@inheritDoc}
	 * @throws IndexOutOfBoundsException {@inheritDoc}
	 */
	public Collection<Number> setRow(int index, double[] row) {
		Number[] arr = NumericArrays.doubleToNumberArray(row);
		checkLength(arr);
		return super.setRow(index, Arrays.asList(arr));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @throws NullPointerException      {@inheritDoc}
	 * @throws IllegalArgumentException  {@inheritDoc}
	 * @throws IndexOutOfBoundsException {@inheritDoc}
	 */
	public <T extends Number> Collection<Number> setRow(int indexRow, T[] row) {
		NumericArrays.checkStaticArrayContainsNullElements(row);
		Number[] arr = NumericArrays.generalizedNumberArray(row);
		checkLength(arr);
		return super.setRow(indexRow, Arrays.asList(arr));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @throws NullPointerException      {@inheritDoc}
	 * @throws IllegalArgumentException  {@inheritDoc}
	 * @throws IndexOutOfBoundsException {@inheritDoc}
	 */
	public Collection<Number> setColumn(int index, Collection<Number> column) {
		if (column.contains(null))
			throw new IllegalArgumentException("The given column contains null elements");
		checkLength(column);
		return super.setColumn(index, column);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @throws NullPointerException      {@inheritDoc}
	 * @throws IllegalArgumentException  {@inheritDoc}
	 * @throws IndexOutOfBoundsException {@inheritDoc}
	 */
	public Collection<Number> setColumn(int index, int[] column) {
		Number[] arr = NumericArrays.intToNumberArray(column);
		checkLength(arr);
		return super.setColumn(index, Arrays.asList(arr));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @throws NullPointerException      {@inheritDoc}
	 * @throws IllegalArgumentException  {@inheritDoc}
	 * @throws IndexOutOfBoundsException {@inheritDoc}
	 */
	public Collection<Number> setColumn(int index, byte[] column) {
		Number[] arr = NumericArrays.byteToNumberArray(column);
		checkLength(arr);
		return super.setColumn(index, Arrays.asList(arr));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @throws NullPointerException      {@inheritDoc}
	 * @throws IllegalArgumentException  {@inheritDoc}
	 * @throws IndexOutOfBoundsException {@inheritDoc}
	 */
	public Collection<Number> setColumn(int index, short[] column) {
		Number[] arr = NumericArrays.shortToNumberArray(column);
		checkLength(arr);
		return super.setColumn(index, Arrays.asList(arr));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @throws NullPointerException      {@inheritDoc}
	 * @throws IllegalArgumentException  {@inheritDoc}
	 * @throws IndexOutOfBoundsException {@inheritDoc}
	 */
	public Collection<Number> setColumn(int index, long[] column) {
		Number[] arr = NumericArrays.longToNumberArray(column);
		checkLength(arr);
		return super.setColumn(index, Arrays.asList(arr));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @throws NullPointerException      {@inheritDoc}
	 * @throws IllegalArgumentException  {@inheritDoc}
	 * @throws IndexOutOfBoundsException {@inheritDoc}
	 */
	public Collection<Number> setColumn(int index, float[] column) {
		Number[] arr = NumericArrays.floatToNumberArray(column);
		checkLength(arr);
		return super.setColumn(index, Arrays.asList(arr));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @throws NullPointerException      {@inheritDoc}
	 * @throws IllegalArgumentException  {@inheritDoc}
	 * @throws IndexOutOfBoundsException {@inheritDoc}
	 */
	public Collection<Number> setColumn(int indexColumn, double[] column) {
		Number[] arr = NumericArrays.doubleToNumberArray(column);
		checkLength(arr);
		return super.setColumn(indexColumn, Arrays.asList(arr));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @throws NullPointerException      {@inheritDoc}
	 * @throws IllegalArgumentException  {@inheritDoc}
	 * @throws IndexOutOfBoundsException {@inheritDoc}
	 */
	public <T extends Number> Collection<Number> setColumn(int index, T[] column) {
		NumericArrays.checkStaticArrayContainsNullElements(column);
		Number[] arr = NumericArrays.generalizedNumberArray(column);
		checkLength(arr);
		return super.setColumn(index, Arrays.asList(arr));
	}

	/*
	 * ---------------------------------------------- ALGEBRA METHODS
	 * ---------------------------------------------------
	 */

	/**
	 * Orders the rows of the matrix based on the index of the pivot of each row.
	 *
	 * This method performs row ordering in the matrix based on the index of the
	 * pivot in each row. The pivot is the leftmost non-zero element in a row after
	 * previous rows have been processed. The rows are rearranged to bring rows with
	 * lower pivot indices to the top, which is a common step in Gaussian
	 * elimination.
	 *
	 * The method returns the total number of swaps performed during the row
	 * ordering process. This value is useful in calculating the determinant of the
	 * matrix.
	 *
	 * @return the total number of swaps performed during row ordering
	 */
	public int orderRows() {
		return LinearAlgebra.matrixOrderingRows(this);
	}

	/**
	 * Converts the matrix to its row echelon form and returns the number of swapped
	 * rows.
	 *
	 * This method transforms the matrix into its row echelon form using Gaussian
	 * elimination. The process involves performing row operations to create a
	 * triangular matrix where the leading entry (pivot) in each row is to the right
	 * of the pivot in the row above. The method returns the total number of swapped
	 * rows during this transformation, a value which is used in the calculation of
	 * the determinant of the matrix.
	 *
	 * @return the total number of swapped rows during the conversion to row echelon
	 *         form
	 */
	public int rowEchelonForm() {
		return LinearAlgebra.matrixRowEchelonForm(this);
	}

	/**
	 * Calculates and returns the determinant of the matrix.
	 *
	 * This method computes the determinant of the matrix using a suitable
	 * algorithm, which is typically based on row operations such as Gaussian
	 * elimination. The determinant is a scalar value that represents the scaling
	 * factor by which the matrix's volume changes under linear transformations.
	 *
	 * @return the determinant of the matrix as a double value
	 * @throws IllegalArgumentException If the matrix is not square, i.e., the
	 *                                  number of rows is not equal to the number of
	 *                                  columns.
	 */
	public double determinant() {
		return LinearAlgebra.matrixDeterminant(this);
	}

	public Object clone() {
		AlgebraicMatrix clone = new AlgebraicMatrix(rowSize(), columnSize());
		Iterator<Collection<Number>> rowItr = rowIterator();
		while (rowItr.hasNext())
			clone.addRow(rowItr.next());
		return clone;
	}

	public AlgebraicMatrix subMatrix(int indexRow, int indexColumn) {
		RegularMatrix<Number> srm = super.subMatrix(indexRow, indexColumn);
		AlgebraicMatrix s = new AlgebraicMatrix(rowSize() - 1, columnSize() - 1);
		for (int i = 0; i < rowSize() - 1; i++)
			s.addRow(Arrays.copyOf(srm.getRow(i).toArray(), columnSize() - 1, Number[].class));
		return s;
	}

	/**
	 * Returns the transpose of this matrix.
	 * 
	 * @return the transpose of this matrix
	 */
	public AlgebraicMatrix transpose() {
		int r = rowSize(), c = columnSize();
		AlgebraicMatrix tr = new AlgebraicMatrix(c, r);
		for (int i = 0; i < c; i++) {
			Number[] newRow = new Number[r];
			for (int j = 0; j < r; j++)
				newRow[j] = getElement(j,i);
			tr.addRow(newRow);
		}
		return tr;
	}

	protected Number[] rowToArray(int n) {
		return Arrays.copyOf(getRow(n).toArray(), columnSize(), Number[].class);
	}
	
	protected Number[] columnToArray(int n) {
		return Arrays.copyOf(getColumn(n).toArray(), rowSize(), Number[].class);
	}

	/*--------------------------------------------------------------------------------------------*/
	/*--------------------------------------------------------------------------------------------*/
	/*--------------------------------------------------------------------------------------------*/
	/*--------------------------------------------------------------------------------------------*/
	/*--------------------------------------------------------------------------------------------*/
	/*--------------------------------------------------------------------------------------------*/

	/*
	 * Nonsense stuff to make matrices look better on the console
	 * 
	 * 
	 */
	// toString capricho

	private int maxLengthOnlyForToStringMethod;
	private static int repeatsForDecimals = 4;

	private void checkLength(Collection<Number> r) {
		for (Number n : r)
			checkLength(n);
	}

	protected void checkLength(Number[] r) {
		for (Number n : r)
			checkLength(n);
	}

	private void checkLength(Object n) {
		String b = new DecimalFormat("0." + "0".repeat(repeatsForDecimals)).format(n);
		b = removeEndingZeros(b);
		maxLengthOnlyForToStringMethod = Math.max(maxLengthOnlyForToStringMethod, b.length());
	}

	private static String removeEndingZeros(String s) {
		int i = s.length() - 1;
		char[] chars = s.toCharArray();
		while (i >= 0 && s.charAt(i) == '0')
			i--;
		if (s.charAt(i) == ',')
			i--;
		return new String(chars, 0, i + 1);
	}

	private String adaptStringToMiddleOfColumn(Number o) {
		String so = new DecimalFormat("0." + "0".repeat(repeatsForDecimals)).format(o);
		so = removeEndingZeros(so);
		int n = maxLengthOnlyForToStringMethod;
		int len = (so.length() + (n - so.length()) / 2);
		String a = String.format("%-" + n + "s", String.format("%" + len + "s", so));
		return a;
	}

	public String toString() {
		if (isEmpty())
			return "[]";
		StringBuilder sb = new StringBuilder();
		char open, close;
		// ┌┐└┘
		for (int i = 0; i < rowSize(); i++) {
			if (rowSize() == 1) {
				open = '[';
				close = ']';
			} else if (i == 0) {
				open = '┌';
				close = '┐';
			} else if (i == rowSize() - 1) {
				open = '└';
				close = '┘';
			} else {
				open = close = '|';
			}

			sb.append(open).append(' ');
			for (int j = 0; j < columnSize(); j++) {
//				sb.append(getElement(i,j))
				sb.append(adaptStringToMiddleOfColumn(getElement(i, j))).append(' ');
			}

			sb.append(close);
			if (i < rowSize() - 1)
				sb.append('\n');
		}
		return sb.toString();
	}

}
