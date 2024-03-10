public class PrimeiraThread extends Thread {
    
    public static void main(String[] args) {
        new PrimeiraThread().start();
    }
    
    @Override
    public void run() {
        System.out.println("Thread em Java");
    }
}
