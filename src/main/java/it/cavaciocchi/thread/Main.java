package it.cavaciocchi.thread;

public class Main {
    public static void main(String[] args) {
        Contatore contatore = new Contatore();

        Lavoratore l1 = new Lavoratore(contatore,  "Lavoratore 1");
        Lavoratore l2 = new Lavoratore(contatore,  "Lavoratore 2");
        
        Thread t1 = new Thread(l1);
        Thread t2 = new Thread(l2);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("è stato raggiunto un numero max = 10");
        
    }
}