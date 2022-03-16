package week04;

public class Exercise7 {
	static final int MAX_SIZE = 10;

	private int boxSize;

	// default constructor
	public Exercise7() {
		this.setSize(1);
	}

	// constructor
	public Exercise7(int size) {

		this.setSize(size);
	}

	// sets the size of the box and tests to make sure size is ok
	public void setSize(int size) {

		if (size < 1) {
			boxSize = 1;
		} else {
			if (size > MAX_SIZE) {
				boxSize = MAX_SIZE;
			} else {
				boxSize = size;
			}
		}
	}

	public String toString() {
		String rs = "" + boxSize;
		return rs;
	}

	// outputs the box in the current size
	public void drawBox() {

		// Draw top
		System.out.print(" ");
		for (int j = 1; j <= boxSize; j++) {
			System.out.print("-");
		}
		System.out.println();

		// Draw Sides
		for (int j = 1; j <= boxSize; j++) {
			System.out.print("l");
			for (int i = 1; i <= boxSize; i++) {
				System.out.print(" ");
			}
			System.out.println("l");
		}

		// Draw bottom
		System.out.print(" ");
		for (int j = 1; j <= boxSize; j++) {
			System.out.print("-");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {

		Exercise7 theBox = new Exercise7(7); // create a box object

		theBox.drawBox();
		System.out.println("Box of size " + theBox);

		// draw a new box
		theBox.setSize(5);
		theBox.drawBox();
		System.out.println("Box of size " + theBox);
	}
}



