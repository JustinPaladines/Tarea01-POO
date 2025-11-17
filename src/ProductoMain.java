import java.util.ArrayList;
import java.util.Scanner;

public class ProductoMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Producto> prodList = new ArrayList<>();

        while (true) {
            System.out.println("---- menu ----");
            System.out.println("1. agregar producto");
            System.out.println("2. mostrar lista");
            System.out.println("3. calcular promedio de precios finales");
            System.out.println("4. salir");
            System.out.print("elige una opcion: ");

            try {
                int opcion = Integer.parseInt(sc.nextLine());

                switch (opcion) {

                    case 1:
                        System.out.println("1. producto nacional");
                        System.out.println("2. producto importado");
                        System.out.print("elige tipo: ");
                        int tipo = Integer.parseInt(sc.nextLine());

                        System.out.print("codigo: ");
                        String codigo = sc.nextLine();

                        System.out.print("nombre: ");
                        String nombre = sc.nextLine();

                        System.out.print("precio base: ");
                        double base = Double.parseDouble(sc.nextLine());

                        if (tipo == 1) {
                            System.out.print("provincia (nacional): ");
                            String pais = sc.nextLine();
                            prodList.add(new ProductoNacional(codigo, nombre, base, pais));
                        } else if (tipo == 2) {
                            System.out.print("pais de origen (importado): ");
                            String pais = sc.nextLine();
                            prodList.add(new ProductoImportado(codigo, nombre, base, pais));
                        } else {
                            throw new IllegalArgumentException("tipo invalido");
                        }

                        System.out.println("producto agregado correctamente.");
                        break;

                    case 2:
                        if (prodList.isEmpty()) {
                            throw new DatosInvalidosException("la lista esta vacia, no hay productos para mostrar");
                        }
                        for (Producto p : prodList) {
                            p.mostrarInformacion();
                            System.out.println("precio final: " + p.total());
                        }
                        break;

                    case 3:
                        if (prodList.isEmpty()) {
                            throw new DatosInvalidosException("no se puede calcular promedio: la lista esta vacia");
                        }
                        double suma = 0;
                        for (Producto p : prodList) {
                            suma += p.total();
                        }
                        double promedio = suma / prodList.size();
                        System.out.println("promedio de precios finales: " + promedio);
                        break;

                    case 4:
                        System.out.println("saliendo.");
                        return;

                    default:
                        throw new IllegalArgumentException("opcion fuera de rango");
                }

            } catch (NumberFormatException e) {
                System.out.println("error: debes ingresar numeros validos");
            } catch (IllegalArgumentException e) {
                System.out.println("error: " + e.getMessage());
            } catch (DatosInvalidosException e) {
                System.out.println("error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("error inesperado: " + e.getMessage());
            }
        }
    }
}


