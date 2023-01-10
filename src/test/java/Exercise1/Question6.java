package Exercise1;
/*Write a program to sorting an Integer array element in ascending order*/

public class Question6 {

	public static void main(String[] args) {
		      
        int [] arr = new int [] {5, 4, 8, 9, 1};     
        int temp = 0;    
              
        for (int i = 0; i < arr.length; i++) {     
            for (int j = i+1; j < arr.length; j++) {     
               if(arr[i] > arr[j]) {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }    
          
        System.out.println();    
             
        System.out.println("Numbers in ascending order: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + ", ");    

	}
	}
}
