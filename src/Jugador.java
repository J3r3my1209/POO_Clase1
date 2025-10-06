import java.util.Scanner;

public class Jugador {
    String nombre;
    String posicion;
    int edad;
    int numeroCamiseta;

    public Jugador(String nombre, String posicion, int edad, int numeroCamiseta) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.edad = edad;
        this.numeroCamiseta = numeroCamiseta;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Posición: " + posicion);
        System.out.println("Edad: " + edad);
        System.out.println("Número de camiseta: " + numeroCamiseta);
        System.out.println("-------------------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Jugador[] jugadores = new Jugador[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese los datos del jugador " + (i + 1) + ":");

            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Posición: ");
            String posicion = scanner.nextLine();

            System.out.print("Edad: ");
            int edad = scanner.nextInt();

            System.out.print("Número de camiseta: ");
            int numeroCamiseta = scanner.nextInt();
            scanner.nextLine();

            // Crear un nuevo objeto Jugador y almacenarlo en el arreglo
            jugadores[i] = new Jugador(nombre, posicion, edad, numeroCamiseta);
        }

        System.out.println("\nInformación de los jugadores:");
        for (int i = 0; i < 3; i++) {
            jugadores[i].mostrarInformacion();
        }

        scanner.close();
    }
}
