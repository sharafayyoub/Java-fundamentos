public class Ejercicio5 { 
   public static void main (String[] args){
    int [] array = {1,2,3,4,5,6,7,8,9,10};
    int numero =10;
    for (int i= 1; i< array.length; i++){
        if (array[i] == numero){
            System.out.println("El numero " + numero + " se encuentra en el indice " + i);
        }

    }
   }
}
