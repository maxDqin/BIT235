package week04;

public class Exercise2 {

	public static void main(String[] args) {
		/*
		 * Modify the Exercise 1 question above to output the songs in alphabetical
		 * order.
		 */
		boolean interchanged, sorted;
		String tempstr;

		String[] favoriteSongs = new String[10];
		String[] artists = new String[10];

		// store my songs
		favoriteSongs[0] = "Twist and Shout";
		artists[0] = "The Beatles";

		favoriteSongs[1] = "Please Mister Postman";
		artists[1] = "The Beatles";

		favoriteSongs[2] = "Ticket to Ride";
		artists[2] = "The Beatles";

		favoriteSongs[3] = "Norwegian Wood";
		artists[3] = "The Beatles";

		favoriteSongs[4] = "Lucy in The Sky with Diamonds";
		artists[4] = "The Beatles";

		favoriteSongs[5] = "Communication Breakdown";
		artists[5] = "Led Zeppelin";

		favoriteSongs[6] = "Ramble On";
		artists[6] = "Led Zeppelin";

		favoriteSongs[7] = "Stairway to Heaven";
		artists[7] = "Led Zeppelin";

		favoriteSongs[8] = "Boogie with Stu";
		artists[8] = "Led Zeppelin";

		favoriteSongs[9] = "You should be Dancing";
		artists[9] = "The Bee Gees";

		// the bubble sort

		for(int k = 0; k < favoriteSongs.length; k++) {
			for (int i = k+1; i < favoriteSongs.length; i++) {
				if (favoriteSongs[k].compareTo(favoriteSongs[i]) > 0) {
					// swap these two songs
					tempstr = favoriteSongs[k];
					favoriteSongs[k] = favoriteSongs[i];
					favoriteSongs[i] = tempstr;
					// dont forget to swap the artists too
					tempstr = artists[k];
					artists[k] = artists[i];
					artists[i] = tempstr;
					interchanged = true;
				}
			}
		}

		// list songs and artists
		for (int i = 0; i < favoriteSongs.length; i++) {
			System.out.println(favoriteSongs[i] + " by " + artists[i]);
		}

	}

}
