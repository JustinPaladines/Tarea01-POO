import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

public class EmpresaMain {
    static Scanner sc = new Scanner(System.in);
    int opcion = 0;
    static ArrayList<TechEsfot> listaEmpleados = new ArrayList<>();

    public static void main(String[] args){
        while (true){
            System.out.println("---Menu Empleados--");
            System.out.println("1. Registrar Empleado tiempo Completo.");
            System.out.println("2. Registrar Empleado medio tiempo.");
            System.out.println("3. Mostrar Empleados Registrados.");
            System.out.println("4. Mostrar Estadisticas");
            System.out.println("5. Salir.");
            System.out.println("Ingrese una opcion: ");
            int opcion= sc.nextInt();
            try {
                switch (opcion){
                    case 1:
                        System.out.println("---Registro Empleados tiempo Completo---");
                        registrarEmpleadoCompleto();
                        break;
                    case 2:
                        System.out.println("---Registro Empleados medio Tiempo---");
                        registrarEmpleadoMedio();
                        break;
                    case 3:
                        System.out.println("--LISTA COMPLETA DE EMPLEADOS--");
                        mostrarEmpleados();
                        break;
                    case 4:
                        System.out.println("---Sueldos totales--");
                        sueldoMayor();
                        break;
                    case 5:
                        return;
                    default:
                        System.out.println("Numero de Campo Invalido.");
                        break;
                }

            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }

    }

    public static void registrarEmpleadoCompleto() throws DatoInvalidoException {
        sc.nextLine();
        System.out.println("Ingrese el codigo del Empleado: ");
        String codigoEmpleado = sc.nextLine();
        System.out.println("Ingrese el nombre del Empleado: ");
        String nombreEmpleado = sc.nextLine();
        System.out.println("Ingrese el Apellido del Empleado: ");
        String apellidoEmpleado = sc.nextLine();
        System.out.println("Ingresa el Cargo del Empleado: ");
        String cargoEmpleado = sc.nextLine();
        sc.nextLine();
        System.out.println("Ingrese el Sueldo base del Empleado: ");
        Double sueldoEmpleado = sc.nextDouble();
        sc.nextLine();
        System.out.println("Años en la empresa: ");
        int aniosEmpleado = sc.nextInt();

        TechEsfot empleado = new EmpleadoCompleto(codigoEmpleado, nombreEmpleado, apellidoEmpleado, cargoEmpleado, sueldoEmpleado, aniosEmpleado);
        listaEmpleados.add(empleado);

        System.out.println("Empleado Completo agregado.");

    }

    public static void registrarEmpleadoMedio() throws DatoInvalidoException{
        sc.nextLine();
        System.out.println("Ingrese el codigo del Empleado: ");
        String codigoEmpleadom = sc.nextLine();
        System.out.println("Ingrese el nombre del Empleado: ");
        String nombreEmpleadom = sc.nextLine();
        System.out.println("Ingrese el Apellido del Empleado: ");
        String apellidoEmpleadom = sc.nextLine();
        System.out.println("Ingresa el Cargo del Empleado: ");
        String cargoEmpleadom = sc.nextLine();
        System.out.println("Ingrese el Sueldo base del Empleado: ");
        Double sueldoEmpleadom = sc.nextDouble();
        System.out.println("Horas a trabajar: ");
        Double horasEmpleadom = sc.nextDouble();

        TechEsfot empleadomedio= new EmpleadoMedio(codigoEmpleadom, nombreEmpleadom, apellidoEmpleadom, cargoEmpleadom, sueldoEmpleadom, horasEmpleadom);
        listaEmpleados.add(empleadomedio);
        System.out.println("Empleado de Medio Tiempo Agregado.");
    }

    public static void CalcularSueldo(){
        boolean encontrado= false;
        mostrarEmpleados();
        System.out.println("Ingrese el Codigo del Empleado a buscar: ");
        String codigoCalcular = sc.nextLine();
        for (TechEsfot e: listaEmpleados){
            if (e.getCodigo().equalsIgnoreCase(codigoCalcular)){
                System.out.println("---Sueldo del Empleado---");
                System.out.println("Empleado : " + e.getCodigo());
                System.out.println("Sueldo: " + e.getSueldoBase());
                System.out.println("----------------------------");
            }
        }

    }
    public static void mostrarEmpleados(){
        if (listaEmpleados.isEmpty()){
            System.out.println("Lista de Empleados sin registros.");
        }
        for (TechEsfot e: listaEmpleados){
            e.mostrarInfo();
            //Polimorfismo
        }
    }



    public static void sueldoMayor(){
        if (listaEmpleados.isEmpty()){
            System.out.println("Lista de Empleados sin registros.");
        }
        for (TechEsfot e: listaEmpleados){
            e.calcularSueldo();

        }
    }



}


