package sincronizacao;

public class CalcNaoSyncMain {
    public static void main(String[] args) {
        int[] vetor = {1,2,3};
        new CalculoNaoSincronizadoRunnable("T1", vetor);
        new CalculoNaoSincronizadoRunnable("T2", vetor);
    }
}
