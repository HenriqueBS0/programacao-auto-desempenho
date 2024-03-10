package situacao;

public class ThreadAliveMain extends Thread {
    public static void main(String[] args) {
        ThreadAlive ta = new ThreadAlive();
        ta.start();
        while (ta.isAlive()) {
            System.out.println("Thread Ativa");

            try {
                Thread.sleep(100);  
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.err.println("Thread Inativa");
    }
}
