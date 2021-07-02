package Domino;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Tablero {
    //datos

    LinkedList<Ficha> fichasTablero;
    int last;
    int first;
    int numRonda;

    //constructor
    public Tablero() {
        fichasTablero = new LinkedList<>();
        last = -1;
        first = -1;
        numRonda = 0;
    }

    //metodos
    public boolean ponerFicha(Ficha ficha, Jugador jugador) {
        boolean añadida;
        if (last == -1) {
            fichasTablero.add(ficha);
            last = ficha.numDer;
            first = ficha.numIz;
            System.out.println("ya que no habia ninguna ficha, se ha añadido");
            añadida = true;
        } else if (ficha == null) {

            System.out.println("aqui hay un error");
            añadida = false;
            return añadida;
        } else if (ficha.numIz == last || ficha.numDer == last) {
            System.out.println("has añadido la pieza al final");
            if (ficha.numDer == last) {
                ficha.voltear();
            }
            fichasTablero.addLast(ficha);
            last = ficha.numDer;
            añadida = true;
        } else if (ficha.numIz == first || ficha.numDer == first) {
            System.out.println("has añadido al pirncipio");
            if (ficha.numIz == first) {
                ficha.voltear();
            }
            fichasTablero.addFirst(ficha);
            first = ficha.numIz;
            añadida = true;

        } else {
            System.out.println("la ficha te la puedes meter por el orto");
            jugador.devolverFicha(ficha);
            añadida = false;
        }
        return añadida;

    }


    public String mostrarTablero() {
        String cad = "";
        for (int i = 0; i < fichasTablero.size(); i++) {
            cad = cad + fichasTablero.get(i);
        }
        return cad;
    }

    public boolean contains(Jugador jugador) {
        boolean esta = false;
        Ficha aux=null;
        int j = 0;
        if (first == -1 || last == -1) {
            esta = true;
            return esta;
        } else {

            for (int i = 0; esta != true && i < jugador.montoncito.size(); i++) {
                if (jugador.montoncito.get(i).numIz == first || jugador.montoncito.get(i).numDer == first || jugador.montoncito.get(i).numIz == last || jugador.montoncito.get(i).numDer == last) {
                    esta = true;
aux=jugador.montoncito.get(i);
                }

            }

            System.out.println("puedes meter mas fichas por que esta" + aux+esta);
            return esta;
        }
    }
}
