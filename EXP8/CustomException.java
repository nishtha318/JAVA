
class MyCustomException extends Exception {
    private String message;  // To store the custom message

    // Constructor that takes a String argument
    public MyCustomException(String message) {
        this.message = message;
    }

    // Method to print the stored String
    public void printMessage() {
        System.out.println("Custom Exception Message: " + message);
    }
}

public class CustomExceptionDemo {
    public static void main(String[] args) {
        try {
            // Step 2: Throw your custom exception
            throw new MyCustomException("Something went wrong in the program!");
        } 
        catch (MyCustomException e) {
            // Step 3: Catch and handle the exception
            e.printMessage();
        }
    }
}
