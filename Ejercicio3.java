public class Ejercicio3 {
    public static void main(String[] args){
        char w = 'W';
        char b = 'B';
        for (int fila = 1; fila <=8 ; fila++){
            for(int columna=1 ; columna <=8; columna++){
                if ((fila +columna)%2==0){
                    System.out.print(w);
                } 
                else {
                    System.out.print(b);
                }
            }
            System.out.println();
        }


    }
    
}
