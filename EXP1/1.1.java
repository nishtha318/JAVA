import java.util.Scanner;

class BasicMathOperations{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          System.out.print("NISHTHA BHATT, 24CSU352");


        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();


        double addition = num1 + num2;
        double subtraction = num1 - num2;
        double multiplication = num1 * num2;
        double division = num1 / num2 ;
        
        System.out.println("\nBasic Math Operation");
        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
    
        sc.close();
    }

}
