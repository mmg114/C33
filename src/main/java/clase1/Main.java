package clase1;

 public class Main {

     public static void main(String[] args) {

            Estudiantes jose = new Estudiantes();
            System.out.println(jose.toString());
            jose.setNombre("Jose");
/*            jose.apellido = "Arango";

            jose.edad = 18;
            jose.identificacion = "12345";*/
            System.out.println(jose.toString());

         System.out.println("---------------------------------------------------");
            Estudiantes mauricio = new Estudiantes("Munoz","Mauricio",32,"1144");
            System.out.println(mauricio.toString());
     }
 }
