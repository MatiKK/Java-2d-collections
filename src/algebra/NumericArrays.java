package algebra;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Static class used to perform primitive arrays convalidations and other
 * methods used in {@link LinearAlgebra}.
 */
public final class NumericArrays {

	private NumericArrays() {
	}

	// checking methods
	private static String EMPTY_ARRAY = "Invalid operation for empty arrays";
	private static String DIFFERENT_SIZE = "Invalid operation for different size arrays: ";

	private static String diff_size(int a, int b) {return DIFFERENT_SIZE + a + " =/= " + b;}

	static void checkEmptiness(int[] arr) {if (arr.length == 0)throw new IllegalArgumentException(EMPTY_ARRAY);}
	static void checkEmptiness(byte[] arr) {if (arr.length == 0)throw new IllegalArgumentException(EMPTY_ARRAY);}
	static void checkEmptiness(short[] arr) {if (arr.length == 0)throw new IllegalArgumentException(EMPTY_ARRAY);}
	static void checkEmptiness(long[] arr) {if (arr.length == 0)throw new IllegalArgumentException(EMPTY_ARRAY);}
	static void checkEmptiness(float[] arr) {if (arr.length == 0)throw new IllegalArgumentException(EMPTY_ARRAY);}
	static void checkEmptiness(double[] arr) {if (arr.length == 0)throw new IllegalArgumentException(EMPTY_ARRAY);}
	static <T extends Number> void checkEmptiness(T[] arr) {if (arr.length == 0)throw new IllegalArgumentException(EMPTY_ARRAY);}

	static void checkIfOperationCanBePerformed(int[] arr1, int[] arr2) {checkEmptiness(arr1);checkEmptiness(arr2);if (arr1.length != arr2.length)throw new IllegalArgumentException(diff_size(arr1.length, arr2.length));}
	static void checkIfOperationCanBePerformed(byte[] arr1, byte[] arr2) {checkEmptiness(arr1);checkEmptiness(arr2);if (arr1.length != arr2.length)throw new IllegalArgumentException(diff_size(arr1.length, arr2.length));}
	static void checkIfOperationCanBePerformed(short[] arr1, short[] arr2) {checkEmptiness(arr1);checkEmptiness(arr2);if (arr1.length != arr2.length)throw new IllegalArgumentException(diff_size(arr1.length, arr2.length));}
	static void checkIfOperationCanBePerformed(long[] arr1, long[] arr2) {checkEmptiness(arr1);checkEmptiness(arr2);if (arr1.length != arr2.length)throw new IllegalArgumentException(diff_size(arr1.length, arr2.length));}
	static void checkIfOperationCanBePerformed(float[] arr1, float[] arr2) {checkEmptiness(arr1);checkEmptiness(arr2);if (arr1.length != arr2.length)throw new IllegalArgumentException(diff_size(arr1.length, arr2.length));}
	static void checkIfOperationCanBePerformed(double[] arr1, double[] arr2) {checkEmptiness(arr1);checkEmptiness(arr2);if (arr1.length != arr2.length)throw new IllegalArgumentException(diff_size(arr1.length, arr2.length));}
	static <T extends Number> void checkIfOperationCanBePerformed(T[] arr1, T[] arr2) {checkEmptiness(arr1);checkEmptiness(arr2);if (arr1.length != arr2.length)throw new IllegalArgumentException(diff_size(arr1.length, arr2.length));}

	/**
	 * Performs element-wise addition on two arrays.
	 * @param arr1 first array
	 * @param arr2 second array
	 * @return an array representing the element-wise addition ({@code arr1 + arr2})
	 * @throws IllegalArgumentException if the arrays do not have the same size
	 */
	public static int[] arrayAddition(int[] arr1, int[] arr2) {
		return intArrayOp(arr1, arr2, 1);
	}

	/**
	 * Performs element-wise subtraction on two arrays.
	 * @param arr1 first array
	 * @param arr2 second array
	 * @return an array representing the element-wise subtraction ({@code arr1 - arr2})
	 * @throws IllegalArgumentException if the arrays do not have the same size
	 */
	public static int[] arraySubtraction(int[] arr1, int[] arr2) {
		return intArrayOp(arr1, arr2, -1);
	}

	/**
	 * Performs element-wise addition on two arrays.
	 * @param arr1 first array
	 * @param arr2 second array
	 * @return an array representing the element-wise addition ({@code arr1 + arr2})
	 * @throws IllegalArgumentException if the arrays do not have the same size
	 */
	public static byte[] arrayAddition(byte[] arr1, byte[] arr2) {
		return byteArrayOp(arr1, arr2, 1);
	}

	/**
	 * Performs element-wise subtraction on two arrays.
	 * @param arr1 first array
	 * @param arr2 second array
	 * @return an array representing the element-wise subtraction ({@code arr1 - arr2})
	 * @throws IllegalArgumentException if the arrays do not have the same size
	 */
	public static byte[] arraySubtraction(byte[] arr1, byte[] arr2) {
		return byteArrayOp(arr1, arr2, -1);
	}

	/**
	 * Performs element-wise addition on two arrays.
	 * @param arr1 first array
	 * @param arr2 second array
	 * @return an array representing the element-wise addition ({@code arr1 + arr2})
	 * @throws IllegalArgumentException if the arrays do not have the same size
	 */
	public static short[] arrayAddition(short[] arr1, short[] arr2) {
		return shortArrayOp(arr1, arr2, 1);
	}

