package thursday;

public class AddNums {

	public static void main(String[] args) {
		
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int sum = 0;
		
		for (int obj: arr) {
			sum = sum + obj;
		}
		
		System.out.println("The total of first 10 natural numbers is: " + sum);

	}

}
