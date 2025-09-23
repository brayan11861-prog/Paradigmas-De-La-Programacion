package co.edu.poli.actividad3.modelo;

/**
 * La clase {@code Accesorio} representa un accesorio de un sistema, 
 * con información sobre su identificador, nombre, material y fecha de fabricación.
 * 
 * <p>Incluye varios constructores sobrecargados para facilitar la creación del objeto 
 * con diferentes niveles de detalle. También ofrece métodos getters y setters para 
 * manipular los atributos del accesorio y un método adicional para calcular el 
 * tamaño de una cadena basada en el tamaño del piñón.</p>
 * 
 * @author TuNombre
 * @version 1.0
 */
public class Accesorio {

    private String idAccesorio;
    private String nombre;
    private String material;
    private String fechaFabricacion;

    /**
     * Crea un nuevo accesorio con todos los atributos especificados.
     *
     * @param idAccesorio el identificador único del accesorio
     * @param nombre el nombre del accesorio
     * @param material el material del accesorio
     * @param fechaFabricacion la fecha de fabricación del accesorio
     */
    public Accesorio(String idAccesorio, String nombre, String material, String fechaFabricacion) {
        this.idAccesorio = idAccesorio;
        this.nombre = nombre;
        this.material = material;
        this.fechaFabricacion = fechaFabricacion;
    }

    /**
     * Crea un nuevo accesorio con fecha de fabricación desconocida.
     *
     * @param idAccesorio el identificador único del accesorio
     * @param nombre el nombre del accesorio
     * @param material el material del accesorio
     */
    public Accesorio(String idAccesorio, String nombre, String material) {
        this(idAccesorio, nombre, material, "Desconocida");
    }

    /**
     * Crea un nuevo accesorio con material y fecha de fabricación desconocidos.
     *
     * @param idAccesorio el identificador único del accesorio
     * @param nombre el nombre del accesorio
     */
    public Accesorio(String idAccesorio, String nombre) {
        this(idAccesorio, nombre, "Desconocido", "Desconocida");
    }

    /**
     * Devuelve el identificador del accesorio.
     *
     * @return el id del accesorio
     */
    public String getIdAccesorio() {
        return idAccesorio;
    }

    /**
     * Establece el identificador del accesorio.
     *
     * @param idAccesorio el nuevo id del accesorio
     */
    public void setIdAccesorio(String idAccesorio) {
        this.idAccesorio = idAccesorio;
    }

    /**
     * Devuelve el nombre del accesorio.
     *
     * @return el nombre del accesorio
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del accesorio.
     *
     * @param nombre el nuevo nombre del accesorio
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el material del accesorio.
     *
     * @return el material del accesorio
     */
    public String getMaterial() {
        return material;
    }

    /**
     * Establece el material del accesorio.
     *
     * @param material el nuevo material del accesorio
     */
    public void setMaterial(String material) {
        this.material = material;
    }

    /**
     * Devuelve la fecha de fabricación del accesorio.
     *
     * @return la fecha de fabricación del accesorio
     */
    public String getFechaFabricacion() {
        return fechaFabricacion;
    }

    /**
     * Establece la fecha de fabricación del accesorio.
     *
     * @param fechaFabricacion la nueva fecha de fabricación del accesorio
     */
    public void setFechaFabricacion(String fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    /**
     * Determina el tamaño de la cadena a partir del tamaño del piñón.
     *
     * @param tamPinion el tamaño del piñón
     * @return el tamaño estimado de la cadena
     */
    public double determinarCadena(double tamPinion) {
        return tamPinion * 2.5;
    }

    /**
     * Devuelve una representación en forma de cadena del accesorio.
     *
     * @return una cadena que representa al accesorio
     */
    @Override
    public String toString() {
        return "ACCESORIO: " + "|(id= " + idAccesorio + ")|"
             + " (nombre= " + nombre + ")|"
             + " (materia= " + material + ")|"
             + " (fechaFabricacion= " + fechaFabricacion + ")|";
    }
}
