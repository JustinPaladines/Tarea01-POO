public class Producto {
    //public double precio;
    private double precio;
    //String nombre;
    private String nombre;

    /*void setPrecio(double p) {
        precio = p;
    }*/
    public void setPrecio (double nuevoPrecio){
        if (precio<0){
            System.out.println("El precio debe ser mayor a 0");
        } else {
            this.precio=nuevoPrecio;
        }
    }
    public void setNombre(String nuevoNombre){
        this.nombre=nuevoNombre;
    }
    /*String getnombre() {
        return nombre;
    }*/
    public String getNombre(){
        return nombre;
    }
    public double getPrecio(){
        return precio;
    }

    public void mostrarInfo(){
        System.out.println("--Información Producto--");
        System.out.println("Nombre: "+getNombre());
        System.out.println("Precio: "+ getPrecio());
    }
}

