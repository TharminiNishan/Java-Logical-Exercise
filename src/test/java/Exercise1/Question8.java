package Exercise1;
/*8.Write a logic to rotate an array in cyclic order. For example, if we have input numbers 2,3,7,6,4 into an
array. Your program should rotate this as 4,2,3,7,6*/

public class Question8 {

	public static void main(String[] args) {
        int [] arr = new int [] {1, 2, 3, 4, 5};   
        int numberOfTimesToBeRotated = 1;  
           
        System.out.println("Array before rotation: ");  
        for (int i = 0; i < arr.length; i++) {   
            System.out.print(arr[i] + " ");   
        }    
          
        for(int i = 0; i < numberOfTimesToBeRotated; i++){  
            int j, storingLast;  
     
            storingLast = arr[arr.length-1];  
          
            for(j = arr.length-1; j > 0; j--){   
                arr[j] = arr[j-1];  
            }  
            arr[0] = storingLast;  
        }  
      
        System.out.println();  
          
        
        System.out.println("Array after rotation: ");  
        for(int i = 0; i< arr.length; i++){  
            System.out.print(arr[i] + " ");  

	}
	}
}
