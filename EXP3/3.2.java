import java.util.Scanner ;
import java.util.Arrays;

class Search{
	public static void main(String agrs[]){
		System.out.println("NISHTHA BHATT 24CSU352");
		

	    Scanner scan = new Scanner(System.in);

	    System.out.println("enter the no of elements in the array");
	    int n = scan.nextInt();



	    System.out.println("enter the elements of the array");

	    int arr[] = new int[n];

	    for(int i = 0 ; i < n ; i++){
	    	arr[i] = scan.nextInt();
	    }



	   
	    System.out.println("enter the element you want to search : ");
	    int target = scan.nextInt();
	    int ans = -1;

	   for(int i = 0 ; i < n ; i++){
	   	if(arr[i] == target){
	   		ans = i ;
	   		break;
	   	}

	   }

	   System.out.println("the element appears at the index : " + (ans + 1));
	    scan.close();



	}
}