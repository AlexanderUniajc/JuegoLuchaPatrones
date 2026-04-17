// Importación de la clase Random para generar números aleatorios
import java.util.Random;

// Clase que representa a un personaje en el juego de lucha
public class Personaje {
    // Atributos privados del personaje
    private String nombre; // Nombre del personaje
    private int puntosDeVida; // Puntos de vida actuales del personaje
    private final int MAX_DANO = 30; // Daño máximo que puede causar un ataque
    private final int MIN_DANO = 10; // Daño mínimo que puede causar un ataque

    // Constructor de la clase Personaje
    // Inicializa el nombre y establece los puntos de vida en 100
    public Personaje(String nombre) {
        this.nombre = nombre;
        this.puntosDeVida = 100;
    }

    // Método para que el personaje ataque a un oponente
    // Genera un daño aleatorio entre MIN_DANO y MAX_DANO y lo aplica al oponente
    public void atacar(Personaje oponente) {
        Random rand = new Random(); // Instancia de Random para generar números aleatorios
        int dano = rand.nextInt((MAX_DANO - MIN_DANO) + 1) + MIN_DANO; // Calcula el daño aleatorio
        oponente.recibirDano(dano); // Aplica el daño al oponente
        System.out.println(this.nombre + " ataca a " + oponente.getNombre() + 
                           " causando " + dano + " puntos de dano."); // Imprime el mensaje del ataque
    }

    // Método para recibir daño
    // Reduce los puntos de vida del personaje por el daño recibido
    // Asegura que los puntos de vida no bajen por debajo de 0
    public void recibirDano(int dano) {
        this.puntosDeVida -= dano; // Reduce los puntos de vida
        if (this.puntosDeVida < 0) { // Si los puntos de vida son negativos
            this.puntosDeVida = 0; // Los establece en 0
        }
    }

    // Método para verificar si el personaje está vivo
    // Retorna true si los puntos de vida son mayores a 0
    public boolean estaVivo() {
        return this.puntosDeVida > 0;
    }

    // Getter para obtener el nombre del personaje
    public String getNombre() {
        return this.nombre;
    }

    // Getter para obtener los puntos de vida del personaje
    public int getPuntosDeVida() {
        return this.puntosDeVida;
    }
}