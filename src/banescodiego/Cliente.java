
package banescodiego;

public class Cliente {
    private String nombre;
    private String apellido;
    private final Lista solicitudes;

    public Cliente(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.solicitudes = new Lista();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Lista getSolicitudes() {
        return solicitudes;
    }

    public void agregarSolicitud(String solicitud) {
        solicitudes.agregar(solicitud);
    }

    public void imprimirSolicitudes() {
        solicitudes.imprimir();
    }
}
