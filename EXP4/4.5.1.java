import java.util.Scanner;

 class MainApp {
    public static void main(String[] args) {
        System.out.println("NISHTHA BHATT , 24CSU352");
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();

        // Input for second point
        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();

        // Create Point objects using parameterized constructor
        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);

        // Display the points
        System.out.println("\nPoints are:");
        p1.display();
        p2.display();

        // Calculate distance using static method
        double dist = Point.distance(p1, p2);

        // Display distance
        System.out.printf("\nDistance between points: %.2f\n", dist);

        sc.close();
    }
}
