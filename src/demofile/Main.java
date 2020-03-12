package demofile;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            File file = new File(args[0]);
            if (!file.exists()) {
                System.out.println("File not found or does not exist");
            }

            // try catch here, if not go to the end of file
            if (file.createNewFile()) {
                System.out.println(file.getName() + " has been created");
            }
            System.out.println("file's name is " + file.getName());
            System.out.println("file's absolute path is " + file.getAbsolutePath());
            System.out.println("file's length is " + file.length());

        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Missing Command Line Argument");
            System.err.println("e is: " + e);

        } catch (IOException e) {
            System.err.println("File not created or already exists");
            System.err.println("e is: " + e);
        }

    }

}
