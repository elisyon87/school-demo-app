package com.darkwilly08.multitasking;

//hacer un programa que lea 4 imagenes de una carpeta y las copie a otro directorio

//hacerlo con el executor service para que sea un pool (hacer de 4)
//pasar por parametro la url y hacer 5000 copiar y borrar
//probar con ImageIO
//para poner el directorio es C\\....

public class ReadImg implements Runnable {

    @Override
    public void run() {
        System.out.println("Estoy en un hilo que NO es el ppal");
    }

}
