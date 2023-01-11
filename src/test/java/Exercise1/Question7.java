package Exercise1;
/*7.Write a logic to Swap the first and last element of an array into a new array and print the new array*/
public class Question7 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
        System.out.println("Array before Swap :");
        for (int i=0; i<arr.length ; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("Array after Swap :");
        for (int i=arr.length-1; i>=0; i--) {
        	System.out.println(arr[i]);
        }

        }}


