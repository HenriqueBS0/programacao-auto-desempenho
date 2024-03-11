package exercicio;

import java.util.Random;

public class Corredor extends Thread {

    public String nome;
    public int distancia;

    final int TEMPO_ATUALIZACAO = 100;

    public Corredor(String nome, int distancia) {
        this.nome = nome;
        this.distancia = distancia;
    }

    @Override
    public void run() {
        Random random = new Random();
        int distanciaRestante = distancia;

        while (distanciaRestante > 0) {
            int avanco = random.nextInt(10) + 1;

            System.out.println("O corredor " + nome + " andou " + avanco);

            distanciaRestante -= avanco;

            try {
                Thread.sleep(TEMPO_ATUALIZACAO);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        Corrida.ordemChegada.add(this);
    }
}
