import java.util.Scanner ;
class Primeno{
	public static void main(String agrs[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("NISHTHA BHATT 24CSU352");

		System.out.println("enter a number");
		int n = scan.nextInt();
		int isprime = -1 ;

		if(n <= 1){
			System.out.println("it is not a prime no");
		}

		for(int i = 2 ; i <= Math.sqrt(n) ; i++){
			if(n % i == 0){
				isprime = -1 ;

			}
			else{
				isprime = 1;
			}
		}

		if(isprime == -1){
			System.out.println(n + " "+"it is not a prime no");
		}
		else{
			System.out.println(n + " "+"it is a prime no");
		}

	}
}