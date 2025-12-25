package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternsMatcherTeste01 {
    public static void main (String[] args){

        String regex = "ab";
        String texto = "abaaba";
        String texto2 = "abaaba";
        Pattern pattern = Pattern.compile(regex);
        pattern.matcher(texto);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("texto: " + texto);
        System.out.println("índice: 0123456789");
        System.out.println("regex: "+ regex);
        System.out.println("POSIÇÕES ENCONTRADAS: ");

            while(matcher.find()){
                System.out.println(matcher.start() + " ");
            }

    }
}
