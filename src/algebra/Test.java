package algebra;

@SuppressWarnings("unused")
public class Test {

	public static void main(String[] args) {
		speedTest(3);
//		equalityTest(3);
	}

	private static void equalityTest(int dimension) {
		AlgebraicMatrix mat, result1, result2;
		int n = dimension;
		mat = AlgebraicMatrix.random(n, n);
		result1 = LinearAlgebra.matrixInverse(mat);
		result2 = LinearAlgebra.matrixInverseGaussianElimination(mat);
//		System.out.println(LinearAlgebra.matrixMultiplication(mat, result1));
//		System.out.println("---------------");
//		System.out.println(LinearAlgebra.matrixMultiplication(mat, result2));
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.println(result1.getElement(i, j) + " = " + result2.getElement(i, j));
			}
		}
	}

	private static void speedTest(int limit) {
		AlgebraicMatrix mat, result1, result2;
		int n = limit;
		for (int i = 1; i <= n; i++) {
			mat = AlgebraicMatrix.random(i, i);
			System.out.println("Matrix " + i + "x" + i);
			System.out.println(mat);
			long startTime, endTime, duration1, duration2;
			startTime = System.nanoTime();
			result1 = LinearAlgebra.matrixInverse(mat);
			endTime = System.nanoTime();
			duration1 = (endTime - startTime);
			System.out.println(result1);
			System.out.println("inverse matrix by adjugate definition: " + duration1 + " nanoseconds");
			startTime = System.nanoTime();
			result2 = LinearAlgebra.matrixInverseGaussianElimination(mat);
			endTime = System.nanoTime();
			duration2 = (endTime - startTime);
			System.out.println(result2);
			System.out.println("inverse matrix by gaussian elimination: " + duration2 + " nanoseconds");
			whichWasFaster(duration1, duration2);
			System.out.println(result1.equals(result2)); // 99% false for i > 2
			System.out.println();
		}
	}

	static void whichWasFaster(long a, long b) {
		if (a < b) {
			System.out.println("adjugate definition method was " + ((double) b / (double) a) + " faster");
		} else {
			System.out.println("gaussian elimination method was " + ((double) a / (double) b) + " faster");
		}
	}

}
