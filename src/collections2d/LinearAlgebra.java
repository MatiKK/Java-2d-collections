package collections2d;

import java.util.Arrays;

/**
 * LinearAlgebra class provides a collection of static methods for performing
 * various linear algebra operations on vectors and matrices.
 *
 * <p>The class includes methods for vector arithmetic, matrix operations, and
 * common linear algebra calculations such as dot product, cross product, matrix
 * multiplication, and determinant computation.</p>
 *
 * <p>All methods in this class are static, allowing users to perform linear algebra
 * operations without instantiating an object of this class.</p>
 *
 * <p>Note: Some methods may throw exceptions if the input parameters are not
 * valid for the specified operation. It is recommended to handle exceptions
 * appropriately when using these methods.</p>
 */
public final class LinearAlgebra {

	/** HOLa no me instancies**/
	private LinearAlgebra() {
	}

	// --------------------------------------------------------------------------
	//vectors addition and subtraction

	/**
	 * Performs vector addition on two integer arrays.
	 * @param v1 first array to be added
	 * @param v2 second array to be added
	 * @return a new integer array representing the vector {@code v1 + v2}
	 * @throws IllegalArgumentException if the arrays have different size
	 */
	public static int[] vectorAddition(int[] v1, int[] v2) {
		return NumericArrays.arrayAddition(v1, v2);
	}

	/**
	 * Performs vector subtraction on two integer arrays.
	 * @param v1 first array to be added
	 * @param v2 second array to be added
	 * @return a new integer array representing the vector {@code v1 - v2}
	 * @throws IllegalArgumentException if the arrays have different size
	 */
	public static int[] vectorSubtraction(int[] v1, int[] v2) {
		return NumericArrays.arraySubtraction(v1, v2);
	}

	/**
	 * Performs vector addition on two byte arrays.
	 * @param v1 first array to be added
	 * @param v2 second array to be added
	 * @return a new byte array representing the vector {@code v1 + v2}
	 * @throws IllegalArgumentException if the arrays have different size
	 */
	public static byte[] vectorAddition(byte[] v1, byte[] v2) {
		return NumericArrays.arrayAddition(v1, v2);
	}

	/**
	 * Performs vector subtraction on two byte arrays.
	 * @param v1 first array to be added
	 * @param v2 second array to be added
	 * @return a new byte array representing the vector {@code v1 - v2}
	 * @throws IllegalArgumentException if the arrays have different size
	 */
	public static byte[] vectorSubtraction(byte[] v1, byte[] v2) {
		return NumericArrays.arraySubtraction(v1, v2);
	}
	
	/**
	 * Performs vector addition on two short integer arrays.
	 * @param v1 first array to be added
	 * @param v2 second array to be added
	 * @return a new short integer array representing the vector {@code v1 + v2}
	 * @throws IllegalArgumentException if the arrays have different size
	 */
	public static short[] vectorAddition(short[] v1, short[] v2) {
		return NumericArrays.arrayAddition(v1, v2);
	}
	
	/**
	 * Performs vector subtraction on two short integer arrays.
	 * @param v1 first array to be added
	 * @param v2 second array to be added
	 * @return a new short integer array representing the vector {@code v1 - v2}
	 * @throws IllegalArgumentException if the arrays have different size
	 */
	public static short[] vectorSubtraction(short[] v1, short[] v2) {
		return NumericArrays.arraySubtraction(v1, v2);
	}
	
	/**
	 * Performs vector addition on two long integer arrays.
	 * @param v1 first array to be added
	 * @param v2 second array to be added
	 * @return a new long integer array representing the vector {@code v1 + v2}
	 * @throws IllegalArgumentException if the arrays have different size
	 */
	public static long[] vectorAddition(long[] v1, long[] v2) {
		return NumericArrays.arrayAddition(v1, v2);
	}
	
	/**
	 * Performs vector subtraction on two long integer arrays.
	 * @param v1 first array to be added
	 * @param v2 second array to be added
	 * @return a new long integer array representing the vector {@code v1 - v2}
	 * @throws IllegalArgumentException if the arrays have different size
	 */
	public static long[] vectorSubtraction(long[] v1, long[] v2) {
		return NumericArrays.arraySubtraction(v1, v2);
	}
	
	/**
	 * Performs vector addition on two float arrays.
	 * @param v1 first array to be added
	 * @param v2 second array to be added
	 * @return a new float array representing the vector {@code v1 + v2}
	 * @throws IllegalArgumentException if the arrays have different size
	 */
	public static float[] vectorAddition(float[] v1, float[] v2) {
		return NumericArrays.arrayAddition(v1, v2);
	}
	
	/**
	 * Performs vector subtraction on two float arrays.
	 * @param v1 first array to be added
	 * @param v2 second array to be added
	 * @return a new float array representing the vector {@code v1 - v2}
	 * @throws IllegalArgumentException if the arrays have different size
	 */
	public static float[] vectorSubtraction(float[] v1, float[] v2) {
		return NumericArrays.arraySubtraction(v1, v2);
	}
	
	/**
	 * Performs vector addition on two double arrays.
	 * @param v1 first array to be added
	 * @param v2 second array to be added
	 * @return a new double array representing the vector {@code v1 + v2}
	 * @throws IllegalArgumentException if the arrays have different size
	 */
	public static double[] vectorAddition(double[] v1, double[] v2) {
		return NumericArrays.arrayAddition(v1, v2);
	}
	
	/**
	 * Performs vector subtraction on two double arrays.
	 * @param v1 first array to be added
	 * @param v2 second array to be added
	 * @return a new double array representing the vector {@code v1 - v2}
	 * @throws IllegalArgumentException if the arrays have different size
	 */
	public static double[] vectorSubtraction(double[] v1, double[] v2) {
		return NumericArrays.arraySubtraction(v1, v2);
	}

	/**
	 * Performs vector addition on two Number object arrays.
	 * @param <T> type of Number
	 * @param v1 first array to be added
	 * @param v2 second array to be added
	 * @return a new Number object array representing the vector {@code v1 + v2}
	 * @throws NullPointerException if any of the vectors contain null elements
	 * @throws IllegalArgumentException if the arrays have different size
	 */
	public static <T extends Number> Number[] vectorAddition(T[] v1, T[] v2) {
		return NumericArrays.arrayAddition(v1, v2);
	}
	
	/**
	 * Performs vector subtraction on two Number object arrays.
	 * @param <T> type of Number
	 * @param v1 first array to be added
	 * @param v2 second array to be added
	 * @return a new Number object array representing the vector {@code v1 - v2}
	 * @throws NullPointerException if any of the vectors contain null elements
	 * @throws IllegalArgumentException if the arrays have different size
	 */
	public static <T extends Number> Number[] vectorSubtraction(T[] v1, T[] v2) {
		return NumericArrays.arraySubtraction(v1, v2);
	}

