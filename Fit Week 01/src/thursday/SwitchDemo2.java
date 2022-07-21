package thursday;

public class SwitchDemo2 {

	public static void main(String[] args) {
		
		// switch demo
		int item = 8;
		String product;
		
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

	}

}
