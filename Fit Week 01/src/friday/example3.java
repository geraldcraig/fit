package friday;

import java.util.Scanner;

public class example3 {

	public static void main(String[] args) {
		
		int count, number;
		boolean boo = true;
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		for (int i = 2; i <= number / 2; i++) {
			count = number % i;
			if (count == 0) {
				boo = false;
				break;
			}
		}
		if (boo) 
			System.out.println(number + " is a prime number");
		
		else
			System.out.println(number + " is not a prime number");
			
		sc.close();
	}
	
	

}
