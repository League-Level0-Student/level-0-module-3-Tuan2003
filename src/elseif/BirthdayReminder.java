
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "June 12th";
		String dadsBirthday = "June 21st";
		String myBirthday = "October 9th";

		// 2. Find out which birthday the user wants and and store their response in a variable
String response = JOptionPane.showInputDialog("Which birthday do you want to know? Mom's, Dad's or Me?");
		// 3. Print out what the user typed
System.out.println(response);
if(response.equalsIgnoreCase("mom")) {
JOptionPane.showMessageDialog(null, momsBirthday);	
}
if(response.equalsIgnoreCase("dad")){
JOptionPane.showMessageDialog(null, dadsBirthday);	
}
if(response.equalsIgnoreCase("Tuan")) {
JOptionPane.showMessageDialog(null, myBirthday);	
}else {
JOptionPane.showMessageDialog(null, "Sorry, I don't remember that person's birthday.");
}
		// 4. if user asked for "mom"
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}
