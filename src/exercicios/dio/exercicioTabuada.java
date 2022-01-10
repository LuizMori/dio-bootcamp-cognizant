package exercicios.dio;

/* criar uma tabuada de qualquer numero inteiro entre 1 e 10.
 */

import java.util.Scanner;

public class exercicioTabuada {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual tabuada entre 1 e 10?");
        int tabuada = scan.nextInt();

        System.out.println("Tabuada de " + tabuada);

        for(int i = 1; i <= 10 ;i++){
            System.out.println(tabuada + "x" + i + " = " + tabuada*i);
        }
    }
}
