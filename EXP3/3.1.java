import java.util.Scanner;
import java.util.Arrays;

class MaxMin{
	public static void main(String args[]){
		System.out.println("NISHTHA BHATT 24CSU352");
		Scanner scan = new Scanner(System.in);

		System.out.println("enter the no of elements in the array");
	    int n = scan.nextInt();



	    System.out.println("enter the elements of the array");

	    int arr[] = new int[n];

	    for(int i = 0 ; i < n ; i++){
	    	arr[i] = scan.nextInt();
	    }

	    int maxel = arr[0];
	    int minel = arr[0];

	    for(int i = 0 ; i < n ; i++){
	    	if(arr[i] > maxel){
	    		maxel= arr[i];
	    	}

	    	if(arr[i] < minel){
	    		minel = arr[i];
	    	}
	    }

	    System.out.println("the max element of the array is : " + maxel );
	    System.out.println("the min element of the array is : " + minel );

	}

}
