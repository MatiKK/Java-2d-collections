package algebra;

import java.util.Collection;

/**
 * Just used to write the java-doc here and not in AlgebraicMatrix.java x d
 */
public interface NumericMatrixForAlgebra {

	/* ------------------------------- addRow() with no index -----------------------------------------------------*/
	
    /**
     * Appends the specified row to the end of this matrix.
     * 
     * @param row row to be appended to this matrix
     * @return {@code true} (as specified by {@link Collection2D#addRow})
     * @throws NullPointerException if the specified row is null
     * @throws IllegalArgumentException if the row is incompatible (the length of
	 *                                  the row is different than the number of
	 *                                  columns this matrix has)
     */
	public boolean addRow(int[] row);

    /**
	 * Appends the specified row to the end of this matrix.
	 * 
	 * @param row row to be appended to this matrix
	 * @return {@code true} (as specified by {@link Collection2D#addRow})
	 * @throws NullPointerException     if the specified row is null
	 * @throws IllegalArgumentException if the row is incompatible (the length of
	 *                                  the row is different than the number of
	 *                                  columns this matrix has)
	 */	
	public boolean addRow(byte[] row);

    /**
     * Appends the specified row to the end of this matrix.
     * 
     * @param row row to be appended to this matrix
     * @return {@code true} (as specified by {@link Collection2D#addRow})
     * @throws NullPointerException if the specified row is null
     * @throws IllegalArgumentException if the row is incompatible (the length of
	 *                                  the row is different than the number of
	 *                                  columns this matrix has)
     */
	public boolean addRow(short[] row);

    /**
     * Appends the specified row to the end of this matrix.
     * 
     * @param row row to be appended to this matrix
     * @return {@code true} (as specified by {@link Collection2D#addRow})
     * @throws NullPointerException if the specified row is null
     *  @throws IllegalArgumentException if the row is incompatible (the length of
	 *                                  the row is different than the number of
	 *                                  columns this matrix has)
     */
	public boolean addRow(long[] row);

	/**
     * Appends the specified row to the end of this matrix.
     * 
     * @param row row to be appended to this matrix
     * @return {@code true} (as specified by {@link Collection2D#addRow})
     * @throws NullPointerException if the specified row is null
     *  @throws IllegalArgumentException if the row is incompatible (the length of
	 *                                  the row is different than the number of
	 *                                  columns this matrix has)
     */
	public boolean addRow(float[] row);

	/**
     * Appends the specified row to the end of this matrix.
     * 
     * @param row row to be appended to this matrix
     * @return {@code true} (as specified by {@link Collection2D#addRow})
     * @throws NullPointerException if the specified row is null
     *  @throws IllegalArgumentException if the row is incompatible (the length of
	 *                                  the row is different than the number of
	 *                                  columns this matrix has)
     */
	public boolean addRow(double[] row);

	/**
     * Appends the specified row to the end of this matrix.
     * @param <T> The generic type parameter representing elements that extends {@code Number}
     * @param row row to be appended to this matrix
     * @return {@code true} (as specified by {@link Collection2D#addRow})
     * @throws NullPointerException if the specified row is null
     * @throws IllegalArgumentException if the row is incompatible (the length of
	 *                                  the row is different than the number of
	 *                                  columns this matrix has) or if the row
	 *                                  contains null elements
     */
	public <T extends Number> boolean addRow(T[] row);

/* ------------------------------- addRow() by index -----------------------------------------------------*/

    /**
     * Inserts the specified row at the specified position in this
     * matrix. Shifts the row currently at that position (if any) and
     * any subsequent rows to the right (adds one to their indices).
     *
     * @param index index at which the specified element is to be inserted
     * @param row row to be inserted
     * 
 	 * @throws NullPointerException     if the row is null
     * @throws IndexOutOfBoundsException if the index is out of range
     *         ({@code index < 0 || index > rowSize()})
	 * @throws IllegalArgumentException if the row is incompatible (the length of
	 *                                  the row is different than the number of
	 *                                  columns this matrix has)
     */
	public void addRow(int index, int[] row);

