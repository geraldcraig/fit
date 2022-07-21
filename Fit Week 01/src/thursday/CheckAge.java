package thursday;

import java.util.Scanner;

public class CheckAge {

	public static void main(String[] args) {
		
		int voter_age;
		System.out.println("Enter the age: ");
		
		// Taking input from the console
		
		Scanner sc = new Scanner(System.in);
		voter_age = sc.nextInt();
		
		// conditional check for age criteria
		if (voter_age >= 18) {
			System.out.println("Voter age is eligible to vote");
		} else {
			System.out.println("Voter is not eligible to vote");
		}
		
		sc.close();

	}
	
	
}
