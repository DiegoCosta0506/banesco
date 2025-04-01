
package banescodiego;

public class Lista {
    private Nodo cabeza;

    public Lista() {
        this.cabeza = null;
    }

    public void agregar(Object dato) {
        Nodo nuevo = new Nodo(dato);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
        }
    }

    public void eliminar(Object dato) {
        if (cabeza == null) return;

        if (cabeza.getDato().equals(dato)) {
            cabeza = cabeza.getSiguiente();
            return;
        }

        Nodo actual = cabeza;
        while (actual.getSiguiente() != null && !actual.getSiguiente().getDato().equals(dato)) {
            actual = actual.getSiguiente();
        }

        if (actual.getSiguiente() != null) {
            actual.setSiguiente(actual.getSiguiente().getSiguiente());
        }
    }

    public boolean buscar(Object dato) {
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.getDato().equals(dato)) {
                return true;
            }
            actual = actual.getSiguiente();
        }
        return false;
    }

    public void imprimir() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.println(actual.getDato());
            actual = actual.getSiguiente();
        }
    }

   public Nodo getCabeza() {
    return cabeza;
}
}

