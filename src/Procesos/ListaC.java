package Procesos;

import java.util.Random;

public class ListaC {
    private NodoC cabeza;
    private NodoC ultimo;
    private NodoC penultimo;
    private int contadorIdCinta;
    private int contadorIngredientes;
  //
    private final int MAX_INGREDIENTES = 6;
    private final int INGREDIENTE_ESPECIAL = 9999;

    
    public ListaC() {
        generarIngredientesIniciales(); 
    }

    private void generarIngredientesIniciales() {
        for (int i = 0; i < MAX_INGREDIENTES - 1; i++) {
            insertaCintaAleatoria(); 
        }
        insertaCintaEspecial(); 
    }

    public String getIngredienteActual() {
        if (cabeza != null) {
            return cabeza.getDato().getIngrediente();
        } else {
            return "La cinta transportadora esta vacia.";
        }
    }
    
    public void eliminarIngredienteActual() {
        if (cabeza == null) {
            System.out.println("La cinta transportadora esta vacia.");
            return;
        }
        cabeza = cabeza.getNext();
        ultimo.setNext(cabeza);
        contadorIngredientes--;
    }

    public String seleccionarIngrediente() {
        Cinta cintaActual = cabeza.getDato();
        String ingredienteSeleccionado = cintaActual.getIngrediente();
        mueveCinta();
        
        return ingredienteSeleccionado;
    }
    

    public void mueveCintaContrario() {
        if (cabeza == null) {
            System.out.println("La cinta transportadora esta vacía.");
            return;
        }

        NodoC nuevoCabeza = ultimo;
        penultimo = ultimo; 
        while (penultimo.getNext() != ultimo) {
            penultimo = penultimo.getNext(); 
        }
        cabeza = nuevoCabeza; 
        ultimo = penultimo; 
    }

    public void mueveCinta() {
        if (cabeza == null) {
            System.out.println("La cinta transportadora esta vacía..");
            return;
        }
        NodoC nuevoUltimo = cabeza;
        cabeza = cabeza.getNext(); 
        penultimo = penultimo.getNext(); 
        ultimo = nuevoUltimo; 
        ultimo.setNext(cabeza); 
    }

    public void inserta(Cinta cinta) {
        if (contadorIngredientes >= MAX_INGREDIENTES) {
            return;
        }

        if (cabeza == null) {
            cabeza = new NodoC(cinta);
            ultimo = cabeza;
            contadorIngredientes++;
        } else if (cinta.getIdCinta() < cabeza.getDato().getIdCinta()) {
            NodoC aux = new NodoC(cinta);
            aux.setNext(cabeza);
            cabeza = aux;
            contadorIngredientes++;
        } else if (ultimo.getDato().getIdCinta() <= cinta.getIdCinta()) {
            ultimo.setNext(new NodoC(cinta));
            penultimo = ultimo;
            ultimo = ultimo.getNext();
            contadorIngredientes++;
        } else {
            NodoC aux = cabeza;
            while (aux.getNext().getDato().getIdCinta() < cinta.getIdCinta()) {
                aux = aux.getNext();
            }
            NodoC temp = new NodoC(cinta);
            temp.setNext(aux.getNext());
            aux.setNext(temp);
            contadorIngredientes++;
        }
        ultimo.setNext(cabeza);
    }

    private void insertaCintaEspecial() {
        String ingredienteEspecial = "Ingrediente Especial";
        inserta(new Cinta(INGREDIENTE_ESPECIAL, ingredienteEspecial));
    }

    public void rellenarCinta() {
        if (contadorIngredientes < MAX_INGREDIENTES) {
            Cinta cintaAleatoria = generarCintaAleatoria();
            inserta(cintaAleatoria);
        }
    }

    public void insertaCintaAleatoria() {
        Cinta cintaAleatoria = generarCintaAleatoria();
        inserta(cintaAleatoria);
    }

    private Cinta generarCintaAleatoria() {
        String[] opcionesIngredientes = { "Pan", "Queso", "Carne", "Lechuga" };    
        Random random = new Random();
     
        int indiceAleatorio = random.nextInt(opcionesIngredientes.length);
        String ingrediente = opcionesIngredientes[indiceAleatorio];
        int idCinta = generarIdUnico();
        return new Cinta(idCinta, ingrediente);
    }

    private int generarIdUnico() {
        return contadorIdCinta++;
    }

    @Override
    public String toString() {
        NodoC aux = cabeza;
        String s = "Lista: \n";
        if (aux != null) {
            s += "ID: " + aux.getDato().getIdCinta() + ", Ingrediente: " + 
            aux.getDato().getIngrediente() + "\n";
            
            aux = aux.getNext();
            while (aux != cabeza) {
                s += "ID: " + aux.getDato().getIdCinta() + ", Ingrediente: " + 
                aux.getDato().getIngrediente() + "\n";
                
                aux = aux.getNext();
            }
        } else {
            s += "vacia";
        }
        return s;
    }
}
