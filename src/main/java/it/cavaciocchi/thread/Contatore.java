package it.cavaciocchi.thread;

public class Contatore {
    public int valore;
    public int valMax;

    public Contatore(){
        this.valore= 0;
        this.valMax= 10;
    }

    public boolean incrementa(String nomeThread){
        if (valore>=valMax) {
            return false;
        }
        valore++;
        System.out.println(nomeThread + "ha incrementato il contatore a : "+ valore);
        return true;
    }

}
