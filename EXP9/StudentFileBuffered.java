import java.io.*;

public class StudentFileBuffered {
    public static void main(String[] args) {
        String fileName = "students.txt";

        try {
            // Writing data
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
            bw.write("1, Nishtha, 8.9, A\n");
            bw.write("2, Lakshay, 8.5, B\n");
            bw.write("3, Riya, 9.1, A\n");
            bw.close();
            System.out.println("Student data written successfully.");

            // Reading data
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;
            System.out.println("\nStudent Records:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
