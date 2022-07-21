package thursday;

public class ArrayExample15 {
	
	static int[] add_sub(int val1, int val2) {
		
		int[] result = new int[2];
		
		result[0] = val1 + val2;
		
		result[1] = val1 - val2;
		
		return result;
	}

	public static void main(String[] args) {
		
		int[] result = add_sub(10, 5);
		
		System.out.println("val1 + val2 = " + result[0]);
		
		System.out.println("val1 - val2 = " + result[1]);
		
	}
	
}