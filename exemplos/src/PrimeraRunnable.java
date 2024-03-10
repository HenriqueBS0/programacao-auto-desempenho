public class PrimeraRunnable implements Runnable {
    public static void main(String[] args) {
        new Thread(new PrimeraRunnable()).start();
    }
    
    @Override
    public void run() {
        System.out.println("Runnable em Java");
    }
}
