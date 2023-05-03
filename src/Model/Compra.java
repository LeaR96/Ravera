package Model;


import java.util.ArrayList;

public class Compra {
    private ArrayList <Producto> carrito;

    public Compra() {
        carrito = new ArrayList<>();
    }

    public void agregarACarrito(Producto p){
        carrito.add(p);
        p.setStock(p.getStock()-1);
    }

    public int descuentoEspecial(Integer porcentajeDescuento){
        Integer precio = 0;
        for (Producto c: carrito) {

            if (c.getClass() == Silla.class || c.getClass() == Impresora.class){
                precio += c.getPrecio() - (Integer) (c.getPrecio()*porcentajeDescuento /100);
            }else{
                precio += c.getPrecio();
            }
        }
        return precio;
    }

}
