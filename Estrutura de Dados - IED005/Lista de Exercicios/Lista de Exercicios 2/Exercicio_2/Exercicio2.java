// Imprima a tabuada do 3

import java.io.IOException;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) throws IOException {
        int entrada;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informar um número: ");
        entrada = scanner.nextInt();

        int multiplicador = 0;
        while(multiplicador <= 10)
        {
            int resultado = entrada * multiplicador;
            System.out.println(resultado);   
            multiplicador++;
        }
    }
}

//public class Exercicio2 {
//    public static void main(String[] args) {
//        int i = 0;
//        while (i <= 10){
//            System.out.println("3 x " + i + " = " + (3 * i));
//            i++;
//        }
//    }
//}