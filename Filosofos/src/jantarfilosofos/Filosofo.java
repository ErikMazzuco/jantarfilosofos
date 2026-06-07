package jantarfilosofos;

import java.util.Random;

public class Filosofo extends Thread {

    private final int id;
    private final Hashi esquerdo;
    private final Hashi direito;
    private final boolean invertido;

    private final Random random = new Random();

    public Filosofo(int id, Hashi esquerdo, Hashi direito, boolean invertido) {
        this.id = id;
        this.esquerdo = esquerdo;
        this.direito = direito;
        this.invertido = invertido;
    }

    private void pensar() throws InterruptedException {
        System.out.println("Filósofo " + id + " está pensando.");
        Thread.sleep(random.nextInt(3000) + 1000);
    }

    private void comer() throws InterruptedException {
        System.out.println("Filósofo " + id + " está COMENDO.");
        Thread.sleep(random.nextInt(2000) + 1000);
    }

    @Override
    public void run() {

        try {
            while (true) {

                pensar();

                if (invertido) {

                    synchronized (direito) {

                        System.out.println(
                            "Filósofo " + id +
                            " pegou hashi direito " +
                            direito.getId());

                        synchronized (esquerdo) {

                            System.out.println(
                                "Filósofo " + id +
                                " pegou hashi esquerdo " +
                                esquerdo.getId());

                            comer();
                        }
                    }

                } else {

                    synchronized (esquerdo) {

                        System.out.println(
                            "Filósofo " + id +
                            " pegou hashi esquerdo " +
                            esquerdo.getId());

                        synchronized (direito) {

                            System.out.println(
                                "Filósofo " + id +
                                " pegou hashi direito " +
                                direito.getId());

                            comer();
                        }
                    }
                }

                System.out.println(
                    "Filósofo " + id +
                    " terminou de comer.");
            }

        } catch (InterruptedException e) {
            interrupt();
        }
    }
}
