package thursday;

import java.util.Scanner;

public class CompareInts {

	public static void main(String[] args) {
		
		int a, b;
		System.out.println("Enter number a:\n");
		
		// Taking input from the console
		
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		
		System.out.println("Enter number b:\n");
		b = sc.nextInt();
		
		// conditional check if numbers match 
		
		if (a == b) {
			System.out.println("\na is equal to b");
		} else if (b == a) {
			System.out.println("\nb is equal to a");	
		} else {
			System.out.println("\na is not equal to b");
		}
		
		sc.close();
	}
	
}
