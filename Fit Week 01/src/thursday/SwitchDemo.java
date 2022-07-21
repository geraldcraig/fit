package thursday;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		
		int item;
		String product;
		
		System.out.println("enter product number");
		
		Scanner sc = new Scanner(System.in);
		item = sc.nextInt();
		
		
		switch (item) {
		
		case 1: product = "iphone 5";
		break;
		case 2: product = "iphone 6";
		break;
		case 3: product = "iphone 7";
		break;
		case 4: product = "iphone 8";
		break;
		case 5: product = "samsung 7";
		break;
		case 6: product = "samsung 8";
		break;
		case 7: product = "nokia";
		break;
		case 8: product = "macbook";
		break;
		default: product = "motoG";
		break;
		
		}
		
		System.out.println(product);
		
		sc.close();

	}

}
