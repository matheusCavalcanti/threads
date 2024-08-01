package threads.aula1;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Isso é uma thread main");

        Thread threadPrint = new Thread(new TarefaImprime("Boa noite Threads"), "Thread Imprime");
        threadPrint.start();

        Thread.sleep(20000);
    }
}