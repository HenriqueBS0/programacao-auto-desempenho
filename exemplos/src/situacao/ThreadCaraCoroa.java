package situacao;

public class ThreadCaraCoroa implements Runnable {
    CaraCoroa caraCoroa;
    Thread thread;
    final int NUM = 10;
    
    public ThreadCaraCoroa(String nome, CaraCoroa caraCoroa) {
        this.caraCoroa = caraCoroa;
        thread = new Thread(this, nome);
        thread.start();
    } 

    @Override
    public void run() {
        if (thread.getName().equalsIgnoreCase("Cara")) {
            for (int i = 0; i < NUM; i++) {
                caraCoroa.cara(true);
            }
            caraCoroa.cara(false);
        }
        else {
            for (int i = 0; i < NUM; i++) {
                caraCoroa.coroa(true);
            }
            caraCoroa.coroa(false);
        }
    }
}
