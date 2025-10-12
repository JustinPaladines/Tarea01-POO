/*
Descripción:
•	Crear la clase Libro con atributos: titulo, autor, anioPublicacion.
•	Crear un constructor.
•	Crear un método mostrarInformacion() que imprima los datos del libro.
•	Crear 2 objetos de tipo Libro y mostrar su información.

*/
public class Libro {
    String Titulo;
    String autor;
    int anioPublicacion;

    // Constructor
    public Libro(String Titulo, String autor, int anioPublicacion) {
        this.Titulo = Titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }
    //Metódo
    void infolibro() {
        System.out.println("--Información Libro--");
        System.out.println("Libro: "+ Titulo);
        System.out.println("Autor: "+ autor);
        System.out.println("Año de publicación: "+ anioPublicacion);
    }
    public static void main(String[] args) {
        Libro libro1 = new Libro("La metamorfosis", "Franz Kafka", 1915 );
        Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967);

        libro1.infolibro();
        libro2.infolibro();
    }
}
