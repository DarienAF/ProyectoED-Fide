package Procesos;


public class NodoC {
    
    private Cinta dato;
    private NodoC next;
    
    @Override
    public String toString() {
        return "Nodo{" + "dato=" + dato + '}';
    }
    
    public NodoC(Cinta dato) {
        this.dato = dato;
    }

    public Cinta getDato() {
        return dato;
    }

    public void setDato(Cinta dato) {
        this.dato = dato;
    }

    public NodoC getNext() {
        return next;
    }

    public void setNext(NodoC next) {
        this.next = next;
    }
}
