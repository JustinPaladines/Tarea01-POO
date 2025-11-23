import java.util.ArrayList;

public class Evento {
    String codigo;
    String nombre;

    public Evento(String codigo, String nombre) throws DatosInvalidosException {
        if (codigo == null || codigo.trim().isEmpty()) {
            throw new DatosInvalidosException("Código vacío");
        }
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new DatosInvalidosException("Nombre vacío");
        }

        this.codigo = codigo;
        this.nombre = nombre;
    }
}

class Olimpiada {
    String nombre;
    String lugar;
    int anio;

    public Olimpiada(String nombre, String lugar, int anio) throws DatosInvalidosException {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new DatosInvalidosException("Nombre vacío");
        }
        if (lugar == null || lugar.trim().isEmpty()) {
            throw new DatosInvalidosException("Lugar vacío");
        }
        if (anio < 1900) {
            throw new DatosInvalidosException("Año inválido");
        }

        this.nombre = nombre;
        this.lugar = lugar;
        this.anio = anio;
    }
}
