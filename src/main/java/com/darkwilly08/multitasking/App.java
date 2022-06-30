package com.darkwilly08.multitasking;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws InterruptedException {
        // TODO: cambiar schoolManager para que agregue el addTeaacher de manera
        // asyncronica mostrando un puntito cada 1 segundo
        List<Thread> threads = new ArrayList<>();
        Thread thread = new Thread(new ReadImg());
        Thread thread2 = new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println("estyo en un hilo desde una clase anonima");

            }

        });

        threads.add(thread);
        threads.add(thread2);

        thread.start();
        thread2.start();

        for (int i = 0; i < threads.size(); i++) {
            Thread t = threads.get(i);

            t.join();
        }

        thread2.interrupt();

        // todo termino
    }
}
