package thursday;

public class ArrayExample17 {

	public static void main(String[] args) {
		
		int jagged_array[][]= new int[2][];
		
		jagged_array[0] = new int[4];
		
		jagged_array[1] = new int[2];
		
		for (int i = 0; i < jagged_array.length; i++)
			
			for (int j = 0; j < jagged_array[i].length; j++)
				
				jagged_array[i][j] = j + 1;
		
		System.out.println("Two-dimensional Jagged Array:");
		
		for (int i = 0; i < jagged_array.length; i++) {
			
			System.out.println("jagged_array[" + i + "]  ");
			
			for (int j = 0; j < jagged_array[i].length; j++)
				
				System.out.print(jagged_array[i][j] + " ");
			
			System.out.println();
		}
		
		
		
	}
	
}