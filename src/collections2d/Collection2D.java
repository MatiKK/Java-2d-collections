package collections2d;

import java.util.Collection;
import java.util.Iterator;

/**
 * A two-dimensional collection which is basically a collection of collections.
 * Since some collections allow duplicate elements and others do not, or some are ordered
 * and others unordered, there is a necessity of creating an abstraction of two-dimensional collections
 * to operate simultaneously with collections of the same type.<p>
 * The different collections that this two-dimensional collection has are internally called "rows", so as not to
 * make it so confused.
 * This interface does not extends from {@link Collection}, but has its same basis and principles.
 * @see Collection
 * 
 * @param <E> the type of elements in this two-dimensional collection
 */
public interface Collection2D<E> extends Iterable2D<E> {

	// query methods

    /**
     * Returns the number of rows in this two-dimensional collection.
     * If this two-dimensional collection contains more than 
     * {@code Integer.MAX_VALUE} rows, returns {@code Integer.MAX_VALUE}.
     *
     * @return the number of rows in this two-dimensional collection
     */
	int rowSize();

    /**
     * Returns the number of elements in this two-dimensional collection.
     * If this two-dimensional collection contains more than 
     * {@code Integer.MAX_VALUE} elements, returns {@code Integer.MAX_VALUE}.
     *
     * @return the number of elements in this two-dimensional collection
     */
	int totalSize();

	/**
	 * Returns {@code true} if this two-dimensional collection has no elements.
	 * @return {@code true} if this two-dimensional collection has no elements
	 */
	boolean isEmpty();

	/**
	 * Returns {@code true} if this two-dimensional collection contains the specified element.
	 * In another way, returns {@code true} there is at least one row that contains as least
	 * one element {@code e} such that {@code Objects.equals(o,e)}.
	 * 
	 * @param o element whose presence in this two-dimensional collection is to be tested
	 * @return {@code true} if this two-dimensional collection contains the specified element
	 * @throws ClassCastOperation if the type of the specified element is incompatible with this two-dimensional collection
	 * @throws NullPointerException if the specified element is null and this two-dimensional collection
	 * does not permit null elements
	 */
	boolean contains(Object o);

    /**
     * Returns an iterator over the rows in this two-dimensional collection. 
     * There are no guarantees concerning the order in which the rows are returned
     * (unless this two-dimensional collection is an instance of some class that provides a
     * guarantee).
     *
     * @return an {@code Iterator} over the rows in this two-dimensional collection
     */
	Iterator<Collection<E>> rowIterator();

    /**
     * Returns {@code true} if this two-dimensional collection contains all of the elements
     * in the specified collection.
     *
     * @param  c collection to be checked for containment in this two-dimensional collection
     * @return {@code true} if this two-dimensional collection contains all of the elements
     *         in the specified collection
     * @throws ClassCastException if the types of one or more elements
     *         in the specified collection are incompatible with this
     *         two-dimensional collection
     * @throws NullPointerException if the specified collection contains one
     *         or more null elements and this two-dimensional collection does not permit null
     *         elements or if the specified collection is null.
     * @see    #contains(Object)
     */
	boolean containsAll(Collection<?> c);

	// métodos modificación

    /**
     * Ensures that this two-dimensional collection contains the specified row (optional
     * operation).  Returns {@code true} if this two-dimensional collection changed as a
     * result of the call.  (Returns {@code false} if this two-dimensional collection does
     * not permit duplicates and already contains the specified row.)<p>
     *
     * Two-dimensional collections that support this operation may place limitations on what
     * rows may be added to this two-dimensional collection.  In particular, some
     * two-dimensional collections will refuse to add {@code null} rows or rows that contain null elements,
     * and others will impose restrictions on the type of rows that may be added.
     * Two-dimensional collection classes should clearly specify in their documentation any
     * restrictions on what rows may be added.<p>
     *
     * If a two-dimensional collection refuses to add a particular row for any reason
     * other than that it already contains the element, it <i>must</i> throw
     * an exception (rather than returning {@code false}).  This preserves
     * the invariant that a two-dimensional collection always contains the specified row
     * after this call returns.
     *
     * @param row row whose presence in this collection is to be ensured
     * @return {@code true} if this two-dimensional collection changed as a result of the
     *         call
     * @throws UnsupportedOperationException if the {@code add} operation
     *         is not supported by this two-dimensional collection
     * @throws ClassCastException if the class of the specified row
     *         prevents it from being added to this two-dimensional collection
     * @throws NullPointerException if the specified row is null and this
     *         two-dimensional collection does not permit null elements or if
     *         the specified row contains null elements
     * @throws IllegalArgumentException if some property of the row
     *         prevents it from being added to this two-dimensional collection
     * @throws IllegalStateException if the row cannot be added at this
     *         time due to insertion restrictions
     */
	boolean addRow(Collection<E> row);

