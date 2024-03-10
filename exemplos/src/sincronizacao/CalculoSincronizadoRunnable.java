package sincronizacao;

public class CalculoSincronizadoRunnable implements Runnable {
    private int[] vetor;
    private String nome;
    private static CalculoSincronizado calc = new CalculoSincronizado();

    public CalculoSincronizadoRunnable(String nome, int[] vetor) {
        this.nome = nome;
        this.vetor = vetor;
        new Thread(this, nome).start();
    }

    @Override
    public void run() {
        System.out.println("Inicio de " + nome);
        int soma = calc.somaVetor(vetor);
        System.out.println("Fim de " + nome + " - soma = " + soma);
    }
}
