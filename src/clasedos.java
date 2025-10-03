
import java.util.Scanner;
public class clasedos {
    public static void main(String[] args) {
        Scanner iguales = new Scanner(System.in);
        System.out.println("Ingresa una palabra: ");
        String a = iguales.nextLine();
        System.out.println("Ingresa otra palabra: ");
        String b= iguales.nextLine();
        System.out.println(a.equals(b));

    }
}
