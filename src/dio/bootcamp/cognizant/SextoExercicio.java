package dio.bootcamp.cognizant;

public class SextoExercicio {

    public static void main(String[] args) {

        SextoExercicio.area(3);
        SextoExercicio.area(5d,8d);
        SextoExercicio.area(10,5,4);
        SextoExercicio.area(5f,15f);
    }

        public static void area(double lado) {

            System.out.println("A área do quadrado é de: " + lado * lado + "m².");
        }

        public static void area(double lado1, double lado2) {

            System.out.println("A área do retangulo é de: " + lado1 * lado2 + "m².");

        }

        public static void area(double baseMaior, double baseMenor, double altura) {

            System.out.println("A área do trapézio é de: " + ((baseMaior +baseMenor)*altura)/2 + "m²");
        }

        //Não pode utilizar o mesmo parâmetro, para incluir o losango, deve-se alterar o tipo double;

        public static void area(float diagonal1, float diagonal2) {

            System.out.println("A área do losango é de: " + (diagonal1 * diagonal2)/2 + "m².");
        }

//        int lado = 3;
//        int altura = 4;
//        int base = 5;
//
//        int areaQuadrado = lado * lado;
//        System.out.println("A área do quadrado é de: " + areaQuadrado + "m².");
//
//        int areaRetangulo = base * altura;
//        System.out.println("A área do retângulo é de: " + areaRetangulo + "m².");
//
//        int areaTrapezio = ((lado+base)*altura) / 2 * altura;
//        System.out.println("A área do trapezio é de: " + areaTrapezio + "m².");
    }