	// just for matrix operation
	private static <T extends Number> Number[] vectorOperation(T[] v1, T[] v2, Number n) {return NumericArrays.numberArrayOp(v1, v2, n);}

	
	
	// VECTOR MAGNITUDE --------------------------------------------------------------------------------------------------

	/**
	 * Calculates the Euclidean length (magnitude) of a vector.
	 * This value is equal to the square root of the sum of the
	 * squares of the individual numbers of the vector.
	 * 
	 * @param v the array representing the vector for which the length is to be calculated
	 * @return the Euclidean length of the vector
	 * @throws IllegalArgumentException if the vector is empty
	 */
	public static double vectorLength(int[] v) {return Math.sqrt(NumericArrays.sumAllNumbersSquared(v));}

	/**
	 * Calculates the Euclidean length (magnitude) of a vector.
	 * This value is equal to the square root of the sum of the
	 * squares of the individual numbers of the vector.
	 * 
	 * @param v the array representing the vector for which the length is to be calculated
	 * @return the Euclidean length of the vector
	 * @throws IllegalArgumentException if the vector is empty
	 */
	public static double vectorLength(byte[] v) {return Math.sqrt(NumericArrays.sumAllNumbersSquared(v));}

	/**
	 * Calculates the Euclidean length (magnitude) of a vector.
	 * This value is equal to the square root of the sum of the
	 * squares of the individual numbers of the vector.
	 * 
	 * @param v the array representing the vector for which the length is to be calculated
	 * @return the Euclidean length of the vector
	 * @throws IllegalArgumentException if the vector is empty
	 */
	public static double vectorLength(short[] v) {return Math.sqrt(NumericArrays.sumAllNumbersSquared(v));}

	/**
	 * Calculates the Euclidean length (magnitude) of a vector.
	 * This value is equal to the square root of the sum of the
	 * squares of the individual numbers of the vector.
	 * 
	 * @param v the array representing the vector for which the length is to be calculated
	 * @return the Euclidean length of the vector
	 * @throws IllegalArgumentException if the vector is empty
	 */
	public static double vectorLength(long[] v) {return Math.sqrt(NumericArrays.sumAllNumbersSquared(v));}

	/**
	 * Calculates the Euclidean length (magnitude) of a vector.
	 * This value is equal to the square root of the sum of the
	 * squares of the individual numbers of the vector.
	 * 
	 * @param v the array representing the vector for which the length is to be calculated
	 * @return the Euclidean length of the vector
	 * @throws IllegalArgumentException if the vector is empty
	 */
	public static double vectorLength(float[] v) {return Math.sqrt(NumericArrays.sumAllNumbersSquared(v));}

	/**
	 * Calculates the Euclidean length (magnitude) of a vector.
	 * This value is equal to the square root of the sum of the
	 * squares of the individual numbers of the vector.
	 * 
	 * @param v the array representing the vector for which the length is to be calculated
	 * @return the Euclidean length of the vector
	 * @throws IllegalArgumentException if the vector is empty
	 */
	public static double vectorLength(double[] v) {return Math.sqrt(NumericArrays.sumAllNumbersSquared(v));}

	/**
	 * Calculates the Euclidean length (magnitude) of a vector.
	 * This value is equal to the square root of the sum of the
	 * squares of the individual numbers of the vector.
	 * 
	 * @param <T> type of Number
	 * @param v the array representing the vector for which the length is to be calculated
	 * @return the Euclidean length of the vector
 	 * @throws NullPointerException if the vector contains null elements
	 * @throws IllegalArgumentException if the vector is empty
	 */
	public static <T extends Number> double vectorLength(T[] v) {return Math.sqrt(NumericArrays.sumAllNumbersSquared(v));}

	//--------------------------------------------------------------------------------------------------
	// vectors scalar multiplication
	
	/**
	 * Performs scalar multiplication on a vector, using the given number as the scalar.
	 * 
	 * @param v the array representing the vector to be multiplied
	 * @param alpha the scalar value to multiply each number of the vector
	 * @return a new array representing the result of the vector scalar multiplication
	 * @throws NullPointerException if {@code alpha} is null
	 * @throws IllegalArgumentException if the vector is empty
	 */
	public static int[] vectorScalarMultiplication(int[] v, Number alpha) {
		return NumericArrays.arrayMultiplyBy(v, alpha);
	}

	/**
	 * Performs scalar multiplication on a vector, using the given number as the scalar.
	 * 
	 * @param v the array representing the vector to be multiplied
	 * @param alpha the scalar value to multiply each number of the vector
	 * @return a new array representing the result of the vector scalar multiplication
	 * @throws NullPointerException if {@code alpha} is null
	 * @throws IllegalArgumentException if the vector is empty
	 */
	public static byte[] vectorScalarMultiplication(byte[] v, Number alpha) {
		return NumericArrays.arrayMultiplyBy(v, alpha);
	}
	
	/**
	 * Performs scalar multiplication on a vector, using the given number as the scalar.
	 * 
	 * @param v the array representing the vector to be multiplied
	 * @param alpha the scalar value to multiply each number of the vector
	 * @return a new array representing the result of the vector scalar multiplication
	 * @throws NullPointerException if {@code alpha} is null
	 * @throws IllegalArgumentException if the vector is empty
	 */
	public static short[] vectorScalarMultiplication(short[] v, Number alpha) {
		return NumericArrays.arrayMultiplyBy(v, alpha);
	}
	
	/**
	 * Performs scalar multiplication on a vector, using the given number as the scalar.
	 * 
	 * @param v the array representing the vector to be multiplied
	 * @param alpha the scalar value to multiply each number of the vector
	 * @return a new array representing the result of the vector scalar multiplication
	 * @throws NullPointerException if {@code alpha} is null
	 * @throws IllegalArgumentException if the vector is empty
	 */
	public static long[] vectorScalarMultiplication(long[] v, Number alpha) {
		return NumericArrays.arrayMultiplyBy(v, alpha);
	}
	
	/**
	 * Performs scalar multiplication on a vector, using the given number as the scalar.
	 * 
	 * @param v the array representing the vector to be multiplied
	 * @param alpha the scalar value to multiply each number of the vector
	 * @return a new array representing the result of the vector scalar multiplication
	 * @throws NullPointerException if {@code alpha} is null
	 * @throws IllegalArgumentException if the vector is empty
	 */
	public static float[] vectorScalarMultiplication(float[] v, Number alpha) {
		return NumericArrays.arrayMultiplyBy(v, alpha);
	}
	
