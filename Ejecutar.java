// Importación de la clase Scanner para leer entrada del usuario
import java.util.Scanner;

// Clase principal que ejecuta el juego
public class Ejecutar {
    // Método main, punto de entrada del programa
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Instancia de Scanner para leer desde la consola

        System.out.print("Introduce el nombre del jugador 1: "); // Pide el nombre del primer jugador
        String nombre1 = scanner.nextLine(); // Lee el nombre del primer jugador

        System.out.print("Introduce el nombre del jugador 2: "); // Pide el nombre del segundo jugador
        String nombre2 = scanner.nextLine(); // Lee el nombre del segundo jugador

        JuegoFacade juego = new JuegoFacade(nombre1, nombre2);
        juego.jugar();
    }
}