	/**
	 * Performs element-wise subtraction on two arrays.
	 * @param arr1 first array
	 * @param arr2 second array
	 * @return an array representing the element-wise subtraction ({@code arr1 - arr2})
	 * @throws IllegalArgumentException if the arrays do not have the same size
	 */
	public static short[] arraySubtraction(short[] arr1, short[] arr2) {
		return shortArrayOp(arr1, arr2, -1);
	}

	/**
	 * Performs element-wise addition on two arrays.
	 * @param arr1 first array
	 * @param arr2 second array
	 * @return an array representing the element-wise addition ({@code arr1 + arr2})
	 * @throws IllegalArgumentException if the arrays do not have the same size
	 */
	public static long[] arrayAddition(long[] arr1, long[] arr2) {
		return longArrayOp(arr1, arr2, 1);
	}

	/**
	 * Performs element-wise subtraction on two arrays.
	 * @param arr1 first array
	 * @param arr2 second array
	 * @return an array representing the element-wise subtraction ({@code arr1 - arr2})
	 * @throws IllegalArgumentException if the arrays do not have the same size
	 */
	public static long[] arraySubtraction(long[] arr1, long[] arr2) {
		return longArrayOp(arr1, arr2, -1);
	}

	/**
	 * Performs element-wise addition on two arrays.
	 * @param arr1 first array
	 * @param arr2 second array
	 * @return an array representing the element-wise addition ({@code arr1 + arr2})
	 * @throws IllegalArgumentException if the arrays do not have the same size
	 */
	public static float[] arrayAddition(float[] arr1, float[] arr2) {
		return floatArrayOp(arr1, arr2, 1);
	}

	/**
	 * Performs element-wise subtraction on two arrays.
	 * @param arr1 first array
	 * @param arr2 second array
	 * @return an array representing the element-wise subtraction ({@code arr1 - arr2})
	 * @throws IllegalArgumentException if the arrays do not have the same size
	 */
	public static float[] arraySubtraction(float[] arr1, float[] arr2) {
		return floatArrayOp(arr1, arr2, -1);
	}

	/**
	 * Performs element-wise addition on two arrays.
	 * @param arr1 first array
	 * @param arr2 second array
	 * @return an array representing the element-wise addition ({@code arr1 + arr2})
	 * @throws IllegalArgumentException if the arrays do not have the same size
	 */
	public static double[] arrayAddition(double[] arr1, double[] arr2) {
		return doubleArrayOp(arr1, arr2, 1);
	}

	/**
	 * Performs element-wise subtraction on two arrays.
	 * @param arr1 first array
	 * @param arr2 second array
	 * @return an array representing the element-wise subtraction ({@code arr1 - arr2})
	 * @throws IllegalArgumentException if the arrays do not have the same size
	 */
	public static double[] arraySubtraction(double[] arr1, double[] arr2) {
		return doubleArrayOp(arr1, arr2, -1);
	}

	/**
	 * Performs element-wise addition on two arrays.
	 * @param arr1 first array
	 * @param arr2 second array
	 * @return an array representing the element-wise addition ({@code arr1 + arr2})
	 * @throws IllegalArgumentException if the arrays do not have the same size
	 */
	public static <T extends Number> Number[] arrayAddition(T[] arr1, T[] arr2) {
		return numberArrayOp(arr1, arr2, 1);
	}

	/**
	 * Performs element-wise subtraction on two arrays.
	 * @param arr1 first array
	 * @param arr2 second array
	 * @return an array representing the element-wise subtraction ({@code arr1 - arr2})
	 * @throws NullPointerException if any of the arrays contain null elements
	 * @throws IllegalArgumentException if the arrays do not have the same size
	 */
	public static <T extends Number> Number[] arraySubtraction(T[] arr1, T[] arr2) {
		return numberArrayOp(arr1, arr2, -1);
	}

	/**
	 * Performs the addition of the given two arrays, where the second array is
	 * multiplied by the given number. Note that if {@code alpha = 1}, an addition
	 * of arrays is performed. if {@code alpha = -1}, a subtraction is performed.
	 * Its only use is for
	 * {@linkplain LinearAlgebra#vectorOperation(int[], int[], Number)}.
	 * 
	 * @param arr1  first array
	 * @param arr2  second array which will be multiplied by {@code alpha}
	 * @param alpha scalar multiplier of {@code arr2}
	 * @return {@code arr1 + (alpha * arr2)}
	 * @throws IllegalArgumentException if any of the given arrays are empty
	 * @throws IllegalArgumentException if the given arrays have different size
	 */
	static int[] intArrayOp(int[] arr1, int[] arr2, Number alpha) {
		checkIfOperationCanBePerformed(arr1, arr2);
		int size = arr1.length;
		int[] res = new int[size];
		double alph = alpha.doubleValue();
		for (int i = 0; i < size; i++)
			res[i] = (int) (arr1[i] + arr2[i] * alph);
		return res;
	}

