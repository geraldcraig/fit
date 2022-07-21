package thursday;

public class ArrayExample14 {

	public static void main(String[] args) {
		
		Test testobj[] = new Test[2];
		
		testobj[0] = new Test();
		
		testobj[1] = new Test();
		
		testobj[0].setData(1, 3);
		
		testobj[1].setData(2, 4);
		
		System.out.println("For Array Element 0 (testobj[0]:");
			
		testobj[0].displayData();
		
		System.out.println("For Array Element 1 (testobj[1]):");
		
		testobj[1].displayData();
			
	}

}

class Test {
	
	int val1;
	
	int val2;
	
	public void setData(int c, int d) {
		
		val1 = c;
		
		val2 = d;
	}
	
	public void displayData() {
		System.out.println("val1 =" + val1 + "; val2 =" + val2 + "\n");
	}
	
}
