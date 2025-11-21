import java.util.ArrayList;

// juego
abstract class Juego {
    private String id;
    private String nombre;
    private String desarrollador;
    private int anio;

    public Juego(String id, String nombre, String desarrollador, int anio) throws DatosInvalidosException {
        if (id == null || id.trim().isEmpty()) throw new DatosInvalidosException("id no puede estar vacío");
        if (nombre == null || nombre.trim().isEmpty()) throw new DatosInvalidosException("nombre no puede estar vacío");
        if (desarrollador == null || desarrollador.trim().isEmpty()) throw new DatosInvalidosException("desarrollador no puede estar vacío");
        if (anio <= 1970) throw new DatosInvalidosException("año inválido (debe ser > 1970)");

        this.id = id.trim();
        this.nombre = nombre.trim();
        this.desarrollador = desarrollador.trim();
        this.anio = anio;
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getDesarrollador() { return desarrollador; }
    public int getAnio() { return anio; }

    // método abstracto que cada tipo implementa
    public abstract String tipoYDetalles();

    @Override
    public String toString() {
        return "[" + id + "] " + nombre + " - " + tipoYDetalles();
    }
}

// mario
class MarioBros extends Juego {
    private int niveles;
    private boolean multijugador;

    public MarioBros(String id, String nombre, String desarrollador, int anio, int niveles, boolean multijugador) throws DatosInvalidosException {
        super(id, nombre, desarrollador, anio);
        if (niveles <= 0) throw new DatosInvalidosException("niveles debe ser mayor que 0");
        this.niveles = niveles;
        this.multijugador = multijugador;
    }

    @Override
    public String tipoYDetalles() {
        return "MarioBros (niveles: " + niveles + ", multijugador: " + (multijugador ? "sí" : "no") + ")";
    }
}

// carrera
class CarreraVehiculos extends Juego {
    private int cantidadVehiculos;
    private boolean pistasRealistas;

    public CarreraVehiculos(String id, String nombre, String desarrollador, int anio, int cantidadVehiculos, boolean pistasRealistas) throws DatosInvalidosException {
        super(id, nombre, desarrollador, anio);
        if (cantidadVehiculos <= 0) throw new DatosInvalidosException("cantidad de vehículos debe ser mayor que 0");
        this.cantidadVehiculos = cantidadVehiculos;
        this.pistasRealistas = pistasRealistas;
    }

    @Override
    public String tipoYDetalles() {
        return "CarreraVehiculos (vehículos: " + cantidadVehiculos + ", pistas realistas: " + (pistasRealistas ? "sí" : "no") + ")";
    }
}

// excepción personalizada

// gestor simple que mantiene la lista
class GestorJuegos {
    private ArrayList<Juego> juegos;

    public GestorJuegos() {
        juegos = new ArrayList<>();
    }

    // agrega validando nulos y id repetido
    public void agregar(Juego j) throws DatosInvalidosException {
        if (j == null) throw new DatosInvalidosException("juego inválido (nulo)");
        for (Juego ex : juegos) {
            if (ex.getId().equalsIgnoreCase(j.getId())) {
                throw new DatosInvalidosException("id repetido: " + j.getId());
            }
        }
        juegos.add(j);
    }

    public ArrayList<Juego> getTodos() {
        return juegos;
    }

    // buscar por nombre (contiene, no exacto)
    public ArrayList<Juego> buscarPorNombre(String nombre) {
        ArrayList<Juego> res = new ArrayList<>();
        if (nombre == null || nombre.trim().isEmpty()) return res;
        String b = nombre.trim().toLowerCase();
        for (Juego j : juegos) {
            if (j.getNombre().toLowerCase().contains(b)) res.add(j);
        }
        return res;
    }

    // filtrar por tipo (clase)
    public ArrayList<Juego> filtrarPorTipo(Class<?> tipo) {
        ArrayList<Juego> res = new ArrayList<>();
        for (Juego j : juegos) {
            if (tipo.isInstance(j)) res.add(j);
        }
        return res;
    }

    // mostrar lista simple
    public void mostrarLista(ArrayList<Juego> lista) {
        if (lista == null || lista.isEmpty()) {
            System.out.println("no hay juegos registrados.");
            return;
        }
        for (Juego j : lista) {
            System.out.println(j);
        }
    }

    // precargar 5 + 5 para probar rápido
    public void precargar() {
        try {
            agregar(new MarioBros("M1", "Super Mario", "Nintendo", 1985, 32, false));
            agregar(new MarioBros("M2", "Mario World", "Nintendo", 1990, 48, true));
            agregar(new MarioBros("M3", "Mario Galaxy", "Nintendo", 2007, 20, true));
            agregar(new MarioBros("M4", "Mario Run", "IndieDev", 2016, 10, false));
            agregar(new MarioBros("M5", "Mario Maker", "Nintendo", 2015, 100, true));

            agregar(new CarreraVehiculos("C1", "Speed Race", "FastGames", 2010, 24, true));
            agregar(new CarreraVehiculos("C2", "Turbo Drive", "RacingLab", 2013, 18, false));
            agregar(new CarreraVehiculos("C3", "Night Race", "DriftCo", 2016, 30, true));
            agregar(new CarreraVehiculos("C4", "Highway Rush", "RoadSoft", 2018, 12, false));
            agregar(new CarreraVehiculos("C5", "Grand Prix", "ClassicGames", 2005, 20, true));
        } catch (DatosInvalidosException e) {
            System.out.println("Error al precargar: " + e.getMessage());
        }
    }
}
