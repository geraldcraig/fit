package thursday;

import java.util.Arrays;

public class ArrayExample16 {

	public static void main(String[] args) {
		
		final int length = 5;
		
		Generic_Array<Integer>intArray = new Generic_Array(length);
		
		for (int i = 0; i < length; i++)
			
			intArray.set(i, i * 2);
		
		System.out.println("Integer Array elements:" + intArray);
		
		Generic_Array<String>strArray = new Generic_Array(length);
		
		for (int i = 0; i < length; i++)
			
			strArray.set(i, String.valueOf((char)(i + 97)));
			
			System.out.println("String Array Elements: " + strArray);
		
	}
	
	class Generic_Array<E> {
		
		private final Object[] gen_Array;
		
		public final int length;
		
		public Generic_Array(int length) {
			
			gen_Array = new Object[length];
			
			this.length = length;
			
		}
		
		Eget(int i) {
			
			final E e = (E)gen_Array[i];
			
			return e;
					
					
		}
		
		void set(int i, E e) {
			
			gen_Array[i] = e;
			
		}
		
		@Override
		
		public String toString() {
			
			return Arrays.toString(gen_Array);
		}
	}
	
	
}