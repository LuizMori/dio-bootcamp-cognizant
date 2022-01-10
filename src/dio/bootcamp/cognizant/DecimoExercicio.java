package dio.bootcamp.cognizant;

import java.util.Scanner;

public class DecimoExercicio {

    public static void main(String[] args) {

        int m1 = 1;
        int m2 = 2;
        int m3 = 3;
        int m4 = 4;
        int m5 = 5;
        int m6 = 6;
        int m7 = 7;
        int m8 = 8;
        int m9 = 9;
        int m10 = 10;
        int m11 = 11;
        int m12 = 12;

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o número do mês que deseja saber: ");

        if (ler.nextInt() == m1) {
            System.out.println("Mês de Janeiro");
        }
        if (ler.nextInt() == m2) {
            System.out.println("Mês de Fevereiro");
        }
        if (ler.nextInt() == m3) {
            System.out.println("Mês de Março");
        }
        if (ler.nextInt() == m4) {
            System.out.println("Mês de Abril");
        }
        if (ler.nextInt() == m5) {
            System.out.println("Mês de Maio");
        }
        if (ler.nextInt() == m6) {
            System.out.println("Mês de Junho");
        }
        if (ler.nextInt() == m7) {
            System.out.println("Mês de Julho - Férias");
        }
        if (ler.nextInt() == m8) {
            System.out.println("Mês de Agosto");
        }
        if (ler.nextInt() == m9) {
            System.out.println("Mês de Setembro");
        }
        if (ler.nextInt() == m10) {
            System.out.println("Mês de Outubro");
        }
        if (ler.nextInt() == m11) {
            System.out.println("Mês de Novembro");
        }
        if (ler.nextInt() == m12) {
            System.out.println("Mês de Dezembro - Férias");
        }
    }
}

