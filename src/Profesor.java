import java.util.ArrayList;
import java.util.HashMap;

public class Profesor extends Thread{


    @Override
    public void run() {

        try {

            synchronized (Main.listaAlumnos){
                Main.listaAlumnos.wait();

                empezarDesinfeccion();
                Main.listaAlumnos.notify();


            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }



    }


    private void empezarDesinfeccion(){

        try {
            sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("=====Empiezo la PRIMERA desinfección=====");

        Main.listaAlumnos.notify();
        System.out.println("Empiezo a desinfectar al alumno X");
        System.out.println("Alumno X desinfectado");



    }

}
