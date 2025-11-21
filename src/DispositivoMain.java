import java.util.ArrayList;

public class DispositivoMain {
    public static void main(String[] args) {
        ArrayList<Dispositivo> lista = new ArrayList<>();

        // Se usan try-catch para capturar DatoInvalidoException al crear objetos inválidos
        try {
            Laptop l1 = new Laptop("Dell", "Inspiron 15", 650.0, 15.6, false);
            lista.add(l1);

            Laptop l2 = new Laptop("HP", "Pavilion", 1200.0, 14.0, true);
            lista.add(l2);

            Telefono t1 = new Telefono("Samsung", "A52", 300.0, 4, true);
            lista.add(t1);

            Telefono t2 = new Telefono("Xiaomi", "Redmi Note", 200.0, 3, false);
            lista.add(t2);

            // Ejemplo inválido: marca vacía -> lanza excepción y se captura abajo
            Laptop lInv = new Laptop("", "X100", 500.0, 13.3, false);
            lista.add(lInv);

        } catch (DatoInvalidoException e) {
            System.out.println("Error al crear un dispositivo: " + e.getMessage());
        }

        // Otro bloque try-catch para capturar fallos individuales
        try {
            // Precio negativo -> excepción
            Telefono tInv2 = new Telefono("MarcaX", "T-1", -50.0, 2, false);
            lista.add(tInv2);
        } catch (DatoInvalidoException e) {
            System.out.println("Error al crear teléfono: " + e.getMessage());
        }

        // Mostrar información usando polimorfismo: llamar mostrarInfo() en cada objeto
        System.out.println("\n--- Lista de dispositivos registrados ---");
        for (Dispositivo d : lista) {
            System.out.println(d.mostrarInfo()); // se ejecuta la versión de la clase real (Laptop/Telefono)
        }

        // También puedes mostrar con toString(), que llama a mostrarInfo()
        System.out.println("\n--- Mostrar usando toString() ---");
        for (Dispositivo d : lista) {
            System.out.println(d); // toString() usa mostrarInfo()
        }
    }
}
