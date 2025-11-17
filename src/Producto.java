public abstract class Producto {
    private String codigo;
    private String nombre;
    private double precio;

    public Producto(String codigo, String nombre, double precio){
        if (codigo == null || codigo.trim().isEmpty()) {
            throw new IllegalArgumentException("el codigo no puede estar vacio");
        }
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("el nombre no puede estar vacio");
        }
        if (precio <= 0) {
            throw new IllegalArgumentException("el precio no puede ser negativo o cero");
        }

        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public void setcodigo(String nuevoCodigo){
        if (nuevoCodigo.trim().isEmpty()){
            throw new IllegalArgumentException("el campo no puede estar vacio");
        } else {
            this.codigo = nuevoCodigo;
            System.out.println("codigo registrado.");
        }
    }

    public String getCodigo(){
        return codigo;
    }

    public void setNombre(String nuevoNombre){
        if (nuevoNombre.trim().isEmpty()){
            throw new IllegalArgumentException("el campo no puede estar vacio");
        } else {
            this.nombre = nuevoNombre;
            System.out.println("nombre registrado.");
        }
    }

    public String getNombre(){
        return nombre;
    }

    public void setPrecio(Double nuevoPrecio){
        if (nuevoPrecio <= 0){
            throw new IllegalArgumentException("el precio no puede ser negativo o cero");
        } else {
            this.precio = nuevoPrecio;
            System.out.println("precio registrado.");
        }
    }

    public Double getPrecio(){
        return precio;
    }

    public abstract double total();

    public void mostrarInformacion(){
        System.out.println("----- producto -----");
        System.out.println("codigo: " + codigo);
        System.out.println("nombre: " + nombre);
        System.out.println("precio base: " + precio);
        System.out.println("--------------------");
    }

}

class ProductoNacional extends Producto {
    String pais;

    public ProductoNacional(String codigo, String nombre, double precio, String pais){
        super(codigo, nombre, precio);
        this.pais = pais;
    }

    @Override
    public double total() {
        double totalConIva = getPrecio() + (getPrecio() * 0.12);
        return totalConIva;
    }
}

class ProductoImportado extends Producto {
    String pais;

    public ProductoImportado(String codigo, String nombre, double precio, String pais){
        super(codigo, nombre, precio);
        this.pais = pais;
    }

    @Override
    public double total() {
        double totalConImpuesto = getPrecio() + (getPrecio() * 0.05);
        return totalConImpuesto;
    }
}
