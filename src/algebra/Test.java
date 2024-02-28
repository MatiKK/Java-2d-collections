package algebra;
import collections2d.*;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		RegularMatrix<String> mat = new RegularMatrix<>(5,5);
		
		ArrayList<String> row = new ArrayList<>(Arrays.asList("asd1","asd2"));
		
		mat.addRow(row);
		mat.addRow(row);
		mat.addColumn(row);
		System.out.println(Arrays.deepToString(mat.rows));
		System.out.println("-------------");
		System.out.println(mat);
	}

	static void time(long t) {
		System.out.println(t + " nanoseconds, or " + (double)t/1000000000d + " seconds");
	}

}
