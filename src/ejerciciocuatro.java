import java.util.Scanner;

public class ejerciciocuatro {
    public static void main(String [] args){
        Scanner equipo = new Scanner(System.in);
        while (true){
            System.out.println("Nombre: ");
            String nombre= equipo.nextLine();
            System.out.println("Edad: ");
            int edad= equipo.nextInt();
            equipo.nextLine();
            System.out.println("Altura: ");
            double altura = equipo.nextDouble();
            equipo.nextLine();
            //nextLine() elimina el salto de linea que queda en el sistema despues de leer un numero
            //Limpia el buffer de entrada para ingresar nuevos datos
            if (nombre.trim().isEmpty()){
                //trim() elimina espacios en blanco
                //isEmpty verfica si la cadena esta vacia
                System.out.println("Los campos no son validos");
            } else{
                if (edad>17 && altura>=1.60){
                    System.out.println(nombre);
                    System.out.println("Aceptado para el equipo.");
                    return;
                } else {
                    System.out.println("No cumple los requisitos.");
                }
            }
        }
    }
}
