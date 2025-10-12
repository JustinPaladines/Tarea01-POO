/*
1.	Explica con tus propias palabras qué es un constructor.
Un constructor es un método que se ejecuta automáticamente cuando se crea un nuevo objeto de una clase.
2.	Crea una clase llamada Producto con tres atributos: nombre, precio, cantidad.
3.	Implementa los tres tipos de constructores: uno con parámetros, uno con valores fijos, y uno vacío.
Constructos con parámetros: este tipo de constructor acepta parámetros y permite inicializar atributos con valores proporcionados al crear un objeto.
Constructor predeterminado: no acepta parámetros, si no se define un constructor en una clase, java proporciona automáticamente uno predeterminado.
Constructor vacío: no se inicializa nada, normalmente usado para asignar valores después
4.	Crea tres objetos usando cada tipo de constructor.
5.	Muestra los datos de cada objeto en consola.
*/

public class Producto {
    String nombre;
    double precio;
    int cantidad;

    //Constructor con parámetros
    public Producto(String nombre, double precio, int cantidad){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    //Constructor con valores fijos
    public Producto(){
        this.nombre= "Impresora";
        this.precio = 299.99;
        this.cantidad = 100;
    }
    //Constructor vacio
    public Producto (boolean vacio){
    }

    public void mostrarinfo(){
        System.out.println("--Información Producto--");
        System.out.println("Producto: "+ nombre);
        System.out.println("Precio: "+ precio);
        System.out.println("Cantidad: "+ cantidad);
    }

    public static void main (String[] args){
        Producto producto1 = new Producto("Computadora", 1000, 200);
        Producto producto2 = new Producto();
        Producto producto3 = new Producto(true);
        producto3.nombre = "Audifonos";
        producto3.precio = 20;
        producto3.cantidad = 100;

        producto1.mostrarinfo();
        producto2.mostrarinfo();
        producto3.mostrarinfo();
    }
}

