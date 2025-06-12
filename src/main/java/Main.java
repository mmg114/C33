import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;


public  class Main {

    public  void main(String[] args) {
        System.out.println("Hola mundo");

        int edad =25 - 8;
        double pi = 3.14159265358979323846;
        char sexo = 'M';
        boolean esMayorDeEdad = edad > 18;
        Integer esMayorDeEdad2 = edad;

        String esMayorString=esMayorDeEdad2.toString();

        Date fecha = new Date();
        LocalDate localDate = LocalDate.now();
        BigDecimal salida = new BigDecimal(edad);
        String mensaje = "Hola mundo";
        String hola=mensaje;
    }
}
