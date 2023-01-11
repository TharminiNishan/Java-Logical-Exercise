package Exercise2;
/*Insert integer numbers into an array, then copy the array elements into another array*/

public class Question3 {

	public static void main(String[] args) {
		  //Initialize array     
        int [] arr1 = new int [] {1, 2, 3, 4, 5};     
        int arr2[] = new int[arr1.length];       
        for (int i = 0; i < arr1.length; i++) {     
            arr2[i] = arr1[i];     
        }        
//        System.out.println("Array1: ");    
//        for (int i = 0; i < arr1.length; i++) {   
//           System.out.print(arr1[i] + " ");    
//        }     
            
        //System.out.println();    
               
        System.out.println("Array2: ");    
        for (int i = 0; i < arr2.length; i++) {     
           System.out.print(arr2[i] + " ");    

	}

}}
