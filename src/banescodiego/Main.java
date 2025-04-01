package banescodiego;


public class Main {
    public static void main(String[] args) {
        Lista listaClientes = new Lista();
        Cola colaClientes = new Cola();

        LeerArchivo.leerArchivo("cliente.in", listaClientes);

        encolarClientes(listaClientes, colaClientes);

        procesarClientes(colaClientes);

        imprimirTransacciones();
    }

    
 

    public static void encolarClientes(Lista listaClientes, Cola colaClientes) {
        Nodo actual = listaClientes.getCabeza();
        while (actual != null) {
            Cliente cliente = (Cliente) actual.getDato();
            colaClientes.encolar(cliente);
            actual = actual.getSiguiente();
        }
    }

    public static void procesarClientes(Cola colaClientes) {
        while (!colaClientes.estaVacia()) {
            Cliente cliente = (Cliente) colaClientes.desencolar();
            System.out.println("Atendiendo a: " + cliente.getNombre() + " " + cliente.getApellido());
            
            Nodo solicitudActual = cliente.getSolicitudes().getCabeza();
            while (solicitudActual != null) {
                String solicitud = (String) solicitudActual.getDato();
                System.out.println("  - Procesando solicitud: " + solicitud);
                solicitudActual = solicitudActual.getSiguiente();
            }
        }
    }

    public static void imprimirTransacciones() {
        System.out.println("Transacciones del día guardadas en Taquilla.log");
    }
}