import java.util.Scanner;
public class equals {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        String usuario= "JustinPaladines";
        String clave = "2005";
        System.out.println("Ingrese su usuario: ");
        String newuser = user.nextLine();
        if(newuser.trim().isEmpty()){
            System.out.println("el usuario no puede estar vacio");
            return;
        }
        System.out.println("Ingrese su clave: ");
        String newclave = user.nextLine();
        if (newuser.equals(usuario) && newclave.equals(clave)) {
            System.out.println("Usuario existoso");
        } else {
            System.out.println("El usuario y contraseña no es valido");
        }
    }
}