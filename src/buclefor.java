import java.util.Scanner;

public class buclefor {
    public static void main(String[] args) {
        Scanner bucle = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num = bucle.nextInt();
        for (int i = 0; i < 10; i++) {
            System.out.println(num+ "*"+ i + "=" + num*i);
        }
    }
}
