package Exercise1;
/*7.Write a logic to Swap the first and last element of an array into a new array and print the new array*/
public class Question7 {

	public static void main(String[] args) {
		String[] arr = {"First", "Second", "Third", "Fourth"};
        System.out.println("Array before Swap" + "\n");
        for (String element : arr) {
            System.out.println(element);
        }
        //Simple Swapping logic
        String temp = arr[1];
        arr[1] = arr[2];
        arr[2] = temp;
        System.out.println("\n" + "Array after Swap" + "\n");
        for (String element : arr) {
            System.out.println(element);

        }}

}
