import java.util.ArrayList;
import java.util.Scanner;

public class JuegoMain {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Juego> listaJuegos = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--MENÚ DE JUEGOS--");
            System.out.println("1. Registrar juego Mario Bros");
            System.out.println("2. Registrar juego de Carreras");
            System.out.println("3. Mostrar todos los juegos");
            System.out.println("4. Buscar juego por nombre");
            System.out.println("5. Filtrar por tipo de juego");
            System.out.println("6. Salir");
            System.out.print("Ingrese una opción: ");

            String linea = sc.nextLine();
            int opcion;
            try {
                opcion = Integer.parseInt(linea.trim());
            } catch (NumberFormatException e) {
                System.out.println("Opción inválida. Ingrese un número entre 1 y 6.");
                continue;
            }

            switch (opcion) {
                case 1:
                    registrarMarioBros();
                    break;
                case 2:
                    registrarVehiculos();
                    break;
                case 3:
                    VerJuegos();
                    break;
                case 4:
                    BuscarJuego();
                    break;
                case 5:
                    filtrarPorTipo();
                    break;
                case 6:
                    System.out.println("Saliendo... ¡Hasta luego!");
                    return; // termina main y no ejecuta nada más
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        }
    }


    public static void registrarMarioBros() {
        try {
            System.out.print("Nombre del juego: ");
            String nombre = sc.nextLine();

            System.out.print("Precio del juego: ");
            Double precio = sc.nextDouble();

            System.out.print("Vida inicial del juego: ");
            int vida = sc.nextInt();

            sc.nextLine(); // limpia el salto de línea para evitar errores después

            listaJuegos.add(new MarioBros(nombre, precio, vida));
            System.out.println("Juego Mario Bros registrado correctamente.");

        } catch (DatoInvalidoExcception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void registrarVehiculos(){
        try {
            System.out.print("Nombre del juego: ");
            String nombre = sc.nextLine();

            System.out.print("Precio del juego: ");
            Double precio = sc.nextDouble();

            System.out.print("Vehiculos: ");
            int vehiculos = sc.nextInt();

            sc.nextLine();

            listaJuegos.add(new CarreraVehiculos( nombre, precio, vehiculos));
            System.out.println("Juego Mario Bros registrado correctamente.");

        } catch (DatoInvalidoExcception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void VerJuegos(){
        if(listaJuegos.isEmpty()){
            System.out.println("No existen juegos registrados");
        }
        else {
            System.out.println("--Lista de Juegos --");
            for (Juego j: listaJuegos){
                j.Mostrarinfo();
                System.out.println("-----------------");
            }
        }
    }

    public static void BuscarJuego(){
        System.out.print("Ingrese el nombre a buscar: ");
        String nombre = sc.nextLine();
        //nombre que se va a buscarr
        boolean encontrado = false;
        //primero falso porque aun no se encuentra

        for (Juego j : listaJuegos) {
            if (j.nombre.equalsIgnoreCase(nombre)) {
                //equalsIgnoreCase compara dos textos sin importar mayúsculas o minúsculas.
                //se usa get porque declaramos el atributo como private
                j.Mostrarinfo();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró un juego con ese nombre.");
        }
    }

    public static void filtrarPorTipo() {
        System.out.println("1. Mario Bros");
        System.out.println("2. Carreras");
        System.out.print("Ingrese tipo: ");
        int tipo = sc.nextInt();
        boolean encontrado = false;

        for (Juego j : listaJuegos) {
            if (tipo == 1 && j instanceof MarioBros) {
                j.Mostrarinfo();
                encontrado = true;
            }
            if (tipo == 2 && j instanceof CarreraVehiculos) {
                j.Mostrarinfo();
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No hay juegos de ese tipo.");
        }
    }
}
