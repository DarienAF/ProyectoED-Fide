
import java.util.ArrayList;
import java.util.List;

public class Orden {
    private String tipoHamburguesa;
    private List<String> ingredientesR;
    private int puntos;
    private int idOrden;
    private boolean completado;

    public Orden(String tipoHamburguesa, int puntos, int idOrden, boolean completado) {
        this.tipoHamburguesa = tipoHamburguesa;
        this.puntos = puntos;
        this.idOrden = idOrden;
        this.completado = completado;       
        this.ingredientesR = asignarIngredientesR(tipoHamburguesa);
    }

    public String getTipoHamburguesa() {
        return tipoHamburguesa;
    }

    public void setTipoHamburguesa(String tipoHamburguesa) {
        this.tipoHamburguesa = tipoHamburguesa;
    }
    public List<String> getIngredientesR() {
        return ingredientesR;
    }
    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(int idOrden) {
        this.idOrden = idOrden;
    }
    public boolean isCompletado() {
        return completado;
    }
    public void setCompletado(boolean completado) {
        this.completado = completado;
    }
    private List<String> asignarIngredientesR(String tipoHamburguesa) {
        List<String> ingredientes = new ArrayList<>();
        if (tipoHamburguesa.equals("Hamburguesa de carne")) {
            ingredientes.add("Pan");
            ingredientes.add("Carne");
        } else if (tipoHamburguesa.equals("Hamburguesa con queso")) {
            ingredientes.add("Pan");
            ingredientes.add("Carne");
            ingredientes.add("Queso");
        } else if (tipoHamburguesa.equals("Hamburguesa clásica")) {
            ingredientes.add("Pan");
            ingredientes.add("Carne");
            ingredientes.add("Lechuga");
            ingredientes.add("Queso");
        }
        
        return ingredientes;
    }
    @Override
    public String toString() {
        return "Orden\n{" + "tipoHamburguesa=" + tipoHamburguesa + 
                "\ningredientesR=" + ingredientesR + "\npuntos=" +
                puntos + "\nidOrden=" + idOrden + "\nompletado=" + 
                completado + '}';
    }
}