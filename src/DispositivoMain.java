// DispositivoMain.java
// Contiene el método main y el menú interactivo (sin precarga)

import java.util.ArrayList;
import java.util.Scanner;

public class DispositivoMain {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Dispositivo> lista = new ArrayList<>();
        boolean salir = false;

        while (!salir) {
            mostrarMenu();
            int opcion = leerEntero("Opción: ");

            switch (opcion) {
                case 1:
                    registrarLaptop(lista);
                    break;
                case 2:
                    registrarTelefono(lista);
                    break;
                case 3:
                    mostrarTodos(lista);
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
            System.out.println();
        }
        sc.close();
    }

    private static void mostrarMenu() {
        System.out.println("----- MENU DISPOSITIVOS -----");
        System.out.println("1. Registrar Laptop");
        System.out.println("2. Registrar Teléfono");
        System.out.println("3. Mostrar todos los dispositivos");
        System.out.println("4. Salir");
    }

    private static void registrarLaptop(ArrayList<Dispositivo> lista) {
        System.out.println("-- Registrar Laptop --");
        try {
            String marca = leerLinea("Marca: ");
            String modelo = leerLinea("Modelo: ");
            double precio = leerDouble("Precio: ");
            double tamPant = leerDouble("Tamaño de pantalla (pulgadas): ");
            boolean tieneGPU = leerBoolean("¿Tiene GPU dedicada? (s/n): ");

            Laptop l = new Laptop(marca, modelo, precio, tamPant, tieneGPU);
            lista.add(l);
            System.out.println("Laptop registrada correctamente.");
        } catch (DatoInvalidoException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void registrarTelefono(ArrayList<Dispositivo> lista) {
        System.out.println("-- Registrar Teléfono --");
        try {
            String marca = leerLinea("Marca: ");
            String modelo = leerLinea("Modelo: ");
            double precio = leerDouble("Precio: ");
            int camaras = leerEntero("Cantidad de cámaras: ");
            boolean tiene5G = leerBoolean("¿Tiene 5G? (s/n): ");

            Telefono t = new Telefono(marca, modelo, precio, camaras, tiene5G);
            lista.add(t);
            System.out.println("Teléfono registrado correctamente.");
        } catch (DatoInvalidoException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void mostrarTodos(ArrayList<Dispositivo> lista) {
        if (lista.isEmpty()) {
            System.out.println("No hay dispositivos registrados.");
            return;
        }
        System.out.println("\n--- LISTA DE DISPOSITIVOS ---");
        for (Dispositivo d : lista) {
            System.out.println(d.mostrarInfo());
        }
    }

    /* Lectura segura */

    private static String leerLinea(String prompt) {
        System.out.print(prompt);
        return sc.nextLine().trim();
    }

    private static int leerEntero(String prompt) {
        while (true) {
            System.out.print(prompt);
            String linea = sc.nextLine().trim();
            try {
                return Integer.parseInt(linea);
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un número entero válido.");
            }
        }
    }

    private static double leerDouble(String prompt) {
        while (true) {
            System.out.print(prompt);
            String linea = sc.nextLine().trim();
            try {
                return Double.parseDouble(linea);
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un número válido (use punto para decimales).");
            }
        }
    }

    private static boolean leerBoolean(String prompt) {
        while (true) {
            System.out.print(prompt);
            String linea = sc.nextLine().trim().toLowerCase();
            if (linea.startsWith("s") || linea.equals("si")) return true;
            if (linea.startsWith("n") || linea.equals("no")) return false;
            System.out.println("Respuesta inválida. Escriba 's' para sí o 'n' para no.");
        }
    }
}
