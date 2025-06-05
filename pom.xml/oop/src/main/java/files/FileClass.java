package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class FileClass {
    public static void main(String[] args) {

        InputStream file = FileClass.class.getClassLoader().getResourceAsStream("File.txt");
        Scanner read = new Scanner(file);
        while(read.hasNext()) {
            System.out.println(read.next());
        }
        read.close();
    }
}