	/**
	 * Performs scalar multiplication on a vector, using the given number as the scalar.
	 * 
	 * @param v the array representing the vector to be multiplied
	 * @param alpha the scalar value to multiply each number of the vector
	 * @return a new array representing the result of the vector scalar multiplication
	 * @throws NullPointerException if {@code alpha} is null
	 * @throws IllegalArgumentException if the vector is empty
	 */
	public static double[] vectorScalarMultiplication(double[] v, Number alpha) {
		return NumericArrays.arrayMultiplyBy(v, alpha);
	}

	/**
	 * Performs scalar multiplication on a vector, using the given number as the scalar.
	 * 
	 * @param <T> type of Number
	 * @param v the array representing the vector to be multiplied
	 * @param alpha the scalar value to multiply each number of the vector
	 * @return a new array representing the result of the vector scalar multiplication
	 * @throws NullPointerException if {@code alpha} is null
 	 * @throws NullPointerException if the vector contains null elements
	 * @throws IllegalArgumentException if the vector is empty
	 */
	public static <T extends Number> Number[] vectorScalarMultiplication(T[] v, Number alpha) {
		return NumericArrays.arrayMultiplyBy(v, alpha);
	}

	//----------------------------------------------------------------------------------------
	// vectors Dot Product
	
	/**
	 * Calculates the dot product of two vectors.
	 * This value represents the sum of the product of their corresponding number by position.
	 * @param v1 first vector
	 * @param v2 second vector
	 * @return the dot product of the two vectors
	 * @throws IllegalArgumentException if the vectors have different size or if they are empty
	 */
	public static int vectorsDotProduct(int[] v1, int[] v2) {
		NumericArrays.checkIfOperationCanBePerformed(v1, v2);
		int sum = 0;
		for (int i = 0; i < v1.length; i++)
			sum += (v1[i] * v2[i]);
		return sum;
	}

	/**
	 * Calculates the dot product of two vectors.
	 * This value represents the sum of the product of their corresponding number by position.
	 * @param v1 first vector
	 * @param v2 second vector
	 * @return the dot product of the two vectors
	 * @throws IllegalArgumentException if the vectors have different size or if they are empty
	 */
	public static int vectorsDotProduct(byte[] v1, byte[] v2) {
		NumericArrays.checkIfOperationCanBePerformed(v1, v2);
		int sum = 0;
		for (int i = 0; i < v1.length; i++)
			sum += (v1[i] * v2[i]);
		return sum;
	}
	
	/**
	 * Calculates the dot product of two vectors.
	 * This value represents the sum of the product of their corresponding number by position.
	 * @param v1 first vector
	 * @param v2 second vector
	 * @return the dot product of the two vectors
	 * @throws IllegalArgumentException if the vectors have different size or if they are empty
	 */
	public static int vectorsDotProduct(short[] v1, short[] v2) {
		NumericArrays.checkIfOperationCanBePerformed(v1, v2);
		int sum = 0;
		for (int i = 0; i < v1.length; i++)
			sum += (v1[i] * v2[i]);
		return sum;
	}
	
	/**
	 * Calculates the dot product of two vectors.
	 * This value represents the sum of the product of their corresponding number by position.
	 * @param v1 first vector
	 * @param v2 second vector
	 * @return the dot product of the two vectors
	 * @throws IllegalArgumentException if the vectors have different size or if they are empty
	 */
	public static long vectorsDotProduct(long[] v1, long[] v2) {
		NumericArrays.checkIfOperationCanBePerformed(v1, v2);
		int sum = 0;
		for (int i = 0; i < v1.length; i++)
			sum += (v1[i] * v2[i]);
		return sum;
	}

	
	/* Used when an operation with doubles values gives a very small number instead of zero, 
	 * when zero is what it is supposed to be return*/
	private static double umbral = NumericArrays.UMBRAL;

	/**
	 * Calculates the dot product of two vectors.
	 * This value represents the sum of the product of their corresponding number by position.
	 * @param v1 first vector
	 * @param v2 second vector
	 * @return the dot product of the two vectors
	 * @throws IllegalArgumentException if the vectors have different size or if they are empty
	 */
	public static double vectorsDotProduct(float[] v1, float[] v2) {
		NumericArrays.checkIfOperationCanBePerformed(v1, v2);
		double sum = 0;
		for (int i = 0; i < v1.length; i++)
			sum += (v1[i] * v2[i]);
		if (Math.abs(sum) - umbral <= 0) sum = 0;
		return sum;
	}

	/**
	 * Calculates the dot product of two vectors.
	 * This value represents the sum of the product of their corresponding number by position.
	 * @param v1 first vector
	 * @param v2 second vector
	 * @return the dot product of the two vectors
	 * @throws IllegalArgumentException if the vectors have different size or if they are empty
	 */
	public static double vectorsDotProduct(double[] v1, double[] v2) {
		NumericArrays.checkIfOperationCanBePerformed(v1, v2);
		double sum = 0;
		for (int i = 0; i < v1.length; i++)
			sum += (v1[i] * v2[i]);
		if (Math.abs(sum) - umbral <= 0) sum = 0;
		return sum;
	}

	/**
	 * Calculates the dot product of two vectors.
	 * This value represents the sum of the product of their corresponding number by position.
	 * @param <T> type of Number
	 * @param v1 first vector
	 * @param v2 second vector
	 * @return the dot product of the two vectors
  	 * @throws NullPointerException if any of the vectors contain null elements
	 * @throws IllegalArgumentException if the vectors have different size or if they are empty
	 */
	public static <T extends Number> double vectorsDotProduct(T[] v1, T[] v2) {
		NumericArrays.checkIfOperationCanBePerformed(v1, v2);
		double sum = 0;
		for (int i = 0; i < v1.length; i++)
			sum += (v1[i].doubleValue() * v2[i].doubleValue());
		if (Math.abs(sum) - umbral <= 0) sum = 0;
		return sum;
	}

	//----------------------------------------------------------------------------------
	// Methods related to vectors perpendicularity
	
	/**
	 * Returns {@code true} if the given vectors are perpendicular (orthogonal).
	 * Two vectors are perpendicular if their dot product is zero.
	 * 
	 * @param v1 first vector
	 * @param v2 second vector
	 * @return {@code true} if the vectors are perpendicular
	 * @throws IllegalArgumentException if the vectors have different size or if they are empty
	 */
	public static boolean vectorsArePerpendicular(int[] v1, int[] v2) {
		return vectorsDotProduct(v1,v2) == 0;
	}

	/**
	 * Returns {@code true} if the given vectors are perpendicular (orthogonal).
	 * Two vectors are perpendicular if their dot product is zero.
	 * 
	 * @param v1 first vector
	 * @param v2 second vector
	 * @return {@code true} if the vectors are perpendicular
	 * @throws IllegalArgumentException if the vectors have different size or if they are empty
	 */
	public static boolean vectorsArePerpendicular(byte[] v1, byte[] v2) {
		return vectorsDotProduct(v1,v2) == 0;
	}
	