	/**
	 * Performs the addition of the given two arrays, where the second array is
	 * multiplied by the given number. Note that if {@code alpha = 1}, an addition
	 * of arrays is performed. if {@code alpha = -1}, a subtraction is performed.
	 * Its only use is for
	 * {@linkplain LinearAlgebra#vectorOperation(byte[], byte[], Number)}.
	 * 
	 * @param arr1  first array
	 * @param arr2  second array which will be multiplied by {@code alpha}
	 * @param alpha scalar multiplier of {@code arr2}
	 * @return {@code arr1 + (alpha * arr2)}
	 * @throws IllegalArgumentException if any of the given arrays are empty
	 * @throws IllegalArgumentException if the given arrays have different size
	 */
	static byte[] byteArrayOp(byte[] arr1, byte[] arr2, Number alpha) {
		checkIfOperationCanBePerformed(arr1, arr2);
		int size = arr1.length;
		byte[] res = new byte[size];
		double alph = alpha.doubleValue();
		for (int i = 0; i < size; i++)
			res[i] = (byte) (arr1[i] + arr2[i] * alph);
		return res;
	}

	/**
	 * Performs the addition of the given two arrays, where the second array is
	 * multiplied by the given number. Note that if {@code alpha = 1}, an addition
	 * of arrays is performed. if {@code alpha = -1}, a subtraction is performed.
	 * Its only use is for
	 * {@linkplain LinearAlgebra#vectorOperation(short[], short[], Number)}.
	 * 
	 * @param arr1  first array
	 * @param arr2  second array which will be multiplied by {@code alpha}
	 * @param alpha scalar multiplier of {@code arr2}
	 * @return {@code arr1 + (alpha * arr2)}
	 * @throws IllegalArgumentException if any of the given arrays are empty
	 * @throws IllegalArgumentException if the given arrays have different size
	 */
	static short[] shortArrayOp(short[] arr1, short[] arr2, Number alpha) {
		checkIfOperationCanBePerformed(arr1, arr2);
		int size = arr1.length;
		short[] res = new short[size];
		double alph = alpha.doubleValue();
		for (int i = 0; i < size; i++)
			res[i] = (short) (arr1[i] + arr2[i] * alph);
		return res;
	}

	/**
	 * Performs the addition of the given two arrays, where the second array is
	 * multiplied by the given number. Note that if {@code alpha = 1}, an addition
	 * of arrays is performed. if {@code alpha = -1}, a subtraction is performed.
	 * Its only use is for
	 * {@linkplain LinearAlgebra#vectorOperation(long[], long[], Number)}.
	 * 
	 * @param arr1  first array
	 * @param arr2  second array which will be multiplied by {@code alpha}
	 * @param alpha scalar multiplier of {@code arr2}
	 * @return {@code arr1 + (alpha * arr2)}
	 * @throws IllegalArgumentException if any of the given arrays are empty
	 * @throws IllegalArgumentException if the given arrays have different size
	 */
	static long[] longArrayOp(long[] arr1, long[] arr2, Number alpha) {
		checkIfOperationCanBePerformed(arr1, arr2);
		int size = arr1.length;
		long[] res = new long[size];
		double alph = alpha.doubleValue();
		for (int i = 0; i < size; i++)
			res[i] = (long) (arr1[i] + arr2[i] * alph);
		return res;
	}

	/**
	 * Performs the addition of the given two arrays, where the second array is
	 * multiplied by the given number. Note that if {@code alpha = 1}, an addition
	 * of arrays is performed. if {@code alpha = -1}, a subtraction is performed.
	 * Its only use is for
	 * {@linkplain LinearAlgebra#vectorOperation(float[], float[], Number)}.
	 * 
	 * @param arr1  first array
	 * @param arr2  second array which will be multiplied by {@code alpha}
	 * @param alpha scalar multiplier of {@code arr2}
	 * @return {@code arr1 + (alpha * arr2)}
	 * @throws IllegalArgumentException if any of the given arrays are empty
	 * @throws IllegalArgumentException if the given arrays have different size
	 */
	static float[] floatArrayOp(float[] arr1, float[] arr2, Number alpha) {
		checkIfOperationCanBePerformed(arr1, arr2);
		int size = arr1.length;
		float[] res = new float[size];
		double alph = alpha.doubleValue();
		for (int i = 0; i < size; i++)
			res[i] = (float) (arr1[i] + arr2[i] * alph);
		return res;
	}

	/**
	 * Performs the addition of the given two arrays, where the second array is
	 * multiplied by the given number. Note that if {@code alpha = 1}, an addition
	 * of arrays is performed. if {@code alpha = -1}, a subtraction is performed.
	 * Its only use is for
	 * {@linkplain LinearAlgebra#vectorOperation(double[], double[], Number)}.
	 * 
	 * @param arr1  first array
	 * @param arr2  second array which will be multiplied by {@code alpha}
	 * @param alpha scalar multiplier of {@code arr2}
	 * @return {@code arr1 + (alpha * arr2)}
	 * @throws IllegalArgumentException if any of the given arrays are empty
	 * @throws IllegalArgumentException if the given arrays have different size
	 */
	static double[] doubleArrayOp(double[] arr1, double[] arr2, Number alpha) {
		checkIfOperationCanBePerformed(arr1, arr2);
		int size = arr1.length;
		double[] res = new double[size];
		double alph = alpha.doubleValue();
		for (int i = 0; i < size; i++)
			res[i] = (double) (arr1[i] + arr2[i] * alph);
		return res;
	}

