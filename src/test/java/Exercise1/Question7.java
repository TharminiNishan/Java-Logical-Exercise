package Exercise1;
/*7.Write a logic to Swap the first and last element of an array into a new array and print the new array*/
public class Question7 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
        System.out.println("Array before Swap :");
        for (int i=0;i<arr.length;i++) {
            System.out.println(i);
        }
        int STORE = arr[1];
        arr[1] = arr[2];
        arr[2] =  STORE;
        System.out.println( "Array after Swap ;");
        for (int element : arr) {
            System.out.println(element);

        }}

}
