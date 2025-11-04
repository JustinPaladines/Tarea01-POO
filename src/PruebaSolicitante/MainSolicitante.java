package PruebaSolicitante;

import java.util.Scanner;

public class MainSolicitante {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese nombre completo: ");
        String nombre = input.nextLine();

        System.out.print("Ingrese número de cédula: ");
        String cedula = input.nextLine();

        System.out.print("Ingrese ingresos mensuales: ");
        double ingresos = input.nextDouble();

        System.out.print("Ingrese cantidad de vehículos: ");
        int vehiculos = input.nextInt();

        System.out.print("¿Vive en Ecuador? (true/false): ");
        boolean viveEnEcuador = input.nextBoolean();

        SolicitanteSubsidio solicitante = new SolicitanteSubsidio(nombre, cedula, ingresos, vehiculos, viveEnEcuador);

        System.out.println("\n--- DATOS DEL SOLICITANTE ---");
        System.out.println(solicitante);

        System.out.println("\n--- RESULTADO ---");
        solicitante.generarResultado();

        System.out.println("\n--- CONSUMO DE COMBUSTIBLE ---");
        double consumoNormal = solicitante.calcularConsumoMensual();
        System.out.println("Consumo mensual estimado: " + consumoNormal + " galones.");

        System.out.print("Ingrese kilómetros adicionales: ");
        double kmExtra = input.nextDouble();

        double consumoConExtra = solicitante.calcularConsumoMensual(kmExtra);
        System.out.println("Consumo con kilómetros adicionales: " + consumoConExtra + " galones.");
    }
}
