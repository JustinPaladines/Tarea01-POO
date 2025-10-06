import java.util.Scanner;

/*
EJERCICIO 1
Problema: Jugadores de un equipo de fútbol. Cada jugador tiene un nombre, una posición en el
campo, una edad y un número de camiseta.
Objetivo: Desarrollar una clase en Java llamada Jugador que tenga los atributos y un método
para mostrar la información del jugador. Luego, crear tres objetos de esta clase, cada uno
representando un jugador diferente.
Realizar EL REGISTRO de los atributos con datos quemados y utilizando Scanner combinar
* */

public class Jugador {

    //Atributos
    int numero;
    String nombre;
    String posicion;
    int edad;

    //Constructor
    public Jugador (int numero, String nombre, String posicion, int edad) {
        this.numero = numero;
        this.nombre = nombre;
        this.posicion = posicion;
        this.edad = edad;
    }
    void mostrarJugador() {
        System.out.println("Jugador: " + nombre + " - "+ posicion + " - camisa numero "+ numero + " - "+ edad+ " años de edad.");
    }
    public static void main (String [] args) {

        Scanner newJugador = new Scanner(System.in);
        System.out.println("Ingrese el numero del jugador: ");
        int numero = newJugador.nextInt();
        newJugador.nextLine();
        System.out.println("Ingrese el nombre del jugador: ");
        String nombre = newJugador.nextLine();
        System.out.println("Ingrese el posicion del jugador: ");
        String posicion = newJugador.nextLine();
        System.out.println("Ingrese el edad del jugador: ");
        int edad = newJugador.nextInt();
        newJugador.nextLine();

        Jugador jugadorcito1 = new Jugador(7, "Cristiano", "Delantero", 40);
        Jugador jugadorcito2 = new Jugador(11, "Neymar", "Volante", 33);
        Jugador jugadorcito3 = new Jugador(1, "Justin", "Defensa", 19);
        Jugador jugadorcito4 = new Jugador(numero, nombre, posicion, edad);

        jugadorcito1.mostrarJugador();
        jugadorcito2.mostrarJugador();
        jugadorcito3.mostrarJugador();
        jugadorcito4.mostrarJugador();
    }
}
