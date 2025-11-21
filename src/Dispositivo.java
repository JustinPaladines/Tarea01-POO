import java.util.ArrayList;

// excepción personalizada (runtime para hacerlo simple)
class DatoInvalidoException extends RuntimeException {
    public DatoInvalidoException(String msg) {
        super(msg);
    }
}

// dispositivo
public class Dispositivo {
    private String marca;
    private String modelo;
    private double precio;

    public Dispositivo(String marca, String modelo, double precio) {
        setMarca(marca);
        setModelo(modelo);
        setPrecio(precio);
    }

    // getters y setters (encapsulamiento + validación)
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
        if (modelo == null) modelo = "";
        this.modelo = modelo.trim();
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

    // método que será sobrescrito (polimorfismo)
    public String mostrarInfo() {
        return "Dispositivo - Marca: " + marca + ", Modelo: " + modelo + ", Precio: $" + precio;
    }

    @Override
    public String toString() {
        return mostrarInfo();
    }
}

// laptop
class Laptop extends Dispositivo {
    private double tamanoPantalla; // pulgadas
    private boolean tieneGPU;      // si tiene GPU dedicada

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
        return "Laptop - Marca: " + getMarca()
                + ", Modelo: " + getModelo()
                + ", Precio: $" + getPrecio()
                + ", Pantalla: " + tamanoPantalla + "''"
                + ", GPU dedicada: " + (tieneGPU ? "sí" : "no");
    }
}

// telefono
class Telefono extends Dispositivo {
    private int camaras;      // cantidad de cámaras
    private boolean tiene5G;  // 5G

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
            throw new DatoInvalidoException("Las cámaras no pueden ser negativas");
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
        return "Teléfono - Marca: " + getMarca()
                + ", Modelo: " + getModelo()
                + ", Precio: $" + getPrecio()
                + ", Cámaras: " + camaras
                + ", 5G: " + (tiene5G ? "sí" : "no");
    }
}
