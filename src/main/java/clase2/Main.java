package clase2;

import clase1.Estudiantes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {


//LISTAS Y ARREGLOS
//_____________________________________________________________________________________

        Estudiantes mauricio = new Estudiantes("Munoz","Mauricio",32,"1144");
        Estudiantes camilo = new Estudiantes("Munoz","Camilo",32,"11441");

        List<Estudiantes> listEstudiantes= new ArrayList<>();

        listEstudiantes.add(mauricio);
        listEstudiantes.add(camilo);

        listEstudiantes.forEach(System.out::println);

        //hay 2 formas

        //Forma 1
        int[] edadesDeEstudiantesF1 = {20,19,18,17};


        int[] edadesDeEstudiantesF2 = new int[20];

        edadesDeEstudiantesF2[0]=11;
        edadesDeEstudiantesF2[1]=12;
        edadesDeEstudiantesF2[19]=6;

        Arrays.stream(edadesDeEstudiantesF2).forEach(System.out::println);



//IF ELSE
//________________________________________________________________________________________________



        int valor = -18;
        //Caso 1
        if(valor<0){
            System.out.println("El valor es negativo");
        }

        if(valor>0){
            System.out.println("El valor es positivo");
        }

        if(valor==0){
            System.out.println("El valor es 0");
        }
        //Caso2

        if (valor<0){
            System.out.println("El valor es negativo");
        }else if (valor>0){
            System.out.println("El valor es positivo");
        } else {
            System.out.println("El valor es 0");
        }
    }
}
