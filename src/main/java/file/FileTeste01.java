package file;

import java.io.File;
import java.io.IOException;

import static java.lang.IO.print;
import static java.lang.IO.println;

public class FileTeste01 {
            void main(){
                File file = new File("file.txt");
                // Quando criamos um file, podemos colocar como um par o path e o nome do arquivo
                try {
                    boolean isCreated = file.createNewFile();
                    // O método de criação lança uma condição booleana
                    println("Created: " + isCreated); // Obs: se ele encontra um arquivo com esse nome ele cancela a operação
                    println("Path: "+ file.getPath());
                    println("Absolute Path " + file.getAbsolutePath());
                    println("Is directory: " + file.isDirectory()); // Saber se o arquivo é um diretório
                    println("Is file: " + file.isFile());
                    println("Is hidden: " + file.isHidden());
                    println("Last modified: " + file.lastModified()); // Mostra quando foi a ýltima alteração neste arquivo (retorna um long de milissegundos)

                    boolean exists = file.exists();
            //        if (exists){
            //            println(file.delete());
            //        }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

