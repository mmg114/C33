package clase3;

import clase1.Estudiantes;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Estudiantes> listEstudiantes= new ArrayList<>();
        Estudiantes mauricio = new Estudiantes("Munoz","Mauricio",32,"1144");
        Estudiantes camilo = new Estudiantes("Munoz","Camilo",32,"11441");

        listEstudiantes.add(mauricio);
        listEstudiantes.add(camilo);
        int[] edadesDeEstudiantesF1 = {20,19,18,17};


        for(int edad :edadesDeEstudiantesF1){
            System.out.println(edad);
        }

        System.out.println("__________________________________________");
        for (int i = 0; i < edadesDeEstudiantesF1.length; i=i+2) {
            System.out.println("edad es: " + edadesDeEstudiantesF1[i]);
        }
        System.out.println("__________________________________________");
        listEstudiantes.forEach(System.out::println);

        listEstudiantes.stream().forEach(System.out::println);

    }
}
