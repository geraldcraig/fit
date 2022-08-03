package wednesday;

import java.util.Arrays;

public class Compiler {

	public static void main(String[] args) {
		
		String word = "hello";
		String newWord = "hello world";
		
		char[] arr = new char[word.length()];
		
		for (int i = 0; i < word.length(); i++) {
			
			arr[i] = word.charAt(i);
		}
		
		char[] newArr = new char[newWord.length()];
		
		for (int i = 0; i < newWord.length(); i++) {
			
			arr[i] = word.charAt(i);
		}
		
		System.out.println(Arrays.toString(arr));
		
		
		mnuClose(arr, newArr);

	}

	private static void mnuClose(char[] arr, char[] newArr) {
		
		int newWordLength;
		
		
		/*if (wordLength != newWordLength  ) {
			System.out.println("Save file");

		} else {
			System.out.println("no changes");
		}*/
			
	}

}
