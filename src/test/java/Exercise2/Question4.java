package Exercise2;
/*A) Write a program to input a paragraph as string and to find alphabet count in the given paragraph
for the alphabet A to Z.
B) Print the positions of each alphabet.
        E.g.: A=&gt; 7,15,27,55,92
                B=&gt; 9,23,45,77
                C=&gt; Not in paragraph*/

public class Question4 {

	public static void main(String[] args) {
		String str = "ki dkfdkfs jdgnfk jhjhkj";
	      int count = 0;
	     // System.out.println("String: "+str);
	      for (int i = 0; i < str.length(); i++) {
	         if (Character.isLetter(str.charAt(i)))
	         count++;
	      }
	      System.out.println("Letters: "+count);

	}

}
