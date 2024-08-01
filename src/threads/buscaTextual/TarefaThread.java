package threads.buscaTextual;

public class TarefaThread {

    public static void main(String[] args) {

        Integer vezes = 1000;

        Thread thread1 = new Thread(new Imprime(vezes));
        Thread thread2 = new Thread(new Imprime(vezes));

        thread1.start();
        thread2.start();

    }

}
