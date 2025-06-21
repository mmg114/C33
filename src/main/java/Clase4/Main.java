package Clase4;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {

        Scanner scaner = new Scanner(System.in);

        System.out.println("Digita el numero de dia de la semana");
        int dia=scaner.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Lunes");
                break;
            case 3:
                System.out.println("Martes");
                break;
            case 4:
                System.out.println("Miercoles");
                break;
            case 5:
                System.out.println("Jueves");
                break;
            case 6:
                System.out.println("Viernes");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Error");
        }
        System.out.println("________________________________________");


        int i = 0;
        while (i < 5) {
            System.out.println("i es: " + i);
            i++;
        }
        System.out.println("________________________________________");
        int j = 0;
        do {
            System.out.println("j es: " + j);
            j++;
        } while (j < 5);

        //Date y localDate
// Java 8
        Date fecha = new Date();
        System.out.println("Fecha: " + fecha);
//java 11
        LocalDate localDate = LocalDate.now();
        System.out.println("Fecha: " + localDate);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Fecha con hora: " + localDateTime);
    }

    public static boolean validarClave(String usuario, String contrasena){
        String user= "Mauricio@gmail.com";
        String clave= "123456";

        boolean valido = false;

        if(user.equals(usuario) && clave.equals(contrasena)){
            valido = true;
        }
        return valido;
    }
}
