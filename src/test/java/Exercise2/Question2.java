package Exercise2;
/*Assume that you are given a word, write a logic to count the number of vowels and consonants in the
given word
E.g.: - given word: ALPHABET No of Vowels: 3 &amp; consonants: 5*/

public class Question2 {

	public static void main(String[] args) {
		    
        int vCount = 0, cCount = 0;    
               
        String str = "Mini with Java";    
        str = str.toLowerCase();    
            
        for(int i = 0; i < str.length(); i++) {    
   
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {       
                vCount++;    
            }    
               
            else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {     
                cCount++;    
            }    
        }    
        System.out.println("Number of vowels: " + vCount);    
        System.out.println("Number of consonants: " + cCount);    

	}

}