	/**
	 * Returns {@code true} if the given vectors are perpendicular (orthogonal).
	 * Two vectors are perpendicular if their dot product is zero.
	 * 
	 * @param v1 first vector
	 * @param v2 second vector
	 * @return {@code true} if the vectors are perpendicular
	 * @throws IllegalArgumentException if the vectors have different size or if they are empty
	 */
	public static boolean vectorsArePerpendicular(short[] v1, short[] v2) {
		return vectorsDotProduct(v1,v2) == 0;
	}
	
	/**
	 * Returns {@code true} if the given vectors are perpendicular (orthogonal).
	 * Two vectors are perpendicular if their dot product is zero.
	 * 
	 * @param v1 first vector
	 * @param v2 second vector
	 * @return {@code true} if the vectors are perpendicular
	 * @throws IllegalArgumentException if the vectors have different size or if they are empty
	 */
	public static boolean vectorsArePerpendicular(long[] v1, long[] v2) {
		return vectorsDotProduct(v1,v2) == 0;
	}
	
	/**
	 * Returns {@code true} if the given vectors are perpendicular (orthogonal).
	 * Two vectors are perpendicular if their dot product is zero.
	 * 
	 * @param v1 first vector
	 * @param v2 second vector
	 * @return {@code true} if the vectors are perpendicular
	 * @throws IllegalArgumentException if the vectors have different size or if they are empty
	 */
	public static boolean vectorsArePerpendicular(float[] v1, float[] v2) {
		return vectorsDotProduct(v1,v2) == 0;
	}
	
	/**
	 * Returns {@code true} if the given vectors are perpendicular (orthogonal).
	 * Two vectors are perpendicular if their dot product is zero.
	 * 
	 * @param v1 first vector
	 * @param v2 second vector
	 * @return {@code true} if the vectors are perpendicular
	 * @throws IllegalArgumentException if the vectors have different size or if they are empty
	 */
	public static boolean vectorsArePerpendicular(double[] v1, double[] v2) {
		return vectorsDotProduct(v1,v2) == 0;
	}
	
	/**
	 * Returns {@code true} if the given vectors are perpendicular (orthogonal).
	 * Two vectors are perpendicular if their dot product is zero.
	 * 
	 * @param <T> type of Number
	 * @param v1 first vector
	 * @param v2 second vector
	 * @return {@code true} if the vectors are perpendicular
	 * @throws NullPointerException if the vector contains null elements
	 * @throws IllegalArgumentException if the vectors have different size or if they are empty
	 */
	public static <T extends Number> boolean vectorsArePerpendicular(T[] v1, T[] v2) {
		return vectorsDotProduct(v1,v2) == 0;
	}
	
	
	// perpendicular vector
	
	/**
	 * Calculates a perpendicular (orthogonal) vector to the given one.
	 * This method generates a random vector with the same length than the given vector,
	 * and establish the corresponding values in order to make their dot product equal to zero.
	 * If the given vector is the null vector (all of the coordinates are equal to zero), a new
	 * null vector is returned (the are infinite vectors perpendicular to the null vector).
	 * 
	 * @param v a vector
	 * @return a vector perpendicular to the given one
	 * @throws IllegalArgumentException if the given vector size is less than 2 (also implicitly if it is empty)
	 */
	public static int[] perpendicularVector(int[] v) {
		int vLength = v.length;
		if (vLength < 2) throw new IllegalArgumentException("vectors of size" + vLength + "cannot have perpendicular vectors");
		int ind = NumericArrays.indexFirstNotZeroNumber(v);
		int[] perp = new int[vLength];
		if (ind == -1) return perp;
		perp = NumericArrays.randomIntArray(vLength,-10,10);
		int dotProd = vectorsDotProduct(v,perp);
		if (dotProd == 0) return perp;	
		int numInV = v[ind];
		int newValue = - dotProd + numInV * perp[ind];
		perp = vectorScalarMultiplication(perp, numInV);
		perp[ind] = newValue;
		return perp;
	}

	/**
	 * Calculates a perpendicular (orthogonal) vector to the given one.
	 * This method generates a random vector with the same length than the given vector,
	 * and establish the corresponding values in order to make their dot product equal to zero.
	 * If the given vector is the null vector (all of the coordinates are equal to zero), a new
	 * null vector is returned (the are infinite vectors perpendicular to the null vector).
	 * 
	 * @param v a vector
	 * @return a vector perpendicular to the given one
	 * @throws IllegalArgumentException if the given vector size is less than 2 (also implicitly if it is empty)
	 */
	public static byte[] perpendicularVector(byte[] v) {
		int vLength = v.length;
		if (vLength < 2) throw new IllegalArgumentException("vectors of size" + vLength + "cannot have perpendicular vectors");
		int ind = NumericArrays.indexFirstNotZeroNumber(v);
		byte[] perp = new byte[vLength];
		if (ind == -1) return perp;
		perp = NumericArrays.randomByteArray(vLength,-10,10);
		int dotProd = vectorsDotProduct(v,perp);
		if (dotProd == 0) return perp;	
		int numInV = v[ind];
		int newValue = - dotProd + numInV * perp[ind];
		perp = vectorScalarMultiplication(perp, numInV);
		perp[ind] = (byte) newValue;
		return perp;
	}

	/**
	 * Calculates a perpendicular (orthogonal) vector to the given one.
	 * This method generates a random vector with the same length than the given vector,
	 * and establish the corresponding values in order to make their dot product equal to zero.
	 * If the given vector is the null vector (all of the coordinates are equal to zero), a new
	 * null vector is returned (the are infinite vectors perpendicular to the null vector).
	 * 
	 * @param v a vector
	 * @return a vector perpendicular to the given one
	 * @throws IllegalArgumentException if the given vector size is less than 2 (also implicitly if it is empty)
	 */
	public static short[] perpendicularVector(short[] v) {
		int vLength = v.length;
		if (vLength < 2) throw new IllegalArgumentException("vectors of size" + vLength + "cannot have perpendicular vectors");
		int ind = NumericArrays.indexFirstNotZeroNumber(v);
		short[] perp = new short[vLength];
		if (ind == -1) return perp;
		perp = NumericArrays.randomShortArray(vLength,-10,10);
		int dotProd = vectorsDotProduct(v,perp);
		if (dotProd == 0) return perp;	
		int numInV = v[ind];
		int newValue = - dotProd + numInV * perp[ind];
		perp = vectorScalarMultiplication(perp, numInV);
		perp[ind] = (short) newValue;
		return perp;
	}

