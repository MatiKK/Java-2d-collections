package algebra;

public class Test {
	public static void main(String[] args) {
		AlgebraicMatrix mat = LinearAlgebra.array2dAsMatrix(
		new Number[][] {
			{2,1,0,1},
			{1,2,-1,2},
			{1,-1,2,1},
			{1,2,-1,2}
		});

//		checkInverse(mat);

		mat = AlgebraicMatrix.random(2,2);
		checkInverse(mat);
	
	}

	private static void checkInverse(AlgebraicMatrix mat) {
		System.out.println("------------------------------");
		System.out.println("Matrix:");
		System.out.println(mat);
		System.out.println();
		
		System.out.println("Its inverse:");
		try {
			AlgebraicMatrix inv = LinearAlgebra.matrixInverse(mat);
			System.out.println(inv);
			System.out.println();

			System.out.println("check: mat x inverse(mat)");
			System.out.println(LinearAlgebra.matrixMultiplication(mat, inv));
			System.out.println("check: inverse(mat) x mat");
			System.out.println(LinearAlgebra.matrixMultiplication(inv, mat));
		}
		catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
	}
}