    /**
     * Inserts the specified row at the specified position in this
     * matrix. Shifts the row currently at that position (if any) and
     * any subsequent rows to the right (adds one to their indices).
     *
     * @param index index at which the specified element is to be inserted
     * @param row row to be inserted
     * 
 	 * @throws NullPointerException     if the row is null
     * @throws IndexOutOfBoundsException if the index is out of range
     *         ({@code index < 0 || index > rowSize()})
	 * @throws IllegalArgumentException if the row is incompatible (the length of
	 *                                  the row is different than the number of
	 *                                  columns this matrix has)
     */
	public void addRow(int index, byte[] row);

    /**
     * Inserts the specified row at the specified position in this
     * matrix. Shifts the row currently at that position (if any) and
     * any subsequent rows to the right (adds one to their indices).
     *
     * @param index index at which the specified element is to be inserted
     * @param row row to be inserted
     * 
 	 * @throws NullPointerException     if the row is null
     * @throws IndexOutOfBoundsException if the index is out of range
     *         ({@code index < 0 || index > rowSize()})
	 * @throws IllegalArgumentException if the row is incompatible (the length of
	 *                                  the row is different than the number of
	 *                                  columns this matrix has)
     */
	public void addRow(int index, short[] row);

    /**
     * Inserts the specified row at the specified position in this
     * matrix. Shifts the row currently at that position (if any) and
     * any subsequent rows to the right (adds one to their indices).
     *
     * @param index index at which the specified element is to be inserted
     * @param row row to be inserted
     * 
 	 * @throws NullPointerException     if the row is null
     * @throws IndexOutOfBoundsException if the index is out of range
     *         ({@code index < 0 || index > rowSize()})
	 * @throws IllegalArgumentException if the row is incompatible (the length of
	 *                                  the row is different than the number of
	 *                                  columns this matrix has)
     */
	public void addRow(int index, long[] row);

    /**
     * Inserts the specified row at the specified position in this
     * matrix. Shifts the row currently at that position (if any) and
     * any subsequent rows to the right (adds one to their indices).
     *
     * @param index index at which the specified element is to be inserted
     * @param row row to be inserted
     * 
 	 * @throws NullPointerException     if the row is null
     * @throws IndexOutOfBoundsException if the index is out of range
     *         ({@code index < 0 || index > rowSize()})
	 * @throws IllegalArgumentException if the row is incompatible (the length of
	 *                                  the row is different than the number of
	 *                                  columns this matrix has)
     */
	public void addRow(int index, float[] row);

    /**
     * Inserts the specified row at the specified position in this
     * matrix. Shifts the row currently at that position (if any) and
     * any subsequent rows to the right (adds one to their indices).
     *
     * @param index index at which the specified element is to be inserted
     * @param row row to be inserted
     * 
 	 * @throws NullPointerException     if the row is null
     * @throws IndexOutOfBoundsException if the index is out of range
     *         ({@code index < 0 || index > rowSize()})
	 * @throws IllegalArgumentException if the row is incompatible (the length of
	 *                                  the row is different than the number of
	 *                                  columns this matrix has)
     */
	public void addRow(int index, double[] row);

    /**
     * Inserts the specified row at the specified position in this
     * matrix. Shifts the row currently at that position (if any) and
     * any subsequent rows to the right (adds one to their indices).
     *
     * @param <T> The generic type parameter representing elements that extends {@code Number}
     * @param index index at which the specified element is to be inserted
     * @param row row to be inserted
     * 
 	 * @throws NullPointerException     if the row is null
     * @throws IndexOutOfBoundsException if the index is out of range
     *         ({@code index < 0 || index > rowSize()})
	 * @throws IllegalArgumentException if the row is incompatible (the length of
	 *                                  the row is different than the number of
	 *                                  columns this matrix has)
	 *                                  or if the row contains null elements
     */
	public <T extends Number> void addRow(int index, T[] row);

	/* ------------------------------- addColumn() with no index -----------------------------------------------------*/