	/**
	 * Calculates a perpendicular (orthogonal) vector to the given one.
	 * This method generates a random vector with the same length than the given vector,
	 * and establish the corresponding values in order to make their dot product equal to zero.
	 * If the given vector is the null vector (all of the coordinates are equal to zero), a new
	 * null vector is returned (the are infinite vectors perpendicular to the null vector).
	 * 
	 * @param v a vector
	 * @return a vector perpendicular to the given one
	 * @throws IllegalArgumentException if the given vector size is less than 2 (also implicitly if it is empty)
	 */
	public static long[] perpendicularVector(long[] v) {
		int vLength = v.length;
		if (vLength < 2) throw new IllegalArgumentException("vectors of size" + vLength + "cannot have perpendicular vectors");
		int ind = NumericArrays.indexFirstNotZeroNumber(v);
		long[] perp = new long[vLength];
		if (ind == -1) return perp;
		perp = NumericArrays.randomLongArray(vLength,-10,10);
		long dotProd = vectorsDotProduct(v,perp);
		if (dotProd == 0) return perp;	
		long numInV = v[ind];
		long newValue = - dotProd + numInV * perp[ind];
		perp = vectorScalarMultiplication(perp, numInV);
		perp[ind] = newValue;
		return perp;
	}

	/**
	 * Calculates a perpendicular (orthogonal) vector to the given one.
	 * This method generates a random vector with the same length than the given vector,
	 * and establish the corresponding values in order to make their dot product equal to zero.
	 * If the given vector is the null vector (all of the coordinates are equal to zero), a new
	 * null vector is returned (the are infinite vectors perpendicular to the null vector).
	 * 
	 * @param v a vector
	 * @return a vector perpendicular to the given one
	 * @throws IllegalArgumentException if the given vector size is less than 2 (also implicitly if it is empty)
	 */
	public static float[] perpendicularVector(float[] v) {
		int vLength = v.length;
		if (vLength < 2) throw new IllegalArgumentException("vectors of size" + vLength + "cannot have perpendicular vectors");
		int ind = NumericArrays.indexFirstNotZeroNumber(v);
		float[] perp = new float[vLength];
		if (ind == -1) return perp;
		perp = NumericArrays.randomFloatArray(vLength,-10,10);
		double dotProd = vectorsDotProduct(v,perp);
		if (dotProd == 0) return perp;	
		double numInV = v[ind];
		double newValue = - dotProd + numInV * perp[ind];
		perp = vectorScalarMultiplication(perp, numInV);
		perp[ind] = (float) newValue;
		return perp;
	}

	/**
	 * Calculates a perpendicular (orthogonal) vector to the given one.
	 * This method generates a random vector with the same length than the given vector,
	 * and establish the corresponding values in order to make their dot product equal to zero.
	 * If the given vector is the null vector (all of the coordinates are equal to zero), a new
	 * null vector is returned (the are infinite vectors perpendicular to the null vector).
	 * 
	 * @param v a vector
	 * @return a vector perpendicular to the given one
	 * @throws IllegalArgumentException if the given vector size is less than 2 (also implicitly if it is empty)
	 */
	public static double[] perpendicularVector(double[] v) {
		int vLength = v.length;
		if (vLength < 2) throw new IllegalArgumentException("vectors of size" + vLength + "cannot have perpendicular vectors");
		int ind = NumericArrays.indexFirstNotZeroNumber(v);
		double[] perp = new double[vLength];
		if (ind == -1) return perp;
		perp = NumericArrays.randomDoubleArray(vLength,-10,10);
		double dotProd = vectorsDotProduct(v,perp);
		if (dotProd == 0) return perp;	
		double numInV = v[ind];
		double newValue = - dotProd + numInV * perp[ind];
		perp = vectorScalarMultiplication(perp, numInV);
		perp[ind] = newValue;
		return perp;
	}

	/**
	 * Calculates a perpendicular (orthogonal) vector to the given one.
	 * This method generates a random vector with the same length than the given vector,
	 * and establish the corresponding values in order to make their dot product equal to zero.
	 * If the given vector is the null vector (all of the coordinates are equal to zero), a new
	 * null vector is returned (the are infinite vectors perpendicular to the null vector).
	 * 
	 * @param <T> type of Number
	 * @param v a vector
	 * @return a vector perpendicular to the given one
	 * @throws NullPointerException if the given vector contains null elements
	 * @throws IllegalArgumentException if the given vector size is less than 2 (also implicitly if it is empty)
	 */
	public static <T extends Number> Number[] perpendicularVector(T[] v) {
		int vLength = v.length;
		if (vLength < 2) throw new IllegalArgumentException("vectors of size" + vLength + "cannot have perpendicular vectors");
		int ind = NumericArrays.indexFirstNotZeroNumber(v);
		Number[] perp = new Number[vLength];
		if (ind == -1) return perp;
		perp = NumericArrays.randomNumberArray(vLength,-10,10);
		double dotProd = vectorsDotProduct(v,perp);
		if (dotProd == 0) return perp;	
		double numInV = v[ind].doubleValue();
		double newValue = - dotProd + numInV * perp[ind].doubleValue();
		perp = vectorScalarMultiplication(perp, numInV);
		perp[ind] = NumericArrays.intOrDouble(newValue);
		return perp;
	}

	//-----------------------------------------------------------------------------------------------------------
	// Cross product
	// It is suggested not to use crossProduct for byte and consider it for short
	// because the cross product uses to give bigger numbers than the ones in the vectors
	
	/**
	 * Calculates the cross product of two three-dimensional vectors. The result is a new vector
	 * that is perpendicular (orthogonal) to both given vectors.
	 * 
	 * @param v1 first vector
	 * @param v2 second vector
	 * @return a new vector representing the cross product of the two given vectors that is 
	 * perpendicular to both of them
	 * @throws IllegalArgumentException if the given vectors does not have exactly three numbers
	 */
	public static int[] crossProduct(int[] v1, int[] v2) {
		NumericArrays.checkIfOperationCanBePerformed(v1, v2);
		int size = v1.length;
		if (size != 3) throw new IllegalArgumentException("Cross product can only be done in three-dimensional vectors");
		
		int[] res = new int[size];
		int numToAdd;
		numToAdd = v1[1] * v2[2] - v1[2] * v2[1];
		res[0] = numToAdd;
		numToAdd = v1[0] * v2[2] - v1[2] * v2[0];
		res[1] = -numToAdd;
		numToAdd = v1[0] * v2[1] - v1[1] * v2[0];
		res[2] = numToAdd;
		return res;
	}