	/**
	 * Performs the addition of the given two arrays, where the second array is
	 * multiplied by the given number. Note that if {@code alpha = 1}, an addition
	 * of arrays is performed. if {@code alpha = -1}, a subtraction is performed.
	 * Its only use is for
	 * {@linkplain LinearAlgebra#vectorOperation(Number[], Number[], Number)}.
	 * 
	 * @param arr1  first array
	 * @param arr2  second array which will be multiplied by {@code alpha}
	 * @param alpha scalar multiplier of {@code arr2}
	 * @return {@code arr1 + (alpha * arr2)}
	 * @throws IllegalArgumentException if any of the given arrays are empty
	 * @throws IllegalArgumentException if the given arrays have different size
	 */
	static <T extends Number> Number[] numberArrayOp(T[] arr1, T[] arr2, Number alpha) {
		checkIfOperationCanBePerformed(arr1, arr2);
		int size = arr1.length;
		Number[] res = new Number[size];
		double alph = alpha.doubleValue();
		for (int i = 0; i < size; i++)
			res[i] = intOrDouble(arr1[i].doubleValue() + arr2[i].doubleValue() * alph);
		return res;
	}

	/**
	 * Computes a new array that consists of the given array multiplied by the
	 * specified scalar.
	 * 
	 * @param arr thr array to be multipled
	 * @param n   the scalar value
	 * @return a new array representing {@code arr * n}
	 * @throws IllegalArgumentException if the array is empty
	 */
	public static int[] arrayMultiplyBy(int[] arr, Number n) {
		checkEmptiness(arr);
		int size = arr.length;
		int[] res = new int[size];
		double alph = n.doubleValue();
		for (int i = 0; i < size; i++) {
			res[i] = (int) (arr[i] * alph);
		}
		return res;
	}

	/**
	 * Computes a new array that consists of the given array multiplied by the
	 * specified scalar.
	 * 
	 * @param arr thr array to be multipled
	 * @param n   the scalar value
	 * @return a new array representing {@code arr * n}
	 * @throws IllegalArgumentException if the array is empty
	 */
	public static byte[] arrayMultiplyBy(byte[] arr, Number n) {
		checkEmptiness(arr);
		int size = arr.length;
		byte[] res = new byte[size];
		double alph = n.doubleValue();
		for (int i = 0; i < size; i++) {
			res[i] = (byte) (arr[i] * alph);
		}
		return res;
	}

	/**
	 * Computes a new array that consists of the given array multiplied by the
	 * specified scalar.
	 * 
	 * @param arr thr array to be multipled
	 * @param n   the scalar value
	 * @return a new array representing {@code arr * n}
	 * @throws IllegalArgumentException if the array is empty
	 */
	public static short[] arrayMultiplyBy(short[] arr, Number n) {
		checkEmptiness(arr);
		int size = arr.length;
		short[] res = new short[size];
		double alph = n.doubleValue();
		for (int i = 0; i < size; i++) {
			res[i] = (short) (arr[i] * alph);
		}
		return res;
	}

	/**
	 * Computes a new array that consists of the given array multiplied by the
	 * specified scalar.
	 * 
	 * @param arr thr array to be multipled
	 * @param n   the scalar value
	 * @return a new array representing {@code arr * n}
	 * @throws IllegalArgumentException if the array is empty
	 */
	public static long[] arrayMultiplyBy(long[] arr, Number n) {
		checkEmptiness(arr);
		int size = arr.length;
		long[] res = new long[size];
		double alph = n.doubleValue();
		for (int i = 0; i < size; i++) {
			res[i] = (long) (arr[i] * alph);
		}
		return res;
	}

	/**
	 * Computes a new array that consists of the given array multiplied by the
	 * specified scalar.
	 * 
	 * @param arr thr array to be multipled
	 * @param n   the scalar value
	 * @return a new array representing {@code arr * n}
	 * @throws IllegalArgumentException if the array is empty
	 */
	public static float[] arrayMultiplyBy(float[] arr, Number n) {
		checkEmptiness(arr);
		int size = arr.length;
		float[] res = new float[size];
		double alph = n.doubleValue();
		for (int i = 0; i < size; i++) {
			res[i] = (float) (arr[i] * alph);
		}
		return res;
	}

	/**
	 * Computes a new array that consists of the given array multiplied by the
	 * specified scalar.
	 * 
	 * @param arr thr array to be multipled
	 * @param n   the scalar value
	 * @return a new array representing {@code arr * n}
	 * @throws IllegalArgumentException if the array is empty
	 */
	public static double[] arrayMultiplyBy(double[] arr, Number n) {
		checkEmptiness(arr);
		int size = arr.length;
		double[] res = new double[size];
		double alph = n.doubleValue();
		for (int i = 0; i < size; i++) {
			res[i] = (double) (arr[i] * alph);
		}
		return res;
	}

	/**
	 * Computes a new array that consists of the given array multiplied by the
	 * specified scalar.
	 * 
	 * @param <T> type of Number
	 * @param arr thr array to be multipled
	 * @param n   the scalar value
	 * @return a new array representing {@code arr * n}
	 * @throws IllegalArgumentException if the array is empty
	 */
	public static <T extends Number> Number[] arrayMultiplyBy(T[] arr, Number n) {
		checkEmptiness(arr);
		int size = arr.length;
		Number[] res = new Number[size];
		double alph = n.doubleValue();
		for (int i = 0; i < size; i++) {
			res[i] = NumericArrays.intOrDouble(arr[i].doubleValue() * alph);
		}
		return res;
	}

	/*
	 * Used to round when a numbers end with decimals .99999... or .00000... I can't
	 * make it work for decimals such as .459999... -> .46
	 */
	static double UMBRAL = 1e-8;

