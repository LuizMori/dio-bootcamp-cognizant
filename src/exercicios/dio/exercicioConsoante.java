package exercicios.dio;

import java.util.Scanner;

public class exercicioConsoante {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantidadeConsoantes = 0;
        int contador = 0;

        do {
            System.out.println("Digite a letra: ");
            String letra = scan.next();
            if ( !(letra.equalsIgnoreCase("a") |
                    (letra.equalsIgnoreCase("e") |
                    (letra.equalsIgnoreCase("i") |
                    (letra.equalsIgnoreCase("o") |
                    (letra.equalsIgnoreCase("u")) ))))){
                consoantes[contador] = letra;
                quantidadeConsoantes++;
            }

            contador++;


        } while(contador < consoantes.length);


        for ( String consoante : consoantes) {
            if (consoante != null)
            System.out.print(consoante + " ");

        }
        System.out.println("Quantidade de consoantes: " + quantidadeConsoantes);
    }
}
