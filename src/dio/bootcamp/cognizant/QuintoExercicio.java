package dio.bootcamp.cognizant;

import java.util.Scanner;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class QuintoExercicio {

    public static void main(String[] args) {

        adicao();
        subtracao();
        multiplicacao();
        divisao();
        horaLocal();

    }

    public static void adicao() {

        int a, b, c = 0;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o número e aperte Enter para realizar a soma: ");
        a = ler.nextInt();
        b = ler.nextInt();
        c = a + b;
        System.out.println("A soma dos valores é de: " + c);

    }

    public static void subtracao() {

        int a, b, c = 0;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o número e aperte Enter para realizar a subtração: ");
        a = ler.nextInt();
        b = ler.nextInt();
        c = a - b;
        System.out.println("A subtração dos valores é de: " + c);
    }

    public static void multiplicacao() {

        int a, b, c = 0;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o número e aperte Enter para realizar a multiplicação: ");
        a = ler.nextInt();
        b = ler.nextInt();
        c = a * b;
        System.out.println("A multiplicação dos valores é de: " + c);
    }

    public static void divisao() {

        int a, b, c = 0;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o número e aperte Enter para realizar a divisão: ");
        a = ler.nextInt();
        b = ler.nextInt();
        c = a / b;
        System.out.println("A divisão dos valores é de: \n" + c);
    }

    public static void horaLocal() {

        LocalTime hora = LocalTime.now();
        DateTimeFormatter horaCorreta = DateTimeFormatter.ofPattern("HH");
        String horaFormatada = hora.format(horaCorreta);
        System.out.println("Agora são: " + horaFormatada);

        int i = Integer.parseInt(horaFormatada);

        if (i <= 12) System.out.println("Bom dia!");
        else if (i <= 20) {
            System.out.println("Boa tarde");
        } else
            System.out.println("Boa noite");
    }

}
