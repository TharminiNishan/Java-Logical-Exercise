package Exercise2;

import java.util.Scanner;

/*Write a logic to list down unique values and times of occurrence in a given array.
E.g.:
Stored list: (9,8,7,3,15,7,9,4,9,2,8,3,8,8)
Expected output: 9 – 3, 8-4, 7-2, 3-2,15-1,4-1,2-1*/
public class Question1 {

	public static void main(String[] args) {
        int [] arr = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1};  
         
        int [] frequency = new int [arr.length];  
        int visited = -1;  
        for(int i = 0; i < arr.length; i++){  
            int count = 1;  
            for(int j = i+1; j < arr.length; j++){  
                if(arr[i] == arr[j]){  
                    count++;   
                    frequency[j] = visited;  
                }  
            }  
            if(frequency[i] != visited)  
                frequency[i] = count;  
        }  
   
         
        System.out.println(" Element - Frequency");  
        for(int i = 0; i < frequency.length; i++){  
            if(frequency[i] != visited)  
                System.out.print("    " + arr[i] + "-" + frequency[i]); 
	       
		    
	    

	}

}
}