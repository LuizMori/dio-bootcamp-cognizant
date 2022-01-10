package exercicios.dio;

import java.util.Scanner;

public class exercicio_ParesImpares {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int quantidadeNumeros;
        int numero;
        int pares = 0;
        int impares = 0;

        System.out.println("Quantidade de números: ");
        quantidadeNumeros = scan.nextInt();

        int contador = 0;

        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            if(numero % 2 == 0) pares++;
            else impares++;

            contador++;

        }while(contador < quantidadeNumeros);

        System.out.println("Quantidade pares: " + pares);
        System.out.println("Quantidade impares: " + impares);

    }
}
