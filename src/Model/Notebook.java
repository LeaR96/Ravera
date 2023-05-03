package Model;

public class Notebook extends ProductoInformatico{
    private Integer memoriaEnGb;

    public Notebook(String nombre, Integer stock, Integer precio, String nombreFabricante, Integer memoriaEnGb) {
        super(nombre, stock, precio, nombreFabricante);
        this.memoriaEnGb = memoriaEnGb;
    }

    public Notebook(String nombreFabricante, Integer memoriaEnGb) {
        super(nombreFabricante);
        this.memoriaEnGb = memoriaEnGb;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "memoriaEnGb=" + memoriaEnGb +
                "} " + super.toString();
    }
}
