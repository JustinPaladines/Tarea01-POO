import java.util.ArrayList;
import java.util.Scanner;

public class JuegoMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GestorJuegos gestor = new GestorJuegos();

        while (true) {
            System.out.println("----- MENU JUEGOS -----");
            System.out.println("1. Precargar ejemplos (5+5)");
            System.out.println("2. Registrar MarioBros");
            System.out.println("3. Registrar CarreraVehiculos");
            System.out.println("4. Mostrar todos los juegos");
            System.out.println("5. Buscar por nombre");
            System.out.println("6. Filtrar por tipo");
            System.out.println("7. Salir");
            System.out.print("Opción: ");

            String linea = sc.nextLine();
            int op;
            try {
                op = Integer.parseInt(linea);
            } catch (Exception e) {
                System.out.println("Ingrese una opción numérica.\n");
                continue;
            }

            try {
                switch (op) {
                    case 1:
                        gestor.precargar();
                        System.out.println("ejemplos cargados.\n");
                        break;

                    case 2:
                        // leer datos de Mario
                        System.out.print("ID: ");
                        String idM = sc.nextLine();
                        System.out.print("Nombre: ");
                        String nomM = sc.nextLine();
                        System.out.print("Desarrollador: ");
                        String devM = sc.nextLine();
                        System.out.print("Año: ");
                        int anioM = Integer.parseInt(sc.nextLine());
                        System.out.print("Niveles: ");
                        int niv = Integer.parseInt(sc.nextLine());
                        System.out.print("Multijugador (s/n): ");
                        boolean multi = sc.nextLine().trim().toLowerCase().startsWith("s");

                        MarioBros mario = new MarioBros(idM, nomM, devM, anioM, niv, multi);
                        gestor.agregar(mario);
                        System.out.println("MarioBros agregado.\n");
                        break;

                    case 3:
                        // leer datos de Carrera
                        System.out.print("ID: ");
                        String idC = sc.nextLine();
                        System.out.print("Nombre: ");
                        String nomC = sc.nextLine();
                        System.out.print("Desarrollador: ");
                        String devC = sc.nextLine();
                        System.out.print("Año: ");
                        int anioC = Integer.parseInt(sc.nextLine());
                        System.out.print("Cantidad vehículos: ");
                        int cant = Integer.parseInt(sc.nextLine());
                        System.out.print("Pistas realistas (s/n): ");
                        boolean pistas = sc.nextLine().trim().toLowerCase().startsWith("s");

                        CarreraVehiculos carrera = new CarreraVehiculos(idC, nomC, devC, anioC, cant, pistas);
                        gestor.agregar(carrera);
                        System.out.println("CarreraVehiculos agregado.\n");
                        break;

                    case 4:
                        gestor.mostrarLista(gestor.getTodos());
                        System.out.println();
                        break;

                    case 5:
                        System.out.print("Nombre a buscar: ");
                        String bus = sc.nextLine();
                        ArrayList<Juego> encontrados = gestor.buscarPorNombre(bus);
                        gestor.mostrarLista(encontrados);
                        System.out.println();
                        break;

                    case 6:
                        System.out.println("1. Mostrar solo MarioBros");
                        System.out.println("2. Mostrar solo CarreraVehiculos");
                        System.out.print("Tipo: ");
                        int t = Integer.parseInt(sc.nextLine());
                        if (t == 1) gestor.mostrarLista(gestor.filtrarPorTipo(MarioBros.class));
                        else if (t == 2) gestor.mostrarLista(gestor.filtrarPorTipo(CarreraVehiculos.class));
                        else System.out.println("tipo inválido.");
                        System.out.println();
                        break;

                    case 7:
                        sc.close();
                        System.out.println("saliendo...");
                        return;

                    default:
                        System.out.println("opción inválida.\n");
                }
            } catch (DatosInvalidosException e) {
                System.out.println("Error: " + e.getMessage() + "\n");
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un número válido donde corresponda.\n");
            } catch (Exception e) {
                System.out.println("Error inesperado: " + e.getMessage() + "\n");
            }
        }
    }
}
