package servidorTarefas.servidor;

import java.util.concurrent.ThreadFactory;

public class FabricaDeThreads implements ThreadFactory {

    private static int numero = 1;

    @Override
    public Thread newThread(Runnable runnable) {

        Thread thread = new Thread(runnable, "Thread Servidor Tarefas " + numero);
        numero++;

        thread.setUncaughtExceptionHandler(new TratadorDeExcecao());
        return thread;
    }

}
