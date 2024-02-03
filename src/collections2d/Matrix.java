package collections2d;

import java.awt.Point;
import java.util.Iterator;
import java.util.Collection;

/**
 * An ordered two-dimensional collection.
 * The user of this
 * interface has precise control over where in the matrix each row and column is
 * inserted.  The user can access rows and columns by their integer index (position in
 * the list), and search for rows, columns and elements in the matrix.
 * Matrices allow duplicate rows or columns. More formally,
 * matrices typically allow pairs of rows or columns {@code row1} and {@code row2}
 * such that {@code row1.equals(row2)}.<p>
 * 
 * Note: While it is permissible for matrix to contain themselves as elements,
 * extreme caution is advised: the {@code equals} and {@code hashCode}
 * methods are no longer well defined on such a matrix.<p>
 * 
 * The {@code Matrix} interface provides a special iterator, called a
 * {@code MatrixIterator}, that allows row and column insertion and replacement, and
 * bidirectional access in addition to the normal operations that the
 * {@code Iterator} interface provides.  A method is provided to obtain a
 * matrix iterator that starts at a specified row or column position in the matrix.<p>
 * 
 * Some matrix implementations have restrictions on the rows and columns that
 * they may contain.  For example, some implementations prohibit null elements,
 * and some have restrictions on the types of their elements.  Attempting to
 * add an ineligible row or column throws an unchecked exception, typically
 * {@code NullPointerException} or {@code ClassCastException}. Attempting
 * to query the presence of an ineligible element may throw an exception,
 * or it may simply return false; some implementations will exhibit the former
 * behavior and some will exhibit the latter.  More generally, attempting an
 * operation on an ineligible element whose completion would not result in
 * the insertion of an ineligible element into the list may throw an
 * exception or it may succeed, at the option of the implementation.
 * Such exceptions are marked as "optional" in the specification for this
 * interface.
 * 
 * @param <E> the type of elements in this matrix
 * @see RegularMatrix
 */
public interface Matrix<E> extends Collection2D<E> {

    /**
     * Returns the number of rows in this matrix.
     * If this matrix contains more than {@code Integer.MAX_VALUE} rows,
     *  returns {@code Integer.MAX_VALUE}.
     *
     * @return the number of rows in this matrix
     */
	int rowSize();
	
    /**
     * Returns the number of columns in this matrix.
     * If this matrix contains more than {@code Integer.MAX_VALUE} columns,
     *  returns {@code Integer.MAX_VALUE}.
     *
     * @return the number of columns in this matrix
     */
	int columnSize();
	
    /**
     * Returns the number of elements in this matrix.
     * If this matrix contains more than {@code Integer.MAX_VALUE} elements,
     *  returns {@code Integer.MAX_VALUE}.
     *
     * @return the number of elements in this matrix
     */
	int totalSize();
	
    /**
     * Returns {@code true} if this matrix contains no elements.
     *
     * @return {@code true} if this matrix contains no elements
     */
	boolean isEmpty();
	
	/**
	 * Returns {@code true} if this matrix contains the specified element.
	 * In another way, returns {@code true} there is at least one row that contains as least
	 * one element {@code e} such that {@code Objects.equals(o,e)}.
	 * 
	 * @param o element whose presence in this matrix is to be tested
	 * @return {@code true} if this matrix contains the specified element
	 * @throws ClassCastOperation if the type of the specified element is incompatible with this matrix
	 * @throws NullPointerException if the specified element is null and this matrix
	 * does not permit null elements
	 */
	boolean contains(Object o);

	/**
	 * Returns the coordinates of the first instance of the specified element
	 * in this matrix. If the element does not exist in this matrix, {@code null} is returned.
	 *
     * @param o element to search for
     * @return the coordinates of the first occurrence of the specified element in
     *         this matrix, or null if this list does not contain the element
     * @throws ClassCastException if the type of the specified element
     *         is incompatible with this matrix
     * @throws NullPointerException if the specified element is null and this
     *         matrix does not permit null elements
     */
	Point indexOf(Object o);
	
