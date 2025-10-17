public class Vehiculo {
    public String marca;
    private String modelo;
    private int velocidadMaxima;
    private int codigoSeguridad;
    private String color;

    //modelo -> eget y set
    public void setModelo (String nuevoModelo){
        this.modelo=nuevoModelo;
    }
    public String getModelo(){
        return modelo;
    }

    public int getVelocidadMaxima(){
        return velocidadMaxima;
    }

    public void setCodigoSeguridad(int nuevoCodigo){
        this.codigoSeguridad=nuevoCodigo;
    }

    public void setColor(String nuevoColor){
        if (nuevoColor.equals("rojo") || nuevoColor.equals("azul") || nuevoColor.equals("blanco")){
            this.color=nuevoColor;
        } else {
            System.out.println("El color no es valido.");
        }
    }

    public String getColor(){
        return color;
    }
    //constructor para velocidadMaxima
    public Vehiculo(int velocidadMaxima){
        this.velocidadMaxima=velocidadMaxima;
    }

    public void mostrarInfo() {
        System.out.println("-- Información del vehículo --");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + getModelo());
        System.out.println("Velocidad Máxima: " + getVelocidadMaxima());
        System.out.println("Color: " + color);
    }


}