    /**
     * Appends the specified column to the end of this matrix
     * 
     * @param column column to be appended to this matrix
     * @return {@code true} (as specified by {@link Collection#add})
     * 
     * @throws NullPointerException if the specified column is null
	 * @throws IllegalArgumentException if the column is incompatible (the length of
	 *                                  the column is different than the number of
	 *                                  rows this matrix has)
     */
	public boolean addColumn(int[] column);

	/**
     * Appends the specified column to the end of this matrix
     * 
     * @param column column to be appended to this matrix
     * @return {@code true} (as specified by {@link Collection#add})
     * 
     * @throws NullPointerException if the specified column is null
	 * @throws IllegalArgumentException if the column is incompatible (the length of
	 *                                  the column is different than the number of
	 *                                  rows this matrix has)
     */
	public boolean addColumn(byte[] column);

    /**
     * Appends the specified column to the end of this matrix
     * 
     * @param column column to be appended to this matrix
     * @return {@code true} (as specified by {@link Collection#add})
     * 
     * @throws NullPointerException if the specified column is null
	 * @throws IllegalArgumentException if the column is incompatible (the length of
	 *                                  the column is different than the number of
	 *                                  rows this matrix has)
     */
	public boolean addColumn(short[] column);

    /**
     * Appends the specified column to the end of this matrix
     * 
     * @param column column to be appended to this matrix
     * @return {@code true} (as specified by {@link Collection#add})
     * 
     * @throws NullPointerException if the specified column is null
	 * @throws IllegalArgumentException if the column is incompatible (the length of
	 *                                  the column is different than the number of
	 *                                  rows this matrix has)
     */
	public boolean addColumn(long[] column);

    /**
     * Appends the specified column to the end of this matrix
     * 
     * @param column column to be appended to this matrix
     * @return {@code true} (as specified by {@link Collection#add})
     * 
     * @throws NullPointerException if the specified column is null
	 * @throws IllegalArgumentException if the column is incompatible (the length of
	 *                                  the column is different than the number of
	 *                                  rows this matrix has)
     */
	public boolean addColumn(float[] column);

    /**
     * Appends the specified column to the end of this matrix
     * 
     * @param column column to be appended to this matrix
     * @return {@code true} (as specified by {@link Collection#add})
     * 
     * @throws NullPointerException if the specified column is null
	 * @throws IllegalArgumentException if the column is incompatible (the length of
	 *                                  the column is different than the number of
	 *                                  rows this matrix has)
     */
	public boolean addColumn(double[] column);

	/**
     * Appends the specified column to the end of this matrix
     * 
     * @param <T> The generic type parameter representing elements that extends {@code Number}
     * @param column column to be appended to this matrix
     * @return {@code true} (as specified by {@link Collection#add})
     * 
     * @throws NullPointerException if the specified column is null
	 * @throws IllegalArgumentException if the column is incompatible (the length of
	 *                                  the column is different than the number of
	 *                                  rows this matrix has)
	 *                                  or if this row contains null elements
     */
	public <T extends Number> boolean addColumn(T[] column);

	/*--------------------------------addColumn() by index -----------------------------------------------------------*/
	
    /**
     * Inserts the specified column at the specified position in this
     * matrix. Shifts the column currently at that position (if any) and
     * any subsequent column to the right (adds one to their indices).
     *
     * @param index index at which the specified column is to be inserted
     * @param column column to be inserted
 	 * @throws NullPointerException     if the column is null
     * @throws IndexOutOfBoundsException if the index is out of range
     *         ({@code index < 0 || index > columnSize()})
	 * @throws IllegalArgumentException if the column is incompatible (the length of
	 *                                  the column is different than the number of
	 *                                  rows this matrix has)
     */
	public void addColumn(int index, int[] column);

    /**
     * Inserts the specified column at the specified position in this
     * matrix. Shifts the column currently at that position (if any) and
     * any subsequent column to the right (adds one to their indices).
     *
     * @param index index at which the specified column is to be inserted
     * @param column column to be inserted
 	 * @throws NullPointerException     if the column is null
     * @throws IndexOutOfBoundsException if the index is out of range
     *         ({@code index < 0 || index > columnSize()})
	 * @throws IllegalArgumentException if the column is incompatible (the length of
	 *                                  the column is different than the number of
	 *                                  rows this matrix has)
     */
	public void addColumn(int index, byte[] column);