    /**
     * Returns the index of the last occurrence of the specified element
     * in this matrix, or null if this matrix does not contain the element.
     * More formally, returns the highest index {@code [x,y]} such that
     * {@code Objects.equals(o, getElement(x,y))},
     * or null if there is no such index.
     *
     * @param o element to search for
     * @return the index of the last occurrence of the specified element in
     *         this matrix, or null if this list does not contain the element
     * @throws ClassCastException if the type of the specified element
     *         is incompatible with this matrix
     * @throws NullPointerException if the specified element is null and this
     *         matrix does not permit null elements
     */
	Point lastIndexOf(Object o);

    /**
     * Returns an iterator over the rows in this matrix in proper sequence.
     *
     * @return an iterator over the rows in this matrix in proper sequence
     */
	Iterator<Collection<E>> rowIterator();

    /**
     * Returns an iterator over the columns in this matrix in proper sequence.
     *
     * @return an iterator over the columns in this matrix in proper sequence
     */
	Iterator<Collection<E>> columnIterator();

    /**
     * Returns a matrix iterator over the rows in this matrix (in proper
     * sequence).
     *
     * @return a matrix iterator over the rows in this matrix (in proper
     *         sequence)
     */	
	MatrixIterator<Collection<E>> matrixRowIterator();

    /**
     * Returns a matrix iterator over the rows in this matrix (in proper
     * sequence), starting at the specified position in the matrix.
     * The specified index indicates the first row that would be
     * returned by an initial call to {@link MatrixIterator#next next}.
     * An initial call to {@link MatrixIterator#previous previous} would
     * return the row with the specified index minus one.
     *
     * @param indexStart index of the first row to be returned from the
     *        matrix iterator (by a call to {@link MatrixIterator#next next})
     * @return a matrix iterator over the rows in this list (in proper
     *         sequence), starting at the specified position in the matrix
     * @throws IndexOutOfBoundsException if the index is out of range
     *         ({@code index < 0 || index > rowSize()})
     */
	MatrixIterator<Collection<E>> matrixRowIterator(int indexStart);

    /**
     * Returns a matrix iterator over the columns in this matrix (in proper
     * sequence).
     *
     * @return a matrix iterator over the columns in this matrix (in proper
     *         sequence)
     */	
	MatrixIterator<Collection<E>> matrixColumnIterator();

    /**
     * Returns a matrix iterator over the columns in this matrix (in proper
     * sequence), starting at the specified position in the matrix.
     * The specified index indicates the first column that would be
     * returned by an initial call to {@link MatrixIterator#next next}.
     * An initial call to {@link MatrixIterator#previous previous} would
     * return the column with the specified index minus one.
     *
     * @param indexStart index of the first column to be returned from the
     *        matrix iterator (by a call to {@link MatrixIterator#next next})
     * @return a matrix iterator over the columns in this list (in proper
     *         sequence), starting at the specified position in the matrix
     * @throws IndexOutOfBoundsException if the index is out of range
     *         ({@code index < 0 || index > columnSize()})
     */
	MatrixIterator<Collection<E>> matrixColumnIterator(int indexStart);

    /**
     * Appends the specified row to the end of this matrix (optional
     * operation).
     *
     * <p> Matrices that support this operation may place limitations on what
     * rows may be added to this matrix.
     * 
     * @param row row to be appended to this matrix
     * @return {@code true} (as specified by {@link Collection2D#addRow})
     * @throws UnsupportedOperationException if the {@code add} operation
     *         is not supported by this matrix
     * @throws ClassCastException if the class of the specified row
     *         prevents it from being added to this matrix
     * @throws NullPointerException if the specified row is null and this
     *         matrix does not permit null rows
     * @throws IllegalArgumentException if some property of this row
     *         prevents it from being added to this matrix
     */
	boolean addRow(Collection<E> row);

