import java.util.Scanner ;
class Roots{
	public static void main(String agrs[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("NISHTHA BHATT 24CSU352");

		System.out.println("enter the coefficient of a :");
		double a = scan.nextDouble();
		System.out.println("enter the coefficient of  b :");
		double b = scan.nextDouble();
		System.out.println("enter the coefficient of c :");
		double c = scan.nextDouble();

		double d = (b * b) - 4 * a * c ;

		if(d > 0){
			double root1 = ((-b) - Math.sqrt(d) ) / 2 * a ;
			double root2 = ((-b) + Math.sqrt(d) ) / 2 * a;

			System.out.println("Roots of the quadactic equation is :" + root1 + " " + root2);

		}

		else if(d == 0){
			double root = (-b) / 2 * a;
			System.out.println("Roots are equal i.e :" + root);
		}

		else{
			double realpart = (-b) / (2 * a);
			double i = Math.sqrt(-d) / (2 * a);
			System.out.println("Roots are imaginary");
			System.out.println("Real part : " + realpart + " " + "imaginary part : " + i + "i");


		}
		scan.close();

	}
}