    /**
     * Inserts the specified column at the specified position in this
     * matrix. Shifts the column currently at that position (if any) and
     * any subsequent column to the right (adds one to their indices).
     *
     * @param index index at which the specified column is to be inserted
     * @param column column to be inserted
 	 * @throws NullPointerException     if the column is null
     * @throws IndexOutOfBoundsException if the index is out of range
     *         ({@code index < 0 || index > columnSize()})
	 * @throws IllegalArgumentException if the column is incompatible (the length of
	 *                                  the column is different than the number of
	 *                                  rows this matrix has)
     */
	public void addColumn(int index, short[] column);	

    /**
     * Inserts the specified column at the specified position in this
     * matrix. Shifts the column currently at that position (if any) and
     * any subsequent column to the right (adds one to their indices).
     *
     * @param index index at which the specified column is to be inserted
     * @param column column to be inserted
 	 * @throws NullPointerException     if the column is null
     * @throws IndexOutOfBoundsException if the index is out of range
     *         ({@code index < 0 || index > columnSize()})
	 * @throws IllegalArgumentException if the column is incompatible (the length of
	 *                                  the column is different than the number of
	 *                                  rows this matrix has)
     */
	public void addColumn(int index, long[] column);	

    /**
     * Inserts the specified column at the specified position in this
     * matrix. Shifts the column currently at that position (if any) and
     * any subsequent column to the right (adds one to their indices).
     *
     * @param index index at which the specified column is to be inserted
     * @param column column to be inserted
 	 * @throws NullPointerException     if the column is null
     * @throws IndexOutOfBoundsException if the index is out of range
     *         ({@code index < 0 || index > columnSize()})
	 * @throws IllegalArgumentException if the column is incompatible (the length of
	 *                                  the column is different than the number of
	 *                                  rows this matrix has)
     */
	public void addColumn(int index, float[] column);	

    /**
     * Inserts the specified column at the specified position in this
     * matrix. Shifts the column currently at that position (if any) and
     * any subsequent column to the right (adds one to their indices).
     *
     * @param index index at which the specified column is to be inserted
     * @param column column to be inserted
 	 * @throws NullPointerException     if the column is null
     * @throws IndexOutOfBoundsException if the index is out of range
     *         ({@code index < 0 || index > columnSize()})
	 * @throws IllegalArgumentException if the column is incompatible (the length of
	 *                                  the column is different than the number of
	 *                                  rows this matrix has)
     */
	public void addColumn(int index, double[] column);	

    /**
     * Inserts the specified column at the specified position in this
     * matrix. Shifts the column currently at that position (if any) and
     * any subsequent column to the right (adds one to their indices).
     *
     * @param <T> The generic type parameter representing elements that extends {@code Number}
     * @param index index at which the specified column is to be inserted
     * @param column column to be inserted
 	 * @throws NullPointerException     if the column is null
     * @throws IndexOutOfBoundsException if the index is out of range
     *         ({@code index < 0 || index > columnSize()})
	 * @throws IllegalArgumentException if the column is incompatible (the length of
	 *                                  the column is different than the number of
	 *                                  rows this matrix has)
	 *                                  or if this column contains null elements
     */
	public <T extends Number> void addColumn(int indexRow, T[] column);

	/*------------------------------setRow() --------------------------------------------------------------*/

	/**
     * Replaces the row at the specified position in this matrix with
     * the specified row.
     *
     * @param indexRow index of the row to replace
     * @param newRow row to be stored at the specified position
     * @return the row previously at the specified position
 	 * @throws NullPointerException     if the row is null
     * @throws IndexOutOfBoundsException if the index is out of range
     *         ({@code index < 0 || index >= rowSize()})
	 * @throws IllegalArgumentException if the row is incompatible (the length of
	 *                                  the row is different than the number of
	 *                                  columns this matrix has)
     */
	public Collection<Number> setRow(int indexRow, int[] newRow);

