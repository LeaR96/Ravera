import Model.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Empresa empresa = new Empresa();

        ///PUNTO 3

        List <Producto> productos = new ArrayList<>();

        Escritorio escritorio = new Escritorio("Escritorio de melamina", 20, 15000, 110, 160);
        Silla silla = new Silla("Silla hergonomica", 30, 10000, true);
        Impresora impresora = new Impresora("Impresora Laser", 20, 50000, "HP", 50);
        Notebook notebook = new Notebook("Mac 5", 10, 100000, "Apple", 256);

        empresa.agregarProducto(escritorio);
        empresa.agregarProducto(silla);
        empresa.agregarProducto(impresora);
        empresa.agregarProducto(notebook);

        empresa.mostrarListado();

        ///PUNTO 4

        Compra compra = new Compra();
        compra.agregarACarrito(silla);
        compra.agregarACarrito(impresora);
        Integer precioConDescuento = compra.descuentoEspecial(10);
        System.out.println("El precio total con descuento es: " + precioConDescuento);

        ///Punto 5

        empresa.actualizar();

    }
}