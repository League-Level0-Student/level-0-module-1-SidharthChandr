package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {
	String john="kind";
	String justin="funny";
	String jacob="smart";
	String name=JOptionPane.showInputDialog("Enter a Name:");
	if(name.equals("jacob")){
		JOptionPane.showMessageDialog(null, name+" is "+jacob);
	}
	if(name.equals("justin")) {
		JOptionPane.showMessageDialog(null, name+" is "+justin);
	}
	if(name.equals("john")) {
		JOptionPane.showMessageDialog(null, name+" is "+john);
	}

		// 1. Save something remarkable about each person in a variable.

		// 2. Ask the user to enter a name. Store their answer in a variable.

		// 3. In a pop-up, tell the user what is remarkable about that person. 

	}
}

