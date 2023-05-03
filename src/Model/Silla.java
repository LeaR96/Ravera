package Model;

public class Silla extends Producto{
    private boolean traeRuedas;

    public Silla(String nombre, Integer stock, Integer precio, boolean traeRuedas) {
        super(nombre, stock, precio);
        this.traeRuedas = traeRuedas;
    }

    public Silla(boolean traeRuedas) {
        this.traeRuedas = traeRuedas;
    }

    public boolean isTraeRuedas() {
        return traeRuedas;
    }

    public void setTraeRuedas(boolean traeRuedas) {
        this.traeRuedas = traeRuedas;
    }

    @Override
    public String toString() {
        return "Silla{" +
                "traeRuedas=" + traeRuedas +
                "} " + super.toString();
    }
}
