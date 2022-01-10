package exercicios.dio;

import java.util.Scanner;

/* Faça um programa que leia conjunto de dois valores, o primeiro representando
o nome do aluno e o segundo representando sua idade.
(Pare inserindo o valor 0 no campo nome)
 */

public class exercicio_nomeIdade {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        String nome;
        int idade;

        while(true) {
            System.out.println("Nome: ");
            nome = leia.next();
            if(nome.equals("0")) break;

            System.out.println("Idade: ");
            idade = leia.nextInt();
        }
    }
}
