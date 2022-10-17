package Entities;

public class Fruta extends Objecto{
    private String unidadDeVenta;

    //constructores


    public Fruta(String nombre, int precio, String unidadDeVenta) {
        super(nombre, precio);
        this.unidadDeVenta = unidadDeVenta;
    }

    public Fruta() {
    }

    //get and set

    public String getUnidadDeVenta() {
        return unidadDeVenta;
    }

    public void setUnidadDeVenta(String unidadDeVenta) {
        this.unidadDeVenta = unidadDeVenta;
    }

    //tostring

    @Override
    public String toString() {
        return  super.toString() + "/// unidadDeVenta:'" + unidadDeVenta + "'";
    }
}
