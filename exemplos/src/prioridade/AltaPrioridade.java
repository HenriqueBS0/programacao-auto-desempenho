package prioridade;

public class AltaPrioridade extends Thread {
    @Override
    public void run() {
        setPriority(MAX_PRIORITY);
        for (int i = 0; i < 10; i++) {
            System.out.println("Alta Prioridade...");
        }
    
        try {
            sleep(100);
        } catch (InterruptedException e) {
            System.exit(0);;
        }
    }
}
