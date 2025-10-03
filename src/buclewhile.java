import java.util.Scanner;

public class buclewhile {
    public static void main(String[] args) {
        Scanner bucle = new Scanner(System.in);
        String usuario = "JustinPaladines";
        String clave = "2005";
        while (true) {
            System.out.println("Ingrese su usuario: ");
            String newuser = bucle.nextLine();
            System.out.println("Ingrese su clave: ");
            String newclave = bucle.nextLine();
            if(newuser.equals(usuario)&&newclave.equals(clave)){
                System.out.println("Usuario existoso");
                return;
            } else {
                System.out.println("El usuario y contraseña no es valido");
            }
        }
    }


}

/*if(newuser.trim().isEmpty()){
        System.out.println("el usuario no puede estar vacio");
            return;*/
