package testeFila;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class TesteFila {

    public static void main(String[] args) throws InterruptedException {

        BlockingQueue<String> fila = new ArrayBlockingQueue<>(3);

        fila.put("c1");
        fila.put("c2");
        fila.put("c3");
        fila.put("c4");

        System.out.println(fila.take());
        System.out.println(fila.take());
        System.out.println(fila.take());
        System.out.println(fila.take());

        System.out.println(fila.size());

    }

}
