package Clase4;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

      /*  Scanner scaner = new Scanner(System.in);

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
        }*/
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



    }
    public boolean validarClave(String usuario, String contrasena){
        String clave= "123456";
        String user= "Mauricio@gmail.com";
        boolean valido = false;

        if(user.equals(usuario) && clave.equals(contrasena)){
            valido = true;
        }
        return valido;
    }
}
