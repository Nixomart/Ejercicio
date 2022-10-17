package Interfaces;

import Entities.Objecto;

import java.util.Comparator;

public class CompararEdad implements Comparator<Objecto> {

    @Override
    public int compare(Objecto o1, Objecto o2) {
        return Integer.valueOf(o1.getPrecio()).compareTo(o2.getPrecio());
    }
}
