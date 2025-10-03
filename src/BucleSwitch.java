import java.util.Scanner;

public class BucleSwitch {
    public static void main(String[] args) {
        Scanner bucle = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        int num = bucle.nextInt();
        bucle.nextLine();

        switch (num) {
            case 1: {
                System.out.println("Ejercicio bucle FOR");
                System.out.println("Ingrese un número para la tabla de multiplicar: ");
                int numero = bucle.nextInt();
                bucle.nextLine();
                for (int i = 0; i <= 10; i++) {
                    System.out.println(numero + " * " + i + " = " + (numero * i));
                }
                break;
            }

            case 2: {
                System.out.println("Ejercicio bucle WHILE");
                String usuario = "JustinPaladines";
                String clave = "2005";

                while (true) {
                    System.out.println("Ingrese su usuario: ");
                    String newuser = bucle.nextLine();
                    System.out.println("Ingrese su clave: ");
                    String newclave = bucle.nextLine();

                    if (newuser.equals(usuario) && newclave.equals(clave)) {
                        System.out.println("Usuario exitoso");
                        break;
                    } else {
                        System.out.println("El usuario y contraseña no son válidos");
                    }
                }
                break;
            }

            case 3: {
                System.out.println("Validación de usuario sin bucle");
                String usuario2 = "JustinPaladines";
                String clave2 = "2005";

                System.out.println("Ingrese su usuario: ");
                String newuser = bucle.nextLine();
                if (newuser.trim().isEmpty()) {
                    System.out.println("El usuario no puede estar vacío");
                    break;
                }

                System.out.println("Ingrese su clave: ");
                String newclave = bucle.nextLine();

                if (newuser.equals(usuario2) && newclave.equals(clave2)) {
                    System.out.println("Usuario exitoso");
                } else {
                    System.out.println("El usuario y contraseña no son válidos");
                }
                break;
            }

            default:
                System.out.println("Opción no válida.");
        }
    }
}
