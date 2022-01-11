package exercicios.dio;

public class exerciciosDeAulas {
    public static void main(String[] args) {

        for (int i = 3; i <= 11; i = i + 2) {
            if(i == 7) continue;
            System.out.println("O valor de i é: " + i);
            }

        System.out.println(" ");
        System.out.println("Com interruptores utilizando 'for':");
        System.out.println(" ");

        for (int j = 0; j <= 14; j = j + 2){
            if (j == 12) break;
            System.out.println("Os valores de j: " + j);
        }

        System.out.println(" ");
        System.out.println("Com interruptores utilizando 'while':");
        System.out.println(" ");

        int k = 0;

        while(k <= 14){
            System.out.println("Valores de k: " +k);
            k = k+2;
            if(k == 12) {
                break;
            }
        }

        String x = "---------------------------------------\n";
        String y = "|                                     |\n";
        System.out.println(x + y + y + y + y + y + x);


    }
}
