
import java.util.Scanner;
public class ejerciciodos {
    public static void main(String [] args){
        Scanner numeros = new Scanner(System.in);
        System.out.println("--Números Pares--");
        System.out.println("Numeros a ingresar: ");
        int numero = numeros.nextInt();
        int pares = 0;
        for (int i= 1; i<=numero; i++){
            System.out.println("Ingrese el numero "+ i);
            int num= numeros.nextInt();
            if (num %2==0){ //corrobora si el numero es par
                pares++;
            }
        }
        System.out.println("Cantidad de numeros pares: "+ pares);
    }
}
