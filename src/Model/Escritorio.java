package Model;

public class Escritorio extends Producto{
    private Integer alto;
    private Integer ancho;

    public Escritorio(String nombre, Integer stock, Integer precio, Integer alto, Integer ancho) {
        super(nombre, stock, precio);
        this.alto = alto;
        this.ancho = ancho;
    }

    public Escritorio(Integer alto, Integer ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }

    public Integer getAlto() {
        return alto;
    }

    public void setAlto(Integer alto) {
        this.alto = alto;
    }

    public Integer getAncho() {
        return ancho;
    }

    public void setAncho(Integer ancho) {
        this.ancho = ancho;
    }

    @Override
    public String toString() {
        return "Escritorio{" +
                "alto=" + alto +
                ", ancho=" + ancho +
                "} " + super.toString();
    }
}
