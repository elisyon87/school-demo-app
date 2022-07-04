package com.darkwilly08;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import com.darkwilly08.copyimage.models.CopyPaste;

public class App {

    public static void main(String[] args) throws Exception {

        long initTime = System.currentTimeMillis();

        for (int i = 1; i < 5; i++) {
            new CopyPaste("C:\\origenImagenJava\\" + i + ".jpg", "C:\\destinoImagenJava\\" + i + ".jpg").start();

        }

        long diff = System.currentTimeMillis() - initTime;

        ExecutorService executor = Executors.newFixedThreadPool(4);

        for (int i = 1; i < 5; i++) {
            new CopyPaste("C:\\origenImagenJava\\" + i + ".jpg", "C:\\destinoImagenJava\\" + i + ".jpg")
                    .deleteFile("C:\\destinoImagenJava\\" + i + ".jpg");
        }

        long initTimeThread = System.currentTimeMillis();

        executor.execute(new CopyPaste("C:\\origenImagenJava\\1.jpg", "C:\\destinoImagenJava\\1.jpg"));
        executor.execute(new CopyPaste("C:\\origenImagenJava\\2.jpg", "C:\\destinoImagenJava\\2.jpg"));
        executor.execute(new CopyPaste("C:\\origenImagenJava\\3.jpg", "C:\\destinoImagenJava\\3.jpg"));
        executor.execute(new CopyPaste("C:\\origenImagenJava\\4.jpg", "C:\\destinoImagenJava\\4.jpg"));

        executor.shutdown();

        executor.awaitTermination(Integer.MAX_VALUE, TimeUnit.NANOSECONDS);

        long diffThread = System.currentTimeMillis() - initTimeThread;

        System.out.println("sin hilos tardo " + diff);

        System.out.println("con hilos tardo " + diffThread);

    }

}

// hacer un programa que lea 4 imagenes de una carpeta y las copie a otro
// directorio

// hacerlo con el executor service para que sea un pool (hacer de 4)
// pasar por parametro la url y hacer 5000 copiar y borrar
// probar con ImageIO
// para poner el directorio es C\\.... C:\ImagenesJava