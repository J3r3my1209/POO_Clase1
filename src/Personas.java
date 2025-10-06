public class Personas {
    int cedula;
    String nombre;
    int edad;
    String correo;

    public Personas(int cedula, String nombre, int edad, String correo){
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
    }

    void imprimir(){
        System.out.println("Bienvenido " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Correo: " + correo);
    }

    public static void main(String[] args) {
        Personas objt1 = new Personas(1245678910, "Jose", 20, "jose@email.com");
        objt1.imprimir();

        Personas objeto2 = new Personas(17584564, "Jorge", 19, "jorge@gmail.com");
        objeto2.imprimir();
    }
}
