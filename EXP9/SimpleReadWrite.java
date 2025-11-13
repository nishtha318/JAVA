import java.io.*;

public class SimpleReadWrite {
    public static void main(String[] args) {
        try {
            // Writing into file
            FileWriter writer = new FileWriter("data.txt");
            writer.write("Hello, this is a sample text file.\n");
            writer.write("Java File Handling Example.");
            writer.close();
            System.out.println("Data written successfully.");

            // Reading from file
            FileReader reader = new FileReader("data.txt");
            int ch;
            System.out.println("File contents:");
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e);
        }
    }
}