	/**
     * Replaces the row at the specified position in this matrix with
     * the specified row.
     *
     * @param indexRow index of the row to replace
     * @param newRow row to be stored at the specified position
     * @return the row previously at the specified position
 	 * @throws NullPointerException     if the row is null
     * @throws IndexOutOfBoundsException if the index is out of range
     *         ({@code index < 0 || index >= rowSize()})
	 * @throws IllegalArgumentException if the row is incompatible (the length of
	 *                                  the row is different than the number of
	 *                                  columns this matrix has)
     */
	public Collection<Number> setRow(int indexRow, byte[] newRow);

	/**
     * Replaces the row at the specified position in this matrix with
     * the specified row.
     *
     * @param indexRow index of the row to replace
     * @param newRow row to be stored at the specified position
     * @return the row previously at the specified position
 	 * @throws NullPointerException     if the row is null
     * @throws IndexOutOfBoundsException if the index is out of range
     *         ({@code index < 0 || index >= rowSize()})
	 * @throws IllegalArgumentException if the row is incompatible (the length of
	 *                                  the row is different than the number of
	 *                                  columns this matrix has)
     */
	public Collection<Number> setRow(int indexRow, short[] newRow);

	/**
     * Replaces the row at the specified position in this matrix with
     * the specified row.
     *
     * @param indexRow index of the row to replace
     * @param newRow row to be stored at the specified position
     * @return the row previously at the specified position
 	 * @throws NullPointerException     if the row is null
     * @throws IndexOutOfBoundsException if the index is out of range
     *         ({@code index < 0 || index >= rowSize()})
	 * @throws IllegalArgumentException if the row is incompatible (the length of
	 *                                  the row is different than the number of
	 *                                  columns this matrix has)
     */
	public Collection<Number> setRow(int indexRow, long[] newRow);

	/**
     * Replaces the row at the specified position in this matrix with
     * the specified row.
     *
     * @param indexRow index of the row to replace
     * @param newRow row to be stored at the specified position
     * @return the row previously at the specified position
 	 * @throws NullPointerException     if the row is null
     * @throws IndexOutOfBoundsException if the index is out of range
     *         ({@code index < 0 || index >= rowSize()})
	 * @throws IllegalArgumentException if the row is incompatible (the length of
	 *                                  the row is different than the number of
	 *                                  columns this matrix has)
     */
	public Collection<Number> setRow(int indexRow, float[] newRow);

	/**
     * Replaces the row at the specified position in this matrix with
     * the specified row.
     *
     * @param indexRow index of the row to replace
     * @param newRow row to be stored at the specified position
     * @return the row previously at the specified position
 	 * @throws NullPointerException     if the row is null
     * @throws IndexOutOfBoundsException if the index is out of range
     *         ({@code index < 0 || index >= rowSize()})
	 * @throws IllegalArgumentException if the row is incompatible (the length of
	 *                                  the row is different than the number of
	 *                                  columns this matrix has)
     */
	public Collection<Number> setRow(int indexRow, double[] newRow);

	/**
     * Replaces the row at the specified position in this matrix with
     * the specified row.
     *
     * @param <T> The generic type parameter representing elements that extends {@code Number}
     * @param indexRow index of the row to replace
     * @param newRow row to be stored at the specified position
     * @return the row previously at the specified position
 	 * @throws NullPointerException     if the row is null
     * @throws IndexOutOfBoundsException if the index is out of range
     *         ({@code index < 0 || index >= rowSize()})
	 * @throws IllegalArgumentException if the row is incompatible (the length of
	 *                                  the row is different than the number of
	 *                                  columns this matrix has)
	 *                                  or if the row contains null elements
     */
	public <T extends Number> Collection<Number> setRow(int indexRow, T[] newRow);

	/*--------------------------------------setColumn()------------------------------------------------*/
	
	/**
     * Replaces the column at the specified position in this matrix with
     * the specified column.
     *
     * @param indexColumn index of the column to replace
     * @param newColumn column to be stored at the specified position
     * @return the column previously at the specified position
 	 * @throws NullPointerException     if the column is null
     * @throws IndexOutOfBoundsException if the index is out of range
     *         ({@code index < 0 || index >= columnSize()})
	 * @throws IllegalArgumentException if the column is incompatible (the length of
	 *                                  the column is different than the number of
	 *                                  rows this matrix has)
     */
	public Collection<Number> setColumn(int indexColumn, int[] newColumn);

