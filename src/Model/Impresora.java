package Model;

public class Impresora extends ProductoInformatico{
    private Integer cantidadImpresionesPorMinuto;

    public Impresora(String nombre, Integer stock, Integer precio, String nombreFabricante, Integer cantidadImpresionesPorMinuto) {
        super(nombre, stock, precio, nombreFabricante);
        this.cantidadImpresionesPorMinuto = cantidadImpresionesPorMinuto;
    }

    public Impresora(String nombreFabricante, Integer cantidadImpresionesPorMinuto) {
        super(nombreFabricante);
        this.cantidadImpresionesPorMinuto = cantidadImpresionesPorMinuto;
    }

    public Integer getCantidadImpresionesPorMinuto() {
        return cantidadImpresionesPorMinuto;
    }

    public void setCantidadImpresionesPorMinuto(Integer cantidadImpresionesPorMinuto) {
        this.cantidadImpresionesPorMinuto = cantidadImpresionesPorMinuto;
    }

    @Override
    public String toString() {
        return "Impresora{" +
                "cantidadImpresionesPorMinuto=" + cantidadImpresionesPorMinuto +
                "} " + super.toString();
    }
}
