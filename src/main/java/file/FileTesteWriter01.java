package file;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileTesteWriter01 {
    public static void main(String[] args){
        File file = new File("file.txt");
        try(FileWriter fw = new FileWriter(file, true)){
            fw.write("Escrevendo...\n"); // Quando colocamos append, ele substitui o conteúdo antigo.
            // Obs: se quiser adicionar novo conteúdo sem apagar o antigo, colocar um booleano true no construtor como nest exemplo
            fw.flush(); // Limpar buffer
            // FWrite é uma classe bem baixo nível, então não
            // tem muitas possibilidades de manipulação de escrita
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
}
