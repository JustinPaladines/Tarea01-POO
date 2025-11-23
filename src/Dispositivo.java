public abstract class Dispositivo {
    protected String marca;
    protected String modelo;
    protected double precio;

    public Dispositivo(String marca, String modelo, double precio) throws DatoInvalidoException {
        if (marca == null || marca.trim().isEmpty()) {
            throw new DatoInvalidoException("La marca no puede estar vacía.");
        }
        if (precio < 0) {
            throw new DatoInvalidoException("El precio no puede ser negativo.");
        }
        if (modelo == null || modelo.trim().isEmpty()) {
            throw new DatoInvalidoException("El modelo no puede estar vacío.");
        }

        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public double getPrecio() { return precio; }

    public abstract void mostrarInfo();
}

class Laptop extends Dispositivo {
    private int ram;

    public Laptop(String marca, String modelo, double precio, int ram) throws DatoInvalidoException {
        super(marca, modelo, precio);

        if (ram <= 0) {
            throw new DatoInvalidoException("La RAM debe ser mayor a 0.");
        }
        this.ram = ram;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("=== LAPTOP ===");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Precio: " + precio);
        System.out.println("RAM: " + ram + "GB");
    }
}

class Telefono extends Dispositivo {
    private int camara;

    public Telefono(String marca, String modelo, double precio, int camara) throws DatoInvalidoException {
        super(marca, modelo, precio);

        if (camara < 0) {
            throw new DatoInvalidoException("La cámara no puede tener Megapíxeles negativos.");
        }

        this.camara = camara;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("=== TELEFONO ===");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Precio: " + precio);
        System.out.println("Cámara: " + camara + "MP");
    }
}
