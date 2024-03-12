package exercicio06;

import java.util.ArrayList;

public class BuscaArray {

    static final int NUMERO_THREADS = 9;
    static final int TAMANHO_LISTA = 500;
    static final int NUMERO_BUSCA = 19;

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        for (int i = 0; i < TAMANHO_LISTA; i++) {
            numeros.add(i);
        }

        Busca busca = new Busca(NUMERO_BUSCA);

        int tamanho = TAMANHO_LISTA / NUMERO_THREADS;

        ArrayList<ThreadBuscadora> threadBuscadoras = new ArrayList<ThreadBuscadora>();

        for (int i = 0; i < NUMERO_THREADS; i++) {
            final int star = i * tamanho;
            final int end = ((i == NUMERO_THREADS - 1) ? TAMANHO_LISTA : ((i + 1) * tamanho)) - 1;
            
            ThreadBuscadora threadBuscadora = new ThreadBuscadora(numeros, busca, star, end);

            threadBuscadoras.add(threadBuscadora);
        }

        for (ThreadBuscadora threadBuscadora : threadBuscadoras) {
            threadBuscadora.start();
        }

        for (ThreadBuscadora threadBuscadora : threadBuscadoras) {
            try {
                threadBuscadora.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        while (busca.threadsFinalizadas != NUMERO_THREADS) {
            Thread.yield();
        }

        System.out.println(busca);
    }
}
