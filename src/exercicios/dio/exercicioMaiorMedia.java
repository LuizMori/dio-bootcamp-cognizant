package exercicios.dio;

import java.util.Scanner;

public class exercicioMaiorMedia {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int total = 0;
        int contador = 0;


        do {
            System.out.println("Digite um número qualquer: ");
            numero = scan.nextInt();

            total = total + numero;
            System.out.println("O valor somado é: " + total);

            if(numero > maior) maior = numero;

            contador = contador + 1;

        } while(contador < 5);

        System.out.println("Maior número: " + maior);
        System.out.println("A média dos valores somados é de: " + (total/5));
    }
}
