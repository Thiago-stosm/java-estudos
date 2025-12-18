package file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTeste01 {
    public static void main(String[] args){
        File file = new File("file.txt");
        try(FileWriter fw = new FileWriter(file, true);
            BufferedWriter bf = new BufferedWriter(fw)){
            bf.write("Escrevendo..."); // Quando colocamos append, ele substitui o conteúdo antigo.
            // Obs: se quiser adicionar novo conteúdo sem apagar o antigo, colocar um booleano true no construtor como nest exemplo
            bf.newLine(); // O buffered writer precisa de um new line para quebra de linha
            bf.flush(); // Limpar buffer
            // FWrite é uma classe bem baixo nível, então não
            // tem muitas possibilidades de manipulação de escrita
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
}
