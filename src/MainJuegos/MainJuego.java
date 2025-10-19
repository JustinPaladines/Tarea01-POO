package MainJuegos;

import Juegos.Juego;

public class MainJuego {
    public static void main (String[] args){

        Juego juego1 = new Juego("Valorant", 33);
        juego1.setPuntaje(7777);

        System.out.println("Puntaje: " + juego1.getPuntaje());
        juego1.mostrarJuego();

    }
}