	/**
	 * Used when an operation that involves Number objects gives a number with bunch
	 * of 999999 decimals or 000000000{...} decimals. It does not work to convert,
	 * for example, decimals such as .459999999 to .46
	 * 
	 * @param n
	 * @return
	 */
	static Number intOrDouble(Number number) {
		double n = number.doubleValue();
		if ((int) n == n)
			return (Number) Integer.valueOf((int) n);
		double aux = Math.abs(n);
		double auxdec = aux - Math.abs(Math.floor(aux));
		if (auxdec + UMBRAL >= 1 || auxdec - UMBRAL <= 0)
			return (Number) Integer.valueOf((int) Math.round(n));
		return Double.valueOf(n);
	}

	/**
	 * Finds the index of the first non-zero number in the given array.
	 *
	 * @param v the array of integers to search
	 * @return the index of the first non-zero number, or -1 if no non-zero number
	 *         is found
	 * @throws IllegalArgumentException if the given array is empty
	 */
	public static int indexFirstNotZeroNumber(int[] v) {
		checkEmptiness(v);
		for (int i = 0; i < v.length; i++)
			if (v[i] != 0)
				return i;
		return -1;
	}

	/**
	 * Finds the index of the first non-zero number in the given array.
	 *
	 * @param v the array of bytes to search
	 * @return the index of the first non-zero number, or -1 if no non-zero number
	 *         is found
	 * @throws IllegalArgumentException if the given array is empty
	 */
	public static int indexFirstNotZeroNumber(byte[] v) {
		checkEmptiness(v);
		for (int i = 0; i < v.length; i++)
			if (v[i] != 0)
				return i;
		return -1;
	}

	/**
	 * Finds the index of the first non-zero number in the given array.
	 *
	 * @param v the array of short integers to search
	 * @return the index of the first non-zero number, or -1 if no non-zero number
	 *         is found
	 * @throws IllegalArgumentException if the given array is empty
	 */
	public static int indexFirstNotZeroNumber(short[] v) {
		checkEmptiness(v);
		for (int i = 0; i < v.length; i++)
			if (v[i] != 0)
				return i;
		return -1;
	}

	/**
	 * Finds the index of the first non-zero number in the given array.
	 *
	 * @param v the array of long integers to search
	 * @return the index of the first non-zero number, or -1 if no non-zero number
	 *         is found
	 * @throws IllegalArgumentException if the given array is empty
	 */
	public static int indexFirstNotZeroNumber(long[] v) {
		checkEmptiness(v);
		for (int i = 0; i < v.length; i++)
			if (v[i] != 0)
				return i;
		return -1;
	}

	/**
	 * Finds the index of the first non-zero number in the given array.
	 *
	 * @param v the array of floats to search
	 * @return the index of the first non-zero number, or -1 if no non-zero number
	 *         is found
	 * @throws IllegalArgumentException if the given array is empty
	 */
	public static int indexFirstNotZeroNumber(float[] v) {
		checkEmptiness(v);
		for (int i = 0; i < v.length; i++)
			if (v[i] != 0)
				return i;
		return -1;
	}

	/**
	 * Finds the index of the first non-zero number in the given array.
	 *
	 * @param v the array of doubles to search
	 * @return the index of the first non-zero number, or -1 if no non-zero number
	 *         is found
	 * @throws IllegalArgumentException if the given array is empty
	 */
	public static int indexFirstNotZeroNumber(double[] v) {
		checkEmptiness(v);
		for (int i = 0; i < v.length; i++)
			if (v[i] != 0)
				return i;
		return -1;
	}

	/**
	 * Finds the index of the first non-zero number in the given array.
	 *
	 * @param v the array of numbers to search
	 * @return the index of the first non-zero number, or -1 if no non-zero number
	 *         is found
	 * @throws IllegalArgumentException if the given array is empty
	 */
	public static <T extends Number> int indexFirstNotZeroNumber(T[] v) {
		checkEmptiness(v);
		for (int i = 0; i < v.length; i++)
			if (v[i].doubleValue() != 0)
				return i;
		return -1;
	}

	/**
	 * Generates an array of random integers with values between -100 and 100
	 * (inclusive).
	 *
	 * @param rLength the length of the array to generate
	 * @return an array of random integers
	 */
	public static int[] randomIntArray(int rLength) {
		return randomIntArray(rLength, -100, 100);
	}

	/**
	 * Generates an array of random integers with values between the specified
	 * minimum and maximum (inclusive).
	 *
	 * @param rLength the number of integers to generate in the array
	 * @param min     the minimum expected value (inclusive)
	 * @param max     the maximum expected value (inclusive)
	 * @return an array of random integers
	 * @throws IllegalArgumentException if {@code min} is greater than or equal to
	 *                                  {@code max}
	 */
	public static int[] randomIntArray(int rLength, int min, int max) {
		int[] res = new int[rLength];
		for (int i = 0; i < rLength; i++)
			res[i] = (int) ThreadLocalRandom.current().nextInt(min, max + 1);
		return res;
	}

	/**
	 * Generates an array of random bytes with values between -100 and 100
	 * (inclusive).
	 *
	 * @param rLength the length of the array to generate
	 * @return an array of random bytes
	 */
	public static byte[] randomByteArray(int rLength) {
		return randomByteArray(rLength, -100, 100);
	}

