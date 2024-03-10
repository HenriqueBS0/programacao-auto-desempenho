package prioridade;

public class Main {
    public static void main(String[] args) {
        AltaPrioridade a = new AltaPrioridade();
        BaixaPrioridade b = new BaixaPrioridade();

        System.out.println("Iniciando threads...");

        b.start();
        a.start();

        Thread.yield();
        System.out.println("Main Finalizado");
    }
}
