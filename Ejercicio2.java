import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args){
        System.out.println("Ejercicio 2");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero decimal:");
        double numero= scanner.nextDouble();

        double resultado1 = numero * 20;
        double resultado2= resultado1 / 10;
        System.out.println("El resultado de la primera operacion: " + resultado2);
        double resultaodo3= (resultado1 + resultado2)/ 10;
        System.out.println("El resultado de la segunda operacion: " + resultaodo3);

        if (resultaodo3  % 2 != 0){
            System.out.println("El resultado tiene resto, es impar");
        } else {
            System.out.println("El resultado es par");
        }
        scanner.close();

    }
    
}
