package extra;

import javax.swing.JOptionPane;

public class Bottles99 {

	public static void main(String[] args) {
	int bottles = 99;
	
		for (int i = bottles; i >= 0; i++) {
			System.out.println(i + " bottles of beer on the wall," + i + " bottles of beer. Take one down and pass it around," + i--  + "bottles of beer on the wall.");
			i-- ;
			if(i== 0) {
		System.out.println("No more bottles of beer on the wall, no more bottles of beer. Go to the store and buy some more, 99 bottles of beer on the wall.");	
		}
		}
		}
		

	}


