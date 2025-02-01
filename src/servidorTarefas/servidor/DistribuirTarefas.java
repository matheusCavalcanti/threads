package servidorTarefas.servidor;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class DistribuirTarefas implements Runnable {

    private ServidorTarefas servidor;
    private Socket socket;

    public DistribuirTarefas(Socket socket, ServidorTarefas servidor) {
        this.socket = socket;
        this.servidor = servidor;
    }

    @Override
    public void run() {

        try {
            System.out.println("Distribuindo tarefas para " + socket);

            Scanner entradaCliente = new Scanner(socket.getInputStream());

            PrintStream saidaCliente = new PrintStream(socket.getOutputStream());

            while (entradaCliente.hasNextLine()) {
                String comando = entradaCliente.nextLine();
                System.out.println("Comando recebido: " + comando);

                switch (comando) {

                    case "c1" : {
                        saidaCliente.println("Confirmação comando c1");
                        break;
                    }
                    case "c2" : {
                        saidaCliente.println("Confirmação comando c2");
                        break;
                    }case "fim" : {
                        saidaCliente.println("Desligando servidor");
                        servidor.parar();
                        break;
                    }
                    default: {
                        saidaCliente.println("Comando não encontrado");
                    }
                }

                System.out.println(comando);
            }

            entradaCliente.close();
            saidaCliente.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
