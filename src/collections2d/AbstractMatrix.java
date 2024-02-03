package collections2d;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/**
 * This class provides a skeletal implementation of the {@link Matrix}
 * interface to minimize the effort required to implement this interface.
 *
 * <p>The programmer should generally provide a void (no argument) and collection
 * constructor, as per the recommendation in the {@link Collection} interface
 * specification.
 *
 * <p>Unlike the other abstract collection implementations, the programmer does
 * <i>not</i> have to provide an iterator implementation; the iterator and
 * matrix iterator are implemented by this class.
 *
 * <p>The documentation for each non-abstract method in this class describes its
 * implementation in detail.  Each of these methods may be overridden if the
 * collection being implemented admits a more efficient implementation.
 * 
 * @see AbstractCollection2D
 * @see Matrix
 * @see RegularMatrix
 *
 */
public abstract class AbstractMatrix<E> extends AbstractCollection2D<E> implements Matrix<E>{

	protected AbstractMatrix() {}

    /**
     * {@inheritDoc}
     *
     * @implSpec
     * This implementation first gets a matrix iterator (with
     * {@code matrixRowIterator()}). Then, it iterates over the rows until the
     * specified element is found or the end of the matrix is reached.
     *
     * @throws ClassCastException   {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
	public Point indexOf(Object o) {
		Point indexes = new Point(-1,-1);
		
		MatrixIterator<Collection<E>> rowsItr = matrixRowIterator();

		if (o == null) {
			while (rowsItr.hasNext()) {
				Collection<E> row = rowsItr.next();
				if (row != null) {
					ListIterator<E> colItr = new ArrayList<E>(row).listIterator();
					while (colItr.hasNext()) {
						if (colItr.next() == null) {
							indexes.x = rowsItr.nextIndex() -1;
							indexes.y = colItr.nextIndex() -1;
							return indexes;
						}
					}
				}
			}
		}
		else {
			while (rowsItr.hasNext()) {
				Collection<E> row = rowsItr.next();
				if (row != null) {
					ListIterator<E> colItr = new ArrayList<E>(row).listIterator();
					while (colItr.hasNext()) {
						if (o.equals(colItr.next())) {
							indexes.x = rowsItr.nextIndex() -1;
							indexes.y = colItr.nextIndex() -1;
							return indexes;
						}
					}
				}
			}
		}
		return null;
	}

    /**
     * {@inheritDoc}
     *
     * @implSpec
     * This implementation first gets a matrix iterator that points to the end
     * of the matrix (with {@code listIterator(rowSize())}).  Then, it iterates
     * backwards over the matrix until the specified element is found, or the
     * beginning of the matrix is reached.
     *
     * @throws ClassCastException   {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
	public Point lastIndexOf(Object o) {
		Point indexes = new Point(-1,-1);
		
		MatrixIterator<Collection<E>> rowsItr = matrixRowIterator(rowSize());

		if (o == null) {

			while (rowsItr.hasPrevious()) {
				Collection<E> row = rowsItr.previous();
				if (row != null) {
					ListIterator<E> colItr = new ArrayList<E>(row).listIterator(row.size());
					while (colItr.hasPrevious()) {
						if (colItr.previous() == null) {
							indexes.x = rowsItr.nextIndex();
							indexes.y = colItr.nextIndex();
							return indexes;
						}
					}
				}
			}

		} else {
			while (rowsItr.hasPrevious()) {
				Collection<E> row = rowsItr.previous();
				if (row != null) {
					ListIterator<E> colItr = new ArrayList<E>(row).listIterator(row.size());
					while (colItr.hasPrevious()) {
						if (o.equals(colItr.previous())) {
							indexes.x = rowsItr.nextIndex();
							indexes.y = colItr.nextIndex();
							return indexes;
						}
					}
				}
			}
		}
		return null;
	}
	
    /**
     * Appends the specified row to the end of this matrix (optional
     * operation).
     *
     * <p>Matrices that support this operation may place limitations on what
     * rows may be added to this matrix. Matrix classes should clearly specify 
     * in their documentation any restrictions on what elements may be added.
     *
     * @implSpec
     * This implementation calls {@code addRow(rowSize(), r)}.
     *
     * <p>This implementation throws an
     * {@code UnsupportedOperationException} unless
     * {@link #addRow(int, Collection)} is overridden.
     *
     * @param row row to be appended to this matrix
     * @return {@code true} (as specified by {@link Collection2D#addRow})
     * @throws UnsupportedOperationException if the {@code addRow} operation
     *         is not supported by this matrix
     * @throws ClassCastException if the class of the specified row
     *         prevents it from being added to this matrix
     * @throws NullPointerException if the specified row is null and this
     *         matrix does not permit null rows
     * @throws IllegalArgumentException if some property of this row
     *         prevents it from being added to this matrix
     */
	public boolean addRow(Collection<E> row) {
		addRow(rowSize(), row);
		return true;
	}