	/**
	 * Calculates the cross product of two three-dimensional vectors. The result is a new vector
	 * that is perpendicular (orthogonal) to both given vectors.
	 * 
	 * @param v1 first vector
	 * @param v2 second vector
	 * @return a new vector representing the cross product of the two given vectors that is 
	 * perpendicular to both of them
	 * @throws IllegalArgumentException if the given vectors does not have exactly three numbers
	 */
	public static byte[] crossProduct(byte[] v1, byte[] v2) {
		NumericArrays.checkIfOperationCanBePerformed(v1, v2);
		int size = v1.length;
		if (size != 3) throw new IllegalArgumentException("Cross product can only be done in three-dimensional vectors");

		byte[] res = new byte[size];
		int numToAdd;
		numToAdd = v1[1] * v2[2] - v1[2] * v2[1];
		res[0] = (byte) numToAdd;
		numToAdd = v1[0] * v2[2] - v1[2] * v2[0];
		res[1] = (byte) -numToAdd;
		numToAdd = v1[0] * v2[1] - v1[1] * v2[0];
		res[2] = (byte) numToAdd;
		return res;
	}

	/**
	 * Calculates the cross product of two three-dimensional vectors. The result is a new vector
	 * that is perpendicular (orthogonal) to both given vectors.
	 * 
	 * @param v1 first vector
	 * @param v2 second vector
	 * @return a new vector representing the cross product of the two given vectors that is 
	 * perpendicular to both of them
	 * @throws IllegalArgumentException if the given vectors does not have exactly three numbers
	 */
	public static short[] crossProduct(short[] v1, short[] v2) {
		NumericArrays.checkIfOperationCanBePerformed(v1, v2);
		int size = v1.length;
		if (size != 3) throw new IllegalArgumentException("Cross product can only be done in three-dimensional vectors");
		
		short[] res = new short[size];
		int numToAdd;
		numToAdd = v1[1] * v2[2] - v1[2] * v2[1];
		res[0] = (short) numToAdd;
		numToAdd = v1[0] * v2[2] - v1[2] * v2[0];
		res[1] = (short) -numToAdd;
		numToAdd = v1[0] * v2[1] - v1[1] * v2[0];
		res[2] = (short) numToAdd;
		return res;
	}
	
	/**
	 * Calculates the cross product of two three-dimensional vectors. The result is a new vector
	 * that is perpendicular (orthogonal) to both given vectors.
	 * 
	 * @param v1 first vector
	 * @param v2 second vector
	 * @return a new vector representing the cross product of the two given vectors that is 
	 * perpendicular to both of them
	 * @throws IllegalArgumentException if the given vectors does not have exactly three numbers
	 */
	public static long[] crossProduct(long[] v1, long[] v2) {
		NumericArrays.checkIfOperationCanBePerformed(v1, v2);
		int size = v1.length;
		if (size != 3) throw new IllegalArgumentException("Cross product can only be done in three-dimensional vectors");
		
		long[] res = new long[size];
		long numToAdd;
		numToAdd = v1[1] * v2[2] - v1[2] * v2[1];
		res[0] = (long) numToAdd;
		numToAdd = v1[0] * v2[2] - v1[2] * v2[0];
		res[1] = (long) -numToAdd;
		numToAdd = v1[0] * v2[1] - v1[1] * v2[0];
		res[2] = (long) numToAdd;
		return res;
	}
	
	/**
	 * Calculates the cross product of two three-dimensional vectors. The result is a new vector
	 * that is perpendicular (orthogonal) to both given vectors.
	 * 
	 * @param v1 first vector
	 * @param v2 second vector
	 * @return a new vector representing the cross product of the two given vectors that is 
	 * perpendicular to both of them
	 * @throws IllegalArgumentException if the given vectors does not have exactly three numbers
	 */
	public static float[] crossProduct(float[] v1, float[] v2) {
		NumericArrays.checkIfOperationCanBePerformed(v1, v2);
		int size = v1.length;
		if (size != 3) throw new IllegalArgumentException("Cross product can only be done in three-dimensional vectors");
		
		float[] res = new float[size];
		float numToAdd;
		numToAdd = v1[1] * v2[2] - v1[2] * v2[1];
		res[0] = (float) numToAdd;
		numToAdd = v1[0] * v2[2] - v1[2] * v2[0];
		res[1] = (float) -numToAdd;
		numToAdd = v1[0] * v2[1] - v1[1] * v2[0];
		res[2] = (float) numToAdd;
		return res;
	}
	
	/**
	 * Calculates the cross product of two three-dimensional vectors. The result is a new vector
	 * that is perpendicular (orthogonal) to both given vectors.
	 * 
	 * @param v1 first vector
	 * @param v2 second vector
	 * @return a new vector representing the cross product of the two given vectors that is 
	 * perpendicular to both of them
	 * @throws IllegalArgumentException if the given vectors does not have exactly three numbers
	 */
	public static double[] crossProduct(double[] v1, double[] v2) {
		NumericArrays.checkIfOperationCanBePerformed(v1, v2);
		int size = v1.length;
		if (size != 3) throw new IllegalArgumentException("Cross product can only be done in three-dimensional vectors");
		
		double[] res = new double[size];
		double numToAdd;
		numToAdd = v1[1] * v2[2] - v1[2] * v2[1];
		res[0] = (double) numToAdd;
		numToAdd = v1[0] * v2[2] - v1[2] * v2[0];
		res[1] = (double) -numToAdd;
		numToAdd = v1[0] * v2[1] - v1[1] * v2[0];
		res[2] = (double) numToAdd;
		return res;
	}
	
	/**
	 * Calculates the cross product of two three-dimensional vectors. The result is a new vector
	 * that is perpendicular (orthogonal) to both given vectors.
	 * 
	 * @param <T> type of Number
	 * @param v1 first vector
	 * @param v2 second vector
	 * @return a new vector representing the cross product of the two given vectors that is 
	 * perpendicular to both of them
	 * 
	 * @throws NullPointerException if any of the given vectors contain null elements
	 * @throws IllegalArgumentException if the given vectors does not have exactly three numbers
	 */
	public static <T extends Number> Number[] crossProduct(T[] v1, T[] v2) {
		NumericArrays.checkIfOperationCanBePerformed(v1, v2);
		int size = v1.length;
		if (size != 3) throw new IllegalArgumentException("Cross product can only be done in three-dimensional vectors");
		
		Number[] res = new Number[size];
		double numToAdd;
		numToAdd = v1[1].doubleValue() * v2[2].doubleValue() - v1[2].doubleValue() * v2[1].doubleValue();
		res[0] = NumericArrays.intOrDouble(numToAdd);
		numToAdd = v1[0].doubleValue() * v2[2].doubleValue() - v1[2].doubleValue() * v2[0].doubleValue();
		res[1] = NumericArrays.intOrDouble(-numToAdd);
		numToAdd = v1[0].doubleValue() * v2[1].doubleValue() - v1[1].doubleValue() * v2[0].doubleValue();
		res[2] = NumericArrays.intOrDouble(numToAdd);
		return res;
	}
	
	
	// ---------------------------------------------------------------------------------------------------
	//matrices ---------------------------------------------------------------------------------------------------
	//matrices ---------------------------------------------------------------------------------------------------
	
