public class Estudiantes {
        //Atributos
        public String nombre;
        public int edad;

    public Estudiantes(String nombre, int edad){
      this. nombre=nombre;
      this.edad= edad;
    }

      public void saludar(){
          System.out.println("NOMBRE: "+ nombre);
          System.out.println(("EDAD: " + edad));

        }

        public static  void main(String[] args){
        Estudiantes estudiante_desarrollo= new  Estudiantes("JHON",25);
        estudiante_desarrollo.saludar();
    }
}





