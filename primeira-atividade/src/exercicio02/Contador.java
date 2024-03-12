package exercicio02;

import java.util.Random;

public class Contador extends Thread {
    
    public ControladorNumeros controladorNumeros;

    public Contador(ControladorNumeros controladorNumeros) {
        this.controladorNumeros = controladorNumeros;
    }

    @Override
    public void run() {

        Random random = new Random();

        while(controladorNumeros.numerosRestantes != 0) {

            int numero = random.nextInt(controladorNumeros.limite) + 1;
            controladorNumeros.tentarRemoverNumero(numero);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
