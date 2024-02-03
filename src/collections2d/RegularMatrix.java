package collections2d;

import java.util.Arrays;
import java.util.Objects;
import java.awt.Dimension;
import java.util.Collection;

/**
 * Resizable-two-dimensional array implementation of the interface {@code Matrix}.
 * Implements almost all optional matrix operations, expect for removing elements
 * from the matrix, because this class represents a Regular Matrix, a matrix where
 * all its rows are the same size.
 * 
 * <p>Each {@code RegularMatrix} instance has a <i>row capacity</i>
 * and <i>column capacity</i>.  Row capacity is the size of the array used to 
 * store the rows in the matrix.  Column capacity is the size of each row.
 * Both are always at least as large as the matrix current dimensions.
 * As elements are added to a RegularMatrix, both capacities grow automatically.
 * 
 * @param <E> the types of elements in this matrix
 */
public class RegularMatrix<E> extends AbstractMatrix<E>
		implements Matrix<E>, Cloneable, java.io.Serializable, java.util.RandomAccess
{

	@java.io.Serial
	private static final long serialVersionUID = -8099230072888978354L;

	/**
	 * Default initial row capacity
	 */
	private final static int DEFAULT_MAX_ROWS_CAPACITY = 3;
	/**
	 * Default initial row capacity
	 */
	private final static int DEFAULT_MAX_COLUMNS_CAPACITY = 3;

	/**
	 * Shared empty two-dimensional array instance used for empty instances.
	 */
	private final static Object[][] EMPTY_MATRIX = {};

	/**
	 * The two-dimensional array buffer into which the elements of the
	 * {@code RegularMatrix} are stored. The row capacity of the RegularMatrix is
	 * the length of this array buffer. Any empty RegularMatrix with rows ==
	 * EMPTY_MATRIX will be expanded to the first row size.
	 */
	protected transient Object[][] rows; // not private for efficiency in AlgebraicMatrix

	/**
	 * The total rows this RegularMatrix can contain (this does NOT determine
	 * whether a column can be added or not).
	 */
	private int currentRowCapacity;
	/**
	 * The total columns this RegularMatrix can contain (this does NOT determine
	 * whether a row can be added or not).
	 */
	private int currentColumnCapacity;
	/**
	 * The number of rows this RegularMatrix currently has.
	 */
	private int numberOfRows;
	/**
	 * The number of columns this RegularMatrix currently has.
	 */
	private int numberOfColumns;
	/**
	 * The number of elements this RegularMatrix currently has.
	 */
	private int numberOfElements;

	private boolean stillEmptyFromConstruction;

	/**
	 * Constructs an empty RegularMatrix instance with an initial capacity of
	 * {@code 3x3}.
	 */
	public RegularMatrix() {
		this(DEFAULT_MAX_ROWS_CAPACITY, DEFAULT_MAX_COLUMNS_CAPACITY);
	}
	
	/**
	 * Constructs an RegularMatrix with an initial row and column capacity of
	 * {@code rowColCapacity}.
	 * 
	 * @param rowColCapacity the initial row/column capacity of the matrix
	 * @throws IllegalArgumentException if the initial row/column capacity is
	 *                                  negative
	 */
	public RegularMatrix(int rowColCapacity) {
		this(rowColCapacity, rowColCapacity);
	}

	/**
	 * /** Constructs an RegularMatrix with an initial row capacity of
	 * {@code rowCapacity} and an initial column capacity of {@code columnCapacity}.
	 * 
	 * @param rowCapacity    the initial row capacity of the matrix
	 * @param columnCapacity the initial column capacity of the matrix
	 * @throws IllegalArgumentException if any of the initial capacities is negative
	 *
	 */
	public RegularMatrix(int rowCapacity, int columnCapacity) {

		if (rowCapacity > 0 && columnCapacity > 0) {
			Arrays.fill(rows = new Object[currentRowCapacity = rowCapacity][currentColumnCapacity = columnCapacity],
					null);
		} else if (rowCapacity == 0 && columnCapacity == 0) {
			rows = EMPTY_MATRIX;
		} else {
			if (rowCapacity < 0)
				throw new IllegalArgumentException("Illegal Rows Capacity: " + rowCapacity);
			else {
				throw new IllegalArgumentException("Illegal Columns Capacity: " + columnCapacity);
			}
		}
		stillEmptyFromConstruction = true;

	}
	
	/**
	 * This implementation always throws an {@code UnsupportedOperationException}.
	 */
	public boolean removeAll(Collection<?> c) {
		throw new UnsupportedOperationException();
	}
	
	/**
	 * This implementation always throws an {@code UnsupportedOperationException}.
	 */	
	public boolean retainAll(Collection<?> c) {
		throw new UnsupportedOperationException();
	}

	/** Returns the number of rows in this matrix.
	 * 
	 * @return the number of rows in this matrix
	 */
	public int rowSize() {
		return numberOfRows;
	}

	/** Returns the number of columns in this matrix.
	 * 
	 * @return the number of columns in this matrix
	 */
	public int columnSize() {
		return numberOfColumns;
	}

	/** Returns the number of elements in this matrix.
	 * <p>Since this is a regular matrix, this should return
	 * {@link #rowSize()} * {@link #columnSize()}.
	 * 
	 * @return the number of elements in this matrix
	 */
	public int totalSize() {
		return numberOfElements;
	}

    /**
     * Returns {@code true} if this matrix contains no elements.
     *
     * @return {@code true} if this matrix contains no elements
     */
	public boolean isEmpty() {
		return numberOfElements == 0;
	}

	/**
	 * Returns the dimension of this matrix, which is
	 * {@link #rowSize()} x {@link #columnSize()}.
	 * 
	 * @return the dimension of this matrix
	 */
	public Dimension getDimension() {
		return new Dimension(columnSize(), rowSize());
	}

	/**
	 * Method used when a RegularMatrix is cleared and variables related to sizes
	 * have to be reestablished.
	 */
	private void clearData() {
		numberOfRows = numberOfColumns = numberOfElements = 0;
	}

	/**
     * Removes all of the elements from this matrix.
     * The matrix will be empty after this call returns.
     */
	public void clear() {
		clearData();
//		super.clear();
//		Arrays.fill(rows = new Object[currentRowCapacity][], null);
		for (int i = 0; i < rows.length; i++) {
			rows[i] = null;
		}
	}

	// borrar luego
	public void data() {
		System.out.println(
				"----------------------------------------------------------------------------\nEsta matriz tiene espacio para contener "
						+ currentRowCapacity + " filas y " + currentColumnCapacity + " columnas.\nActualmente tiene "
						+ rowSize() + " filas, " + columnSize() + " columnas y " + totalSize() + " elementos."
						+ "\nObject[][] rows tiene " + rows.length
						+ " filas actualmente \n----------------------------------------------------------------------------");
	}

	// borrar luego
	public void showData() {
		if (rows.length == 0) {
			System.out.println("vacio por completo");
			return;
		}
		for (Object[] row : rows) {
			if (row == null)
				System.out.println("[null row]");
			else {
				System.out.print("[ ");
				for (Object e : row) {
					if (e == null)
						System.out.print("null");
					else {
						System.out.print(e.toString());
					}
					System.out.print(", ");
				}
				System.out.println("]");
			}
		}
	}

    /**
     * Returns a shallow copy of this {@code RegularMatrix} instance.  (The
     * elements themselves are not copied.)
     *
     * @return a clone of this {@code RegularMatrix} instance
     */
	public Object clone() {
		try {
			RegularMatrix<?> mat = (RegularMatrix<?>) super.clone();
			mat = new RegularMatrix<E>(currentRowCapacity, currentColumnCapacity);
			for (int i = 0; i < numberOfRows; i++)
				mat.addArray(mat.rows, rows[i], i, numberOfColumns);
			return mat;
		} catch (CloneNotSupportedException e) {
			throw new InternalError(e);
		}
	}

	/**
	 * More efficient private method variant of {@code addRow()}.
	 * Created for efficiency in {@code clone()} method and
	 * when adding rows in general
	 * @param rows the rows container of this matrix
	 * @param array new row
	 * @param index index where the new row is wanted to be
	 * @param sizeInCorrectRange apparent array size for user, without this,
	 * {@code toString()} method will show raw rows, with the nulls at the end due to the columnCapacity.
	 */
	private void addArray(Object[][] rows, Object[] array, int index, int sizeInCorrectRange) {
		Arrays.fill(rows[index] = new Object[currentColumnCapacity], null);
		System.arraycopy(array, 0, rows[index], 0, array.length);
		numberOfRows++;
		numberOfColumns = sizeInCorrectRange;
		numberOfElements += sizeInCorrectRange;
	}

	/**
	 * Trims both capacities of this {@code RegularMatrix} instance to be the
	 * matrix's current sizes. This operation can be used to minimize the storage of
	 * an {@code RegularMatrix} instance.
	 */
	public void trimToSize() {
		if (isEmpty()) {
			rows = EMPTY_MATRIX;
			clearData();
		} else {
			if (numberOfColumns < currentColumnCapacity) {
				for (int i = 0; i < rowSize(); i++)
					rows[i] = Arrays.copyOf(rows[i], columnSize());
				currentColumnCapacity = columnSize();
			}
			if (numberOfRows < currentRowCapacity) {
				rows = Arrays.copyOf(rows, numberOfRows);
				currentRowCapacity = rowSize();
			}
		}
	}

	/**
	 * Increases the row capacity of this {@code RegularMatrix} instance, if
	 * necessary, to ensure that it can hold at least the number of rows specified
	 * by the minimum capacity argument.
	 *
	 * @param minCapacity the desired minimum row capacity
	 */
	public void ensureRowCapacity(int minCapacity) {
		if (minCapacity > currentRowCapacity) {
			increaseRowCapacity(minCapacity);
		}
	}

	private Object[][] increaseRowCapacity() {
		return increaseRowCapacity(rowSize() + 1);
	}

	/**
	 * Increases the row capacity to ensure that it can hold at least the number of
	 * elements specified by the new capacity argument.
	 *
	 * @param newRowCapacity the desired new row capacity
	 * @throws OutOfMemoryError if newRowCapacity is less than zero
	 */
	private Object[][] increaseRowCapacity(int newCapacity) {
		int oldCapacity = currentRowCapacity;
		
		if (oldCapacity > 0 || rows != EMPTY_MATRIX) {
			rows = Arrays.copyOf(rows, currentRowCapacity = newCapacity);
			return rows;
		} else {
			rows = new Object[currentRowCapacity = Math.max(DEFAULT_MAX_ROWS_CAPACITY,
					newCapacity)][currentColumnCapacity];
			Arrays.fill(rows, null);
			return rows;
		}
	}

	/**
	 * Checks if there is the necessity of increasing the row capacity.
	 */
	private Object[][] checkRowCapacity(Object[][] rows, boolean newRowWantsToBeAdded) {
		if (newRowWantsToBeAdded && numberOfRows == currentRowCapacity) {
			rows = increaseRowCapacity();
		}
		return rows;
	}

	/**
	 * Increases the column capacity of this {@code RegularMatrix} instance, if
	 * necessary, to ensure that it can hold at least the number of columns
	 * specified by the minimum capacity argument.
	 *
	 * @param minCapacity the desired minimum column capacity
	 */
	public void ensureColumnCapacity(int minCapacity) {
		if (minCapacity > currentColumnCapacity) {
			increaseColumnCapacity(minCapacity);
		}
	}

	private Object[][] increaseColumnCapacity() {
		return increaseColumnCapacity(columnSize() + 1);
	}

	/**
	 * Increases the column capacity to ensure that it can hold at least the number
	 * of columns specified by the new capacity argument.
	 *
	 * @param newColumnCapacity the desired new column capacity
	 * @throws OutOfMemoryError if newColumnCapacity is less than zero
	 */
	private Object[][] increaseColumnCapacity(int newCapacity) {

		if (stillEmptyFromConstruction) {
			for (int i = 0; i < numberOfRows; i++) {
				rows[i] = new Object[newCapacity];
			}
		}

		else {
			for (int i = 0; i < numberOfRows; i++) {
				rows[i] = Arrays.copyOf(rows[i], newCapacity);
				currentColumnCapacity = newCapacity;
			}
		}
		return rows;
	}

	/**
	 * Checks if there is the necessity of increasing the column capacity.
	 */
	private void checkColumnCapacity(boolean newColumnWantsToBeAdded) {
		if (newColumnWantsToBeAdded || stillEmptyFromConstruction) {
			increaseColumnCapacity();
		}
	}

	/**
	 * Checks if the given row can be added to this {@code RegularMatrix} instance.
	 * A few settings are made in the case the matrix is empty.
	 * 
	 * @param row the row to check its compability
	 * @throws NullPointerException     if the row is null ({@code RegularMatrix}
	 *                                  instances do not accept null rows)
	 * @throws IllegalArgumentException if the row is incompatible (the length of
	 *                                  the row is different than the number of
	 *                                  columns this matrix has) due to the
	 *                                  definition of <i>Regular</i> matrix
	 */
	protected void checkRowCompability(Collection<E> row) {

		if (row == null)
			throw new NullPointerException();

		int checkedRowLength = row.size();

		if (isEmpty()) {
			if (stillEmptyFromConstruction)
				currentColumnCapacity = Math.max(checkedRowLength, currentColumnCapacity);
		}

		else if (checkedRowLength != numberOfColumns)
			throw new IllegalArgumentException(incompatibleRowSize(numberOfColumns ,checkedRowLength));
	}
	
	private String incompatibleRowSize(int expected, int received) {
		return "Expected a row of " + expected + " elements, but received one with " + received;
	}

	/**
	 * Checks if the given column can be added to this {@code RegularMatrix}
	 * instance. Some settings are made in the case the matrix is empty.
	 * 
	 * @param col the column to check its compability
	 * @throws NullPointerException     if the column is null ({@code RegularMatrix}
	 *                                  instances do not accept null columns)
	 * @throws IllegalArgumentException if the column is incompatible (the length of
	 *                                  the column is different than the number of
	 *                                  row this matrix has) due to the
	 *                                  definition of <i>Regular</i> matrix
	 */
	protected void checkColumnCompability(Collection<E> column) {

		if (column == null)
			throw new NullPointerException();

		int checkedColumnLength = column.size();

		if (isEmpty()) {
			if (stillEmptyFromConstruction)
				Arrays.fill(rows = new Object[currentRowCapacity = Math.max(currentRowCapacity,
						checkedColumnLength)][currentColumnCapacity], null);
			rows = increaseRowCapacity(currentRowCapacity);
		}

		else if (checkedColumnLength != numberOfRows)
			throw new IllegalArgumentException(incompatibleColumnSize(numberOfRows, checkedColumnLength));
	}
	
	private String incompatibleColumnSize(int expected, int received) {
		return "Expected a column of " + expected + " elements, but received one with " + received;
	}

	/** Appends the specified row to the end of this matrix.
 	 * 
     * @throws NullPointerException if the row is null ({@code RegularMatrix}
	 *                                  instances do not accept null rows)
     * @throws IllegalArgumentException if the row is incompatible (the length of
	 *                                  the row is different than the number of
	 *                                  columns this matrix has) due to the
	 *                                  definition of <i>Regular</i> matrix
     */
	public boolean addRow(Collection<E> row) {
		return super.addRow(row);
	}
	
    /**
     * Inserts the specified row at the specified position in this
     * matrix. Shifts the row currently at that position (if any) and
     * any subsequent rows to the right (adds one to their indices).
     *
     * @param index index at which the specified element is to be inserted
     * @param row row to be inserted
     * @throws IndexOutOfBoundsException {@inheritDoc}
 	 * @throws NullPointerException     if the row is null ({@code RegularMatrix}
	 *                                  instances do not accept null rows)
	 * @throws IllegalArgumentException if the row is incompatible (the length of
	 *                                  the row is different than the number of
	 *                                  columns this matrix has) due to the
	 *                                  definition of <i>Regular</i> matrix
     */
	public void addRow(int index, Collection<E> row) {
		Objects.checkIndex(index, rowSize() + 1);
		checkRowCompability(row);
		checkRowCapacity(rows, true);
		System.arraycopy(rows, index, rows, index + 1, numberOfRows - index);
		Object[] newRow = row.toArray();
		addArray(rows, newRow, index, newRow.length);
		stillEmptyFromConstruction = false;
	}

	private void addColumn(Object[][] rows, Collection<E> column, int index) {
		checkColumnCompability(column);
		checkColumnCapacity(true);
		Object[] c = column.toArray();
		numberOfRows = c.length;
		for (int i = 0; i < numberOfRows; i++) {
			Object[] row = rows[i];
			if (row == null) Arrays.fill(row = new Object[currentColumnCapacity], null);
			row[index] = c[i];
			this.rows[i] = row;
		}

		numberOfColumns++;
		numberOfElements += c.length;
		stillEmptyFromConstruction = false;
	}

    /**
     * Appends the specified column to the end of this matrix.
     *
     * @param col column to be appended to this matrix
     * @return {@code true} (as specified by {@link Collection#add})
	 * @throws NullPointerException     if the column is null ({@code RegularMatrix}
	 *                                  instances do not accept null columns)
	 * @throws IllegalArgumentException if the column is incompatible (the length of
	 *                                  the column is different than the number of
	 *                                  rows this matrix has) due to the
	 *                                  definition of <i>Regular</i> matrix
     */
	public boolean addColumn(Collection<E> col) {
		addColumn(rows, col, numberOfColumns);
		return true;
	}

    /**
     * Inserts the specified column at the specified position in this
     * matrix. Shifts the column currently at that position (if any) and
     * any subsequent column to the right (adds one to their indices).
     *
     * @param index index at which the specified column is to be inserted
     * @param col column to be inserted
     * @throws IndexOutOfBoundsException {@inheritDoc}
 	 * @throws NullPointerException     if the column is null ({@code RegularMatrix}
	 *                                  instances do not accept null column)
	 * @throws IllegalArgumentException if the column is incompatible (the length of
	 *                                  the column is different than the number of
	 *                                  rows this matrix has) due to the
	 *                                  definition of <i>Regular</i> matrix
     */
	public void addColumn(int index, Collection<E> col) {

		Objects.checkIndex(index, columnSize() + 1);
		checkColumnCompability(col);
		checkColumnCapacity(true);
		Object[] c = col.toArray();
		numberOfRows = c.length;
		for (int i = 0; i < numberOfRows; i++) {
			Object[] currentRow = rows[i];
			if (currentRow == null)
				currentRow = new Object[currentColumnCapacity];
//				Arrays.fill(currentRow = new Object[currentColumnCapacity], null);
			System.arraycopy(currentRow, index, currentRow, index + 1, currentColumnCapacity - index - 1);
			currentRow[index] = c[i];
			rows[i] = currentRow;
		}
		numberOfColumns++;
		numberOfElements += c.length;
		stillEmptyFromConstruction = false;
	}

    /**
     * Returns the row at the specified position in this matrix.
     *
     * @param  indexRow index of the row to return
     * @return the row at the specified position in this matrix
     * @throws IndexOutOfBoundsException {@inheritDoc}
     */
	public Collection<E> getRow(int indexRow) {
		Objects.checkIndex(indexRow, rowSize());
		return rowAt(indexRow);
	}

	protected Object[] columnToArray(int indexColumn) {
		Object[] col = new Object[numberOfRows];
		for (int i = 0; i < numberOfRows; i++) col[i] = rows[i][indexColumn];
		return col;
	}

	/**
	 * Just the main stuff of {@link #getRow(int)}
	 * @param indexRow index of the row to return
	 * @return the row at the specified position in this matrix
	 */
	@SuppressWarnings("unchecked")
	private Collection<E> rowAt(int indexRow) {
		return (Collection<E>) Arrays.asList(Arrays.copyOfRange(rows[indexRow], 0, numberOfColumns));
	}

    /**
     * Returns the column at the specified position in this matrix.
     *
     * @param  indexColumn index of the element to return
     * @return the column at the specified position in this matrix
     * @throws IndexOutOfBoundsException {@inheritDoc}
     */
	public Collection<E> getColumn(int indexColumn) {
		Objects.checkIndex(indexColumn, numberOfColumns);
		return columnAt(indexColumn);
	}

	/**
	 * Just the main stuff of {@link #getColumn(int)}
	 * @param indexColumn index of the row to return
	 * @return the column at the specified position in this matrix
	 */	
	@SuppressWarnings("unchecked")
	private Collection<E> columnAt(int indexColumn) {
		Object[] c = new Object[numberOfRows];
		for (int i = 0; i < numberOfRows; i++)
			c[i] = elementAt(i, indexColumn);
		return (Collection<E>) Arrays.asList(c);
	}

    /**
     * Returns the element at the specified coordinates in this matrix.
     *
     * @param indexRow index of the row where the element is to return
     * @param indexCol index of the column where the element is to return
     * @return the element at the specified coordinates in this matrix
     * @throws IndexOutOfBoundsException {@inheritDoc}
     */
	public E getElement(int indexRow, int indexColumn) {
		Objects.checkIndex(indexRow, numberOfRows);
		Objects.checkIndex(indexColumn, numberOfColumns);
		return elementAt(indexRow, indexColumn);
	}
	
	/**
	 * Just the main stuff of {@link #getElement(int, int)}
     * @param indexRow index of the row where the element is to return
     * @param indexCol index of the column where the element is to return
     * @return the element at the specified coordinates in this matrix
	 */
	@SuppressWarnings("unchecked")
	protected E elementAt(int indexRow, int indexColumn) {
		return (E) rows[indexRow][indexColumn];
	}

    /**
     * Removes the row at the specified position in this matrix.
     * Shifts any subsequent rows to the left (subtracts one from their
     * indices).
     *
     * @param index the index of the row to be removed
     * @return the row that was removed from the matrix
     * @throws IndexOutOfBoundsException {@inheritDoc}
     */
	public Collection<E> removeRow(int index) {
		Objects.checkIndex(index, numberOfRows);
		Collection<E> removedRow = rowAt(index);
		fastRowRemove(rows, index);
		return removedRow;
	}

	/**
	 * Removes row with no index verification
	 * @param r rows where to remove row at specified index
	 * @param index the index of the row to be removed
	 */
	private void fastRowRemove(Object[][] r, int index) {
		System.arraycopy(r, index + 1, r, index, currentRowCapacity - index - 1);
		r[currentRowCapacity - 1] = null;
		numberOfRows--;
	}

    /**
     * Removes the column at the specified position in this matrix.
     * Shifts any subsequent columns to the left (subtracts one from their
     * indices).
     *
     * @param index the index of the column to be removed
     * @return the column that was removed from the matrix
     * @throws IndexOutOfBoundsException {@inheritDoc}
     */
	public Collection<E> removeColumn(int index) {
		Objects.checkIndex(index, numberOfColumns);
		Collection<E> removedColumn = columnAt(index);
		numberOfElements -= removedColumn.size();
		fastColumnRemove(rows, index);

		return removedColumn;
	}

	/**
	 * Removes column with no index verification
	 * @param r rows where to remove column at specified index
	 * @param index the index of the column to be removed
	 */
	private void fastColumnRemove(Object[][] r, int index) {
		if (numberOfColumns == 1) {clear();return;}
		for (int i = 0; i < numberOfRows; i++) {
			Object[] raux = r[i];
			System.arraycopy(raux, index + 1, raux, index, currentColumnCapacity - index - 1);
			raux[currentColumnCapacity - 1] = null;
			r[i] = raux;
		}
		numberOfColumns--;
	}

	/**
     * Replaces the row at the specified position in this matrix with
     * the specified row.
     *
     * @param indexRow index of the row to replace
     * @param newRow row to be stored at the specified position
     * @return the row previously at the specified position
     * @throws ClassCastException {@inheritDoc}
     * @throws NullPointerException if the specified row is null
     * @throws IllegalArgumentException {@inheritDoc}
     * @throws IndexOutOfBoundsException {@inheritDoc}
     */
	public Collection<E> setRow(int indexRow, Collection<E> newRow) {
		Objects.checkIndex(indexRow, numberOfRows);
		checkRowCompability(newRow);
		Collection<E> replacedRow = rowAt(indexRow);
		Object[] r = newRow.toArray();
		rows[indexRow] = Arrays.copyOf(r, currentColumnCapacity);
		return replacedRow;
	}

	/**
     * Replaces the column at the specified position in this matrix with
     * the specified column.
     *
     * @param indexColumn index of the column to replace
     * @param newColumn column to be stored at the specified position
     * @return the column previously at the specified position
     * @throws ClassCastException {@inheritDoc}
     * @throws NullPointerException if the specified column is null
     * @throws IllegalArgumentException {@inheritDoc}
     * @throws IndexOutOfBoundsException {@inheritDoc}
     */
	public Collection<E> setColumn(int indexColumn, Collection<E> newColumn) {
		Objects.checkIndex(indexColumn, numberOfColumns);
		checkColumnCompability(newColumn);
		Object[] c = newColumn.toArray();
		Collection<E> replacedColumn = columnAt(indexColumn);
		for (int i = 0; i < rowSize(); i++)
			rows[i][indexColumn] = c[i];
		return replacedColumn;
	}

    /**
     * Replaces the element at the specified coordinates in this matrix with
     * the specified element.
     *
     * @param indexRow index of the row where the element is to replace
     * @param indexCol index of the column where the element is to replace
     * @return the element previously at the specified coordinates
     * @throws IndexOutOfBoundsException {@inheritDoc}
     */
	public E setElement(int indexRow, int indexColumn, E newElement) {
		E element = getElement(indexRow, indexColumn);
		rows[indexRow][indexColumn] = newElement;
		return element;
	}
	
	
	/**
	 * Swaps the positions of two rows in the matrix.
	 * The rows at the specified indices will exchange places,
	 * resulting in a new arrangement of the matrix
	 * @param indexRow1 index of the first row to be swapped
	 * @param indexRow2 index of the second row to be swapped
	 * @throws IndexOutOfBoundsException if either indexRow1 or indexRow2 is out of range
	 * 									 {@code (index < 0 || index >= rowSize())}
	 */
	public void swapRows(int indexRow1, int indexRow2) {
		Object[] row1 = rows[indexRow1];
		Object[] row2 = rows[indexRow2];
		rows[indexRow1] = row2;
		rows[indexRow2] = row1;
	}
	
	@Override
	public RegularMatrix<E> subMatrix(int indexRow, int indexColumn) {
		//TODO SUBMATRIX PRIVATE CLASS
		Objects.checkIndex(indexRow, numberOfRows);
		Objects.checkIndex(indexColumn, numberOfColumns);
		RegularMatrix<E> s = new RegularMatrix<>(numberOfRows-1,numberOfColumns);
		copyValues(s);
		s.numberOfElements -= numberOfColumns;
		for (int i = 0; i < numberOfRows; i++) {
			if (i == indexRow) continue;
			s.numberOfElements--;
			int j = i > indexRow? i - 1 : i;
			s.rows[j] = Arrays.copyOf(rows[i], currentColumnCapacity);
		}
		s.numberOfRows--;
		s.fastColumnRemove(s.rows, indexColumn);
		s.trimToSize();
		return s;
	}
	
	/**
	 * Copy essential values
	 * @param rm matrix where the values of this matrix will be copied
	 */
	private void copyValues(RegularMatrix<?> rm) {
		rm.currentColumnCapacity = currentColumnCapacity;
		rm.currentRowCapacity = currentRowCapacity;
		rm.numberOfColumns = numberOfColumns;
		rm.numberOfElements = numberOfElements;
		rm.numberOfRows = numberOfRows;
	}
	
	protected void beAware() {
		currentRowCapacity = rows.length;
		currentColumnCapacity = currentRowCapacity == 0 ? 0 : rows[0] == null ? 0 : rows[0].length;
		
	}
	
}
