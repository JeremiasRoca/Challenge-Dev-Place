
@Getter
@Entity
// Esto me indica que es una entidad de JPA. Como no existe el @Table en esta clase,
// JPA asume que Habitacion es una entidad mapeada a una tabla "Habitacion" dentro de la BD.
// Es decir, a una tabla mapeada con el mismo nombre.
public class Habitacion {

    @Id // establece que el atributo siguiente será un ID, un valor único indexado no null
    @GeneratedValue(strategy = GenerationType.AUTO) // GeneratedValue indica que el ID
    // deberia ser generado automaticamente. Le forzamos el automatico y le dejamos
    //la responsabilidad al motor de BD (la BD en sí)
    private Long roomNumber;

    private int capacidad;
    private boolean disponible;
    private ArrayList<Comodities> comodidades;

    // Tenemos 2 (dos) constructores, El normal, el de siempre, el que devuelve
    // las instancias de habitacion. Y el protegido, que existe debido a JPA.
    // Para crear las relaciones de instancia con habitacion
    protected Habitacion() {}

    public Habitacion(int capacity) {
        this.capacidad = capacity;
        this.disponible = true;
        this.comodidades = new ArrayList<Comodities>();
    }

    public Habitacion(int capacity, ArrayList<Comodities> comodidad) {
        this.capacidad = capacity;
        this.disponible = true;
        this.comodidades = comodidad;
    }

    @ManyToMany
    @JoinTable(name = "comodidades", joinColumns = @JoinColumn(name = "fk_idComodidad",
            referencedColumnName = "roomNumber"), inverseJoinColumns = @JoinColumn(
            name = "idComodidad"))
    public ArrayList<Comodities> getComodidades() {
        return this.comodidades;
    }
