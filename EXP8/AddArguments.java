public class AddArguments {
    public static void main(String[] args) {
        try {
            // Check if there are fewer than 5 arguments
            if (args.length < 5) {
                throw new CheckArgumentException("Error: Please enter exactly 5 integer arguments.");
            }

            int sum = 0;
            for (int i = 0; i < 5; i++) {
                sum += Integer.parseInt(args[i]);
            }

            System.out.println("Sum of all 5 numbers: " + sum);
        } 
        catch (CheckArgumentException e) {
            System.out.println(e.getMessage());
        } 
        catch (NumberFormatException e) {
            System.out.println("Error: All arguments must be integers.");
        }
    }
}
