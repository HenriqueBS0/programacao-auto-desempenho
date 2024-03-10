package join;

public class Thread2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("T2: " + i + " | ");
            Thread.currentThread();
            Thread.yield();
        }
    }
}
