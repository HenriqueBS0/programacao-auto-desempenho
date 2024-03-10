package sincronizacao;

public class CalculoSincronizado {
    private int soma;

    public synchronized int somaVetor(int[] vetor) {
        soma = 0;
        for (int x = 0; x < vetor.length; x++) {
            soma += vetor[x];
            System.out.println(Thread.currentThread().getName()
                + " - somado " + vetor[x] +
                " - total = " + soma 
            );

            try {
                Thread.sleep(100);  
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return soma;
    }
}
