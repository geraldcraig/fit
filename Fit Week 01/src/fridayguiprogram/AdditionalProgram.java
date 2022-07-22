package fridayguiprogram;

import javax.swing.JOptionPane;


public class AdditionalProgram {

	public static void main(String[] args) {
		
		String userInput;
		int number1;
		int number2;
		int total;
		
		JOptionPane.showMessageDialog(null, "This program will add two numbers");
		userInput = JOptionPane.showInputDialog("Enter your First Number");
		
		number1 = Integer.parseInt(userInput);
		userInput = JOptionPane.showInputDialog("Enter second number");
		number2 = Integer.parseInt(userInput);
		total = number1 + number2;
		
		JOptionPane.showMessageDialog(null, "Your total is :" + total);
		JOptionPane.showMessageDialog(null, "Program Over, Goodbye");

	}

}
