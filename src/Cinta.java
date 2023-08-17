
public class Cinta{
    private int idCinta;
    private String ingrediente;

    public Cinta(int idCinta, String ingrediente) {
        this.idCinta = idCinta;
        this.ingrediente = ingrediente;
    }

    public int getIdCinta() {
        return idCinta;
    }

    public void setIdCinta(int idCinta) {
        this.idCinta = idCinta;
    }

    public String getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }

    @Override
    public String toString() {
        return "Cinta{" + "idCinta=" + idCinta +
               ", ingrediente=" + ingrediente + '}';
    }
}