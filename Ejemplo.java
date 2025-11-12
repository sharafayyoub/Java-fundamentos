import java.util.Scanner;
public class Ejemplo{
    public static void main(String[] args){
        String ShortMsg = "Short Message";
        String LoongMsg= "Loooooong Message";
        boolean printShort= true;
        int counter;
        if (printShort= true){
            System.out.println(ShortMsg);
        } else {
            System.out.println(LoongMsg);
        }
        System.out.println("This message is always printed.");
        for (counter= 1; counter <= 10; counter++){
            System.out.println("Are we there yet?");
        }
        counter= 1;
        while (counter <=7){
            System.out.println("Almost there...");
            counter++;
        }
    }
}