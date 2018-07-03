//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		Random rand = new Random();
		int num2 = rand.nextInt(100)+1;
		System.out.println(num2);

		
for (int i = 0; i < 10; i++) {
String answer = JOptionPane.showInputDialog("Guess a number from 1-100");			
int ans2 = (Integer.parseInt(answer));
if(ans2 == num2) {
JOptionPane.showMessageDialog(null,"Win");
System.exit(0);
}
if (ans2 > num2) {
JOptionPane.showMessageDialog(null, "Too High");	
}
if (ans2 < num2) {
JOptionPane.showMessageDialog(null, "Too Low");
}
}
}

	


// 1. Ask the user for a guess using a pop-up window, and save their response 
// 2. Print out the random variable above
// 4. Convert the users’ answer to an int (Integer.parseInt(string))
// 5. if the guess is correct
// 6. Win
// 7. if the guess is high
// 8. Tell them it's too high
// 9. if the guess is low
// 10. Tell them it's too low
// 11. Repeat steps 1 to 10 ten times
// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
// 13. Tell them they lose
		
	}




