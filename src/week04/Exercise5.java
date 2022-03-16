package week04;

public class Exercise5 {
	public static void main(String[] args) {
		String[] paragraphs = new String[10];
		String phrase;
		int result;
		boolean isFound;

		// initialize
		phrase = "keyword search";

		paragraphs[0] = "Lose all the weight you want.";
		paragraphs[1] = "I can't I must work";
		paragraphs[2] = "That would be like a keyword search.";
		paragraphs[3] = "This would be Victoria.";
		paragraphs[4] = "Join the party.";
		paragraphs[5] = "To be or not to be.";
		paragraphs[6] = "That is a question to test keyword search.";
		paragraphs[7] = "Can you find a needle in a hay stack?";
		paragraphs[8] = "This could be the last paragraph, but its not.";
		paragraphs[9] = "Ada Lovelace is the worlds first programmer as of 1860.";

		// Search
		isFound = false;
		for (int i = 0; i < paragraphs.length; i++) {
			result = paragraphs[i].indexOf(phrase);
			if (result > 0) {
				isFound = true;
				System.out.println("Found phrase '" + phrase + "' at index " + i);
				System.out.println("Paragraph it was found in:");
				System.out.println(paragraphs[i]);
				System.out.println("================================================");
				System.out.println();
			}
		}

		if (!isFound) {
			System.out.println("Search for '" + phrase + "' was not successful");
		}
	}
}