	/**
     * Replaces the column at the specified position in this matrix with
     * the specified column.
     *
     * @param indexColumn index of the column to replace
     * @param newColumn column to be stored at the specified position
     * @return the column previously at the specified position
 	 * @throws NullPointerException     if the column is null
     * @throws IndexOutOfBoundsException if the index is out of range
     *         ({@code index < 0 || index >= columnSize()})
	 * @throws IllegalArgumentException if the column is incompatible (the length of
	 *                                  the column is different than the number of
	 *                                  rows this matrix has)
     */
	public Collection<Number> setColumn(int indexColumn, byte[] newColumn);	

	/**
     * Replaces the column at the specified position in this matrix with
     * the specified column.
     *
     * @param indexColumn index of the column to replace
     * @param newColumn column to be stored at the specified position
     * @return the column previously at the specified position
 	 * @throws NullPointerException     if the column is null
     * @throws IndexOutOfBoundsException if the index is out of range
     *         ({@code index < 0 || index >= columnSize()})
	 * @throws IllegalArgumentException if the column is incompatible (the length of
	 *                                  the column is different than the number of
	 *                                  rows this matrix has)
     */
	public Collection<Number> setColumn(int indexColumn, short[] newColumn);

	/**
     * Replaces the column at the specified position in this matrix with
     * the specified column.
     *
     * @param indexColumn index of the column to replace
     * @param newColumn column to be stored at the specified position
     * @return the column previously at the specified position
 	 * @throws NullPointerException     if the column is null
     * @throws IndexOutOfBoundsException if the index is out of range
     *         ({@code index < 0 || index >= columnSize()})
	 * @throws IllegalArgumentException if the column is incompatible (the length of
	 *                                  the column is different than the number of
	 *                                  rows this matrix has)
     */
	public Collection<Number> setColumn(int indexColumn, long[] newColumn);

	/**
     * Replaces the column at the specified position in this matrix with
     * the specified column.
     *
     * @param indexColumn index of the column to replace
     * @param newColumn column to be stored at the specified position
     * @return the column previously at the specified position
 	 * @throws NullPointerException     if the column is null
     * @throws IndexOutOfBoundsException if the index is out of range
     *         ({@code index < 0 || index >= columnSize()})
	 * @throws IllegalArgumentException if the column is incompatible (the length of
	 *                                  the column is different than the number of
	 *                                  rows this matrix has)
     */
	public Collection<Number> setColumn(int indexColumn, float[] newColumn);

	/**
     * Replaces the column at the specified position in this matrix with
     * the specified column.
     *
     * @param indexColumn index of the column to replace
     * @param newColumn column to be stored at the specified position
     * @return the column previously at the specified position
 	 * @throws NullPointerException     if the column is null
     * @throws IndexOutOfBoundsException if the index is out of range
     *         ({@code index < 0 || index >= columnSize()})
	 * @throws IllegalArgumentException if the column is incompatible (the length of
	 *                                  the column is different than the number of
	 *                                  rows this matrix has)
     */
	public Collection<Number> setColumn(int indexColumn, double[] newColumn);

	/**
     * Replaces the column at the specified position in this matrix with
     * the specified column.
     * 
     * @param <T> The generic type parameter representing elements that extends {@code Number}
     * @param indexColumn index of the column to replace
     * @param newColumn column to be stored at the specified position
     * @return the column previously at the specified position
 	 * @throws NullPointerException     if the column is null
     * @throws IndexOutOfBoundsException if the index is out of range
     *         ({@code index < 0 || index >= columnSize()})
	 * @throws IllegalArgumentException if the column is incompatible (the length of
	 *                                  the column is different than the number of
	 *                                  rows this matrix has)
	 *                                  or if the column contains null elements
     */
	public <T extends Number> Collection<Number> setColumn(int indexColumn, T[] newColumn);
}
