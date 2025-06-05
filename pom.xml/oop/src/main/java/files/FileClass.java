package files;

import java.io.File;

public class FileClass {
    public static void main(String[] args) {
        File file = new File("src/main/resources/File.txt");

        if (file.exists()) {
            System.out.println(file.getName() + " exists!");
        } else {
            System.out.println("The file does not exist");
        }
    }
}
