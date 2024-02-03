package test;

import collections2d.LinearAlgebra;
import java.util.Arrays;
import java.util.Scanner;

public class Main_vectors {
	public static void main(String[] args) {
		int[] v1, v2, vResult;
		Number scalar;
		double result;
		Scanner scan = new Scanner(System.in);
		System.out.println(
				"THESE METHODS WORK FOR ANY TYPE OF NUMBERS, BUT THIS TEST WORKS FOR INTEGERS FOR BETTER ILLUSTRATION");
		System.out.println(AskUserFor.VECTOR_OPERATIONS);
		System.out.print("I choose: ");
		int choice = scan.nextInt();
		switch (choice) {
		case 1:
			System.out.println("\nAsking for the 1st vector\n");
			v1 = AskUserFor.vector(scan);
			System.out.println("\nAsking for the 2nd vector\n");
			v2 = AskUserFor.vector(scan);
			vResult = LinearAlgebra.vectorAddition(v1, v2);
			System.out.println(
					"\n" + Arrays.toString(v1) + " + " + Arrays.toString(v2) + " = " + Arrays.toString(vResult));
			break;
		case 2:
			System.out.println("\nAsking for the 1st vector\n");
			v1 = AskUserFor.vector(scan);
			System.out.println("\nAsking for the 2nd vector\n");
			v2 = AskUserFor.vector(scan);
			vResult = LinearAlgebra.vectorSubtraction(v1, v2);
			System.out.println(
					"\n" + Arrays.toString(v1) + " - " + Arrays.toString(v2) + " = " + Arrays.toString(vResult));
			break;
		case 3:
			System.out.println("\nAsking for the 1st vector\n");
			v1 = AskUserFor.vector(scan);
			System.out.println("\nAsking for the 2nd vector\n");
			v2 = AskUserFor.vector(scan);
			result = LinearAlgebra.vectorsDotProduct(v1, v2);
			System.out.println("\n" + Arrays.toString(v1) + "." + Arrays.toString(v2) + " = " + result);
			break;
		case 4:
			System.out.println("\nAsking for the 1st vector\n");
			v1 = AskUserFor.vector(scan);
			System.out.println("\nAsking for the scalar\n");
			scalar = AskUserFor.scalarValue(scan);
			vResult = LinearAlgebra.vectorScalarMultiplication(v1, scalar);
			System.out.println("\n" + scalar + " x " + Arrays.toString(v1) + " = " + Arrays.toString(vResult));
			break;
		case 5:
			System.out.println("\nAsking for the vector\n");
			v1 = AskUserFor.vector(scan);
			vResult = LinearAlgebra.perpendicularVector(v1);
			System.out.println("\n" + Arrays.toString(v1) + " is perpendicular to " + Arrays.toString(vResult));
			break;
		case 6:
			System.out.println("\nAsking for the vector\n");
			v1 = AskUserFor.vector(scan);
			result = LinearAlgebra.vectorLength(v1);
			System.out.println("\nLength of " + Arrays.toString(v1) + " = " + result);
			break;
		case 7:
			System.out.println("\nAsking for the 1st vector\n");
			v1 = AskUserFor.vector(scan);
			if (v1.length != 3)
				throw new IllegalArgumentException(
						"Cross product can only be achieved with three-dimensional vectors (vector.length = 3)");
			System.out.println("\nAsking for the 2nd vector\n");
			v2 = AskUserFor.vector(scan);
			if (v2.length != 3)
				throw new IllegalArgumentException(
						"Cross product can only be achieved with three-dimensional vectors (vector.length = 3)");
			System.out.println("\nResult of cross product:");
			vResult = LinearAlgebra.crossProduct(v1, v2);
			System.out.println(Arrays.toString(v1) + " x " + Arrays.toString(v2) + " = " + Arrays.toString(vResult));
			break;
		default:
			System.out.println("invalid choice");
		}
	}
}