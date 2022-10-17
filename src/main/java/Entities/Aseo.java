package Entities;

public class Aseo extends Objecto{
    private int contenido;

    //constructores

    public Aseo(String nombre, int precio, int contenido) {
        super(nombre, precio);
        this.contenido = contenido;
    }

    public Aseo() {
    }

    //get and set

    public int getContenido() {
        return contenido;
    }

    public void setContenido(int contenido) {
        this.contenido = contenido;
    }

    //tostring

    @Override
    public String
    toString() {
        return super.toString() +
                "/// contenido:" + contenido +
                "ml";
    }
}
