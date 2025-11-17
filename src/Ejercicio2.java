import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int op;

        System.out.println("---- menu de pizzas ----");
        System.out.println("1. pizza pepperoni");
        System.out.println("2. pizza hawaina");
        System.out.println("3. pizza jamon");
        System.out.println("4. pizza champiñones");
        System.out.print("elige una opcion: ");

        try {
            op = sc.nextInt();

            if (op < 1 || op > 4) {
                throw new IllegalArgumentException("opcion fuera del rango");
            }

            switch (op) {
                case 1:
                    System.out.println("escogiste pizza pepperoni");
                    return;
                case 2:
                    System.out.println("escogiste pizza hawaina");
                    return;
                case 3:
                    System.out.println("escogiste pizza jamon");
                    return;
                case 4:
                    System.out.println("escogiste pizza champiñones");
                    return;
            }

        } catch (InputMismatchException ex) {
            System.out.println("error: solo puedes ingresar numeros");
            sc.nextLine();
        } catch (IllegalArgumentException ex) {
            System.out.println("error: " + ex.getMessage());
        }
    }
}
