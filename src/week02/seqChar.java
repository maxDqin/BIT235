package week02;

class seqChar {

/* medium-challenging programming problem for lesson2 - 2.4 - Control structures*/
/*
  This program generates a sequence of random charcters that are
  uppercase and not vowels.


*/
    public static final int MAX_CHARS = 75;
    public static final int CAPITALS_UNICODE_START = 65;
    public static final int NUM_LETTERS = 26;

    public static void main(String[] args) {
        int randomNumber, randomSequence, count;
        char c;

        // first determine how many characters:
        randomSequence = (int) (1 + Math.random()*MAX_CHARS);

        count = 0;     // initialize loop counter

        while (count < randomSequence) {
            // now get a random number between 65 and 90 then cast to
            // a char

            randomNumber = (int) (CAPITALS_UNICODE_START + Math.random()*NUM_LETTERS);

            c = (char) randomNumber; // this gives a letter between A to Z

            if ((c == 'A') || (c == 'E') ||(c == 'I') ||(c == 'O') ||(c == 'U')) {
                // this character is a vowel so do nothing
            } else {
                // not a vowel so print it out
                System.out.print(c);
                ++count;
            }
        }
        System.out.println();       // advance the CRLF
    }
}
