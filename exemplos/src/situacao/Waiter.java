package situacao;

public class Waiter implements Runnable {
    private Message msg;

    public Waiter(Message m) {
        msg = m;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        synchronized (msg) {
            try {
                System.out.println(name + " esperando para ser notificado na hora: " + System.currentTimeMillis());
                msg.wait();
            }
            catch(InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(name +
                " esperador notificado em: " +
                System.currentTimeMillis());
            
            System.out.println(name + " processed: " + msg.getMsg());
        }
    }
}
