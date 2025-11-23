import java.util.ArrayList;
import java.util.Scanner;

public class DispositivoMain {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Dispositivo> listaDispositivos = new ArrayList<>();

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n-- MENÚ DE DISPOSITIVOS --");
            System.out.println("1. Registrar Laptop");
            System.out.println("2. Registrar Teléfono");
            System.out.println("3. Mostrar todos los dispositivos");
            System.out.println("4. Buscar por marca");
            System.out.println("5. Filtrar por tipo");
            System.out.println("6. Salir");
            System.out.print("Ingrese una opción: ");

            String linea = sc.nextLine();
            int opcion;

            try {
                opcion = Integer.parseInt(linea.trim());
            } catch (NumberFormatException e) {
                System.out.println("Opción inválida.");
                continue;
            }

            switch (opcion) {
                case 1: registrarLaptop(); break;
                case 2: registrarTelefono(); break;
                case 3: verDispositivos(); break;
                case 4: buscarDispositivo(); break;
                case 5: filtrarPorTipo(); break;
                case 6:
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción inválida.");
            }
        }
    }

    public static void registrarLaptop() {
        try {
            System.out.print("Marca: ");
            String marca = sc.nextLine();

            System.out.print("Modelo: ");
            String modelo = sc.nextLine();

            System.out.print("Precio: ");
            double precio = sc.nextDouble();

            System.out.print("RAM (GB): ");
            int ram = sc.nextInt();
            sc.nextLine();

            listaDispositivos.add(new Laptop(marca, modelo, precio, ram));
            System.out.println("Laptop registrada correctamente.");

        } catch (DatoInvalidoException e) {
            System.out.println("Error: " + e.getMessage());
            sc.nextLine();
        }
    }

    public static void registrarTelefono() {
        try {
            System.out.print("Marca: ");
            String marca = sc.nextLine();

            System.out.print("Modelo: ");
            String modelo = sc.nextLine();

            System.out.print("Precio: ");
            double precio = sc.nextDouble();

            System.out.print("Megapíxeles cámara: ");
            int camara = sc.nextInt();
            sc.nextLine();

            listaDispositivos.add(new Telefono(marca, modelo, precio, camara));
            System.out.println("Teléfono registrado correctamente.");

        } catch (DatoInvalidoException e) {
            System.out.println("Error: " + e.getMessage());
            sc.nextLine();
        }
    }

    public static void verDispositivos() {
        if (listaDispositivos.isEmpty()) {
            System.out.println("No hay dispositivos registrados.");
        } else {
            System.out.println("-- Lista de Dispositivos --");
            for (Dispositivo d : listaDispositivos) {
                d.mostrarInfo();
                System.out.println("------------------");
            }
        }
    }

    public static void buscarDispositivo() {
        System.out.print("Ingrese marca a buscar: ");
        String marca = sc.nextLine();
        boolean encontrado = false;

        for (Dispositivo d : listaDispositivos) {
            if (d.getMarca().equalsIgnoreCase(marca)) {
                d.mostrarInfo();
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No existe un dispositivo con esa marca.");
        }
    }

    public static void filtrarPorTipo() {
        System.out.println("1. Laptop");
        System.out.println("2. Teléfono");
        System.out.print("Ingrese tipo: ");
        int tipo = sc.nextInt();
        sc.nextLine();

        boolean encontrado = false;

        for (Dispositivo d : listaDispositivos) {
            if (tipo == 1 && d instanceof Laptop) {
                d.mostrarInfo();
                encontrado = true;
            }
            if (tipo == 2 && d instanceof Telefono) {
                d.mostrarInfo();
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No hay dispositivos de ese tipo.");
        }
    }
}
