package collections2d;

import java.util.Objects;
import java.util.Iterator;
import java.util.Collection;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Consumer;

/**
 * Implementing this interface allows a collection to be two-dimensional,
 * making it able to iterate through its collections or "rows".
 * 
 * @param E the type of element each row returned by the {@code rowIterator} will be
 */
public interface Iterable2D<E> {

	/**
	 * Returns an iterator over the rows of type {@code Collection<E>}.
	 * 
	 * @return an iterator
	 */
	Iterator<Collection<E>> rowIterator();
	
	/**
	 * Performs the given action to each element of this {@code Iterable2D} instance
	 * until all elements have been processed or the action throws an exception.
	 * Actions are performed in order of iteration, if that order is specified by 
	 * its subclass.
	 * 
	 * @param action The action to be performed for each element
     * @throws NullPointerException if the specified action is null
	 */
	default void forEach(Consumer<? super E> action) {
		Objects.requireNonNull(action);
		Iterator<Collection<E>> rowItr = rowIterator();
		while (rowItr.hasNext())
			rowItr.next().forEach(action);
	}

	/**
	 * Creates a {@link Spliterator} over the rows of this {@code Iterable2D} instance.
	 * 
	 * @return a {@code Spliterator}
	 */
	default Spliterator<Collection<E>> spliterator() {
        return Spliterators.spliteratorUnknownSize(rowIterator(), 0);
    }
}
