                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 //    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;
import java.util.Random;

public class RobotColorChooser {

	public static void main(String[] args) {
Robot Trump = new Robot();		
Trump.setSpeed(1000);
Trump.miniaturize();
Trump.penDown();
for (int i = 0; i < 4; i++) {
String response = JOptionPane.showInputDialog("What color would you like the robot to draw with?");


if (response.equalsIgnoreCase("blue")) {
	Trump.setPenColor(Color.blue);
}
if (response.equalsIgnoreCase("yellow")) {
	Trump.setPenColor(Color.yellow);	
}
if (response.equalsIgnoreCase("black")) {
	Trump.setPenColor(Color.black);	
}
if (response.equalsIgnoreCase("orange")) {
	Trump.setPenColor(Color.orange);	
}
if (response.equalsIgnoreCase("green")) {
	Trump.setPenColor(Color.green);	
}
if (response.equalsIgnoreCase("magenta")) {
	Trump.setPenColor(Color.magenta);	
}
if (response.equalsIgnoreCase("gray")) {
	Trump.setPenColor(Color.gray);	
}
if (response.equalsIgnoreCase("cyan")) {
	Trump.setPenColor(Color.cyan);	
}
if (response.equalsIgnoreCase("pink")) {
	Trump.setPenColor(Color.pink);

}
Trump.move(100);
Trump.turn(90);	
//1. Create a new Robot		
//3. Ask the user what color they would like the robot to draw		
//5. Use an if/else statement to set the pen color that the user requested
//6. If the user doesn’t enter anything, choose a random color
//7. Put a loop around your code so that you keep asking the user for more colors & drawing them		
//4. Set the pen width to 10		
//2. Make the robot draw a shape (this will take more than one line of code)


	}
}
	}

