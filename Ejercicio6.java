import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args){
        int numero;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero positivo:");
        numero = scanner.nextInt();
        int factorial = 1;
        for (int i= 1; i<= numero; i++){
            factorial *= i;
            System.out.println(factorial);
        }
        
    }
    
}
