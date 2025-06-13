package clase1;

 public class Main {

     public static void main(String[] args) {

         Estudiantes estudiante = new Estudiantes();

         estudiante.apellido = "Montalvo";
         estudiante.matricular();
         int proximoSemestre= estudiante.calcularSemestre(6);
         System.out.println(proximoSemestre);
         var fullName = estudiante.nombreCompleto("Mauricio","Guzman");
         System.out.println(fullName);

     }
 }
