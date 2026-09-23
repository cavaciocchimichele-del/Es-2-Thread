package it.cavaciocchi.thread;

public class Contatore {
    public int valore= 0;
    public int valMax = 10;

    public Contatore(int valore, int valMax){
        this.valore= valore;
        this.valMax= valMax;
    }

    public boolean incrementa(String nomeThread){
        if (valore>valMax) {
            return false;
        }
        valore++;
        System.out.println(nomeThread + "ha incrementato il contatore a : "+ valore);
        return true;
    }

}
