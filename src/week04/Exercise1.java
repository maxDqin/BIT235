package week04;

public class Exercise1 {

	public static void main(String[] args) {
		/* Write a Java program that stores the names of 
		 * your 10 favourite songs in an array of strings. 
		 * Also store the artist's name in a second array of strings. 
		 * Output a list of the songs and artists.
		 */

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

		// list songs and artists
		for (int i = 0; i < favoriteSongs.length; i++) {
			System.out.println(favoriteSongs[i] + " by " + artists[i]);
		}

	}

}
