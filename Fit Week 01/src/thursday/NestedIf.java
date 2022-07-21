package thursday;

public class NestedIf {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 15;
		
		// specified condition inside if statement
		if (a > 9) {
			
			// specified condition inside another if statement
			if (b >= 10) {
				
				// print this only if both conditions are true
				System.out.println("This is a nested if example");
			}
		}		

	}

}
