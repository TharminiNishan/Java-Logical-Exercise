package Exercise1;
/*Write a program to compute the standard deviation
    Steps: 
    A. Create the array with 10 numbers
    B. Calculate the average of the 10 numbers
  C. Find the difference between each element of the array and the average, then square the
difference. Thereafter, sum the squares of differences calculated and divide by the number of elements
(10) and then find the square root.*/

public class Question1 {

	public static void main(String[] args) {
		int sum =0,i ;
		double avg = 0;
	
		
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		for ( i=0; i<a.length ; i++) 
		{
			 sum=sum + a[i];
		}
		avg =sum/a.length;
		//double sqrtDifference = avg-i;
		
		
		System.out.println("Sum :");
		System.out.println(sum);
		System.out.println("Average:");
		System.out.println(avg);
	}

}
