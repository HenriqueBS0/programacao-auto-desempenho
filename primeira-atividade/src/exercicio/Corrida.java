package exercicio;

import java.util.LinkedList;
import java.util.Scanner;

public class Corrida {
    static LinkedList<Corredor> ordemChegada = new LinkedList<Corredor>();

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o número de corredores: ");
        int numeroCorredores = scanner.nextInt();
        scanner.nextLine();

        LinkedList<Corredor> corredores = new LinkedList<Corredor>();

        for (int i = 0; i < numeroCorredores; i++) {
            System.out.println("Digite o nome do corredor " + (i+1) + ": ");
            String nome = scanner.nextLine();
            corredores.add(new Corredor(nome, 100));
        }

        for (Corredor corredor : corredores) {
            corredor.start();
        }

        for (Corredor corredor : corredores) {
            corredor.join();
        }


        System.out.println("Chegada: ");

        for (Corredor corredor : ordemChegada) {
            System.out.println(corredor.nome);
        }

        scanner.close();
    }
}
