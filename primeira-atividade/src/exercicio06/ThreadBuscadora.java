package exercicio06;

import java.util.ArrayList;

public class ThreadBuscadora extends Thread {

    private ArrayList<Integer> numeros;
    private Busca busca;
    private int start = 0;
    private int end = 0;

    public ThreadBuscadora(ArrayList<Integer> numeros, Busca busca, int start, int end) {
        this.numeros = numeros;
        this.busca = busca;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        buscar();
    }

    private void buscar() {
        synchronized(busca) {
            for (int i = start; i <= end; i++) {
                if (busca.finalizada) {
                    break;
                }
    
                if (numeros.get(i) == busca.numero) {
                    busca.finalizada = true;
                    busca.indice = i;
                }
                Thread.yield();
            }

            busca.threadsFinalizadas++;
        }
    }
}
