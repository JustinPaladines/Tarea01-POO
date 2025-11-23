import java.util.ArrayList;
import java.util.Scanner;

public class OlimpiadaMain {

    static Scanner sc = new Scanner(System.in);

    static Olimpiada olimpiada = null;
    static ArrayList<Evento> eventos = new ArrayList<>();
    static ArrayList<Participante> participantes = new ArrayList<>();


    public static void main(String[] args) {

        while (true) {
            System.out.println("\n--- MENÚ OLIMPIADAS ---");
            System.out.println("1. Crear Olimpiada");
            System.out.println("2. Registrar Evento");
            System.out.println("3. Registrar Participante");
            System.out.println("4. Ver Participantes de un Evento");
            System.out.println("5. Salir");
            System.out.print("Opción: ");

            int op = Integer.parseInt(sc.nextLine());

            try {
                switch (op) {
                    case 1:
                        crearOlimpiada();
                        break;

                    case 2:
                        registrarEvento();
                        break;

                    case 3:
                        registrarParticipante();
                        break;

                    case 4:
                        mostrarParticipantesPorEvento();
                        break;

                    case 5:
                        System.out.println("Saliendo...");
                        return;

                    default:
                        System.out.println("Opción inválida.");
                }

            } catch (Exception e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        }
    }


    static void crearOlimpiada() throws DatosInvalidosException {
        System.out.print("Nombre: ");
        String n = sc.nextLine();
        System.out.print("Lugar: ");
        String l = sc.nextLine();
        System.out.print("Año: ");
        int a = Integer.parseInt(sc.nextLine());

        olimpiada = new Olimpiada(n, l, a);
        System.out.println("Olimpiada creada.");
    }


    static void registrarEvento() throws DatosInvalidosException {
        if (olimpiada == null) {
            System.out.println("Primero cree la Olimpiada.");
            return;
        }

        System.out.print("Código: ");
        String c = sc.nextLine();
        System.out.print("Nombre: ");
        String n = sc.nextLine();

        eventos.add(new Evento(c, n));
        System.out.println("Evento registrado.");
    }


    static void registrarParticipante() throws DatosInvalidosException {
        if (eventos.isEmpty()) {
            System.out.println("No hay eventos registrados.");
            return;
        }

        System.out.print("Código del evento: ");
        String cod = sc.nextLine();

        boolean existe = false;
        for (Evento e : eventos) {
            if (e.codigo.equals(cod)) {
                existe = true;
            }
        }

        if (!existe) {
            System.out.println("Evento no encontrado.");
            return;
        }

        System.out.println("1. Atleta");
        System.out.println("2. Equipo");
        System.out.print("Tipo: ");
        int t = Integer.parseInt(sc.nextLine());

        System.out.print("ID: ");
        String id = sc.nextLine();
        System.out.print("Nombre: ");
        String nom = sc.nextLine();

        if (t == 1) {
            System.out.print("Disciplina: ");
            String dis = sc.nextLine();
            System.out.print("Edad: ");
            int edad = Integer.parseInt(sc.nextLine());

            participantes.add(new Atleta(id, nom, cod, dis, edad));
        } else {
            System.out.print("País: ");
            String pais = sc.nextLine();

            participantes.add(new Equipo(id, nom, cod, pais));
        }

        System.out.println("Participante registrado.");
    }


    static void mostrarParticipantesPorEvento() {
        System.out.print("Código del evento: ");
        String cod = sc.nextLine();

        boolean encontrado = false;

        for (Participante p : participantes) {
            if (p.eventoCodigo.equals(cod)) {
                p.mostrarInfo();
                System.out.println("-------------------");
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No hay participantes en este evento.");
        }
    }

}
