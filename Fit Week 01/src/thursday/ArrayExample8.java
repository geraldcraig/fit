package thursday;

import java.util.Arrays;

public class ArrayExample8 {

	public static void main(String[] args) {
		
		int[] num_Array = {5, 10, 15, 20, 25, 30};
		
		int clone_Array[] = num_Array.clone();
		
		System.out.println("Original num_Array:" + Arrays.toString(num_Array));
		
		System.out.println("Cloned num_Array:" + Arrays.toString(clone_Array));
		
		
	}

}
