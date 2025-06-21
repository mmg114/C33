package clase1;

 public class Estudiantes {

     Estudiantes(){}

     Estudiantes(String nombre,String apellido){
         this.nombre = nombre;
         this.apellido = apellido;
     }

     public Estudiantes(String apellido, String nombre, Integer edad, String identificacion) {
         this.apellido = apellido;
         this.nombre = nombre;
         this.edad = edad;
         this.identificacion = identificacion;
     }

     private String apellido,nombre;
     private Integer edad;
     private String identificacion;

    //Matricula
    public static void matricular(){
        System.out.println("Estudiante matriculandose");

    }

    public int calcularSemestre(int semestreActual){
        return semestreActual +1;
    }

    public String nombreCompleto(String nombre,String apellido) {
        return nombre + " " + apellido;
    }

     @Override
     public String toString() {
         return "Estudiantes{" +
                 "identificacion='" + identificacion + '\'' +
                 ", edad=" + edad +
                 ", nombre='" + nombre + '\'' +
                 ", apellido='" + apellido + '\'' +
                 '}';
     }

     public String getNombre() {
        return nombre;
     }

     public void setNombre(String nombre) {
        this.nombre = nombre;
     }

     public String getApellido() {
         return apellido;
     }

     public void setApellido(String apellido) {
         this.apellido = apellido;
     }

     public Integer getEdad() {
         return edad;
     }

     public void setEdad(Integer edad) {
         this.edad = edad;
     }

     public String getIdentificacion() {
         return identificacion;
     }

     public void setIdentificacion(String identificacion) {
         this.identificacion = identificacion;
     }
 }
