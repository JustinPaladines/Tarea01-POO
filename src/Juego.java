public abstract class Juego{
    protected String nombre;
    protected double precio;

    public Juego(String nombre,Double precio)throws DatoInvalidoExcception{
        if (nombre == null || nombre.trim().isEmpty()){
            throw new DatoInvalidoExcception("No se permiten datos vacios.");
        }
        if (precio<0){
            throw new DatoInvalidoExcception("No se aceptan valores menores a 0");
        }
        this.nombre = nombre;
        this.precio=precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public abstract void Mostrarinfo();
}

class MarioBros extends Juego{
    private int vidas;

    public MarioBros(String nombre,Double precio,int vidas) throws DatoInvalidoExcception {
        super(nombre, precio);

        if (vidas<=0){
            throw new DatoInvalidoExcception("No se permiten vidas negativas");
        }

        this.vidas=vidas;
    }

    @Override
    public void Mostrarinfo(){
        System.out.println("=== CARRERAS ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Vidas: " + vidas);
    }
}

class CarreraVehiculos extends Juego{
    int vehiculos;

    public CarreraVehiculos(String nombre,Double precio, int vehiculos) throws DatoInvalidoExcception{
        super(nombre, precio);

        if (vehiculos<0) {
            throw new DatoInvalidoExcception("No se permiten menos de 1 vehiculo");
        }
        this.vehiculos=vehiculos;
    }

    @Override
    public void Mostrarinfo() {
        System.out.println("=== CARRERAS ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Vehiculos: " + vehiculos);
    }
}

