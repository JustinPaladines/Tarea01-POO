public class EmpleadoMedio extends TechEsfot{
    private double horas;

    public EmpleadoMedio(String codigo, String nombre, String apellido, String cargo, Double sueldoBase, double horas) throws DatoInvalidoException {
        super(codigo, nombre, apellido, cargo, sueldoBase);
        if (horas<=0){
            throw new DatoInvalidoException("Error: No se permiten horas negativas.");
        }
        this.horas = horas;
    }

    public Double getHoras() {
        return horas;
    }




    @Override
    public void mostrarInfo() {
        System.out.println("---Información Empleado de Medio tiempo---");
        System.out.println("Codigo: "+ getCodigo());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: "+ getApellido());
        System.out.println("Cargo: "+ getCargo());
        System.out.println("SueldoBase: "+ getSueldoBase());
        System.out.println("Horas: " + getHoras());
        System.out.println("------------------------------------------");
    }

    @Override
    public void calcularSueldo() {
        System.out.println("Empleado: "+ getNombre());
        Double sueldoTotal = getSueldoBase()*getHoras();
        System.out.println("Sueldo Empleado Medio Tiempo: "+ sueldoTotal);
        System.out.println("-----------------------------");
    }
}
