import java.util.Scanner;

public class Empleados {
    String nombre;
    int edad;
    String cargo;
    double salario;

    public Empleados (String nombre, int edad, String departamento, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.cargo = cargo;
        this.salario = salario;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Departamento: " + cargo);
        System.out.println("Salario: " + salario);
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Empleados[] empleados = new Empleados[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese los datos del empleado " + (i + 1) + ":");

            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Edad: ");
            int edad = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Cargo: ");
            String departamento = scanner.nextLine();

            System.out.print("Salario: ");
            double salario = scanner.nextDouble();
            scanner.nextLine();

            empleados[i] = new Empleados(nombre, edad, departamento, salario);
        }

        System.out.println("\nInformación de los empleados:");
        for (int i = 0; i < 3; i++) {
            empleados[i].mostrarInformacion();
        }

        scanner.close();
    }
}
