package _04_int._1_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {
		int score= 0;
		String x= JOptionPane.showInputDialog("What is greater than God, more evil than the devil, the poor have it, the rich need it, and if you eat it, you'll die?");
		if(x.equals("Nothing")) {
			JOptionPane.showMessageDialog(null, "correct");
			score = score+1;
			JOptionPane.showMessageDialog(null, "score "+ score);
		}
		else {
			JOptionPane.showMessageDialog(null, "Incorrect");
			score=score-1;
			JOptionPane.showMessageDialog(null, "score "+ score);
		}
		String y= JOptionPane.showInputDialog("Who makes it, has no need of it.\r\n" + 
				" Who buys it, has no use for it. \r\n" + 
				"Who uses it can neither see nor feel it. \r\n" + 
				"What is it? ");
		if(y.equals("coffin")) {
			JOptionPane.showMessageDialog(null, "correct");
			score = score+1;
			JOptionPane.showMessageDialog(null, "score "+ score);
		}
		else {
			JOptionPane.showMessageDialog(null, "Incorrect");
			score=score-1;
			JOptionPane.showMessageDialog(null, "score "+ score);
		}

		// 1. Make a variable to hold the score

		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles

		// 4. If they got the answer right, pop up "correct!" and increase the score by one

		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		
	}
}

