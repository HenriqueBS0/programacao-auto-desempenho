public class Imprimir implements Runnable {
    String str;

    public static void main(String[] args) {
        new Thread(new Imprimir("A")).start();
        new Thread(new Imprimir("B")).start();
    }

    public Imprimir(String str) {
        this.str = str;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.print(str);
        }
    }
}
