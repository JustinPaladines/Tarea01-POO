public class Estudiante extends Persona {
    //String cedula;
    String codigo;
    //String nombre;
    //int edad;
    // no se colocan, ya que al heredar se pasan los atributos
    public Estudiante (String cedula, String nombre, int edad, String codigo){
        super(cedula, nombre, edad); // se usa super para que la clase reconozca que los atributos son heredados
        this.codigo=codigo;
    }

    public void imprimirEstudiante(){
        System.out.println("---Datos de Estudiante---");
        super.imprimir();
        System.out.println("Codigo: "+ codigo);
    }
}