	private static void isValid(AlgebraicMatrix m) {
		if (m == null) throw new NullPointerException("Given Matrix is null");
		if (m.isEmpty()) throw new IllegalArgumentException("Given matrix is empty and not valid for this operation");
	}
	
	private static boolean areValidForOperation(AlgebraicMatrix m1, AlgebraicMatrix m2) {
		return m1.getDimension().equals(m2.getDimension());
	}
	
	private static void checkMatrixOperationIfItCanHappen(AlgebraicMatrix m1, AlgebraicMatrix m2) {
		isValid(m1); isValid(m2); if (!areValidForOperation(m1, m2)) throw new IllegalArgumentException("Can't operate with these matrices due to their different dimensions");
	}
	
	private static boolean areValidForMultiplication(AlgebraicMatrix m1, AlgebraicMatrix m2) {
		return m1.columnSize() == m2.rowSize();
	}

	private static void checkMatrixMultiplicationIfItCanHappen(AlgebraicMatrix m1, AlgebraicMatrix m2) {
		isValid(m1); isValid(m2); if (!areValidForMultiplication(m1, m2)) throw new IllegalArgumentException("Unsupported operation for different dimensions matrices");
	}

	/**
	 * Performs matrix addition on two matrices. The result is a new matrix
	 * where each element is the sum of the corresponding elements from both matrices by position.
	 * @param m1 first matrix
	 * @param m2 second matrix
	 * @return a new {@link AlgebraicMatrix} representing {@code m1 + m2}
	 * 
	 * @throws IllegalArgumentException if the matrices do not have the same dimensions
	 * 									or if they are empty (dimension {@code 0x0})
	 */
	public static AlgebraicMatrix matrixAddition(AlgebraicMatrix m1, AlgebraicMatrix m2) {
		return matrixOperation(m1,m2,1);
	}

	/**
	 * Performs matrix subtraction on two matrices. The result is a new matrix
	 * where each element is the difference of the corresponding elements from both matrices by position.
	 * @param m1 first matrix (minuend)
	 * @param m2 second matrix (subtrahend)
	 * @return a new {@link AlgebraicMatrix} representing {@code m1 - m2}
	 * 
	 * @throws IllegalArgumentException if the matrices do not have the same dimensions
	 * 									or if they are empty (dimension {@code 0x0})
	 */
	public static AlgebraicMatrix matrixSubtraction(AlgebraicMatrix m1, AlgebraicMatrix m2) {
		return matrixOperation(m1,m2,-1);
	}
	
	private static AlgebraicMatrix matrixOperation(AlgebraicMatrix m1, AlgebraicMatrix m2, Number alpha) {
		checkMatrixOperationIfItCanHappen(m1, m2);
		int r = m1.rowSize(), c = m1.columnSize();
		AlgebraicMatrix res = new AlgebraicMatrix(r,c);
		for (int i = 0; i < r; i++)
			res.addRow(vectorOperation(getAsNumberArray(m1.rows[i], c),getAsNumberArray(m2.rows[i], c),alpha));
		return res;
	}

	/**
	 * Performs scalar multiplication on a matrix.
	 * It returns a matrix where each number of it is multiplied by the given scalar.
	 * @param mat matrix to be multiplied
	 * @param alpha the scalar value
	 * @return a new {@link AlgebraicMatrix} representing the result of the matrix scalar multiplication
	 * @throws IllegalArgumentException if the given matrix is empty (dimension {@code 0x0})
	 */
	public static AlgebraicMatrix matrixScalarMultiplication(AlgebraicMatrix mat, Number alpha) {
		isValid(mat);
		int r = mat.rowSize(), c = mat.columnSize();
		AlgebraicMatrix res = new AlgebraicMatrix(r,c);
		for (int i = 0; i < r; i++)
			res.addRow(vectorScalarMultiplication(getAsNumberArray(mat.rows[i], c),alpha));
		return res;
	}

	/**
	 * Performs matrix multiplication on two matrices.
	 * The result is a new matrix representing the product of the given matrices.
	 * @param m1 first matrix
	 * @param m2 second matrix
	 * @return a new {@link AlgebraicMatrix} representing {@code m1 x m2}
	 * @throws IllegalArgumentException if their dimensions are incompatible for matrix multiplication
	 * (the number of columns in {@code m1} is not equal to the number of rows in {@code m2})
	 */
	public static AlgebraicMatrix matrixMultiplication(AlgebraicMatrix m1, AlgebraicMatrix m2) {
		checkMatrixMultiplicationIfItCanHappen(m1, m2);
		int r = m1.rowSize(), c = m2.columnSize();
		int commonSize = m1.columnSize();
		AlgebraicMatrix res = new AlgebraicMatrix(r,c);
		for(int i = 0; i < r; i++) {
			Number[] vector = new Number[c];
			Number[] v1 = getAsNumberArray(m1.rows[i], commonSize);
			for (int j = 0; j < c; j++) {
				Number[] v2 = getAsNumberArray(m2.columnToArray(j), commonSize);
				vector[j] = NumericArrays.intOrDouble(vectorsDotProduct(v1, v2));
			}
			res.addRow(vector);
		}
		return res;
	}

	/**
	 * Creates an identity matrix of size {@code n x n}.
	 * @param n the size of the square identity matrix to be created
	 * @return an {@link AlgebraicMatrix} representing the identity matrix of dimension {@code n x n}
	 * @throws IllegalArgumentException if {@code n < 1}
	 */
	public static AlgebraicMatrix matrixIdentity(int n) {
		AlgebraicMatrix mat = new AlgebraicMatrix(n);
		Number[] row;
		for (int i = 0; i < n; i++) {
			Arrays.fill(row = new Number[n], 0);
			row[i] = 1;
			mat.addRow(row);
		}
		return mat;
	}

	private static Number[] getAsNumberArray(Object[] arr, int rowSize) {
		return Arrays.copyOf(arr, rowSize, Number[].class);
	}

	/**
	 * Orders the rows of the given matrix based on the index of the pivot of each row.
	 *
	 * This performs row ordering in the matrix based on the index of the pivot
	 * in each row. The pivot is the leftmost non-zero element in a row after previous
	 * rows have been processed. The rows are rearranged to bring rows with lower pivot
	 * indices to the top.
	 *
	 * @return the total number of swaps performed during the method to make the matrix ordered
	 */
	protected static int matrixOrderingRows(AlgebraicMatrix mat) {
		int swappedRowsCount = 0;
		int sizeEachRow = mat.columnSize();
		for (int row1 = 0; row1 < mat.rowSize() - 1; row1++) {
			for (int row2 = row1 + 1; row2 < mat.rowSize(); row2++) {
				int indexRow1 = NumericArrays.indexFirstNotZeroNumber(getAsNumberArray(mat.rows[row1],sizeEachRow));
				int indexRow2 = NumericArrays.indexFirstNotZeroNumber(getAsNumberArray(mat.rows[row2],sizeEachRow));
				if ( indexRow1 == -1 || (indexRow1 > indexRow2 && indexRow2 != -1 )) {
					mat.swapRows(row1, row2);
					swappedRowsCount++;
				}
			}
		}
		return swappedRowsCount;
	}

