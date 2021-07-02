package Domino;

import java.util.*;


public class Monton {

    Set<Ficha> monton;
    LinkedList<Ficha> fichas ;

    public Monton() {
fichas= new LinkedList<>();
        monton = new HashSet<>();

        int k = 0;
        for (int i = 0; i <= 6; i++) {

            for (int j = i; j <= 6; j++) {
                fichas.add(k,new Ficha(i, j));
                monton.add(fichas.get(k));
                k++;
            }
        }
    }

    //metodod
    public Ficha sacarFicha() throws NoSuchElementException {
        Random rn = new Random();
        Ficha aux;
        int max;
        if (monton.isEmpty()) {
            System.out.println("el monton esta vacio");
            throw new NoSuchElementException();
        } else {
            max=monton.size()-1;
            aux =  fichas.get(rn.nextInt(max));
            fichas.remove(aux);
            monton.remove(aux);
            return aux;
        }

    }

public String toString(){
        String cad="";
    Iterator it=monton.iterator();
        for (int i=0;i<monton.size();i++){
            if (it.hasNext())
            cad=cad+" ["+it.next()+"]";

        }
        return cad;
}
}
