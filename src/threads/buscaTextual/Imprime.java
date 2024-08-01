package threads.buscaTextual;

public class Imprime implements Runnable {

    private Integer vezes;

    public Imprime(Integer vezes) {
        this.vezes = vezes;
    }

    @Override
    public void run() {

        for (int num=1; num <= vezes; num++) {
            Thread threadAtual = Thread.currentThread();
            long id = threadAtual.getId();
            System.out.println("N: " + num + " - Id da thread: " + id);
        }

    }
}
