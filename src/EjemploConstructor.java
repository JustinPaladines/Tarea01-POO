
public class EjemploConstructor {
    static class Estudiante {
        String nombre;
        int edad;

        // Constructor
        public Estudiante(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

        //Metódo
        void saludar() {
            System.out.println("Hola, mi nombre es " + nombre + " y tengo " + edad + " años.");
        }
    }

    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Justin", 20);
        //Se ejecuta el constructor automáticamente y asigna los valores
        estudiante1.saludar();
    }
}

