
public abstract class Vehiculo{
    private String placa;
    private String marca;
    private int anio;
    private String propietario;

    public Vehiculo (String placa, String marca, int anio, String propietario){
        this.placa= placa;
        this.marca = marca;
        this.anio = anio;
        this.propietario= propietario;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getAnio() {
        return anio;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public abstract double calcularValorMatricula();

}

class Auto extends Vehiculo {
    private String modelo;
    public Auto(String placa, String marca, int anio, String propietario, String modelo) {
        super(placa, marca, anio, propietario);
        this.modelo= modelo;
    }

    @Override
    public double calcularValorMatricula() {
        // Fórmula sencilla: 200 + 5 por cada año después de 2000
        int extra = Math.max(0, getAnio() - 2000);
        return 200 + extra * 5;
    }
}

class Moto extends Vehiculo {
    private int KmRecorridos;

    public Moto(String placa, String marca, int anio, String propietario, int kmRecorridos) {
        super(placa, marca, anio, propietario);
        this.KmRecorridos=kmRecorridos;

    }

    public int getKmRecorridos() {
        return KmRecorridos;
    }

    @Override
    public double calcularValorMatricula() {
        // Fórmula sencilla: 200 + 5 por cada año después de 2000
        int km = Math.max(0, getKmRecorridos()-800);
        return 100 + km * 5;
    }
}

class Camion extends Vehiculo {
    private double peso;

    public Camion(String placa, String marca, int anio, String propietario, double peso) {
        super(placa, marca, anio, propietario);
        this.peso= peso;

    }

    public double getPeso() {
        return peso;
    }

    @Override
    public double calcularValorMatricula() {
        double base = 500;
        double CantidadPeso = getPeso() * 50;
        return base+CantidadPeso;
    }
}




