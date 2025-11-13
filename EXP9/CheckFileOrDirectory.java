import java.io.File;

public class CheckFileOrDirectory {
    public static void main(String[] args) {
        File file = new File("StudentFileBuffered.java"); // change path as needed

        if (file.exists()) {
            if (file.isFile())
                System.out.println(file.getName() + " is a file.");
            else if (file.isDirectory())
                System.out.println(file.getName() + " is a directory.");
        } else {
            System.out.println("File/Directory does not exist.");
        }
    }
}
