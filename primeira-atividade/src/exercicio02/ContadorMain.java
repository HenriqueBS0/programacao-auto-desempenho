package exercicio02;

import java.util.LinkedList;
import java.util.Scanner;

public class ContadorMain {

    public final static int CONTADORES = 10;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número para o contador");

        ControladorNumeros controladorNumeros = new ControladorNumeros(scanner.nextInt());

        LinkedList<Contador> contadores = new LinkedList<Contador>();

        for (int i = 0; i < CONTADORES; i++) {
            contadores.add(new Contador(controladorNumeros));
        }

        for (Contador contador : contadores) {
            contador.start();
            try {
                contador.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        scanner.close();
    }
}
