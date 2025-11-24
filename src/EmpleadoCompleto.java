public class EmpleadoCompleto extends TechEsfot{
    private int aniosEmpresa;

    public EmpleadoCompleto(String codigo, String nombre, String apellido, String cargo, Double sueldoBase, int aniosEmpresa) throws DatoInvalidoException {
        super(codigo, nombre, apellido, cargo, sueldoBase);
        if (aniosEmpresa>50 || aniosEmpresa<=0){
            throw new DatoInvalidoException("Error: campo aniosEmpresa invalido.");
        }
        this.aniosEmpresa = aniosEmpresa;
    }

    public int getAniosEmpresa() {
        return aniosEmpresa;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("---Información Empleado Completo---");
        System.out.println("Codigo: "+ getCodigo());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: "+ getApellido());
        System.out.println("Cargo: "+ getCargo());
        System.out.println("SueldoBase: "+ getSueldoBase());
        System.out.println("Años en Empresa: " + getAniosEmpresa());
        System.out.println("-----------------------------------");
    }

    @Override
    public void calcularSueldo() {
        System.out.println("Empleado: "+ getNombre());
        System.out.println("Sueldo Empleado Completo: " + getSueldoBase());
        System.out.println("-----------------------------");
    }
}
