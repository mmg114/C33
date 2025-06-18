package clase2;


import java.util.Scanner;

public class Escaner {

    public static void main(String[] args) {

        Scanner scaner = new Scanner(System.in);

        System.out.println("Digita tu nombre:");
        String nombre=scaner.nextLine();
        System.out.println("Su nombre es: "+nombre);

        System.out.println("Digita tu edad:");
        int edad=scaner.nextInt();
        System.out.println("Su edad es: "+edad);
        scaner.close();


    }
}
