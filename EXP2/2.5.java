import java.util.Scanner ;
class Fibonacci{
	public static void main(String agrs[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("NISHTHA BHATT 24CSU352");

		System.out.println("enter number you want series upto");
		int n = scan.nextInt();
		int a = 0 , b = 1;

		for(int i = 0 ; i < n ; i++){
			System.out.println(a);
			int next = a + b;
			a = b ;
			b = next;


		}
		scan.close();

	}
}


