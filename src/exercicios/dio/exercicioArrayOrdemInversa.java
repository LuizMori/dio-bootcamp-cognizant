package exercicios.dio;

public class exercicioArrayOrdemInversa {

    public static void main(String[] args) {

        int[] vetores = {0, -33, 30, 64, -51, 42};

        int contador = 0;

        while(contador <= vetores.length -1) {
            System.out.print(vetores[contador] + " ");
            contador++;
        }

        for (int i = (vetores.length -1); i >= 0; i--){
            System.out.print(vetores[i] + " ");

        }

    }
}
