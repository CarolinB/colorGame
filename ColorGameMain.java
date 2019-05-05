package colorGame;

import java.util.Scanner;

public class ColorGameMain {
	
	int RED = 0b00000000111111110000000000000000;
	int GREEN = 0b00000000000000001111111100000000;
	int BLUE = 0b00000000000000000000000011111111;
	Scanner userInput;
	int input = userInput.nextInt();
	
	int red = (RED & input) >> 16;
	int green = (GREEN & input) >> 8;
	int blue = BLUE & input;
	
	public static int createColor(int input) {
		
		int rgbValue = 0;
		
		if (0<=input && input<=2147483647) {
			// do something
			rgbValue = 3;
			return rgbValue;
		} else {
			System.out.println("Sorry, unvalid input.");
		}
		
		return rgbValue;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("Please type in a number between 0 and 2147483647");
		Scanner userInput = new Scanner(System.in);
		int input = userInput.nextInt();
		
		createColor(input);
		System.out.println("Your number is the rgb color value: " + rgbValue);

	}

}
