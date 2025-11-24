public abstract class TechEsfot {
    private String codigo;
    private String nombre;
    private String apellido;
    private String cargo;
    private Double sueldoBase;


    //Constructor con Excepciones
    public TechEsfot(String codigo, String nombre, String apellido, String cargo, Double sueldoBase) throws DatoInvalidoException{
        if (codigo == null || codigo.isBlank()){
            throw new DatoInvalidoException("Error: campo codigo vacio.");
        }
        if (nombre == null || nombre.isBlank()){
            throw new DatoInvalidoException("Error: campo nombre vacio.");
        }
        if (apellido == null || apellido.isBlank()){
            throw new DatoInvalidoException("Error: campo apellido vacio.");
        }
        if (cargo == null || cargo.isBlank()){
            throw new DatoInvalidoException("Error: campo codigo vacio.");
        }
        if (sueldoBase==null || sueldoBase<=0){
            throw new DatoInvalidoException("Error: campo sueldoBase invalido.");
        }
        this.codigo = codigo;
        this.nombre=nombre;
        this.apellido=apellido;
        this.cargo=cargo;
        this.sueldoBase=sueldoBase;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCargo() {
        return cargo;
    }

    public Double getSueldoBase() {
        return sueldoBase;
    }

    public abstract void mostrarInfo();
    //metodo abstracto (debe ser usado obligatoriamente en las clases Hijas)

    public abstract void calcularSueldo();
}