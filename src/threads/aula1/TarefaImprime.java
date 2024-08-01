package threads.aula1;

public class TarefaImprime implements Runnable{

    private String texto;

    public TarefaImprime(String texto) {
        this.texto = texto;
    }

    @Override
    public void run() {
        System.out.println(texto);
    }
}
