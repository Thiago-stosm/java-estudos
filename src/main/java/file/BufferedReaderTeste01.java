package file;

import java.io.*;

import static java.lang.IO.println;

public class BufferedReaderTeste01 {
    public static void main(String[] args) throws IOException {
        File file = new File("file.txt");

        try (FileReader fr = new FileReader(file);
             BufferedReader bf = new BufferedReader(fr)) {
            String linha;
            while((linha = bf.readLine())!=null){
                println(linha);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
