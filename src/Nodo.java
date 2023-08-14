package Procesos;

public class Nodo {
    private Orden dato;
    private Nodo atras;
    
    public Nodo(Orden dato) {
        this.dato = dato;
        this.atras = null;
    }

    public Orden getDato() {
        return dato;
    }

    public void setDato(Orden dato) {
        this.dato = dato;
    }

    public Nodo getAtras() {
        return atras;
    }

    public void setAtras(Nodo atras) {
        this.atras = atras;
    }
    
}
