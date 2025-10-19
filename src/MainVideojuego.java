public class MainVideojuego {
    public static void main(String[] args) {

        Videojuego juego1 = new Videojuego("Valorant", "Steam", 9.5);

        juego1.mostrar();

        // Cambiar valores
        juego1.setTitulo("Fallguys");
        juego1.setPlataforma("Epic games");
        juego1.setPuntuacion(7.7);

        // mostrar datos actualizados
        System.out.println("--datos modificados--");
        juego1.mostrar();
    }
}
