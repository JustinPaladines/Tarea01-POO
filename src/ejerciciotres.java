import java.util.Scanner;
public class ejerciciotres {
    public static void main(String[] args){
        Scanner estudiante= new Scanner(System.in);

        System.out.println("Ingresa el nombre del estudiante ");
        String nombre = estudiante.nextLine();
        if (nombre.trim().isEmpty()){
            System.out.println("El campo no puede estar vacio.");
            return;
        }
        System.out.println("Altura: ");
        double altura= estudiante.nextDouble();
        if (altura<1.60){
            System.out.println("El estudiante no cumple los requisitos (altura >=1.60).");
        } else {
            System.out.println("Cumple");
        }
        System.out.println("Edad: ");
        int edad = estudiante.nextInt();
        if (edad < 18){
            System.out.println("El estudiante no cumple los requisitos (edad >=18).");
        }else {
            System.out.println("Cumple");
        }
        if (altura >= 1.60 && edad >= 18) {
            System.out.println("Nombre: "+nombre);
            System.out.println("Edad: "+ edad);
            System.out.println("Estatura: "+ altura);
            System.out.println("El estudiante cumple los requisitos");
        } else {
            System.out.println("El estudiante no cumple con los requisitos");
        }

    }
}
