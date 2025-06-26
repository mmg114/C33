package Clase5;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {


    private static final Logger log = Logger.getLogger(Main.class.getName());


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("::: Dividir :::");
            System.out.println("Ingrese El primer numero : ");
            var a = scanner.nextInt();
            System.out.println("Ingrese El primer numero : ");
            var b = scanner.nextInt();
            int resultado = dividir(a, b);
            log.info("El resultado es: " + resultado);
        } catch (ArithmeticException e) {
           log.info("Error: " + e.getMessage());
        }finally {
            log.info("Fin del programa y ejecucion del scanner.close");
           scanner.close();
        }
    }

    public static int dividir(int a, int b) {
        return a / b;
    }

}
