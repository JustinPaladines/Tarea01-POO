import java.util.ArrayList;



// participante
public abstract class Participante {
    private String id;
    private String nombre;

    public Participante(String id, String nombre) {
        if (id == null || id.trim().isEmpty()) {
            throw new IllegalArgumentException("id no puede estar vacío");
        }
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("nombre no puede estar vacío");
        }
        this.id = id.trim();
        this.nombre = nombre.trim();
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }

    public abstract String tipoYInfo();

    @Override
    public String toString() {
        return "[" + id + "] " + nombre + " - " + tipoYInfo();
    }
}

// atleta
class Atleta extends Participante {
    private String disciplina;
    private int edad;

    public Atleta(String id, String nombre, String disciplina, int edad) {
        super(id, nombre);
        if (disciplina == null || disciplina.trim().isEmpty()) {
            throw new IllegalArgumentException("disciplina no puede estar vacía");
        }
        if (edad <= 0) {
            throw new IllegalArgumentException("edad debe ser mayor que 0");
        }
        this.disciplina = disciplina.trim();
        this.edad = edad;
    }

    @Override
    public String tipoYInfo() {
        return "atleta (disciplina: " + disciplina + ", edad: " + edad + ")";
    }
}

// equipo
class Equipo extends Participante {
    private String pais;
    private ArrayList<String> miembros;

    public Equipo(String id, String nombre, String pais) {
        super(id, nombre);
        if (pais == null || pais.trim().isEmpty()) {
            throw new IllegalArgumentException("pais no puede estar vacío");
        }
        this.pais = pais.trim();
        this.miembros = new ArrayList<>();
    }

    public void agregarMiembro(String miembro) {
        if (miembro == null || miembro.trim().isEmpty()) {
            throw new IllegalArgumentException("miembro vacío");
        }
        miembros.add(miembro.trim());
    }

    @Override
    public String tipoYInfo() {
        return "equipo (pais: " + pais + ", miembros: " + miembros.size() + ")";
    }
}

// evento
class Evento {
    private String codigo;
    private String nombre;
    private ArrayList<Participante> participantes;

    public Evento(String codigo, String nombre) {
        if (codigo == null || codigo.trim().isEmpty()) {
            throw new IllegalArgumentException("codigo vacío");
        }
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("nombre vacío");
        }
        this.codigo = codigo.trim();
        this.nombre = nombre.trim();
        this.participantes = new ArrayList<>();
    }

    public String getCodigo() { return codigo; }

    public void agregarParticipante(Participante p) throws DatosInvalidosException {
        if (p == null) throw new DatosInvalidosException("participante inválido");

        for (Participante ex : participantes) {
            if (ex.getId().equals(p.getId())) {
                throw new DatosInvalidosException("id repetido en el evento");
            }
        }

        participantes.add(p);
    }

    public void mostrarParticipantes() {
        if (participantes.isEmpty()) {
            System.out.println("no hay participantes registrados.");
            return;
        }
        for (Participante p : participantes) {
            System.out.println(p);
        }
    }
}

// olimpiada
class Olimpiada {
    private String nombre;
    private String lugar;
    private int anio;
    private ArrayList<Evento> eventos;

    public Olimpiada(String nombre, String lugar, int anio) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("nombre vacío");
        }
        if (lugar == null || lugar.trim().isEmpty()) {
            throw new IllegalArgumentException("lugar vacío");
        }
        if (anio <= 1800) {
            throw new IllegalArgumentException("año inválido");
        }

        this.nombre = nombre.trim();
        this.lugar = lugar.trim();
        this.anio = anio;
        this.eventos = new ArrayList<>();
    }

    public void agregarEvento(Evento e) throws DatosInvalidosException {
        if (e == null) throw new DatosInvalidosException("evento inválido");

        for (Evento ex : eventos) {
            if (ex.getCodigo().equals(e.getCodigo())) {
                throw new DatosInvalidosException("código repetido");
            }
        }

        eventos.add(e);
    }

    public Evento buscarEvento(String codigo) {
        for (Evento e : eventos) {
            if (e.getCodigo().equals(codigo)) return e;
        }
        return null;
    }

    public void mostrarEventos() {
        if (eventos.isEmpty()) {
            System.out.println("no hay eventos registrados.");
            return;
        }
        for (Evento e : eventos) {
            System.out.println("evento: " + e.getCodigo());
        }
    }
}

// exception
class DatosInvalidosException extends Exception {
    public DatosInvalidosException(String msg) {
        super(msg);
    }
}
