package Model;

public abstract class Producto {
    private String nombre;
    private Integer stock;
    private Integer precio;
    private static Integer Contador= 0;
    private Integer id;

    public Producto(String nombre, Integer stock, Integer precio) {
        this.nombre = nombre;
        this.stock = stock;
        this.precio = precio;
        Contador++;
        this.id = Contador;
    }

    public Producto() {
        Contador++;
        this.id = Contador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", stock=" + stock +
                ", precio=" + precio +
                ", id=" + id +
                '}';
    }
}