	/**
	 * Generates an array of random bytes with values between the specified minimum
	 * and maximum (inclusive).
	 *
	 * @param rLength the number of bytes to generate in the array
	 * @param min     the minimum expected value (inclusive)
	 * @param max     the maximum expected value (inclusive)
	 * @return an array of random bytes
	 * @throws IllegalArgumentException if {@code min} is greater than or equal to
	 *                                  {@code max}
	 */
	public static byte[] randomByteArray(int rLength, int min, int max) {
		if (rLength < 1)
			throw new IllegalArgumentException("Introduce a positive integer number");
		byte[] res = new byte[rLength];
		for (int i = 0; i < rLength; i++)
			res[i] = (byte) ThreadLocalRandom.current().nextInt(min, max + 1);
		return res;
	}

	/**
	 * Generates an array of random short integers with values between -100 and 100
	 * (inclusive).
	 *
	 * @param rLength the length of the array to generate
	 * @return an array of random bytes
	 */
	public static short[] randomShortArray(int rLength) {
		return randomShortArray(rLength, -100, 100);
	}

	/**
	 * Generates an array of random short integers with values between the specified
	 * minimum and maximum (inclusive).
	 *
	 * @param rLength the number of short integers to generate in the array
	 * @param min     the minimum expected value (inclusive)
	 * @param max     the maximum expected value (inclusive)
	 * @return an array of random short integers
	 * @throws IllegalArgumentException if {@code min} is greater than or equal to
	 *                                  {@code max}
	 */
	public static short[] randomShortArray(int rLength, int min, int max) {
		if (rLength < 1)
			throw new IllegalArgumentException("Introduce a positive integer number");
		short[] res = new short[rLength];
		for (int i = 0; i < rLength; i++)
			res[i] = (short) ThreadLocalRandom.current().nextInt(min, max + 1);
		return res;
	}

	/**
	 * Generates an array of random long integers with values between -100 and 100
	 * (inclusive).
	 *
	 * @param rLength the length of the array to generate
	 * @return an array of random bytes
	 */
	public static long[] randomLongArray(int rLength) {
		return randomLongArray(rLength, -100, 100);
	}

	/**
	 * Generates an array of random long integers with values between the specified
	 * minimum and maximum (inclusive).
	 *
	 * @param rLength the number of long integers to generate in the array
	 * @param min     the minimum expected value (inclusive)
	 * @param max     the maximum expected value (inclusive)
	 * @return an array of random long integers
	 * @throws IllegalArgumentException if {@code min} is greater than or equal to
	 *                                  {@code max}
	 */
	public static long[] randomLongArray(int rLength, int min, int max) {
		if (rLength < 1)
			throw new IllegalArgumentException("Introduce a positive integer number");
		long[] res = new long[rLength];
		for (int i = 0; i < rLength; i++)
			res[i] = (long) ThreadLocalRandom.current().nextInt(min, max + 1);
		return res;
	}

	/**
	 * Generates an array of random floats with values between -100 and 100
	 * (inclusive).
	 *
	 * @param rLength the length of the array to generate
	 * @return an array of random bytes
	 */
	public static float[] randomFloatArray(int rLength) {
		return randomFloatArray(rLength, -100, 100);
	}

	/**
	 * Generates an array of random floats with values between the specified minimum
	 * and maximum (inclusive).
	 *
	 * @param rLength the number of floats to generate in the array
	 * @param min     the minimum expected value (inclusive)
	 * @param max     the maximum expected value (inclusive)
	 * @return an array of random floats
	 * @throws IllegalArgumentException if {@code min} is greater than or equal to
	 *                                  {@code max}
	 */
	public static float[] randomFloatArray(int rLength, int min, int max) {
		if (rLength < 1)
			throw new IllegalArgumentException("Introduce a positive integer number");
		float[] res = new float[rLength];
		for (int i = 0; i < rLength; i++)
			res[i] = (float) ThreadLocalRandom.current().nextInt(min, max + 1);
		return res;
	}

	/**
	 * Generates an array of random doubles with values between -100 and 100
	 * (inclusive).
	 *
	 * @param rLength the length of the array to generate
	 * @return an array of random bytes
	 */
	public static double[] randomDoubleArray(int rLength) {
		return randomDoubleArray(rLength, -100, 100);
	}

	/**
	 * Generates an array of random doubles with values between the specified
	 * minimum and maximum (inclusive).
	 *
	 * @param rLength the number of doubles to generate in the array
	 * @param min     the minimum expected value (inclusive)
	 * @param max     the maximum expected value (inclusive)
	 * @return an array of random doubles
	 * @throws IllegalArgumentException if {@code min} is greater than or equal to
	 *                                  {@code max}
	 */
	public static double[] randomDoubleArray(int rLength, int min, int max) {
		if (rLength < 1)
			throw new IllegalArgumentException("Introduce a positive integer number");
		double[] res = new double[rLength];
		for (int i = 0; i < rLength; i++)
			res[i] = (double) ThreadLocalRandom.current().nextInt(min, max + 1);
		return res;
	}

	/**
	 * Generates an array of random numbers (Integer objects) with values between
	 * -100 and 100 (inclusive).
	 *
	 * @param rLength the length of the array to generate
	 * @return an array of random bytes
	 */
	public static Number[] randomNumberArray(int rLength) {
		return randomNumberArray(rLength, -100, 100);
	}

