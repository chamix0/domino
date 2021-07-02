package Domino;

public class Partida {
    //datos
    Jugador j1;
    Jugador j2;
    Tablero tablero;
    Monton monton;
    int numRonda;

    //constructor
    public Partida(Jugador j11, Jugador j22, Tablero t, Monton m) {
        j1 = j11;
        j2 = j22;
        tablero = t;
        monton = m;
        numRonda = 0;

    }

    //metodos
public void Ronda(Jugador jugador,Tablero tablero){
        tablero.ponerFicha(jugador.sacarFicha(tablero,j1,monton),jugador);



}
    }
