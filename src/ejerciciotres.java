import java.util.Scanner;

public class ejerciciotres {
    public static void main (String[] args) {
        Scanner multiplicacion = new Scanner(System.in);

        while (true) {
            System.out.println("Ingrese un numero: ");
            int num = multiplicacion.nextInt();
            if (num < 10 && num > 0) {
                for (int i = 0; i <= 10; i++) {
                    System.out.println(num + "*" + i + "=" + num * i);
                }
                break;
            } else {
                System.out.println("Solo ingresar numeros del 1 al 10");
            }
        }
    }
}
