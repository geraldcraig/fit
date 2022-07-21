package thursday;

import java.util.Arrays;

public class ArrayExample7 {

	public static void main(String[] args) {
		
		int[] intArray = {10, 15, 20, 25, 30, 35, 40};
		
		int array_len = intArray.length;
		
		System.out.println("Original Array:" + Arrays.toString(intArray));
		
		int[] copy_intArray = Arrays.copyOf(intArray, array_len);
		
		System.out.println("Copied Array:" + Arrays.toString(copy_intArray));

	}

}
