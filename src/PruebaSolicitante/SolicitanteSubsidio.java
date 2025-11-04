package PruebaSolicitante;

public class SolicitanteSubsidio {

    // Atributos privados
    private String nombreCompleto;
    private String cedula;
    private double ingresosMensuales;
    private int cantidadVehiculos;
    private boolean viveEnEcuador;

    // Constructor que recibe todos los atributos
    public SolicitanteSubsidio(String nombreCompleto, String cedula, double ingresosMensuales, int cantidadVehiculos, boolean viveEnEcuador) {
        this.nombreCompleto = nombreCompleto;
        this.cedula = cedula;
        setIngresosMensuales(ingresosMensuales);
        setCantidadVehiculos(cantidadVehiculos);
        this.viveEnEcuador = viveEnEcuador;
    }

    // Getters y Setters
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public double getIngresosMensuales() {
        return ingresosMensuales;
    }

    public void setIngresosMensuales(double ingresosMensuales) {
        if (ingresosMensuales >= 470) {
            this.ingresosMensuales = ingresosMensuales;
        } else {
            System.out.println("El ingreso no puede ser menor a $470. Se asigna 470 por defecto.");
            this.ingresosMensuales = 470;
        }
    }

    public int getCantidadVehiculos() {
        return cantidadVehiculos;
    }

    public void setCantidadVehiculos(int cantidadVehiculos) {
        if (cantidadVehiculos >= 0) {
            this.cantidadVehiculos = cantidadVehiculos;
        } else {
            System.out.println("Cantidad de vehículos no válida. Se asigna 0 por defecto.");
            this.cantidadVehiculos = 0;
        }
    }

    public boolean isViveEnEcuador() {
        return viveEnEcuador;
    }

    public void setViveEnEcuador(boolean viveEnEcuador) {
        this.viveEnEcuador = viveEnEcuador;
    }

    // Método para validar si recibe subsidio
    public boolean subsidioAprobado() {
        return ingresosMensuales <= 1200 && cantidadVehiculos <= 1 && viveEnEcuador;
    }

    // Método para mostrar si fue aprobado o no
    public void generarResultado() {
        if (subsidioAprobado()) {
            System.out.println("Subsidio APROBADO.");
        } else {
            System.out.println("Subsidio RECHAZADO.");
            if (ingresosMensuales > 1200) {
                System.out.println("- Ingreso mensual mayor a $1200.");
            }
            if (cantidadVehiculos > 1) {
                System.out.println("- Tiene más de un vehículo registrado.");
            }
            if (!viveEnEcuador) {
                System.out.println("- No reside en Ecuador.");
            }
        }
    }

    // Método estático: reglas del subsidio
    public static void mostrarReglasSubsidio() {
        System.out.println("REGLAS DEL SUBSIDIO:");
        System.out.println("- Ingresos mensuales ≤ $1200");
        System.out.println("- Máximo 1 vehículo registrado");
        System.out.println("- Debe vivir en Ecuador");
    }

    // Métodos sobrecargados: calcular consumo mensual
    public double calcularConsumoMensual() {
        double kmMensuales = 800;
        return kmMensuales / 40;
    }

    public double calcularConsumoMensual(double kmExtra) {
        double kmMensuales = 800 + kmExtra;
        return kmMensuales / 40;
    }

    // Mostrar datos
    @Override
    public String toString() {
        return "Nombre: " + nombreCompleto +
                "\nCédula: " + cedula +
                "\nIngresos Mensuales: " + ingresosMensuales +
                "\nCantidad de Vehículos: " + cantidadVehiculos +
                "\nVive en Ecuador: " + viveEnEcuador;
    }
}
