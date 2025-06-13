package clase1;

 class Estudiantes {


    String apellido,nombre;
    int edad;
    String identificacion;

    //Matricula
    public void matricular(){
        System.out.println("Estudiante matriculandose");

    }

    public int calcularSemestre(int semestreActual){
        return semestreActual +1;
    }

    public String nombreCompleto(String nombre,String apellido) {
        return nombre + " " + apellido;
    }

}
