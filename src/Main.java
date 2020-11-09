import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static ArrayList<String> listaAlumnos= new ArrayList<>();


    public static void main(String[] args){

        Profesor profesor= new Profesor();
        Alumnos alumnos = new Alumnos();

        /*for(int i=0;i<9;i++) {

            Alumnos alumnos = new Alumnos();
            listaAlumnos.put(i, alumnos);
            alumnos.start();

            System.out.println("Ha llegado el alumno"+(listaAlumnos.get(i)));
            System.out.println("Alumno "+listaAlumnos.get(i)+" espera a que el profesor le desinfecte");
        }*/



       profesor.start();
       alumnos.start();



    }


}
