package exercicio03;

public class SemaforoMain {
    public static void main(String[] args) {
        Semaforo semaforo1 = new Semaforo(2000);
        Semaforo semaforo2 = new Semaforo(3000);
        Semaforo semaforo3 = new Semaforo(1000);
        Semaforo semaforo4 = new Semaforo(5000);
    
        semaforo1.start();
        semaforo2.start();
        semaforo3.start();
        semaforo4.start();
    }
}
