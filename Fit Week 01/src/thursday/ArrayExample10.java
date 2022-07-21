package thursday;

import java.util.Arrays;
import java.util.Collections;

public class ArrayExample10 {

	public static void main(String[] args) {
		
		Integer [] even_Arrayr = {2, 4, 6, 8, 10};
		
		System.out.println("Original Array: " + Arrays.toString(even_Arrayr));
		
		Collections.reverse(Arrays.asList(even_Arrayr));
		
		System.out.println("Reversed Array:" + Arrays.asList(even_Arrayr));
		
	}

}
