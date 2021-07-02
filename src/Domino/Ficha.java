package Domino;

public class Ficha {

    //datos
    int numIz;
    int numDer;
    boolean iz;
    boolean der;

    //constructor
    public Ficha(int num1, int num2) {
        numIz = num1;
        numDer = num2;
        iz = false;
        der = false;
    }


    //metodos







    public void voltear() {
        int aux;
        aux = numIz;
        numIz = numDer;
        numDer = aux;
    }

    @Override
    public String toString() {
        String cad = "[" + numIz + "|" + numDer + "]";
        return cad;
    }
}