	/**
	 * Generates an array of random numbers (Integer objects) with values between
	 * the specified minimum and maximum (inclusive).
	 *
	 * @param rLength the number of Number objects to generate in the array
	 * @param min     the minimum expected value (inclusive)
	 * @param max     the maximum expected value (inclusive)
	 * @return an array of random numbers
	 * @throws IllegalArgumentException if {@code min} is greater than or equal to
	 *                                  {@code max}
	 */
	public static Number[] randomNumberArray(int rLength, int min, int max) {
		if (rLength < 1)
			throw new IllegalArgumentException("Introduce a positive integer number");
		Number[] res = new Number[rLength];
		for (int i = 0; i < rLength; i++) {
			res[i] = ThreadLocalRandom.current().nextInt(min, max + 1);
		}
		return res;
	}

	/**
	 * Generate a Number array based on the given integer array. Used when an
	 * integer array is added to an {@link AlgebraicMatrix} as row or column.
	 * 
	 * @param arr integer array to base the Number array
	 * @return a Number array based on the given integer array
	 */
	static Number[] intToNumberArray(int[] arr) {
		int size = arr.length;
		Number[] res = new Number[size];
		for (int i = 0; i < size; i++)
			res[i] = (Number) arr[i];
		return res;
	}

	/**
	 * Generate a Number array based on the given byte array. Used when a byte array
	 * is added to an {@link AlgebraicMatrix} as row or column.
	 * 
	 * @param arr byte array to base the Number array
	 * @return a Number array based on the given byte array
	 */
	static Number[] byteToNumberArray(byte[] arr) {
		int size = arr.length;
		Number[] res = new Number[size];
		for (int i = 0; i < size; i++)
			res[i] = (Number) arr[i];
		return res;
	}

	/**
	 * Generate a Number array based on the given short integer array. Used when a
	 * short integer array is added to an {@link AlgebraicMatrix} as row or column.
	 * 
	 * @param arr short integer array to base the Number array
	 * @return a Number array based on the given short integer array
	 */
	static Number[] shortToNumberArray(short[] arr) {
		int size = arr.length;
		Number[] res = new Number[size];
		for (int i = 0; i < size; i++)
			res[i] = (Number) arr[i];
		return res;
	}

	/**
	 * Generate a Number array based on the given long integer array. Used when a
	 * long integer array is added to an {@link AlgebraicMatrix} as row or column.
	 * 
	 * @param arr long integer array to base the Number array
	 * @return a Number array based on the given long integer array
	 */
	static Number[] longToNumberArray(long[] arr) {
		int size = arr.length;
		Number[] res = new Number[size];
		for (int i = 0; i < size; i++)
			res[i] = (Number) arr[i];
		return res;
	}

	/**
	 * Generate a Number array based on the given float array. Used when an float
	 * array is added to an {@link AlgebraicMatrix} as row or column.
	 * 
	 * @param arr float array to base the Number array
	 * @return a Number array based on the given float array
	 */
	static Number[] floatToNumberArray(float[] arr) {
		int size = arr.length;
		Number[] res = new Number[size];
		for (int i = 0; i < size; i++)
			res[i] = (Number) arr[i];
		return res;
	}

	/**
	 * Generate a Number array based on the given double array. Used when an double
	 * array is added to an {@link AlgebraicMatrix} as row or column.
	 * 
	 * @param arr double array to base the Number array
	 * @return a Number array based on the given double array
	 */
	static Number[] doubleToNumberArray(double[] arr) {
		int size = arr.length;
		Number[] res = new Number[size];
		for (int i = 0; i < size; i++)
			res[i] = (Number) arr[i];
		return res;
	}

	/**
	 * Generate a Number array based on the given T array, with T an object that
	 * extends the Number class. Used when a T array is added to an
	 * {@link AlgebraicMatrix} as row or column.
	 * 
	 * @param <T> type of Number
	 * @param arr T array to base the Number array
	 * @return a Number array based on the given T array
	 */
	static <T extends Number> Number[] generalizedNumberArray(T[] arr) {
		return java.util.Arrays.copyOf(arr, arr.length, Number[].class);
	}

	/**
	 * Returns the sum of all of the numbers in the given array.
	 * 
	 * @param v the array where to sum its numbers
	 * @return the sum of all of the numbers in the given array
	 * @throws IllegalArgumentException if the array is empty
	 */
	public static double sumAllNumbers(int[] v) {
		checkEmptiness(v);
		int sum = 0;
		for (int n : v)
			sum += n;
		return sum;
	}

	/**
	 * Returns the sum of all of the numbers in the given array.
	 * 
	 * @param v the array where to sum its numbers
	 * @return the sum of all of the numbers in the given array
	 * @throws IllegalArgumentException if the array is empty
	 */
	public static double sumAllNumbers(byte[] v) {
		checkEmptiness(v);
		int sum = 0;
		for (byte n : v)
			sum += n;
		return sum;
	}

	/**
	 * Returns the sum of all of the numbers in the given array.
	 * 
	 * @param v the array where to sum its numbers
	 * @return the sum of all of the numbers in the given array
	 * @throws IllegalArgumentException if the array is empty
	 */
	public static double sumAllNumbers(short[] v) {
		checkEmptiness(v);
		int sum = 0;
		for (short n : v)
			sum += n;
		return sum;
	}

	/**
	 * Returns the sum of all of the numbers in the given array.
	 * 
	 * @param v the array where to sum its numbers
	 * @return the sum of all of the numbers in the given array
	 * @throws IllegalArgumentException if the array is empty
	 */
	public static double sumAllNumbers(long[] v) {
		checkEmptiness(v);
		long sum = 0;
		for (long n : v)
			sum += n;
		return sum;
	}

