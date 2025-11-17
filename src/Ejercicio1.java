import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String dato;

        System.out.println("---- calculo de precio ----");
        System.out.print("ingrese el precio del producto: ");
        dato = sc.nextLine();

        try {

            double precio = Double.parseDouble(dato);

            if (precio <= 0) {
                System.out.println("el precio no puede ser cero o negativo");
            } else {
                double total = precio + (precio * 0.15);
                System.out.println("total con iva: $" + total);
            }

        } catch (NumberFormatException ex) {
            System.out.println("error: ingrese solo numeros");
        }
    }
}
