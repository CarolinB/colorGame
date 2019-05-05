package colorGame;

import java.util.Scanner;

public class ColorGameMain {
	
	final static int RED = 0b00000000111111110000000000000000;
	final static int GREEN = 0b00000000000000001111111100000000;
	final static int BLUE = 0b00000000000000000000000011111111;
	
	public static ColorValues createColor(int input) {
		
		int red = (RED & input) >> 16;
		int green = (GREEN & input) >> 8;
		int blue = BLUE & input;
		
		ColorValues result = new ColorValues(red, green, blue);
				
		return result;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("Please type in a whole number between 0 and 2147483647");
		Scanner userInput = new Scanner(System.in);
		
		try {
			int input = userInput.nextInt();
			ColorValues result = createColor(input);
			System.out.println("Your number is the rgb color value: " + result);
				
		} catch(Exception e) {
			System.out.println("Sorry, invalid input.");
		}
				

	}

}
