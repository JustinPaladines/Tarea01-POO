import java.util.Scanner;
public class ejerciciodos {
    public static void main(String[] args){
        Scanner datos= new Scanner(System.in);

        System.out.println("Numero de cedula: ");
        String cedula = datos.nextLine();
        if (cedula.trim().isEmpty()){//trim() sirve para no tomar en cuenta espacios, y Empty verificar si esta vacio
            System.out.println("El campo no puede estar vacio.");
            return;
        }
        System.out.println("Nombre Completo: ");
        String nombre = datos.nextLine();
        if (nombre.trim().isEmpty()){
            System.out.println("El campo no puede estar vacio.");
            return;
        }
        System.out.println("Numero: ");
        String numero= datos.nextLine();
        if (numero.trim().isEmpty()){
            System.out.println("El campo no puede estar vacio.");
            return;
        }
        System.out.println("Dirección: ");
        String direccion= datos.nextLine();
        if (direccion.trim().isEmpty()){
            System.out.println("El campo no puede estar vacio.");
            return;
        }
        System.out.println("--Registro de Cliente--");
        System.out.println("Nombre: "+nombre);
        System.out.println("Cedula: "+cedula);
        System.out.println("Numero: "+numero);
        System.out.println("Dirección: "+direccion);

    }
}