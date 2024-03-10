package situacao;

public class CaraCoroaMain {
    public static void main(String[] args) {
        CaraCoroa caraCoroa = new CaraCoroa();
        ThreadCaraCoroa cara = new ThreadCaraCoroa("Cara", caraCoroa);
        ThreadCaraCoroa coroa = new ThreadCaraCoroa("Coroa", caraCoroa);

        try {
            cara.thread.join();
            coroa.thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
