package Principal;

import Entities.Aseo;
import Entities.Fruta;
import Entities.Gaseosa;
import Entities.Objecto;
import Interfaces.CompararEdad;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        //SETEO DE DATOS A LOS OBJETOS

        Objecto cocazero = new Gaseosa("Coca-cola zero", 20, 1.5 );
        Objecto coca = new Gaseosa("Coca-cola", 18, 1.5 );
        Objecto champu = new Aseo("Shampoo Sedal", 19,500);
        Objecto frutilla = new Fruta("Frutilla", 64, "kilo");

        List<Objecto> lista = new ArrayList<Objecto>();
        lista.add(cocazero);
        lista.add(coca);
        lista.add(champu);
        lista.add(frutilla);

        for (Objecto o : lista){
            System.out.println(o);

        }

        System.out.println("=================================================");

        //USO DE LOS METODOS MIN Y MAX DE COLLECTIONS PARA FILTRAR LA EL ARRAY
        Objecto objetomax = Collections.max(lista, new CompararEdad());
        System.out.println("Producto mas caro: "+objetomax.getNombre());
        Objecto objetomin = Collections.min(lista, new CompararEdad());
        System.out.println("Producto mas caro: "+objetomin.getNombre());



    }
}
