

@Getter
@Entity
@Table(name = "prisioneros")
public class Prisionero {
    /**
     @Autowired
     HabitacionRepository hb;

     public void test() {
     hb.save(new Habitacion(2));
     }
     */

    /**
     * @MappedSuperClass: Se aplica sobre una clase, indica que se mapea como cualquier
     * clase, pero que se aplicará únicamente a sus subclases, puesto que esta clase
     * no tiene una tabla asociada.
     * @Table: Especifica el nombre de la tabla relacionada con la entidad. Hay que
     * indicarle el nombre de la tabla a la que debería estar asociada.
     *
     * @Column: Indica la columna en la BD (de la tabla que ya conocemos). Hay que indicarle
     * el nombre de la columna a la que debería estar asociada.
     * @Enumerated: Indica que los valores de la propiedad van a estar dentro del rango
     * de un objeto numerador. Value = tipo de valor que se va a utilizar en la
     * persistencia de la BD. Puede utilizarse EnumType.
     * @Lob: Large Object, indica que es un objeto largo o pesado.
     * @NotEmpty: Es una restricción, indica que la propiedad no puede tener un valro vacío
     *
     * TIPOS DE RELACION
     * @OnetoOne: Especifica relación de uno a uno con otro objeto (entidad).
     * - cascade: Indica el tipo de operación de cascada a realizar. CascadeType
     * - fetch: Indica la forma en que se consultarán las entidades asociadas. FetchType
     * @OnetoMany: Especifica relación de uno a muchos.
     * - cascade
     * - mappedBy: Especifica la propiedad de la entidad HIJA (en el extremo "muchos")
     * que sirve para enlazar con la entidad principal (en el extremo "uno")
     * @ManytoOne: Especifica una relación de muchos a uno.
     * @ManytoMany: Especifica una relación de muchos a muchos en la propiedad decorada.
     * Sila relación es bidireccional, se debe especificar el extermo propietario
     * (el que posee la clave principal) mediante el parámetro mappedBy. En casos de
     * relación bidireccional, JPA crea una tabla relacional por cada sentido. Para
     * evitar esto, se usa el decorador @JoinTable.
     * - @JoinTable especifica datos relativos a la tabla de unión en la relación.
     * Este "decorador" se añade en el extermo propietario.
     *      - name: nombre de la tabla
     *      - joinColumns: indica cómo se llamará la columna que contendrá la clave
     *      correspondiente a la tabla en el extrermo que es propietario. @JoinColumn
     *      - inverseJoinColumns: Especifica cómo se llama la columna de clave foránea
     *      correspondiente al extremo propietario. @JoinColumns
     * - @JoinColumn: Especifica la columna de unión. A través del parámetro "name"
     */

    @Id
    @Column(name = "DNI")
    private Long dni;

    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;


    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha", updatable = false, nullable = false)
    private Date fechaAlta;

    @Column(name = "sentencia", nullable = false, length = 50)
    private String sentencia;

    @Column(name = "delito", nullable = false, length = 50)
    private String delito;
}