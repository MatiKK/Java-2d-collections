package collections2d;

import java.util.Iterator;
import java.util.AbstractCollection;
import java.util.Collection;

/**
 * This class provides a skeletal implementation of the {@code Collection2D}
 * interface, to minimize the effort required to implement this interface. <p>
 * 
 * The documentation for each non-abstract method in this class describes its
 * implementation in detail.  Each of these methods may be overridden if
 * the two-dimensional collection being implemented admits a more efficient implementation.<p>
 *
 * @see Collection2D
 * @see AbstractCollection
 * 
 */
public abstract class AbstractCollection2D<E> implements Collection2D<E>{

	protected AbstractCollection2D() {}

	public abstract Iterator<Collection<E>> rowIterator();
	
	public abstract int rowSize();
	
	public abstract int totalSize();
	
    /**
     * {@inheritDoc}
     *
     * @implSpec
     * This implementation returns {@code size() == 0}.
     */
	public boolean isEmpty() {
		return totalSize() == 0;
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @implSpec
	 * This implementation iterates through the rows of this
	 * two-dimensional collection and checks if any of its rows
	 * contains the specified element.
	 * 
	 * @throws ClassCastOperation {@inheritDoc}
	 * @throws NullPointerException {@inheritDoc}
	 */
	public boolean contains(Object o) {
		Iterator<Collection<E>> rowItr = rowIterator();
		while (rowItr.hasNext())
			if (rowItr.next().contains(o))
				return true;
		return false;
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
     * @throws IllegalStateException         {@inheritDoc}
     */
	public boolean addRow(Collection<E> row) {
		throw new UnsupportedOperationException();
	}
	
    /**
     * {@inheritDoc}
     *
     * @implSpec
     * This implementation iterates over the two-dimensional collection looking for the
     * specified element.  If it finds the element, it removes the element
     * from the row where it was found ({@linkplain Collection#remove(Object)}).
     * This implementation throws an {@code UnsupportedOperationException}
     * if the iterator returned by the row where the element was found
     * does not implement the {@code remove} method and this collection contains the specified object.
     *
     * @throws UnsupportedOperationException {@inheritDoc}
     * @throws ClassCastException            {@inheritDoc}
     * @throws NullPointerException          {@inheritDoc}
     */
	public boolean removeElement(Object o) {
		Iterator<Collection<E>> rowItr = rowIterator();
		if (o == null) {
			Iterator<E> row = rowItr.next().iterator();
			while (row.hasNext()) {
				if (row.next() == null) {
					row.remove();
					return true;
				}
			}
		} else {
			Iterator<E> row = rowItr.next().iterator();
			while (row.hasNext()) {
				if (o.equals(row.next())) {
					row.remove();
					return true;
				}
			}
		}
		return false;
	}

    /**
     * {@inheritDoc}
     *
     * @implSpec
     * This implementation iterates over the specified collection,
     * checking each element returned by the iterator in turn to see
     * if it's contained in this two-dimensional collection.  If all elements are so
     * contained {@code true} is returned, otherwise {@code false}.
     *
     * @throws ClassCastException            {@inheritDoc}
     * @throws NullPointerException          {@inheritDoc}
     * @see #contains(Object)
     */
	public boolean containsAll(Collection<?> c) {
		for (Object o: c)
			if (!contains(o))
				return false;
		return true;
	}
	
    /**
     * {@inheritDoc}
     *
     * @implSpec
     * This implementation iterates over this two-dimensional collection, checking each
     * element returned by the iterators of each row in turn to see if it's contained
     * in the specified collection.  If it's so contained, it's removed from
     * this collection with the iterator's {@code remove} method of its row.
     *
     * This implementation will throw an
     * {@code UnsupportedOperationException} if the iterator returned by the
     * {@code iterator} method of the row where the element was found
     * does not implement the {@code remove} method
     * and this two-dimensional collection contains one or more elements in common with the
     * specified collection.
     *
     * @throws UnsupportedOperationException {@inheritDoc}
     * @throws ClassCastException            {@inheritDoc}
     * @throws NullPointerException          {@inheritDoc}
     *
     * @see #remove(Object)
     * @see #contains(Object)
     */
	public boolean removeAll(Collection<?> c) {
		boolean removedSomething = false;
		Iterator<Collection<E>> rowItr = rowIterator();
		while (rowItr.hasNext()) {
			Iterator<E> row = rowItr.next().iterator();
			while (row.hasNext()) {
				if (c.contains(row.next())) {
					row.remove();
					removedSomething = true;
				}
			}
		}
		return removedSomething;
	}

    /**
     * {@inheritDoc}
     *
     * @implSpec
     * This implementation iterates over this two-dimensional collection, checking each
     * element returned by the iterator of each row in turn to see if it's contained
     * in the specified collection.  If it's not so contained, it's removed
     * from this two-dimensional collection with the iterator's {@code remove} method of its row.
     *
     * This implementation will throw an
     * {@code UnsupportedOperationException} if the iterator returned by the
     * {@code iterator} method of the row does not implement the {@code remove} method
     * and this two-dimensional collection contains one or more elements not present in the
     * specified collection.
     *
     * @throws UnsupportedOperationException {@inheritDoc}
     * @throws ClassCastException            {@inheritDoc}
     * @throws NullPointerException          {@inheritDoc}
     *
     * @see #remove(Object)
     * @see #contains(Object)
     */
	public boolean retainAll(Collection<?> c) {
		boolean removedSomething = false;
		Iterator<Collection<E>> rowItr = rowIterator();
		while (rowItr.hasNext()) {
			Iterator<E> row = rowItr.next().iterator();
			while (row.hasNext()) {
				if (!c.contains(row.next())) {
					row.remove();
					removedSomething = true;
				}
			}
		}
		return removedSomething;
	}
	
    /**
     * {@inheritDoc}
     *
     * @implSpec
     * This implementation iterates over this two-dimensional collection, removing each
     * row using the {@code Iterator.remove} operation.  Most
     * implementations will probably choose to override this method for
     * efficiency.
     *
     * <p> This implementation will throw an
     * {@code UnsupportedOperationException} if the iterator returned by this
     * two-dimensional collection's {@code iterator} method does not implement the
     * {@code remove} method and this two-dimensional collection is non-empty.
     *
     * @throws UnsupportedOperationException {@inheritDoc}
     */
	public void clear() {
		Iterator<Collection<E>> rowItr = rowIterator();
		while(rowItr.hasNext()) {
			rowItr.next();
			rowItr.remove();
		}
	}

    /**
     * Returns a string representation of this two-dimensional collection.  The string
     * representation consists of each row of this two-dimensional collection separated by
     * a line break in the
     * order they are returned by its iterator.
     * Rows are converted to strings as
     * by {@link String#valueOf(Collection)}.
     *
     * @return a string representation of this two-dimensional collection
     */
	public String toString() {
		Iterator<Collection<E>> rowsItr = rowIterator();
		if (!rowsItr.hasNext()) return "[]";
		StringBuilder sb = new StringBuilder();
		for (;;) {
			Collection<E> row = rowsItr.next();
			sb.append(row == null? "[Null row]" : row.isEmpty()? "[Empty row]" : row);
			if (!rowsItr.hasNext()) return sb.toString();
			sb.append('\n');
		}
	}
	
}
