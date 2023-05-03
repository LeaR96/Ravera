package Model;

public abstract class ProductoInformatico extends Producto{
    private String nombreFabricante;

    public ProductoInformatico(String nombre, Integer stock, Integer precio, String nombreFabricante) {
        super(nombre, stock, precio);
        this.nombreFabricante = nombreFabricante;
    }

    public ProductoInformatico(String nombreFabricante) {
        this.nombreFabricante = nombreFabricante;
    }

    @Override
    public String toString() {
        return "ProductoInformatico{" +
                "nombreFabricante='" + nombreFabricante + '\'' +
                "} " + super.toString();
    }
}
