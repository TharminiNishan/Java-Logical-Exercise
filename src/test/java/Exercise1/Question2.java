package Exercise1;
/*2.Check whether a String is Palindrome. i.e. when the word is reversed, it gives the same word. E.g.
“Madam” is a Palindrome*/

public class Question2 {

	public static void main(String[] args) {

	    String WORD = "MADAM", REVERSEWORD = "";
	    
	    int strLength = WORD.length();

	    for (int i = (strLength - 1); i >=0; --i) {
	    
	    	REVERSEWORD = REVERSEWORD + WORD.charAt(i);
	    }

	    if (WORD.toLowerCase().equals(REVERSEWORD.toLowerCase())) {
	      System.out.println(WORD + " is a Palindrome.");
	    }
	    else {
	      System.out.println(WORD + " is not a Palindrome.");

	}
	}
}
