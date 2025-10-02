import java.util.Scanner;
public class ejerciciouno {
    public static void main(String[] args){
       Scanner valor= new Scanner(System.in);

       System.out.println("Ingresa el nombre del producto: ");
       String nombre = valor.nextLine();

       System.out.println("Precio del producto: ");
       double precio = valor.nextDouble();

       System.out.println("Cantidad total del Producto: ");
       int cantidad = valor.nextInt();

       double total = precio*cantidad;
        System.out.println("Producto: "+nombre);
        System.out.println("Precio: "+ precio);
       System.out.println("El valor total del stock de "+ nombre+" es de $"+ total+" dolares");

    }
}