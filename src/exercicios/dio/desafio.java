package exercicios.dio;

import java.io.IOException;
import java.util.Scanner;

public class desafio {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
//declare suas variaveis corretamente
/*        int numero;
        int pares = 0;
        int impares = 0;
        int contador = 0;
        int positivo = 0;
        int negativo = 0;

//continue a solução
        do{
            System.out.println("Digite o inteiro");
            numero = leitor.nextInt();

            if(numero % 2 == 0) pares++;
            else impares++;

            if(numero > 0)  positivo++;
            else negativo++;

            contador++;
        }while (contador < 5);

//insira suas variaveis corretamente
        System.out.println(pares + " par(es)");
        System.out.println(impares + " impar(es)");
        System.out.println(positivo + " positivo(s)");
        System.out.println(negativo + " negativo(s)");*/

        int numero;
        int pares = 0;
        int impares = 0;
        int positivo = 0;
        int negativo = 0;

        System.out.println("Digite o inteiro");


//continue a solução
        for (int i = 0; i < 5; i++) {
            numero = leitor.nextInt();
            if(numero % 2 == 0) pares++;
            else impares++;

            if(numero > 0) positivo++;
            else if (numero < 0) negativo++;

        }

//insira suas variaveis corretamente
        System.out.println(pares + " par(es)");
        System.out.println(impares + " impar(es)");
        System.out.println(positivo + " positivo(s)");
        System.out.println(negativo + " negativo(s)");
    }



}
