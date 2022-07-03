public class CopyImg implements Runnable {

    public static void main(String[] args) 
    {
      ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(4);
      for (int i = 0; i < 499; i++) {
        
      }


}

// hacer un programa que lea 4 imagenes de una carpeta y las copie a otro
// directorio

// hacerlo con el executor service para que sea un pool (hacer de 4)
// pasar por parametro la url y hacer 5000 copiar y borrar
// probar con ImageIO
// para poner el directorio es C\\.... C:\ImagenesJava