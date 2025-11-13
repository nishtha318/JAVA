import java.io.File;

public class ChangeFilePermissions {
    public static void main(String[] args) {
        File file = new File("SimpleReadWrite.java");

        if (file.exists()) {
            // Remove write permission
            file.setWritable(false);
            // Give read and execute permissions
            file.setReadable(true);
            file.setExecutable(true);

            System.out.println("Permissions changed successfully.");
            System.out.println("Readable: " + file.canRead());
            System.out.println("Writable: " + file.canWrite());
            System.out.println("Executable: " + file.canExecute());
        } else {
            System.out.println("File does not exist.");
        }
    }
}
