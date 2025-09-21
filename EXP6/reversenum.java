import java.util.Scanner;

class Reversenum{
	public static void main(String args[]){
	int n;
	int rev = 0 ;
	int sum = 0;

	System.out.println("NISHTHA BHATT 24CSU352");
	System.out.println("enter a number ");
	Scanner scan = new Scanner(System.in);
	n = scan.nextInt();

	while(n != 0){
		int rem ;
		rem = n % 10;
		sum += rem;
		rev = rev * 10 + rem;
		n = n / 10 ;

	}
	System.out.println("reverse of the number is: " + rev + "and sum of the number is  " + sum);



	}
}