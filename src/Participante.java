public abstract class Participante {
    protected String id;
    protected String nombre;
    protected String eventoCodigo; // para saber a qué evento pertenece

    public Participante(String id, String nombre, String eventoCodigo) throws DatosInvalidosException {
        if (id == null || id.trim().isEmpty()) {
            throw new DatosInvalidosException("ID vacío");
        }
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new DatosInvalidosException("Nombre vacío");
        }
        if (eventoCodigo == null || eventoCodigo.trim().isEmpty()) {
            throw new DatosInvalidosException("Evento inválido");
        }

        this.id = id;
        this.nombre = nombre;
        this.eventoCodigo = eventoCodigo;
    }

    public abstract void mostrarInfo();
}

class Atleta extends Participante {
    private String disciplina;
    private int edad;

    public Atleta(String id, String nombre, String eventoCodigo, String disciplina, int edad)
            throws DatosInvalidosException {
        super(id, nombre, eventoCodigo);

        if (disciplina == null || disciplina.trim().isEmpty()) {
            throw new DatosInvalidosException("Disciplina vacía");
        }
        if (edad <= 0) {
            throw new DatosInvalidosException("Edad inválida");
        }

        this.disciplina = disciplina;
        this.edad = edad;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("=== ATLETA ===");
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Disciplina: " + disciplina);
        System.out.println("Edad: " + edad);
        System.out.println("Evento: " + eventoCodigo);
    }
}

class Equipo extends Participante {
    private String pais;

    public Equipo(String id, String nombre, String eventoCodigo, String pais)
            throws DatosInvalidosException {
        super(id, nombre, eventoCodigo);

        if (pais == null || pais.trim().isEmpty()) {
            throw new DatosInvalidosException("País vacío");
        }

        this.pais = pais;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("=== EQUIPO ===");
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("País: " + pais);
        System.out.println("Evento: " + eventoCodigo);
    }
}


