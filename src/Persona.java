public class Persona {
    private String nombre;
    private int edad;
    private String profesion;

    //set - modificar
    public void setNombre(String nuevoNombre){
        if(nuevoNombre == null || nuevoNombre.trim().isEmpty()){
            System.out.println("El nombre no puede estar vacio.");
        } else {
            this.nombre =nuevoNombre;
        }
    }
    public void setEdad(int nuevaEdad){
        if(nuevaEdad <0){
            System.out.println("El numero debe ser positivo.");
        } else {
            this.edad=nuevaEdad;
        }
    }
    public void setProfesion(String nuevaProfesion){
        this.profesion=nuevaProfesion;
    }

    //get para obtener los atributos

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getProfesion() {
        return profesion;
    }
}
