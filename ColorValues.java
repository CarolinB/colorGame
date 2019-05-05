package colorGame;

public class ColorValues {
	int r;
	int g;
	int b;
	
	public ColorValues(int r, int g, int b) {
		this.r = r;
		this.g = g;
		this.b = b;
	}
	
	@Override
	public String toString() {
		return ("r = " + r + ", g = " + g + ", b = " + b + ".");
	}
	
}
