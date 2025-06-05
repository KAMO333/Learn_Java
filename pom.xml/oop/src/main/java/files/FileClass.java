package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileClass {
    public static void main(String[] args) {
        File file = new File("src/main/resources/File.txt");

//        if (file.exists()) {
//            System.out.println(file.getName() + " exists!");
//        } else {
//            System.out.println("The file does not exist");
//        }

        try {
            Scanner read = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
