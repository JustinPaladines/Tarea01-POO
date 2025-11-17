public class Estudiante {
    private String nombre;
    private int edad;

    public Estudiante(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public void setNombre(String nuevoNombre){
        if(nuevoNombre.trim().isEmpty()){
            throw new IllegalArgumentException("el nombre no puede estar vacio");
            // nombre vacio → no permite ingresar un nombre sin contenido
        }
        else{
            this.nombre = nuevoNombre;
        }
    }

    public String getNombre(){
        return nombre;
    }

    public void setEdad(int nuevaEdad){
        if(nuevaEdad < 0 || nuevaEdad > 120){
            throw new IllegalArgumentException("edad fuera del rango permitido");
            // edad fuera del rango → evita edades imposibles o invalidas
        }
        else{
            this.edad = nuevaEdad;
        }
    }

    public int getEdad(){
        return edad;
    }

    public void mostrarInformacion(){
        System.out.println("----- datos del estudiante -----");
        System.out.println("nombre: " + nombre);
        System.out.println("edad: " + edad);
        System.out.println("--------------------------------");
    }
}
