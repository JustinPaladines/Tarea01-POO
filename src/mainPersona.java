public class mainPersona {
    public static void main (String[] args){
        Persona empleado1 = new Persona();
        System.out.println("--valores incorrectos--");
        empleado1.setNombre("");
        empleado1.setEdad(-1);

        System.out.println("--valores correctos--");
        empleado1.setNombre("Justin");
        empleado1.setEdad(19);
        empleado1.setProfesion("Desarrollador");

        System.out.println("--Resultados--");
        System.out.println("Nombre: "+ empleado1.getNombre());
        System.out.println("Edad: "+ empleado1.getEdad());
        System.out.println("Profesión: "+ empleado1.getProfesion());

    }
}