	/**
	 * Converts the given matrix to its row echelon form and returns the number of swapped rows
	 * needed to achieve it.
	 *
	 * This method transforms the matrix into its row echelon form using Gaussian elimination.
	 * The process involves performing row operations to create a triangular matrix where
	 * the leading entry (pivot) in each row is to the right of the pivot in the row above.
	 * Matrices on their row echelon form are useful to solve systems of linear equations and finding
	 * their rank. It simplifies these operations by providing a clearer structure to the matrix.
	 * 
	 * This method returns the total number of swapped rows during this transformation, a value which is
	 * used in the calculation of the determinant of the matrix.
	 *
	 * @return the total number of swapped rows during the conversion to row echelon form
	 */
	public static int matrixRowEchelonForm(AlgebraicMatrix mat) {
		int swappedRowsCount = matrixOrderingRows(mat);
		int rowSize = mat.rowSize();
		int sizeEachRow = mat.columnSize();
		for (int row1 = 0; row1 < rowSize - 1; row1++) {
			Number[] currentRow = getAsNumberArray(mat.rows[row1], sizeEachRow);
			int indexFirstNotZeroCurrentRow = NumericArrays.indexFirstNotZeroNumber(currentRow);
			for (int row2 = row1 + 1; row2 < rowSize; row2++) {
				Number[] nextRow = getAsNumberArray(mat.rows[row2], sizeEachRow);
				int indexFirstNotZeroNextRow = NumericArrays.indexFirstNotZeroNumber(nextRow);
				if (indexFirstNotZeroCurrentRow == indexFirstNotZeroNextRow && indexFirstNotZeroCurrentRow != -1) {
					/* I don't know how much precision this loses by using doubles instead of BigDecimal
					it shouldn't be that much if it is matrix of integers or doubles with no complex decimals*/

					double currentRowFirstNumber, nextRowFirstNumber, alpha;
					currentRowFirstNumber = currentRow[indexFirstNotZeroCurrentRow].doubleValue();
					nextRowFirstNumber = nextRow[indexFirstNotZeroNextRow].doubleValue();
					alpha = Double.valueOf( nextRowFirstNumber / currentRowFirstNumber);

//					BigDecimal currentRowFirstNumber = new BigDecimal(currentRow[indexFirstNotZeroCurrentRow].toString());
//					BigDecimal nextRowFirstNumber = new BigDecimal(nextRow[indexFirstNotZeroNextRow].toString());
//					BigDecimal alpha = nextRowFirstNumber.divide(currentRowFirstNumber, 20, RoundingMode.HALF_UP);

					Number[] auxiliarRow = LinearAlgebra.vectorScalarMultiplication(currentRow, alpha);
					auxiliarRow = LinearAlgebra.vectorSubtraction(nextRow, auxiliarRow);
					mat.rows[row2] = auxiliarRow;
					mat.checkLength(auxiliarRow);
				}
			}
			swappedRowsCount += matrixOrderingRows(mat);
		}
		return swappedRowsCount;
	}

	/**
	 * Returns the determinant of the given square matrix.
	 * The determinant is a scalar value that can be used to determine various properties
	 * of the matrix, such as determining its invertibility, and particularly useful in solving systems of linear equations.
	 * It is crucial in various problems in geometry and physics related to eigenvalues.
	 * 
	 * @param mat the matrix
	 * @return the determinant of the given matrix
	 * 
	 * @throws IllegalArgumentException if the given matrix is not square 
	 * (i.e., the number of rows is not equal to the number of columns).
	 * A matrix of dimension {@code 0 x 0} is not considered square
	 */
	public static double matrixDeterminant(AlgebraicMatrix mat) {
		if (!mat.isSquare()) throw new IllegalArgumentException("non square matrix.");
		int size = mat.rowSize();
		if (size == 1) return mat.elementAt(0,0).doubleValue();
		if (size == 2) return NumericArrays.intOrDouble(
				mat.elementAt(0, 0).doubleValue() * mat.elementAt(1, 1).doubleValue() - 
				mat.elementAt(0, 1).doubleValue() * mat.elementAt(1, 0).doubleValue())
				.doubleValue();
		AlgebraicMatrix clone = (AlgebraicMatrix) mat.clone();
		int swappedRowsCount = matrixRowEchelonForm(clone);
		double determinant = Math.pow(-1, swappedRowsCount);
		for (int i = 0; i < mat.rowSize(); i++) determinant = determinant * clone.elementAt(i, i).doubleValue();
		return NumericArrays.intOrDouble(determinant).doubleValue();
	}
	
	/**
	 * Converts the given matrix into a two-dimensional array of Numbers.
	 * 
	 * @param mat the matrix to be converted
	 * @return a two-dimensional array where each element represents a row of the given matrix
	 */
	public static Number[][] matrixAs2dArray(AlgebraicMatrix mat){
		int r = mat.rowSize(), c = mat.columnSize();
		Number[][] rows = new Number[r][];
		for (int i = 0; i < r; i++) rows[i] = getAsNumberArray(mat.rows[i], c);
		return rows;
	}
	
	/**
	 * Converts the given two-dimensional array of Numbers into an {@link AlgebraicMatrix}.
	 * 
	 * @param mat the two-dimensional array of numbers
	 * @return an {@link AlgebraicMatrix} based on the elements of the given two-dimensional array
	 * @throws NullPointerException if the given two-dimensional array is null or if it contains a null element
	 * @throws IllegalArgumentException if the given two-dimensional array has inconsistent row sizes
	 */
	public static AlgebraicMatrix array2dAsMatrix(Number[][] mat) {
		AlgebraicMatrix m = new AlgebraicMatrix(0,0);
		if (mat.length == 0) return m;
		for (Number[] row: mat) m.addRow(row);
		return m;
	}
	
	public static AlgebraicMatrix matrixTranspose(AlgebraicMatrix mat) {
		int r = mat.rowSize(), c = mat.columnSize();
		AlgebraicMatrix tr = new AlgebraicMatrix(c,r);
		for (int i = 0; i < r; i++)
			tr.addColumn(getAsNumberArray(mat.rows[i], c));
		return tr;
	}
	
	
}