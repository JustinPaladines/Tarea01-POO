
public class Persona {
    String cedula;
    String nombre;
    int edad;


    public Persona(String cedula, String nombre, int edad) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
    }

    public void imprimir() {
        System.out.println("Datos Personales");
        System.out.println("La cedula es: " + cedula);
        System.out.println("El nombre es: " + nombre);
        System.out.println("La edad es: " + cedula);
    }
}




