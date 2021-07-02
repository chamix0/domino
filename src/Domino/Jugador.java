package Domino;

import java.util.*;

public class Jugador {
    //datos
    LinkedList<Ficha> montoncito = new LinkedList<>();


    //constructor
    public Jugador(Monton m) {

        for (int i = 0; i < 7; i++) {
            montoncito.add(m.sacarFicha());
        }
    }

    //metodos
    public void devolverFicha(Ficha ficha) {

        montoncito.add(ficha);
        System.out.println("tu ficha ha sido devuelta");

    }

    public Ficha sacarFicha(Tablero tablero, Jugador jugador, Monton monton) throws NoSuchElementException {
        Scanner ent = new Scanner(System.in);
        Ficha aux=null;
        boolean robo = false;
        System.out.println(tablero.mostrarTablero());
        System.out.println(mostrar());
        if (montoncito.isEmpty()) {
            System.out.println("tu monton esta vacio");
            throw new NoSuchElementException("has ganado campeon");
        } else if (tablero.contains(jugador)) {
            aux = montoncito.remove(ent.nextInt());
            return aux;
        } else if (!tablero.contains(jugador)&&(tablero.first!=-1&&tablero.last!=-1)) {
            System.out.println("tienes que robar una ficha");
            while (!tablero.contains(jugador)&&!monton.monton.isEmpty())

            montoncito.add(monton.sacarFicha());

        }
        return aux;
    }

    public void robar(Monton monton) {
        Ficha aux = null;
        if (monton.monton.isEmpty()) {
            System.out.println("no quedan fichas por robar");
        } else
            aux = monton.sacarFicha();
        montoncito.add(aux);
    }

    public String mostrar() {
        String cad = "";
        for (int i = 0; i < montoncito.size(); i++) {
            cad = cad + montoncito.get(i) + "-" + i + "-";
        }
        return cad;
    }
}