    /**
     * {@inheritDoc}
     *
     * @implSpec
     * This implementation always throws an
     * {@code UnsupportedOperationException}.
     *
     * @throws UnsupportedOperationException {@inheritDoc}
     * @throws ClassCastException            {@inheritDoc}
     * @throws NullPointerException          {@inheritDoc}
     * @throws IllegalArgumentException      {@inheritDoc}
     * @throws IndexOutOfBoundsException     {@inheritDoc}
     */
	public void addRow(int index, Collection<E> row) {
		throw new UnsupportedOperationException();
	}

    /**
     * Appends the specified column to the end of this matrix (optional
     * operation).
     *
     * <p>Matrices that support this operation may place limitations on what
     * columns may be added to this matrix. Matrix classes should clearly specify 
     * in their documentation any restrictions on what columns may be added.
     *
     * @implSpec
     * This implementation calls {@code addColumn(columnSize(), col)}.
     *
     * <p>This implementation throws an
     * {@code UnsupportedOperationException} unless
     * {@link #addColumn(int, Collection)} is overridden.
     *
     * @param col column to be appended to this matrix
     * @return {@code true} (as specified by {@link Matrix#addColumn})
     * @throws UnsupportedOperationException if the {@code addRow} operation
     *         is not supported by this matrix
     * @throws ClassCastException if the class of the specified row
     *         prevents it from being added to this matrix
     * @throws NullPointerException if the specified row is null and this
     *         matrix does not permit null rows
     * @throws IllegalArgumentException if some property of this row
     *         prevents it from being added to this matrix
     */
	public boolean addColumn(Collection<E> column) {
		addColumn(columnSize(), column);
		return true;
	}

    /**
     * {@inheritDoc}
     *
     * @implSpec
     * This implementation always throws an
     * {@code UnsupportedOperationException}.
     *
     * @throws UnsupportedOperationException {@inheritDoc}
     * @throws ClassCastException            {@inheritDoc}
     * @throws NullPointerException          {@inheritDoc}
     * @throws IllegalArgumentException      {@inheritDoc}
     * @throws IndexOutOfBoundsException     {@inheritDoc}
     */
	public void addColumn(int index, Collection<E> column) {
		throw new UnsupportedOperationException();
	}

