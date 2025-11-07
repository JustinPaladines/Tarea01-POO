public class Docente extends Persona {
    String materias;

    public Docente(String cedula, String nombre, int edad, String materias) {
        super(cedula, nombre, edad);
        this.materias = materias;
    }

    public void imprimirDocente() {
        System.out.println("---Datos del Docente---");
        super.imprimir();
        System.out.println("Materias: " + materias);
    }
}
