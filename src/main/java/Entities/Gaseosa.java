package Entities;

public class Gaseosa extends Objecto{
    private double litros;



    //constructores

    public Gaseosa(String nombre, int precio, double litros) {
        super(nombre, precio);
        this.litros = litros;
    }

    public Gaseosa() {
    }

    //GET AND SET


    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    //TOSTRING
    @Override
    public String toString() {
        return super.toString() +
                "/// litros:" + litros;
    }

}
