import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Producto> listaProductos = new ArrayList<>();

        while (true) {
            System.out.println("----- menu sistema de productos -----");
            System.out.println("1. registrar producto");
            System.out.println("2. mostrar productos");
            System.out.println("3. salir");
            System.out.print("seleccione una opcion: ");

            try {
                int opcion = Integer.parseInt(sc.nextLine());

                switch (opcion) {

                    case 1:
                        System.out.print("ingrese nombre del producto: ");
                        String nombre = sc.nextLine();

                        System.out.print("ingrese precio: ");
                        double precio = Double.parseDouble(sc.nextLine());

                        if (nombre.trim().isEmpty()) {
                            throw new IllegalArgumentException("el nombre no puede estar vacío.");
                        }
                        if (precio < 0) {
                            throw new IllegalArgumentException("el precio no puede ser negativo.");
                        }

                        Producto nuevo = new Producto(nombre, precio);
                        listaProductos.add(nuevo);

                        System.out.println("producto registrado correctamente.");
                        break;

                    case 2:
                        if (listaProductos.isEmpty()) {
                            System.out.println("no hay productos registrados.");
                        } else {
                            System.out.println("--- lista de productos ---");
                            for (Producto prod : listaProductos) {
                                System.out.println("nombre: " + prod.getNombre() +
                                        " | precio: $" + prod.getPrecio());
                            }
                        }
                        break;

                    case 3:
                        System.out.println("saliendo del sistema...");
                        return;

                    default:
                        System.out.println("opcion fuera de rango.");
                }

            } catch (NumberFormatException e) {
                System.out.println("debe ingresar un numero valido.");
            } catch (IllegalArgumentException e) {
                System.out.println("error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("error inesperado: " + e.getMessage());
            }
        }
    }
}
