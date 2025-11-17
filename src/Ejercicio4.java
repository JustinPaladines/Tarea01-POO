import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double pago;

        System.out.println("--- banco central ---");
        System.out.print("ingrese el valor del pago: ");
        pago = sc.nextDouble();

        try {

            if (pago <= 0 || pago > 5000) {
                throw new PagoInvalidoException("pago no permitido");
            } else {
                System.out.println("pago procesado con exito");
            }

        } catch (PagoInvalidoException ex) {
            System.out.println("error: " + ex.getMessage());
        }
    }
}


