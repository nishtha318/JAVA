public class ThrowExceptionExample {
    public static void main(String[] args) {
        try {
            // Throwing an Exception with a message
            throw new Exception("This is a custom exception message.");
        } 
        catch (Exception e) {
            // Catching and printing the exception message
            System.out.println("Caught Exception: " + e.getMessage());
        } 
        finally {
            // This block always runs
            System.out.println("Finally block executed — program ended properly.");
        }
    }
}
