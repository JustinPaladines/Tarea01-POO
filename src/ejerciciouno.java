import java.util.Scanner;
public class ejerciciouno {
    public static void main(String[] args){
        Scanner estudiante= new Scanner(System.in);

        System.out.println("Nombre del estudiante: ");
        String nombre= estudiante.nextLine();
        System.out.println("Ingresa la primera nota: ");
        double nota1 = estudiante.nextDouble();
        System.out.println("Ingresa la segunda nota: ");
        double nota2 = estudiante.nextDouble();
        System.out.println("Ingresa la tercera nota: ");
        double nota3= estudiante.nextDouble();

        double total= nota1+nota2+nota3;
        double resultado = total/3;
        double promedio = Math.floor(resultado * 100.0) / 100.0;
        //Math.floor redondea el numero hacia abajo, da resultado con 2 decimales
        System.out.println("El promedio del estudiante " + nombre + " es de "+ promedio);
        if (promedio>=7){
            System.out.println("El estudiante aprueba");
        } else {
            System.out.println("El estudiante no aprueba");

        }
    }
}