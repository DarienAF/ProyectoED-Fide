package Procesos;

import java.util.Random;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Cola {
    private Nodo frente;
    private Nodo ultimo;
    private int largo;
    private int contadorIdOrden;
    
    public Cola() {
        this.frente = null;
        this.ultimo = null;
        this.largo = 0;
    }
    
    public void encola(Nodo nuevoNodo){
        if(frente == null){
            frente = nuevoNodo;
            ultimo = nuevoNodo;                    
        } else{
            ultimo.setAtras(nuevoNodo);
            ultimo = nuevoNodo;
        }
        largo++;
    }
    

    public Nodo atiende(){
        Nodo aux = frente;
        if(frente != null){
            frente = frente.getAtras();
           //
            aux.setAtras(null);
            largo--;
        }
        return aux;
    }
    
        
    public int obtenerPuntosOrdenFrente() {
        if (frente != null) {
            return frente.getDato().getPuntos();
        } else {
            return 0;
        }
    }
    
    public void generarOrdenesAleatorias() {
        ScheduledExecutorService executor = 
        Executors.newSingleThreadScheduledExecutor();
        
        executor.scheduleAtFixedRate(() -> {
            if (3 > largo) {
                Orden nuevaOrden = generarOrdenAleatoria();
                encola(new Nodo(nuevaOrden));
            }
        }, 0, 20, TimeUnit.SECONDS);
    }
    
    
    private Orden generarOrdenAleatoria() {
        Random random = new Random();
        String tipoHamburguesa;
        int puntos;

        int tipo = random.nextInt(3);
        switch (tipo) {
            case 0:
                tipoHamburguesa = "Hamburguesa de carne";
                puntos = 5;
                break;
            case 1:
                tipoHamburguesa = "Hamburguesa con queso";
                puntos = 10;
                break;
            case 2:
                tipoHamburguesa = "Hamburguesa clásica";
                puntos = 15;
                break;
            default:
                tipoHamburguesa = "Hamburguesa de carne";
                puntos = 5;
                break;
        }
        int idOrden = generarIdUnico();
        boolean completado = false;

        return new Orden(tipoHamburguesa, puntos, idOrden, completado);
    }
    
    private int generarIdUnico() {
        return contadorIdOrden++;
    }
    
       public Orden obtenerDatos() {
        if (frente != null) {
            Orden ordenFrente = frente.getDato();
            return ordenFrente;
        } else {
            return null;
        }
    }
    
}
