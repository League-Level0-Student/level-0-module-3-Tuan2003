//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package extra;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class DizzyRobot {
	static Robot trump = new Robot();
	public static void main(String[] args) {
int numSpins =1;
		boolean spin = false;

// 2. Ask the user how dizzy you want the robot from 1-10, then spin that number of times.
while(!spin) {

String input = JOptionPane.showInputDialog("How dizzy do you want the robot from 1-10?");	
numSpins = Integer.parseInt(input);
if(numSpins > 10) {
spin = true;
dance(numSpins);
}
}



// 1. Use the dance method to make the robot spin.
	

	}

	static void dance(int numberOfSpins) {
		for (int i = 0; i < numberOfSpins; i++) {
			trump.turn(360);
		}
	}
}

