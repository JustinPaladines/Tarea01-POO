public class Dispositivo {
    private String marca;
    private String modelo;
    private double precio;

    public Dispositivo(String marca, String modelo, double precio) {
        setMarca(marca);
        setModelo(modelo);
        setPrecio(precio);
    }

    /* Getters y setters con validación */
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca == null || marca.trim().isEmpty()) {
            throw new DatoInvalidoException("La marca no puede estar vacía");
        }
        this.marca = marca.trim();
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = (modelo == null) ? "" : modelo.trim();
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio < 0) {
            throw new DatoInvalidoException("El precio no puede ser negativo");
        }
        this.precio = precio;
    }

    /* Método que se sobrescribe en las subclases */
    public String mostrarInfo() {
        return String.format("Dispositivo - Marca: %s, Modelo: %s, Precio: $%.2f",
                getMarca(), getModelo(), getPrecio());
    }

    @Override
    public String toString() {
        return mostrarInfo();
    }
}

/* Clase Laptop, hereda de Dispositivo */
class Laptop extends Dispositivo {
    private double tamanoPantalla; // pulgadas
    private boolean tieneGPU;

    public Laptop(String marca, String modelo, double precio, double tamanoPantalla, boolean tieneGPU) {
        super(marca, modelo, precio);
        setTamanoPantalla(tamanoPantalla);
        this.tieneGPU = tieneGPU;
    }

    public double getTamanoPantalla() {
        return tamanoPantalla;
    }

    public void setTamanoPantalla(double tamanoPantalla) {
        if (tamanoPantalla <= 0) {
            throw new DatoInvalidoException("El tamaño de pantalla debe ser mayor que 0");
        }
        this.tamanoPantalla = tamanoPantalla;
    }

    public boolean isTieneGPU() {
        return tieneGPU;
    }

    public void setTieneGPU(boolean tieneGPU) {
        this.tieneGPU = tieneGPU;
    }

    @Override
    public String mostrarInfo() {
        return String.format("Laptop - Marca: %s, Modelo: %s, Precio: $%.2f, Pantalla: %.1f\", GPU dedicada: %s",
                getMarca(), getModelo(), getPrecio(), tamanoPantalla, (tieneGPU ? "sí" : "no"));
    }
}

/* Clase Telefono, hereda de Dispositivo */
class Telefono extends Dispositivo {
    private int camaras;
    private boolean tiene5G;

    public Telefono(String marca, String modelo, double precio, int camaras, boolean tiene5G) {
        super(marca, modelo, precio);
        setCamaras(camaras);
        this.tiene5G = tiene5G;
    }

    public int getCamaras() {
        return camaras;
    }

    public void setCamaras(int camaras) {
        if (camaras < 0) {
            throw new DatoInvalidoException("La cantidad de cámaras no puede ser negativa");
        }
        this.camaras = camaras;
    }

    public boolean isTiene5G() {
        return tiene5G;
    }

    public void setTiene5G(boolean tiene5G) {
        this.tiene5G = tiene5G;
    }

    @Override
    public String mostrarInfo() {
        return String.format("Teléfono - Marca: %s, Modelo: %s, Precio: $%.2f, Cámaras: %d, 5G: %s",
                getMarca(), getModelo(), getPrecio(), camaras, (tiene5G ? "sí" : "no"));
    }
}