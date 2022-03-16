package week04;

public class Exercise4 {
	public static void main(String[] args) {

        String decodedCharSet, codedCharSet, theCodedString, theDecodedString;
        char[] theCodedMsgArray, theDecodedMsgArray;

        // the table for decoding the message stored in two strings
        codedCharSet   = "a b c d e f g h i j k l m n o p q r s t u v w x y z";
        decodedCharSet = "c r g z a v i b s d o e q f h u j x k l w m y n p t";

        theCodedString = "G tgsl Qefe";           // the coded message

        // convert the coded message to an array
        theCodedMsgArray = theCodedString.toCharArray();

        // define the decoded msg array's size
        theDecodedMsgArray = new char[theCodedMsgArray.length];

        // decode each character and place result the decoded msg array
        for(int j=0; j < theCodedMsgArray.length; j++) {
            int placeHolder;

            char ch = Character.toLowerCase(theCodedMsgArray[j]);

            placeHolder = codedCharSet.indexOf(ch);
            theDecodedMsgArray[j] = decodedCharSet.charAt(placeHolder);
        }

        // convert the char array to a string
        theDecodedString = new String(theDecodedMsgArray);

        // output the results
        System.out.println(theCodedString);
        System.out.println("Decodes to:");
        System.out.println(theDecodedString);

    }
}
