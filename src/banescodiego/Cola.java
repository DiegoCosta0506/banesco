
package banescodiego;


public class Cola {
    private Nodo frente;
    private Nodo fin;

    public Cola() {
        this.frente = null;
        this.fin = null;
    }

    public void encolar(Object dato) {
        Nodo nuevo = new Nodo(dato);
        if (fin == null) {
            frente = nuevo;
            fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
    }

    public Object desencolar() {
        if (frente == null) {
            return null;
        }
        Object dato = frente.getDato();
        frente = frente.getSiguiente();
        if (frente == null) {
            fin = null;
        }
        return dato;
    }

    public boolean estaVacia() {
        return frente == null;
    }

    public void imprimir() {
        Nodo actual = frente;
        while (actual != null) {
            System.out.println(actual.getDato());
            actual = actual.getSiguiente();
        }
    }
}
