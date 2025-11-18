import java.util.Scanner;

public class OlimpiadaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Olimpiada olimpiada = null;

        while (true) {
            System.out.println("----- MENU OLIMPIADAS -----");
            System.out.println("1. Crear Olimpiada");
            System.out.println("2. Agregar Evento");
            System.out.println("3. Registrar Participante");
            System.out.println("4. Ver Participantes de un Evento");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            int op = Integer.parseInt(sc.nextLine());

            try {
                switch (op) {
                    case 1:
                        System.out.print("Nombre: ");
                        String n = sc.nextLine();
                        System.out.print("Lugar: ");
                        String l = sc.nextLine();
                        System.out.print("Año: ");
                        int a = Integer.parseInt(sc.nextLine());
                        olimpiada = new Olimpiada(n, l, a);
                        System.out.println("Olimpiada creada.\n");
                        break;

                    case 2:
                        if (olimpiada == null) {
                            System.out.println("Primero cree la olimpiada.\n");
                            break;
                        }
                        System.out.print("Código evento: ");
                        String c = sc.nextLine();
                        System.out.print("Nombre evento: ");
                        String ne = sc.nextLine();
                        olimpiada.agregarEvento(new Evento(c, ne));
                        System.out.println("Evento agregado.\n");
                        break;

                    case 3:
                        if (olimpiada == null) {
                            System.out.println("Primero cree la olimpiada.\n");
                            break;
                        }
                        System.out.print("Código del evento: ");
                        String ce = sc.nextLine();
                        Evento ev = olimpiada.buscarEvento(ce);
                        if (ev == null) {
                            System.out.println("Evento no encontrado.\n");
                            break;
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
                            int ed = Integer.parseInt(sc.nextLine());
                            ev.agregarParticipante(new Atleta(id, nom, dis, ed));
                        } else {
                            System.out.print("País: ");
                            String pa = sc.nextLine();
                            Equipo eq = new Equipo(id, nom, pa);
                            System.out.print("Miembros a agregar: ");
                            int m = Integer.parseInt(sc.nextLine());
                            for (int i = 0; i < m; i++) {
                                System.out.print("Miembro " + (i + 1) + ": ");
                                eq.agregarMiembro(sc.nextLine());
                            }
                            ev.agregarParticipante(eq);
                        }

                        System.out.println("Participante agregado.\n");
                        break;

                    case 4:
                        System.out.print("Código evento: ");
                        String cod = sc.nextLine();
                        Evento eve = olimpiada.buscarEvento(cod);
                        if (eve == null) System.out.println("No existe.\n");
                        else eve.mostrarParticipantes();
                        break;

                    case 5:
                        return;

                    default:
                        System.out.println("Opción inválida.\n");
                }

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage() + "\n");
            }
        }
    }
}
