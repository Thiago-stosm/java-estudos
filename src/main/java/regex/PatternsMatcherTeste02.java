package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternsMatcherTeste02 {
    public static void main (String[] args){

        String regex = "\\d";
        // \\d acha todos os números inteiros
        // \\D acha todos os caracteres que NÃO são números inteiros
        // \s = espaços em branco
        // \S = todos os caracteres excluindo os espaços em branco
        // \w = a-ZA-Z, dígitos, _, tirando os caracteres especiais


        String texto = "abaaba";
        String texto2 = "thiago123thiago";
        Pattern pattern = Pattern.compile(regex);
        pattern.matcher(texto2);
        Matcher matcher = pattern.matcher(texto2);

        System.out.println("texto: " + texto2);
        System.out.println("índice: 0123456789");
        System.out.println("regex: "+ regex);
        System.out.println("POSIÇÕES ENCONTRADAS: ");

            while(matcher.find()){
                System.out.println(matcher.start() + " : " + matcher.group());
            }

    }
}
