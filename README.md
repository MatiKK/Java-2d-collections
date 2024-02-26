# Matrices-and-Linear-Algebra

This project is intended to serve linear algebra methods, focusing on operations with vectors and matrices. It offers an easy-to-use interface to perform various operations on vectors and matrices.

## Example Usage

```java
package algebra;

import java.util.*;

public class ExampleLinearAlgebra {

    public static void main(String[] args){

    	int[] v1 = {1, 2, 3};
    	int[] v2 = {1, 2, 3};
    	int[] vResult = LinearAlgebra.vectorAddition(v1, v2);
    	vResult = LinearAlgebra.vectorSubtraction(v1, v2);
    	vResult = LinearAlgebra.vectorScalarMultiplication(vResult, 12);
    	double dotProd = LinearAlgebra.vectorsDotProduct(v1, v2);
    	int[] orthogonal = LinearAlgebra.perpendicularVector(vResult);
    	int[] crossProd = LinearAlgebra.crossProduct(v1, v2);
    	boolean arePerpendicular = 
    		LinearAlgebra.vectorsArePerpendicular(vResult,crossProd);
    	
        AlgebraicMatrix m1, m2, mResult;

        //               Initial matrix capacity
        m1 = new AlgebraicMatrix(3, 3);
        m2 = AlgebraicMatrix.random(4, 4);
        ArrayList<Number> array = new ArrayList<>(Arrays.asList(1,2,3,4));

        m1.addRow(new Number[]{1, 2, 3});
        m1.addRow(new double[]{4, 6, 6});
        m1.addRow(v1);
        m1.addRow(1, v2);
        m1.addColumn(1, array);
        mResult = LinearAlgebra.matrixAddition(m1, m2);
        mResult = LinearAlgebra.matrixSubtraction(m1, m2);
        mResult = LinearAlgebra.matrixMultiplication(m1, m2);
        mResult = LinearAlgebra.matrixScalarMultiplication(mResult, Math.PI);
        double det = mResult.determinant();
        mResult = mResult.inverse();
    }
}
```

## Advise

It is not suggested to use this project for critical work if efficiency and optimization is what you need. This matrix implementation uses a two-dimensional array of Objects (Numbers), better and more optimized codes of your needings can be found. This project only has the intention to show the creator's passion for programming and math.
