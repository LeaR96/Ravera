package Model;

import java.util.ArrayList;

public class Empresa {

    private ArrayList<Producto> productos;

    public Empresa() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto p){
        productos.add(p);
    }

    public void mostrarListado(){
        for (Producto p: productos) {
            System.out.println(p.toString());
        }
    }

    public void actualizar(){
        for (Producto p : productos){
            System.out.println(p.getNombre() + ", precio anterior: " + p.getPrecio());
            if(p.getClass() == Silla.class){
                p.setPrecio(p.getPrecio()+ (Integer) (p.getPrecio()*5/100));
            }else if(p.getClass() == Escritorio.class){
                p.setPrecio(p.getPrecio()+ (Integer) (p.getPrecio()*10/100));
            }else if(p.getClass() == Impresora.class){
                p.setPrecio(p.getPrecio()+ (Integer) (p.getPrecio()*15/100));
            } else if (p.getClass() == Notebook.class) {
                p.setPrecio(p.getPrecio()+ (Integer) (p.getPrecio()*20/100));
            }
            System.out.println(p.getNombre() + ", precio actualizado: " + p.getPrecio());
        }
    }

}
