package join;

public class Thread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("T1: " + i + " | ");
            Thread.currentThread();
            Thread.yield();
        }
    }
}
