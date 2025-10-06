
/*
EJERCICIO 2
Problema: Sistema de gestión de empleados en una empresa. Cada empleado tiene un nombre,
un cargo, un salario y una fecha de ingreso a la empresa.
Objetivo: Desarrollar una clase en Java llamada Empleado que tenga los atributos mencionados
anteriormente y un método para mostrar la información del empleado. Luego, crearemos tres
objetos de esta clase, cada uno representando un empleado diferente, y solicitaremos al usuario
que ingrese los detalles de cada empleado a través del teclado.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Empleados {
    String nombre;
    double salario;
    String fecha;

    public Empleados(String nombre, double salario, String fecha) {
        this.nombre = nombre;
        this.salario = salario;
        this.fecha = fecha;
    }

    void mostrarEmpleado() {
        System.out.println("--Información del empleado--");
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + salario);
        System.out.println("Fecha: " + fecha);
        System.out.println("-----------------------------");
    }

    public static void main(String[] args) {
        Scanner newEmpleado = new Scanner(System.in);
        ArrayList<Empleados> listaEmpleados = new ArrayList<>();

        System.out.println("Número de empleados a registrar:");
        int cantidad = newEmpleado.nextInt();
        newEmpleado.nextLine(); // Limpiar buffer

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese el nombre del empleado:");
            String nombre = newEmpleado.nextLine();

            System.out.println("Ingrese el salario del empleado:");
            double salario = newEmpleado.nextDouble();
            newEmpleado.nextLine(); // Limpiar buffer

            System.out.println("Ingrese la fecha de ingreso del empleado:");
            String fecha = newEmpleado.nextLine();

            Empleados empleado = new Empleados(nombre, salario, fecha);
            listaEmpleados.add(empleado);
        }

        System.out.println("--Mostrando todos los empleados--");
        for (Empleados empleadito : listaEmpleados) {
            empleadito.mostrarEmpleado();
        }
    }
}


