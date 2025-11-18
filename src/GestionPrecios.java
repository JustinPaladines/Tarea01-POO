import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashSet;

public class GestionPrecios {
    // lista donde se guardan los precios
    private ArrayList<Double> precios = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    // ingresar precio (valida que sea double y mayor que 0)
    public void ingresarPrecio() {
        try {
            System.out.print("ingrese un precio: ");
            double precio = Double.parseDouble(sc.nextLine());

            if (precio <= 0) {
                System.out.println("no puede ingresar precios negativos o igual a cero.");
                return;
            }

            precios.add(precio);
            System.out.println("el precio se agrego correctamente.");

        } catch (NumberFormatException e) {
            System.out.println("entrada invalida: debe ingresar un numero valido (ej: 1234.56).");
        } catch (Exception e) {
            System.out.println("error inesperado: " + e.getMessage());
        }
    }

    // mostrar todos los precios
    public void mostrarPrecios() {
        if (precios.isEmpty()) {
            System.out.println("no existen precios registrados.");
            return;
        }

        System.out.println("---- precios registrados ----");
        for (double p : precios) {
            System.out.println(p);
        }
    }

    // precio mas alto
    public void precioAlto() {
        if (precios.isEmpty()) {
            System.out.println("no existen precios registrados.");
            return;
        }

        double maximo = precios.get(0);
        for (double p : precios) {
            if (p > maximo) {
                maximo = p;
            }
        }
        System.out.println("el precio más alto de la lista es: $" + maximo);
    }

    // precio mas bajo
    public void precioBajo() {
        if (precios.isEmpty()) {
            System.out.println("no existen precios registrados.");
            return;
        }

        double minimo = precios.get(0);
        for (double p : precios) {
            if (p < minimo) {
                minimo = p;
            }
        }
        System.out.println("el precio más bajo de la lista es: $" + minimo);
    }

    // precios iguales (muestra cada valor duplicado una sola vez)
    public void preciosIguales() {
        if (precios.isEmpty()) {
            System.out.println("no existen precios registrados.");
            return;
        }

        // usamos un conjunto para marcar valores vistos y otro para duplicados
        HashSet<Double> vistos = new HashSet<>();
        HashSet<Double> duplicados = new HashSet<>();

        for (Double p : precios) {
            if (!vistos.add(p)) {         // add devuelve false si ya estaba
                duplicados.add(p);
            }
        }

        if (duplicados.isEmpty()) {
            System.out.println("no existen precios duplicados.");
        } else {
            System.out.println("los precios iguales en la lista son:");
            for (Double d : duplicados) {
                System.out.println("$" + d);
            }
        }
    }

    // buscar precio especifico (usa contains)
    public void buscarPrecio() {
        if (precios.isEmpty()) {
            System.out.println("no existen precios registrados.");
            return;
        }

        try {
            System.out.print("ingrese el precio a buscar: ");
            double buscado = Double.parseDouble(sc.nextLine());

            if (buscado <= 0) {
                System.out.println("no puede ingresar un numero negativo o cero.");
                return;
            }

            // contains usa equals sobre Double; puede fallar por precision en decimales
            if (precios.contains(buscado)) {
                System.out.println("el precio que usted busca se encuentra en la lista.");
            } else {
                System.out.println("el precio que busca no se encuentra en la lista.");
            }

        } catch (NumberFormatException e) {
            System.out.println("entrada invalida: debe ingresar un numero valido.");
        } catch (Exception e) {
            System.out.println("error inesperado: " + e.getMessage());
        }
    }

    // menu principal
    public void menu() {
        while (true) {
            System.out.println("===== menu de precios inmobiliarios =====");
            System.out.println("1. ingresar precio");
            System.out.println("2. mostrar todos los precios");
            System.out.println("3. mostrar precio más alto");
            System.out.println("4. mostrar precio más bajo");
            System.out.println("5. mostrar precios iguales");
            System.out.println("6. buscar un precio específico");
            System.out.println("7. salir");
            System.out.print("seleccione una opcion: ");

            String linea = sc.nextLine();
            int opcion;
            try {
                opcion = Integer.parseInt(linea);
            } catch (NumberFormatException e) {
                System.out.println("debe ingresar un numero valido para la opcion.");
                continue;
            }

            switch (opcion) {
                case 1:
                    ingresarPrecio();
                    break;
                case 2:
                    mostrarPrecios();
                    break;
                case 3:
                    precioAlto();
                    break;
                case 4:
                    precioBajo();
                    break;
                case 5:
                    preciosIguales();
                    break;
                case 6:
                    buscarPrecio();
                    break;
                case 7:
                    System.out.println("saliendo.");
                    return;
                default:
                    System.out.println("ingrese una opcion valida (1-7).");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("----- bienvenid@ al sistema de precios -----");
        GestionPrecios app = new GestionPrecios();
        app.menu();
    }
}
