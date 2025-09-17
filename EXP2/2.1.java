import java.util.Scanner;

class PatternPrinting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("NISHTHA BHATT , 24CSU352");

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        System.out.println("\n--- Left Triangle ---");
        leftTriangle(n);

        System.out.println("\n--- Right Triangle ---");
        rightTriangle(n);

        System.out.println("\n--- Pyramid ---");
        pyramid(n);

        System.out.println("\n--- Diamond ---");
        diamond(n);

        sc.close();
    }

    // Left Triangle
    static void leftTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Right Triangle
    static void rightTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("  "); 
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Pyramid
    static void pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Diamond
    static void diamond(int n) {
        // Upper half
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Lower half
        for (int i = n - 1; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
