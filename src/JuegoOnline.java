public class JuegoOnline {
    private int nivel = 1;

    public void setNivel(int nuevoNivel) {
        if (nuevoNivel >= 1) {
            nivel = nuevoNivel;
        } else {
            System.out.println("El nivel no puede ser negativo ni cero.");
        }
    }

    public int getNivel() {
        return nivel;
    }
}
