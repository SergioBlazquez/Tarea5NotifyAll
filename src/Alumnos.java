import java.util.ArrayList;

public class Alumnos extends Thread{

    @Override
    public void run() {

        int random=0;

        synchronized (Main.listaAlumnos) {


            for (int i=0;i<5;i++){


                do{

                    random=(int)(Math.random()*10);


                }while(random<1 && random>10);
                System.out.println("Random: "+random);
                try {
                    sleep(random*1000);
                    System.out.println("El alumno "+(i+1)+" ha dormido "+(random)+" segundos");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }

        }


    }



}
