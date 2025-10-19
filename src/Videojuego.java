public class Videojuego {
    private String titulo;
    private String plataforma;
    private double puntuacion;

    public Videojuego(String titulo, String plataforma, double puntuacion) {
        setTitulo(titulo);
        setPlataforma(plataforma);
        setPuntuacion(puntuacion);
    }

    public void setTitulo(String nuevoTitulo) {
        this.titulo = nuevoTitulo;
    }
    public String getTitulo() {
        return titulo;
    }

    public void setPlataforma(String nuevoPlataforma) {
        this.plataforma= nuevoPlataforma;
    }
    public String getPlataforma() {
        return plataforma;
    }

    public void setPuntuacion(double nuevoPuntacion) {
        this.puntuacion = nuevoPuntacion;
    }
    public double getPuntuacion() {
        return puntuacion;
    }

    public void mostrar() {
        System.out.println("----Videojuego----");
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Plataforma: " + getPlataforma());
        System.out.println("Puntuacion: " + getPuntuacion());
        System.out.println("------------------");
    }
}
