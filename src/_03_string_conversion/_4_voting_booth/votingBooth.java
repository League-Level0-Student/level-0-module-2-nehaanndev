package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class votingBooth {

	public static void main (String[] args) {
		
		int age =Integer.parseInt(JOptionPane.showInputDialog("What is your age?"));
		if(age > 17) {
			JOptionPane.showMessageDialog(null, "Who should be president, in your opinion?");
		}
		else {
			JOptionPane.showMessageDialog(null, "No body cares about what you think.");
		}
	}
}
