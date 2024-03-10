package sincronizacao;

public class CalcSyncMain {
    public static void main(String[] args) {
        int[] vetor = {1,2,3};
        new CalculoSincronizadoRunnable("T1", vetor);
        new CalculoSincronizadoRunnable("T2", vetor);
    }
}
