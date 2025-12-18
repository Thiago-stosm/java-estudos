package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import static java.lang.IO.println;

public class FileReaderTeste01 {
    public static void main(String[] args) throws IOException {
        File file = new File("file.txt");
        FileReader fr;
        try {
            fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        int i;
        while ((i = fr.read()) != -1) {
            println((char)i);
        }
    }
}