    /**
     * Inserts the specified row at the specified position in this matrix
     * (optional operation).  Shifts the row currently at that position
     * (if any) and any subsequent rows to the right (adds one to their
     * indices).
     *
     * @param index index at which the specified row is to be inserted
     * @param row row to be inserted
     * @throws UnsupportedOperationException if the {@code addRow} operation
     *         is not supported by this matrix
     * @throws ClassCastException if the class of the specified row
     *         prevents it from being added to this matrix
     * @throws NullPointerException if the specified row is null and
     *         this matrix does not permit null rows
     * @throws IllegalArgumentException if some property of the specified
     *         row prevents it from being added to this matrix
     * @throws IndexOutOfBoundsException if the index is out of range
     *         ({@code index < 0 || index > rowSize()})
     */
	void addRow(int index, Collection<E> row);

    /**
     * Appends the specified column to the end of this matrix (optional
     * operation).
     *
     * <p> Matrices that support this operation may place limitations on what
     * columns may be added to this matrix.
     * 
     * @param col column to be appended to this matrix
     * @return {@code true} if this matrix changed as a result of the call
     * 
     * @throws UnsupportedOperationException if the {@code addColumn} operation
     *         is not supported by this matrix
     * @throws ClassCastException if the class of the specified column
     *         prevents it from being added to this matrix
     * @throws NullPointerException if the specified column is null and this
     *         matrix does not permit null rows
     * @throws IllegalArgumentException if some property of this column
     *         prevents it from being added to this matrix
     */
	boolean addColumn(Collection<E> column);

    /**
     * Inserts the specified column at the specified position in this matrix
     * (optional operation).  Shifts the column currently at that position
     * (if any) and any subsequent columns to the right (adds one to their
     * indices).
     *
     * @param index index at which the specified column is to be inserted
     * @param col column to be inserted
     * @throws UnsupportedOperationException if the {@code addColumn} operation
     *         is not supported by this matrix
     * @throws ClassCastException if the class of the specified column
     *         prevents it from being added to this matrix
     * @throws IllegalArgumentException if some property of the specified
     *         column prevents it from being added to this matrix
     * @throws IndexOutOfBoundsException if the index is out of range
     *         ({@code index < 0 || index > columnSize()})
     */
	void addColumn(int index, Collection<E> col);

    /**
     * Returns the row at the specified position in this matrix.
     *
     * @param index index of the row to return
     * @return the row at the specified position in this matrix
     * @throws IndexOutOfBoundsException if the index is out of range
     *         ({@code index < 0 || index >= rowSize()})
     */
	Collection<E> getRow(int index);

    /**
     * Returns the column at the specified position in this matrix.
     *
     * @param index index of the column to return
     * @return the column at the specified position in this matrix
     * @throws IndexOutOfBoundsException if the index is out of range
     *         ({@code index < 0 || index >= columnSize()})
     */
	Collection<E> getColumn(int index);

    /**
     * Returns the element at the specified position in this list.
     *
     * @param indexRow index of where the element is to return
     * @param indexColumn index of the column where the element is to return
     * @return the element at the specified coordinates in this matrix
     * @throws IndexOutOfBoundsException if the index is out of range
     *         ({@code indexRow < 0 || indexRow >= rowSize()
     *         || indexColumn < 0 || indexColumn >= columnsSize()})
     */
	E getElement(int indexRow, int indexColumn);

    /**
     * Removes the row at the specified position in this matrix (optional
     * operation).  Shifts any subsequent rows to the left (subtracts one
     * from their indices).  Returns the row that was removed from the
     * matrix.
     *
     * @param index the index of the row to be removed
     * @return the row previously at the specified position
     * @throws UnsupportedOperationException if the {@code removeRow} operation
     *         is not supported by this matrix
     * @throws IndexOutOfBoundsException if the index is out of range
     *         ({@code index < 0 || index >=rowSize()})
     */
	Collection<E> removeRow(int index);

