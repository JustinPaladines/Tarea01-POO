public class Persona { //importante, la clase debe ir con Mayuscula

        //ATRIBUTOS
        int cedula;
        String nombre;
        int edad;
        String correo;

        /*METODO CONSTRUCTOR
        inicializar las variables, llamas al objeto y le asignas atributos iniciales (por defecto)
        Si no se asigna un metodo constructor a una clase, el propio Java crea uno por defecto,
        es importante hacer un metodo constructor - siempre tiene el mismo nombre de la clase*/

        public Persona(int cedula, String nombre, int edad, String correo) { //dentro del parentesis se colocan parametros

            this.cedula = cedula;
            this.nombre = nombre;
            this.edad = edad;
            this.correo = correo;

            /*this es una referencia al objeto actual que está ejecutando el código.
            Sirve para distinguir entre los atributos del objeto*/
        }

        //segundo objeto



        void imprimir() {
            System.out.println("hola " + nombre+" con "+ edad+ " años de edad, tu correo es " + correo+" (cedula: "+cedula+") jeje");
        }

        public static void main(String[] args) {
            Persona objeto1 = new Persona(278121, "Agapito", 20, "agapitoutu@gmail.com");
            objeto1.imprimir();
            Persona objeto2= new Persona(89287912, "Pacheco", 17, "pachecocarafloja@gmail.com");
            objeto2.imprimir();
        }
    }