package com.henriquebs.exercicioum;

import java.util.Random;

public class Corredor extends Thread {

    private String nome;
    private int distancia;

    final int TEMPO_ATUALIZACAO = 100;

    public Corredor(String nome, int distancia) {
        this.nome = nome;
        this.distancia = 0;
    }

    @Override
    public void run() {
        Random random = new Random();
        int distanciaRestante = distancia;

        while (distanciaRestante > 0) {
            distanciaRestante -= random.nextInt(10) + 1;

            try {
                Thread.sleep(TEMPO_ATUALIZACAO);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        Corrida.ordemChegada.add(this);
    }
}
