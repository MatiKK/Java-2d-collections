package test;

import java.util.ArrayList;
import java.util.Scanner;

import algebra.AlgebraicMatrix;
import algebra.NumericArrays;

public class AskUserFor {

	static String VECTOR_OPERATIONS = """
			What vector operation do you want to perform?
			1) vector addition
			2) vector subtraction
			3) vector dot product
			4) vector by a scalar
			5) perpendicular vector
			6) length of a vector
			7) cross product
			""";

	static String MATRIX_OPERATIONS = """
			What matrix operation do you want to perform?
			1) matrix addition
			2) matrix subtraction
			3) matrix multiplication
			4) matrix by a scalar
			5) matrix determinant
			6) matrix transpose
			7) matrix inverse
			8) cofactor matrix
			9) adjugate matrix
			""";

	static Number scalarValue(Scanner sc) {
		System.out.print("Write your scalar value: ");
		return Double.valueOf(sc.nextLine());
	}

	static AlgebraicMatrix matrix(Scanner sc) {
		int rows, columns;
		System.out.print("Input the number of rows: ");
		rows = sc.nextInt();
		System.out.print("Input the matrix number of columns: ");
		columns = sc.nextInt();
		sc.nextLine();
		System.out.print("Random matrix of given sizes? (y/n): ");		
		if (sc.nextLine().equalsIgnoreCase("y")) 
			return AlgebraicMatrix.random(rows,columns);
		
		
		AlgebraicMatrix mat = new AlgebraicMatrix(rows, columns);

		System.out.println("Write your matrix rows separating each number with a space");

//		sc.nextLine();
		int addedRows = 0;
		while (mat.rowSize() != rows) {

			ArrayList<Number> newRow = new ArrayList<>();
			System.out.print("F" + (addedRows + 1) + ": ");
			String[] rowInput = sc.nextLine().split(" ");
			for (int i = 0; i < rowInput.length; i++) {
				newRow.add(Double.valueOf(rowInput[i]));
			}
			if (newRow.size() != columns)
				throw new IllegalArgumentException("You chose the matrix to have " + columns
						+ " columns, but you introduced a row of " + newRow.size() + " numbers");
			mat.addRow(newRow);
			addedRows++;
		}

		return mat;
	}

	static int[] vector(Scanner sc) {
		System.out.print("Input the dimension of the vector: ");
		int size = sc.nextInt();
		int[] vector = new int[size];
		System.out.println("Write your vector separating each number with a space");
		System.out.println("or write \"random\" to obtain a random vector with numbers from -20 to 20");
		sc.nextLine();
		String[] vectorInput = sc.nextLine().split(" ");
		if (vectorInput.length == 1 && vectorInput[0].equals("random"))
			return NumericArrays.randomIntArray(size, -20, 20);
		for (int i = 0; i < vectorInput.length; i++)
			vector[i] = Integer.valueOf(vectorInput[i]);
		return vector;
	}
}
