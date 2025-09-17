import java.util.Scanner;
class Conversion{
	public static void main(String args[]){
		System.out.println("NISHTHA BHATT  24CSU352");
		double farenhite;

		System.out.println("enter farenhite");
		Scanner scan = new Scanner(System.in);

		farenhite = scan.nextDouble();

		double celsius = (5.0 / 9) * (farenhite - 32);
		System.out.println("the value in celsius is : " + celsius ); 
	}
}