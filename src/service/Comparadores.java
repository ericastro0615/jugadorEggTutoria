package service;

import entidad.JugadorClass;

import java.util.Comparator;

public class Comparadores {

    public static Comparator <JugadorClass> compareNacionalidad = new Comparator<JugadorClass> () {
        @Override
        public int compare(JugadorClass o1, JugadorClass o2) {
            return o1.getNacionalidad ().compareTo ( o2.getNacionalidad () );
        }
    };

    public static Comparator <JugadorClass> compareNombre = new Comparator<JugadorClass> () {
        @Override
        public  int compare(JugadorClass o1, JugadorClass o2) {
            return o1.getNombre ().compareTo ( o2.getNombre () );
        }
    };

    public static Comparator <JugadorClass> compareEdad = new Comparator<JugadorClass> () {
        @Override
        public int compare(JugadorClass o1, JugadorClass o2) {
            return o1.getEdad ();
        }
    };

}
