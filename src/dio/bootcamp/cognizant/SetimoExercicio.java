package dio.bootcamp.cognizant;

public class SetimoExercicio {

    public static void main(String[] args) {

        double areaQuadrado = SetimoExercicio.area(2);
        System.out.println("A área do quadrado é de: " + areaQuadrado + "m².");

        double areaRetangulo = SetimoExercicio.area(3d,5d);
        System.out.println("A área do retângulo é de: " + areaRetangulo + "m².");

        double areaTrapezio = SetimoExercicio.area(5,4,3);
        System.out.println("A área do trapézio é de: " + areaTrapezio + "m².");

        float areaLosango = SetimoExercicio.area(5f,4f);
        System.out.println("A área do losango é de: " + areaLosango + "m².");
    }

    public static double area(double lado) {

        return lado * lado;
    }

    public static double area(double lado1, double lado2) {

        return lado1 * lado2;

    }

    public static double area(double baseMaior, double baseMenor, double altura) {

        return ((baseMaior +baseMenor)*altura)/2;
    }

    //Não pode utilizar o mesmo parâmetro, para incluir o losango, deve-se alterar o tipo double;

    public static float area(float diagonal1, float diagonal2) {

        return (diagonal1 * diagonal2)/2;
    }
}
