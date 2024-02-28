package collections2d;
import java.util.Collection;
import java.util.Objects;
/**
 * Abstract class representing the basics of a regular matrix, a matrix where
 * all its rows AND columns have strictly the same size. An {@linkplain IncompatibleCollectionSizeException}
 * will be thrown in the case you want to add a row or a column that does not match
 * with the current matrix dimensions.
 * 
 * @see Matrix
 * @see AbstractMatrix
 * @see RegularMatrix
 * @See {@link algebra.AlgebraicMatrix}
 */
public abstract class AbstractRegularMatrix<E> extends AbstractMatrix<E> {

	@Override
	public void addRow(int index, Collection<E> row) {
		Objects.checkIndex(index, rowSize() + 1);
		checkRowCompability(row);
	}

	@Override
	public void addColumn(int index, Collection<E> column) {
		Objects.checkIndex(index, columnSize() + 1);
		checkColumnCompability(column);
	}

	protected void checkRowCompability(Collection<E> row) {
		if (row == null)
			throw new NullPointerException();
		if (!isEmpty() && row.size() != columnSize())
			throw new IncompatibleCollectionSizeException();
	}
	protected void checkColumnCompability(Collection<E> column) {
		if (column == null)
			throw new NullPointerException();
		if (!isEmpty() && column.size() != rowSize())
			throw new IncompatibleCollectionSizeException();
	}
}
