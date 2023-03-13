import entidad.JugadorClass;
import service.ServiceJugador;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //iniciar servicio
        ServiceJugador svj = new ServiceJugador ();
        ArrayList<JugadorClass> lista= svj.crearListaJugadores ();
        svj.mostrarLista ( lista );
        svj.eliminarJugador ( lista );
        svj.ordenarEdad ( lista );
        svj.ordenarNacionalidad ( lista );
        svj.ordenarNOmbre ( lista );

    }
}