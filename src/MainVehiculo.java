import java.util.Scanner;

public class MainVehiculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Auto
        System.out.println("Ingrese datos del Auto:");
        System.out.print("Placa: ");
        String placaAuto = sc.nextLine();
        System.out.print("Marca: ");
        String marcaAuto = sc.nextLine();
        System.out.print("Año: ");
        int anioAuto = sc.nextInt(); sc.nextLine();
        System.out.print("Propietario: ");
        String propietarioAuto = sc.nextLine();
        System.out.print("Modelo: ");
        String modeloAuto = sc.nextLine();

        Vehiculo auto = new Auto(placaAuto, marcaAuto, anioAuto, propietarioAuto, modeloAuto);

        // Moto
        System.out.println("\nIngrese datos de la Moto:");
        System.out.print("Placa: ");
        String placaMoto = sc.nextLine();
        System.out.print("Marca: ");
        String marcaMoto = sc.nextLine();
        System.out.print("Año: ");
        int anioMoto = sc.nextInt(); sc.nextLine();
        System.out.print("Propietario: ");
        String propietarioMoto = sc.nextLine();
        System.out.print("Km Recorridos: ");
        int kmMoto = sc.nextInt(); sc.nextLine();

        Vehiculo moto = new Moto(placaMoto, marcaMoto, anioMoto, propietarioMoto, kmMoto);


        System.out.println("\nIngrese datos del Camión:");
        System.out.print("Placa: ");
        String placaCamion = sc.nextLine();
        System.out.print("Marca: ");
        String marcaCamion = sc.nextLine();
        System.out.print("Año: ");
        int anioCamion = sc.nextInt(); sc.nextLine();
        System.out.print("Propietario: ");
        String propietarioCamion = sc.nextLine();
        System.out.print("Peso: ");
        double pesoCamion = sc.nextDouble(); sc.nextLine();

        Vehiculo camion = new Camion(placaCamion, marcaCamion, anioCamion, propietarioCamion, pesoCamion);

        System.out.println("\n--- Valores de Matrícula ---");
        System.out.println("Auto: $" + auto.calcularValorMatricula());
        System.out.println("Moto: $" + moto.calcularValorMatricula());
        System.out.println("Camión: $" + camion.calcularValorMatricula());
    }
}
