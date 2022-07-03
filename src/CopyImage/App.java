import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CopyImg implements Runnable {

    public static void main(String[] args) 
    {
      ExecutorService executor = Executors.newFixedThreadPool(4);
      
        @Override
        public void run() {
            for(int i=1; i < 4999 ; i++) {
                copyImg1();
                deleteImg1();
            }
            copyImg1();
        
    }
}
}

// hacer un programa que lea 4 imagenes de una carpeta y las copie a otro
// directorio

// hacerlo con el executor service para que sea un pool (hacer de 4)
// pasar por parametro la url y hacer 5000 copiar y borrar
// probar con ImageIO
// para poner el directorio es C\\.... C:\ImagenesJava