package fridayguiprogram;

import javax.swing.JOptionPane;

public class Names {

	public static void main(String[] args) {
		
		String firstName;
		String surName;
		
		firstName = JOptionPane.showInputDialog("Enter Your First name");
		surName = JOptionPane.showInputDialog("Enter Your Surname");
		JOptionPane.showMessageDialog(null, firstName + "" + surName);
		
		System.exit(0);

	}

}
