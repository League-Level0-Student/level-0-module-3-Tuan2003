import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class obedientRobot {
static Robot Trump = new Robot();
public static void main(String[] args) {
String userInput = JOptionPane.showInputDialog("What shape would you like the robot to draw?");
Trump.miniaturize();
Trump.penDown();
Trump.setSpeed(1000);

if(userInput.equalsIgnoreCase("circle")) {
drawCircle();
}
if(userInput.equalsIgnoreCase("square")) {
drawSquare();	
}

if(userInput.equalsIgnoreCase("triangle")) {
drawTriangle();
}
}
static public void drawSquare(){
for (int i = 0; i < 4; i++) {
Trump.move(100);
Trump.turn(360/4);

}	
}	
static public void drawTriangle(){
for (int i = 0; i < 3; i++) {
Trump.move(100);	
Trump.turn(360/3);
}


}
static public void drawCircle(){

for (int i = 0; i < 360; i++) {
Trump.move(1);	
Trump.turn(360/360);
}
	

}



	

}