	/**
	 * Returns the sum of all of the numbers in the given array.
	 * 
	 * @param v the array where to sum its numbers
	 * @return the sum of all of the numbers in the given array
	 * @throws IllegalArgumentException if the array is empty
	 */
	public static double sumAllNumbers(float[] v) {
		checkEmptiness(v);
		double sum = 0;
		for (float n : v)
			sum += n;
		return sum;
	}

	/**
	 * Returns the sum of all of the numbers in the given array.
	 * 
	 * @param v the array where to sum its numbers
	 * @return the sum of all of the numbers in the given array
	 * @throws IllegalArgumentException if the array is empty
	 */
	public static double sumAllNumbers(double[] v) {
		checkEmptiness(v);
		double sum = 0;
		for (double n : v)
			sum += n;
		return sum;
	}

	/**
	 * Returns the sum of all of the numbers in the given array.
	 * 
	 * @param v the array where to sum its numbers
	 * @return the sum of all of the numbers in the given array
	 * @throws IllegalArgumentException if the array is empty
	 */
	public static <T extends Number> double sumAllNumbers(T[] v) {
		checkEmptiness(v);
		double sum = 0;
		for (Number n : v)
			sum += n.doubleValue();
		return sum;
	}

	/**
	 * Returns the sum of all of the squares of the numbers in the given array.
	 * 
	 * @param v the array where to sum its numbers
	 * @return the sum of all of the squares of the numbers in the given array
	 * @throws IllegalArgumentException if the array is empty
	 */
	static double sumAllNumbersSquared(int[] v) {
		checkEmptiness(v);
		int sum = 0;
		for (int n : v)
			sum += Math.pow(n, 2);
		return sum;
	}

	/**
	 * Returns the sum of all of the squares of the numbers in the given array.
	 * 
	 * @param v the array where to sum its numbers
	 * @return the sum of all of the squares of the numbers in the given array
	 * @throws IllegalArgumentException if the array is empty
	 */
	static double sumAllNumbersSquared(byte[] v) {
		checkEmptiness(v);
		int sum = 0;
		for (byte n : v)
			sum += Math.pow(n, 2);
		return sum;
	}

	/**
	 * Returns the sum of all of the squares of the numbers in the given array.
	 * 
	 * @param v the array where to sum its numbers
	 * @return the sum of all of the squares of the numbers in the given array
	 * @throws IllegalArgumentException if the array is empty
	 */
	static double sumAllNumbersSquared(short[] v) {
		checkEmptiness(v);
		int sum = 0;
		for (short n : v)
			sum += Math.pow(n, 2);
		return sum;
	}

	/**
	 * Returns the sum of all of the squares of the numbers in the given array.
	 * 
	 * @param v the array where to sum its numbers
	 * @return the sum of all of the squares of the numbers in the given array
	 * @throws IllegalArgumentException if the array is empty
	 */
	static double sumAllNumbersSquared(long[] v) {
		checkEmptiness(v);
		long sum = 0;
		for (long n : v)
			sum += Math.pow(n, 2);
		return sum;
	}

	/**
	 * Returns the sum of all of the squares of the numbers in the given array.
	 * 
	 * @param v the array where to sum its numbers
	 * @return the sum of all of the squares of the numbers in the given array
	 * @throws IllegalArgumentException if the array is empty
	 */
	static double sumAllNumbersSquared(float[] v) {
		checkEmptiness(v);
		double sum = 0;
		for (float n : v)
			sum += Math.pow(n, 2);
		return sum;
	}

	/**
	 * Returns the sum of all of the squares of the numbers in the given array.
	 * 
	 * @param v the array where to sum its numbers
	 * @return the sum of all of the squares of the numbers in the given array
	 * @throws IllegalArgumentException if the array is empty
	 */
	static double sumAllNumbersSquared(double[] v) {
		checkEmptiness(v);
		double sum = 0;
		for (double n : v)
			sum += Math.pow(n, 2);
		return sum;
	}

	/**
	 * Returns the sum of all of the squares of the numbers in the given array.
	 * 
	 * @param v the array where to sum its numbers
	 * @return the sum of all of the squares of the numbers in the given array
	 * @throws IllegalArgumentException if the array is empty
	 */
	static <T extends Number> double sumAllNumbersSquared(T[] v) {
		checkEmptiness(v);
		double sum = 0;
		for (Number n : v)
			sum += Math.pow(n.doubleValue(), 2);
		return sum;
	}

	/**
	 * Returns {@code true} if an array of Numbers contains at least one null
	 * element. Used when a row/column is added to an {@link AlgebraicMatrix}
	 * 
	 * @param <T> type of Number
	 * @param arr array to check if it contains null elements
	 * @return {@code true} if an array of Numbers contains a null element
	 */
	static <T extends Number> boolean staticArrayContainsNullElements(T[] arr) {
		for (T num : arr)
			if (num == null)
				return true;
		return false;
	}

	/**
	 * Checks if the given Number array contains at least one null element. If it
	 * does, this method throws a {@code NullPointerException}. Used when a
	 * row/column is added to an {@link AlgebraicMatrix}
	 * 
	 * @param <T> type of Number
	 * @param arr array to check if it contains null elements
	 * @throws NullPointerException if the given array contains at least one null
	 *                              element
	 */
	static <T extends Number> void checkStaticArrayContainsNullElements(T[] arr) {
		if (staticArrayContainsNullElements(arr))
			throw new NullPointerException("This numeric array contains at least one null element");
	}

}