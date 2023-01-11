package Exercise1;
/*5.Write a program to check if two given Strings are anagram of each other or not E.g, “Funeral” and
“Real Fun” are anagram.*/

import java.util.Arrays;

public class Question5 {

	public static void main(String[] args) {
		 String str1= "race";
		 String str2= "care";
	        
	
	        char[] array1 = str1.toCharArray();
	        char[] array2 = str2.toCharArray();
	 
	        Arrays.sort(array1);
	        Arrays.sort(array2);
	 
	        if (String.valueOf(array1).equals(String.valueOf(array2))) {
	            System.out.println("Anagram String");
	        } else {
	            System.out.println("Not Anagram String");

	}

}}
