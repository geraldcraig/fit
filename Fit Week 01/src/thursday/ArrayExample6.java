package thursday;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayExample6 {

	public static void main(String[] args) {
		
		int[] tensArray = {10, 20, 30, 40, 50};
		
		System.out.println("Input Array : " + Arrays.toString(tensArray));
		
		int index = 1;
		
		System.out.println("Index to be removed : " + index);
		
		if (tensArray == null || index < 0 || index >= tensArray.length); {
		
		System.out.println("No element to delete");
		
		}
		
		List<Integer>tensList = IntStream.of(tensArray).boxed().collect(Collectors.toList());
		
		tensList.remove(index);
		
		tensArray = tensList.stream().mapToInt(Integer::intValue).toArray();
		
		System.out.println("Array after deleting element at index " + index + 
				":\n" + Arrays.toString(tensArray));
	}

}
