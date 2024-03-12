package exercicio04;

public class ContadorThread extends Thread {
    private ContadorComponente contadorComponente;
    private boolean rodando = true;
    private boolean pausado = false;

    ContadorThread(ContadorComponente contadorComponente) {
        this.contadorComponente = contadorComponente;
    }

    @Override
    public void run() {
        while (rodando) {
            if(!pausado) {
                contadorComponente.incrementaContador();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void parar() {
        rodando = false;
    }

    public void setPausado(boolean pausado) {
        this.pausado = pausado;
    }
}
