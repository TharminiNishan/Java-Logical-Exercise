package Exercise1;
/*4.Write a logic to input characters one by one into a single dimensional array and thereafter reversely
print the contents in the array.*/

public class Question4 {

	public static void main(String[] args) {
		int arr[] = new int [] {1, 2, 3, 4, 5}; 
       
		System.out.println("Number in reverse: ");  
       
        for (int y = arr.length-1; y >= 0; y--) {  
            System.out.print( arr[y] + ", ");  
		// TODO Auto-generated method stub
        
	}

}}
