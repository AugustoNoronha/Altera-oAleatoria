import java.util.*;

import static java.lang.Math.random;

public class Main {
        public static void main(String[] args) {
            Random random = new Random(4);
            Scanner sc = new Scanner(System.in);
            String entrada = sc.nextLine();
            while (!(entrada.equals("FIM"))){
                char letra1 = (char) random.nextInt(26 + 'a');
                char letra2 = (char) random.nextInt(26 + 'a');
                StringBuilder stringBuilder = new StringBuilder();
                String saida = substituirLetras(entrada, letra1, letra2, 0, stringBuilder);
                System.out.println(saida);
                entrada = sc.nextLine();
            }

        }

        public static String substituirLetras(String texto, char letra1, char letra2, int count, StringBuilder stringBuilder) {
            if(texto.charAt(count) == letra1) {
                stringBuilder.append(letra1);
            }else if(texto.charAt(count) == letra2){
                stringBuilder.append(letra2);

            }else{
                stringBuilder.append(texto.charAt(count));
            }

            count++;

            if(stringBuilder.length() != texto.length()){
                substituirLetras(texto, letra1, letra2, count, stringBuilder);
            }

            return stringBuilder.toString();
        }

    }



