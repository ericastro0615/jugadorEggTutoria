package service;

import entidad.JugadorClass;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class ServiceJugador {
    Scanner sc = new Scanner ( System.in ).useDelimiter ( "\n" );
//CREAR OBJETO
    public JugadorClass crearJugador () {
        JugadorClass p1 = new JugadorClass ();
        System.out.println ("Ingrese el nombre del jugador ");
        p1.setNombre ( sc.next () );
        System.out.println ("Ingrese el peso del jugador ");
       p1.setPeso ( sc.nextInt () );
        System.out.println ("Ingrese la altura jugador ");
        p1.setAltura ( sc.nextDouble () );
        System.out.println ("Ingrese la edad jugador ");
        p1.setEdad ( sc.nextInt () );
        System.out.println ("Ingrese la nacionalidad del jugador");
       p1.setNacionalidad ( sc.next () );
        return p1;

    }

    //CREA LISTA DONDE SE GUARDARAN LOS JUGADORES (OBJETOS)
    public ArrayList <JugadorClass> crearListaJugadores () {

        //instanciar el arrayList. Importante colocar MOLDE = TIPO, FIRMA
        ArrayList <JugadorClass> lista = new ArrayList ();
        boolean salir =  false;
        do {
            //ARRIBA CREE LA CAJITA  DONDE SERAN GUARDADOS LOS JUGADORES => LISTA, AHORA DEBO AGREGAR LOS OBJ EN LA CAJA
            // se debe llamar al metodo, ya que es reutilizado p/crear distintos jugadores, no se puede llamar a p1 ya que es una persona no varias
            //INVOQUE AL METODO CREAR JUGADOR
            lista.add ( crearJugador () );
            System.out.println ("Desea salir? si/no");
            salir = sc.next ().equalsIgnoreCase ( "no" ) ? true : false;

        } while (salir); //OTRA FORMA ES COLOCAR LA LINEA 35 ADENTRO DE LA CONDICION DE WHILE
        return lista;
    }


    public void mostrarLista (ArrayList <JugadorClass> lista) {
        // en el foreach se debe colocar la clase el iterador = aux en singular y luego que recorrerá
        for ( JugadorClass aux: lista) {
            //se imprime el iterador = aux
            System.out.println (aux.toString ());
        }
    }

    /* Pide al usuario que ingrese el nombre de un jugador, si está
     * en la lista lo elimina y sino envía un mensaje.*/
    public void eliminarJugador (ArrayList <JugadorClass> lista)  {
        System.out.println ("Ingrese el nombre del jugador a eliminar ");
        String jugEliminado = sc.nextLine ();
        Iterator <JugadorClass> it = lista.iterator () ;
        ///// habra que colocar boolean  para salir?????????????
        while (it.hasNext () ) {
            if (it.next ().getNombre ().equalsIgnoreCase ( jugEliminado )) {
                it.remove ();
                System.out.println ("Hubo coincidencia ");
                break;
            }else {
                System.out.println ("jugador no encontrado");
        }
        }
        System.out.println ("\nNueva lista: \n");
        mostrarLista ( lista );

    }

    /* Ordena la lista alfabeticamente según nacionalidad.*/
    public void  ordenarNOmbre (ArrayList<JugadorClass> lista) {
        lista.sort (Comparadores.compareNombre);
        System.out.println ("\nlista ordenada por nombre ");
        mostrarLista ( lista );
    }

    public  void ordenarNacionalidad (ArrayList <JugadorClass> lista) {
        lista.sort ( Comparadores.compareNombre );
        System.out.println ("\nlista ordenada por nacionalidad \n");
        mostrarLista ( lista );
    }

    public void ordenarEdad (ArrayList <JugadorClass> lista) {
        lista.sort ( Comparadores.compareEdad );
        System.out.println ("\nlista ordenada por edad ");
        mostrarLista ( lista );
    }









}
