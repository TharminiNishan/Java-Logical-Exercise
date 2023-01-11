package Exercise1;
/*.Given an Integer array “A”, Write a program to sum the elements of A*/

public class Question3 {

	public static void main(String[] args) {
		int sum=0;
		int i;
		int a[]= {5,6,7,8,9};
		for ( i=0; i<a.length;i++) {
			
			sum=sum+a[i];
		}
	
        System.out.println(sum);
	}

}
