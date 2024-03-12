package exercicio06;

public class Busca {
    public Integer numero;
    public boolean finalizada = false;
    public Integer indice = -1;
    public Integer threadsFinalizadas = 0;

    public Busca(Integer numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Busca{" +
                "numero=" + numero +
                ", finalizada=" + finalizada +
                ", indice=" + indice +
                ", threadsFinalizadas=" + threadsFinalizadas +
                '}';
    }
}
