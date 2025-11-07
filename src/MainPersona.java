public class MainPersona {
    public static void main(String[] args){
        Persona persona1 = new Persona("175981289", "Justin Paladines", 20);
        Estudiante estudiante1 = new Estudiante("12889218", "Joe Rey", 22, "JR1221");
        Docente docente1 = new Docente("1892891289", "Jao Wing", 23, "Programación");
        persona1.imprimir();
        estudiante1.imprimirEstudiante();
        docente1.imprimirDocente();
    }
}
