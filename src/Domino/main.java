package Domino;

public class main {
    public static void main(String[] args) {
        Monton m = new Monton();
        Tablero t = new Tablero();
        Jugador j = new Jugador(m);
        Partida p = new Partida(j, j, t, m);

        p.Ronda(j ,t);
        p.Ronda(j ,t);
        p.Ronda(j ,t);
        p.Ronda(j ,t);
        p.Ronda(j ,t);
        p.Ronda(j ,t);

        p.Ronda(j ,t);
        p.Ronda(j ,t);

        p.Ronda(j ,t);
        p.Ronda(j ,t);
        p.Ronda(j ,t);
        p.Ronda(j ,t);
        p.Ronda(j ,t);
        p.Ronda(j ,t);
        p.Ronda(j ,t);
        p.Ronda(j ,t);




        System.out.println(t.mostrarTablero());
    }
}
