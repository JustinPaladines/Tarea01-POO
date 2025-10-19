package Juegos;

public class Juego {
    private String nombreJuego;
    protected int nivel;
    private int puntaje;

    public Juego(String nombreJuego, int nivel){
        this.nombreJuego = nombreJuego;
        this.nivel = nivel;
    }
    // acceder y modificar el atributo privado
    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
    public int getPuntaje() {
        return puntaje;
    }

    public void mostrarJuego() {
        System.out.println("----Juego----");
        System.out.println("Titulo: " + nombreJuego);
        System.out.println("Plataforma: " + nivel);
        System.out.println("Puntuacion: " + getPuntaje());
        System.out.println("------------------");
    }
}

//    public void setNombreJuego( String nuevoNombreJuego){
//        this.nombreJuego=nuevoNombreJuego;
//    }

