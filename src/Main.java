public class Main {
    //Atributos
    private String nombre;
    private int edad;


    public Main(String nombre, int edad){
        this. nombre=nombre;
        this.edad= edad;
    }



    //metodo getter y setter
    public String  getNombre(){
        return  nombre;
    }
        public void setNombre(String nombre){
            this.nombre=nombre;

        }

    public int getEdad(){
        return  edad;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }




    public void saludar(){
        System.out.println("NOMBRE: "+ nombre);
        System.out.println(("EDAD: " + edad));

    }

}