    /**
     * Compares the specified object with this matrix for equality.  Returns
     * {@code true} if and only if the specified object is also a matrix, both
     * matrices have the same dimension, and all corresponding pairs of elements in
     * the two matrices are <i>equal</i>.  (Two elements {@code e1} and
     * {@code e2} are <i>equal</i> if {@code (e1==null ? e2==null :
     * e1.equals(e2))}.)  In other words, two matrices are defined to be
     * equal if they contain the same elements in the same order.
     *
     * @implSpec
     * This implementation first checks if the specified object is this
     * list. If so, it returns {@code true}; if not, it checks if the
     * specified object is a matrix. If not, it returns {@code false}; if so,
     * it iterates over both matrices, comparing corresponding pairs of elements.
     * If any comparison returns {@code false}, this method returns
     * {@code false}.  If either iterator runs out of elements before the
     * other it returns {@code false} (as the matrix are of unequal length);
     * otherwise it returns {@code true} when the iterations complete.
     *
     * @param o the object to be compared for equality with this matrix
     * @return {@code true} if the specified object is equal to this matrix
     */
	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof Matrix))
			return false;
		MatrixIterator<Collection<E>> rowItr1 = matrixRowIterator();
		MatrixIterator<?> rowItr2 = ((Matrix<?>) o).matrixRowIterator();
		while (rowItr1.hasNext() && rowItr2.hasNext()) {
			Iterator<E> row1 = rowItr1.next().iterator();
			Iterator<?> row2 = ((Collection<?>) rowItr2.next()).iterator();
			while (row1.hasNext() && row2.hasNext()) {
				E o1 = row1.next();
				Object o2 = row2.next();
	            if (!(o1==null ? o2==null : o1.equals(o2)))
	                return false;
			}
		}
		if (rowItr1.hasNext()) System.out.println("iter del this no terminó");
		if (rowItr2.hasNext()) System.out.println("iter del otro no terminó");
		return !(rowItr1.hasNext() || rowItr2.hasNext());
	}

    /**
     * Returns the hash code value for this matrix. The hash code of a
     * matrix is defined to be the sum of the hash codes of each row (collection).
     *
     * @return the hash code value for this matrix
     * @see Collection#hashCode()
     */
	public int hashCode() {
        int hashCode = 0;
        Iterator<Collection<E>> rowItr = rowIterator();
        while (rowItr.hasNext()) {
            hashCode += (rowItr.next().hashCode());
        }
        return hashCode == 0 ? 1 : hashCode;
	}


    /**
     * Returns an iterator over the rows in this matrix in proper sequence.
     *
     * @implSpec
     * This implementation returns a straightforward implementation of the
     * iterator interface, relying on the backing matrix's {@code rowSize()},
     * {@code getRow(int)}, and {@code removeRow(int)} methods.
     *
     * <p>Note that the iterator returned by this method will throw an
     * {@link UnsupportedOperationException} in response to its
     * {@code removeRow} method unless the matrix's {@code removeRow(int)} method is
     * overridden.
     *
     * @return an iterator over the rows in this matrix in proper sequence
     */
	public Iterator<Collection<E>> rowIterator() {
		return new RowItr();
	}

    /**
     * Returns an iterator over the columns in this matrix in proper sequence.
     *
     * @implSpec
     * This implementation returns a straightforward implementation of the
     * iterator interface, relying on the backing matrix's {@code columnSize()},
     * {@code getColumn(int)}, and {@code removeColumn(int)} methods.
     *
     * <p>Note that the iterator returned by this method will throw an
     * {@link UnsupportedOperationException} in response to its
     * {@code removeColumn} method unless the matrix's {@code removeColumn(int)} method is
     * overridden.
     *
     * @return an iterator over the rows in this matrix in proper sequence
     */
	public Iterator<Collection<E>> columnIterator() {
		return new ColumnItr();
	}

    /**
     * {@inheritDoc}
     *
     * @implSpec
     * This implementation returns {@code matrixRowIterator(0)}.
     *
     * @see #matrixRowIterator(int)
     */
	public MatrixIterator<Collection<E>> matrixRowIterator() {
		return matrixRowIterator(0);
	}

    /**
     * {@inheritDoc}
     *
     * @implSpec
     * This implementation returns a straightforward implementation of the
     * {@code MatrixIterator} interface that extends the implementation of the
     * {@code ListIterator} interface returned by the {@code iterator()} method.
     * The {@code MatrixIterator} implementation relies on the backing matrix's
     * {@code get(int)}, {@code set(int, E)}, {@code add(int, E)}
     * and {@code remove(int)} methods.
     *
     * <p>Note that the list iterator returned by this implementation will
     * throw an {@link UnsupportedOperationException} in response to its
     * {@code remove}, {@code set} and {@code add} methods unless the
     * matrix's {@code removeRow(int)}, {@code setRow(int, Collection)}, and
     * {@code addRow(int, Collection)} methods are overridden.
     *
     * @throws IndexOutOfBoundsException {@inheritDoc}
     */
	public MatrixIterator<Collection<E>> matrixRowIterator(int indexStart) {
		Objects.checkIndex(indexStart, rowSize() + 1);
		return new MatrixRowItr(indexStart);
	}

    /**
     * {@inheritDoc}
     *
     * @implSpec
     * This implementation returns {@code matrixColumnIterator(0)}.
     *
     * @see #matrixColumnIterator(int)
     */
	public MatrixIterator<Collection<E>> matrixColumnIterator() {
		return matrixColumnIterator(0);
	}

    /**
     * {@inheritDoc}
     *
     * @implSpec
     * This implementation returns a straightforward implementation of the
     * {@code MatrixIterator} interface that extends the implementation of the
     * {@code ListIterator} interface returned by the {@code iterator()} method.
     * The {@code MatrixIterator} implementation relies on the backing matrix's
     * {@code getColumn(int)}, {@code setColumn(int, Collection)}, {@code addColumn(int, Collection)}
     * and {@code removeColumn(int)} methods.
     *
     * <p>Note that the list iterator returned by this implementation will
     * throw an {@link UnsupportedOperationException} in response to its
     * {@code remove}, {@code set} and {@code add} methods unless the
     * matrix's {@code removeColumn(int)}, {@code setColumn(int, Collection)}, and
     * {@code addColumn(int, Collection)} methods are overridden.
     *
     * @throws IndexOutOfBoundsException {@inheritDoc}
     */
	public MatrixIterator<Collection<E>> matrixColumnIterator(int indexStart) {
		Objects.checkIndex(indexStart, columnSize() + 1);
		return new MatrixColumnItr(indexStart);
	}
	
	
	private class RowItr implements Iterator<Collection<E>>{
        /**
         * Index of row to be returned by subsequent call to next.
         */
		int cursor = 0;
		
        /**
         * Index of row returned by most recent call to next or
         * previous.  Reset to -1 if this row is deleted by a call
         * to remove.
         */
		int lastRet = -1;

		public boolean hasNext() {
			return cursor != rowSize();
		}

		public Collection<E> next() {
			try {
				int i = cursor;
				Collection<E> nextRow = getRow(i);
				lastRet = i;
				cursor = i + 1;
				return nextRow;
			} catch (IndexOutOfBoundsException e) {
				throw new NoSuchElementException();
			}
		}

		public void remove() {
			if (lastRet < 0)
				throw new IllegalStateException();
			AbstractMatrix.this.removeRow(lastRet);
			if (lastRet < cursor)
				cursor--;
			lastRet = -1;
		}	
	}

	private class ColumnItr implements Iterator<Collection<E>>{
        /**
         * Index of column to be returned by subsequent call to next.
         */
		int cursor = 0;

        /**
         * Index of column returned by most recent call to next or
         * previous.  Reset to -1 if this column is deleted by a call
         * to remove.
         */
		int lastRet = -1;

		public boolean hasNext() {
			return cursor != columnSize();
		}

		public Collection<E> next() {
			try {
				int i = cursor;
				Collection<E> nextColumn = getColumn(i);
				lastRet = i;
				cursor = i + 1;
				return nextColumn;
			} catch (IndexOutOfBoundsException e) {
				throw new NoSuchElementException();
			}
		}

		public void remove() {
			if (lastRet < 0)
				throw new IllegalStateException();
			AbstractMatrix.this.removeColumn(lastRet);
			if (lastRet < cursor)
				cursor--;
			lastRet = -1;
		}
	}
	
	private class MatrixRowItr extends RowItr implements MatrixIterator<Collection<E>>{

		MatrixRowItr(int indexStart) {
			cursor = indexStart;
		}

		@Override
		public boolean hasPrevious() {
			return cursor != 0;
		}

		@Override
		public Collection<E> previous() {
			try {
				int i = cursor - 1;
				Collection<E> previousRow = getRow(i);
				lastRet = cursor = i;
				return previousRow;
			} catch (IndexOutOfBoundsException e) {
				throw new NoSuchElementException();
			}
		}

		@Override
		public int nextIndex() {
			return cursor;
		}

		@Override
		public int previousIndex() {
			return cursor - 1;
		}

		@Override
		public void set(Collection<E> newRow) {
			if (lastRet < 0)
				throw new IllegalStateException();
			AbstractMatrix.this.setRow(lastRet, newRow);

		}

		@Override
		public void add(Collection<E> newRow) {
			int i = cursor;
			AbstractMatrix.this.addRow(i,newRow);
			lastRet = -1;
			cursor = i + 1;
		}

	}

	private class MatrixColumnItr extends ColumnItr implements MatrixIterator<Collection<E>>{

		MatrixColumnItr(int indexStart) {
			cursor = indexStart;
		}

		@Override
		public boolean hasPrevious() {
			return cursor != 0;
		}

		@Override
		public Collection<E> previous() {
			try {
				int i = cursor - 1;
				Collection<E> previousColumn = getColumn(i);
				lastRet = cursor = i;
				return previousColumn;
			} catch (IndexOutOfBoundsException e) {
				throw new NoSuchElementException();
			}
		}

		@Override
		public int nextIndex() {
			return cursor;
		}

		@Override
		public int previousIndex() {
			return cursor - 1;
		}

		@Override
		public void set(Collection<E> newColumn) {
			if (lastRet < 0)
				throw new IllegalStateException();
			AbstractMatrix.this.setColumn(lastRet, newColumn);

		}

		@Override
		public void add(Collection<E> newColumn) {
			int i = cursor;
			AbstractMatrix.this.addColumn(i, newColumn);
			lastRet = -1;
			cursor = i + 1;
		}
	}

	/**
	 * {@inheritDoc}
	 * @implSpec This implementation always throws an {@code UnsupportedOperationException}.
	 */
	public Matrix<E> subMatrix(int indexRow, int indexColumn){
		// TODO someday
		throw new UnsupportedOperationException();
	}
}