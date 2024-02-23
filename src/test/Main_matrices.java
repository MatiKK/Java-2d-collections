package test;

import java.util.Scanner;

import algebra.AlgebraicMatrix;
import algebra.LinearAlgebra;

public class Main_matrices {
	public static void main(String[] args) {
		AlgebraicMatrix m1, m2, result;
		Number scalar;
		Scanner scan = new Scanner(System.in);
		System.out.println(AskUserFor.MATRIX_OPERATIONS);
		System.out.print("I choose: ");
		int choice = scan.nextInt();
		switch (choice) {
		case 1:
			System.out.println("\nAsking for the 1st matrix");
			m1 = AskUserFor.matrix(scan);
			System.out.println("\nAsking for the 2nd matrix\n");
			m2 = AskUserFor.matrix(scan);
			result = LinearAlgebra.matrixAddition(m1, m2);
			System.out.println();
			System.out.println(m1);
			System.out.println("+");
			System.out.println(m2);
			System.out.println("=");
			System.out.println(result);
			break;

		case 2:
			System.out.println("\nAsking for the 1st matrix");
			m1 = AskUserFor.matrix(scan);
			System.out.println("\nAsking for the 2nd matrix\n");
			m2 = AskUserFor.matrix(scan);
			result = LinearAlgebra.matrixSubtraction(m1, m2);
			System.out.println();
			System.out.println(m1);
			System.out.println("-");
			System.out.println(m2);
			System.out.println("=");
			System.out.println(result);
			break;

		case 3:
			System.out.println("\nAsking for the 1st matrix");
			m1 = AskUserFor.matrix(scan);
			System.out.println("\nAsking for the 2nd matrix\n");
			m2 = AskUserFor.matrix(scan);
			result = LinearAlgebra.matrixMultiplication(m1, m2);
			System.out.println();
			System.out.println(m1);
			System.out.println("x");
			System.out.println(m2);
			System.out.println("=");
			System.out.println(result);
		case 4:
			System.out.println("\nAsking for the matrix");
			m1 = AskUserFor.matrix(scan);
			System.out.println("\nAsking for the scalar value");
			scalar = AskUserFor.scalarValue(scan);
			result = LinearAlgebra.matrixScalarMultiplication(m1, scalar);
			System.out.println();
			System.out.println(m1);
			System.out.println("x");
			System.out.println(scalar);
			System.out.println("=");
			System.out.println(result);
			break;
		case 5:
			System.out.println("\nAsking for the matrix\n");
			m1 = AskUserFor.matrix(scan);
			System.out.println(m1);
			System.out.println("Determinant: " + m1.determinant());
			break;
		case 6:
			System.out.println("\nAsking for the 1st matrix");
			m1 = AskUserFor.matrix(scan);
			result = m1.transpose();
			System.out.println();
			System.out.println(m1);
			System.out.println("\nTranspose: ");
			System.out.println(result);
			break;
		case 7:
			System.out.println("\nAsking for the 1st matrix");
			m1 = AskUserFor.matrix(scan);
			result = LinearAlgebra.matrixInverse(m1);
			System.out.println();
			System.out.println(m1);
			System.out.println("\nInverse: ");
			System.out.println(result);
			break;
		case 8:
			System.out.println("\nAsking for the 1st matrix");
			m1 = AskUserFor.matrix(scan);
			result = LinearAlgebra.matrixCofactor(m1);
			System.out.println();
			System.out.println(m1);
			System.out.println("\nCofactor matrix: ");
			System.out.println(result);
			break;
		case 9:
			System.out.println("\nAsking for the 1st matrix");
			m1 = AskUserFor.matrix(scan);
			result = LinearAlgebra.matrixAdjugate(m1);
			System.out.println();
			System.out.println(m1);
			System.out.println("\nAdjugate matrix: ");
			System.out.println(result);
			break;
		default:
			System.out.println("Invalid choice");
		}
	}
}