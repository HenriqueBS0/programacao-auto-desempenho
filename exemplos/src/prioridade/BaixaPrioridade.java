package prioridade;

public class BaixaPrioridade extends Thread {
    @Override
    public void run() {
        setPriority(MIN_PRIORITY);
        for (int i = 0; i < 10; i++) {
            System.out.println("Baixa Prioridade...");
        }
    
        try {
            sleep(100);
        } catch (InterruptedException e) {
            System.exit(0);;
        }
    }
}
