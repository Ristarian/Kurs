package tutorial.exceptions.handlingExceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class App3 {

    public static void main(String[] args) throws FileNotFoundException {
        openFile();
    }

    public static void openFile() throws FileNotFoundException {
        File file = new File("test.txt");

        FileReader fileReader = new FileReader(file);
    }
}

