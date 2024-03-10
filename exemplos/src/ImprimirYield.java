public class ImprimirYield implements Runnable {
    String str;

    public static void main(String[] args) {
        new Thread(new ImprimirYield("A")).start();
        new Thread(new ImprimirYield("B")).start();
    }

    public ImprimirYield(String str) {
        this.str = str;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.print(str);
            Thread.yield();
        }
    }
}