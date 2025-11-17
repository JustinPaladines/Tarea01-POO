import java.util.Scanner;

public class EstudianteMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Estudiante obj = new Estudiante("josselyn", 20);

        try {
            System.out.println("ingrese el nombre del estudiante: ");
            obj.setNombre(sc.nextLine());

            System.out.println("ingrese la edad del estudiante: ");
            obj.setEdad(sc.nextInt());
            sc.nextLine();

            obj.mostrarInformacion();

        } catch (IllegalArgumentException ex) {
            System.out.println("error: " + ex.getMessage());
        }
    }
}