    /**
     * Removes a single instance of the specified element from this
     * two-dimensional collection, if it is present (optional operation). More formally,
     * removes an element {@code e} such that
     * {@code Objects.equals(o, e)}, if
     * this two-dimensional collection contains one or more such elements.  Returns
     * {@code true} if this two-dimensional collection contained the specified element (or
     * equivalently, if this two-dimensional collection changed as a result of the call).
     *
     * @param o element to be removed from this two-dimensional collection, if present
     * @return {@code true} if an element was removed as a result of this call
     * @throws ClassCastException if the type of the specified element
     *         is incompatible with this two-dimensional collection
     * @throws NullPointerException if the specified element is null and this
     *         two-dimensional collection does not permit null elements
     * @throws UnsupportedOperationException if the {@code remove} operation
     *         is not supported by this two-dimensional collection
     */
	boolean removeElement(Object o);
	
    /**
     * Removes all of this two-dimensional collection's elements that are also contained in the
     * specified collection (optional operation).  After this call returns,
     * this two-dimensional collection will contain no elements in common with the specified
     * collection.
     *
     * @param c collection containing elements to be removed from this two-dimensional collection
     * @return {@code true} if this two-dimensional collection changed as a result of the
     *         call
     * @throws UnsupportedOperationException if the {@code removeAll} method
     *         is not supported by this two-dimensional collection
     * @throws ClassCastException if the types of one or more elements
     *         in this two-dimensional collection are incompatible with the specified
     *         collection
     * @throws NullPointerException if this two-dimensional collection contains one or more
     *         null elements and the specified collection does not support
     *         null elements
     *         or if the specified collection is null
     * @see #remove(Object)
     * @see #contains(Object)
     */
	boolean removeAll(Collection<?> c);
	
    /**
     * Retains only the elements in this two-dimensional collection that are contained in the
     * specified collection (optional operation).  In other words, removes from
     * this two-dimensional collection all of its elements that are not contained in the
     * specified collection.
     *
     * @param c collection containing elements to be retained in this two-dimensional collection
     * @return {@code true} if this two-dimensional collection changed as a result of the call
     * @throws UnsupportedOperationException if the {@code retainAll} operation
     *         is not supported by this two-dimensional collection
     * @throws ClassCastException if the types of one or more elements
     *         in this two-dimensional collection are incompatible with the specified
     *         collection
     * @throws NullPointerException if this two-dimensional collection contains one or more
     *         null elements and the specified collection does not permit null
     *         elements
     *         or if the specified collection is null
     * @see #remove(Object)
     * @see #contains(Object)
     */
	boolean retainAll(Collection<?> c);
	
    /**
     * Removes all of the elements from this two-dimensional collection (optional operation).
     * The collection will be empty after this method returns.
     *
     * @throws UnsupportedOperationException if the {@code clear} operation
     *         is not supported by this two-dimensional collection
     */
	void clear();

	// Hashing and comparison methods

    /**
     * Compares the specified object with this two-dimensional collection for equality.

     * @param o object to be compared for equality with this two-dimensional collection
     * @return {@code true} if the specified object is equal to this two-dimensional collection
     *
     * @see Object#equals(Object)
     * @see Collection#equals(Object)
     */
	boolean equals(Object o);

    /**
     * Returns the hash code value for this two-dimensional collection.
     *programmers should take note that any class that overrides the {@code Object.equals}
     * method must also override the {@code Object.hashCode} method in order
     * to satisfy the general contract for the {@code Object.hashCode} method.
     * In particular, {@code c1.equals(c2)} implies that
     * {@code c1.hashCode()==c2.hashCode()}.
     * @return the hash code value for this two-dimensional collection
     *
     * @see Collection#hashCode()
     * @see Collection#equals(Object)
     */
	int hashCode();

}
