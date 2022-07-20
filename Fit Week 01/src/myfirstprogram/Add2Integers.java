package myfirstprogram;

import java.util.Scanner;

public class Add2Integers {

	public static void main(String[] args) {
		System.out.println("This program adds two numbers.\n");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter num 1:");
		int n1 = sc.nextInt();
		System.out.println("Please enter num2:");
		int n2 = sc.nextInt();
		int total = n1 + n2;
		System.out.println("The total is: " + total + ".");
		sc.close();

	}

}
