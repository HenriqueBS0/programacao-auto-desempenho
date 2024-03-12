package exercicio03;

import java.util.LinkedList;

public class Semaforo extends Thread {
    public int tempo;
    public int indice;

    private static LinkedList<Semaforo> semaforos = new LinkedList<Semaforo>();

    private static Semaforo aberto; 

    public Semaforo(int tempo) {
        this.tempo = tempo;
        this.addSemaforo(this);
    }

    private void addSemaforo(Semaforo semaforo) {
        semaforos.add(semaforo);
        semaforo.indice = semaforos.size() - 1;
        if (semaforo.indice == 0) {
            aberto = semaforo;
        } 
    }

    @Override
    public void run() {
        try {
            while (true) {
                execute();   
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void execute() throws InterruptedException {
        synchronized (this) {
            while (this.indice != aberto.indice) {
                wait();
            }
        }

        logSemaforos();
        Thread.sleep(tempo);
        aberto = proximo();

        synchronized(aberto) {
            aberto.notify();
        }
    }

    private Semaforo proximo() {
        if(aberto.indice == semaforos.size() - 1) {
            return semaforos.getFirst();
        }

        return semaforos.get(aberto.indice + 1);
    }

    private static void logSemaforos() {
        for (Semaforo semaforo : semaforos) {
            semaforo.log();
        }
        System.out.println("----------------");
    }

    public void log() {
        System.out.println("Semaforo " + (indice + 1) + ": " + (aberto.indice == indice ? "Aberto" : "Fechado"));
    }
    
}