    /**
     * Removes the column at the specified position in this matrix (optional
     * operation).  Shifts any subsequent columns to the left (subtracts one
     * from their indices).  Returns the column that was removed from the
     * matrix.
     *
     * @param index the index of the column to be removed
     * @return the column previously at the specified position
     * @throws UnsupportedOperationException if the {@code removeColumn} operation
     *         is not supported by this matrix
     * @throws IndexOutOfBoundsException if the index is out of range
     *         ({@code index < 0 || index >= columnSize()})
     */
	Collection<E> removeColumn(int index);

    /**
     * Replaces the row at the specified position in this matrix with the
     * specified row (optional operation).
     *
     * @param index index of the row to replace
     * @param newRow row to be stored at the specified position
     * @return the row previously at the specified position
     * @throws UnsupportedOperationException if the {@code setRow} operation
     *         is not supported by this matrix
     * @throws ClassCastException if the class of the specified row
     *         prevents it from being added to this matrix
     * @throws NullPointerException if the specified row is null and
     *         this matrix does not permit null rows
     * @throws IllegalArgumentException if some property of the specified
     *         row prevents it from being added to this matrix
     * @throws IndexOutOfBoundsException if the index is out of range
     *         ({@code index < 0 || index >= rowSize()})
     */
	Collection<E> setRow(int index, Collection<E> newRow);

    /**
     * Replaces the column at the specified position in this matrix with the
     * specified column (optional operation).
     *
     * @param index index of the column to replace
     * @param newRow column to be stored at the specified position
     * @return the column previously at the specified position
     * @throws UnsupportedOperationException if the {@code setColumn} operation
     *         is not supported by this matrix
     * @throws ClassCastException if the class of the specified column 
     * prevents it from being added to this matrix
     * @throws NullPointerException if the specified column is null and
     *         this matrix does not permit null columns
     * @throws IllegalArgumentException if some property of the specified
     *         column prevents it from being added to this matrix
     * @throws IndexOutOfBoundsException if the index is out of range
     *         ({@code index < 0 || index >= columnSize()})
     */
	Collection<E> setColumn(int index, Collection<E> newColumn);

    /**
     * Replaces the element at the specified coordinates in this matrix with the
     * specified element (optional operation).
     *
     * @param indexRow index of the row where the element is to replace
     * @param indexColumn index of the column where the element is to replace
     * @param newElement element to be stored at the specified position
     * @return the element previously at the specified coordinates
     * @throws UnsupportedOperationException if the {@code setElement} operation
     *         is not supported by this matrix
     * @throws ClassCastException if the class of the specified element
     *         prevents it from being added to this matrix
     * @throws NullPointerException if the specified element is null and
     *         this matrix does not permit null elements
     * @throws IllegalArgumentException if some property of the specified
     *         element prevents it from being added to this matrix
     * @throws IndexOutOfBoundsException if the index is out of range
				({@code indexRow < 0 || indexRow >= rowSize()
     *         || indexColumn < 0 || indexColumn >= columnsSize()})
     */
	E setElement(int indexRow, int indexColumn, E newElement);

    /**
     * Returns a view of the portion of this matrix where the row specified
     * with its index {@code indexRow}, and the column specified with its index {@code indexColumn} are not included
     * in the returned martrix.  
     * Non-structural changes in the returned matrix are reflected in this matrix, and vice-versa.
     * The returned matrix supports all of the optional matrix operations.
     * 
     * @param indexRowRemove index of the row not to include on the sub matrix
     * @param indexColumnRemove index of the column not to include on the sub matrix
     * @throws IndexOutOfBoundsException if {@code indexRow} or {@code indexColumn are out of range}
     * 		   (@code indexRow < 0 || rowSize() >= indexRow || indexColumn < 0 || columnSize() >= indexColumn)
     */
	Matrix<E> subMatrix(int indexRowRemove, int indexColumnRemove);

}