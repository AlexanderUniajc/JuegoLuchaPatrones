// Clase que representa el juego de lucha entre dos personajes
public class JuegoLucha {
    // Atributos privados: los dos jugadores
    private Personaje jugador1; // Primer personaje
    private Personaje jugador2; // Segundo personaje

    // Constructor de la clase JuegoLucha
    // Crea dos personajes con los nombres proporcionados
    public JuegoLucha(String nombre1, String nombre2) {
        this.jugador1 = new Personaje(nombre1); // Instancia el primer personaje
        this.jugador2 = new Personaje(nombre2); // Instancia el segundo personaje
    }

    // Método para iniciar la pelea
    // Imprime el inicio de la pelea y alterna turnos hasta que uno de los personajes muera
    public void iniciarPelea() {
        System.out.println("La pelea comienza entre " + jugador1.getNombre() + 
                           " y " + jugador2.getNombre() + "..."); // Mensaje de inicio

        // Bucle mientras ambos personajes estén vivos
        while (jugador1.estaVivo() && jugador2.estaVivo()) {
            turno(jugador1, jugador2); // Turno del jugador 1
            if (jugador2.estaVivo()) { // Si el jugador 2 sigue vivo
                turno(jugador2, jugador1); // Turno del jugador 2
            }
        }

        // Determina y anuncia el ganador
        if (jugador1.estaVivo()) {
            System.out.println(jugador1.getNombre() + " ha ganado la pelea.");
        } else {
            System.out.println(jugador2.getNombre() + " ha ganado la pelea.");
        }
    }

    // Método privado para manejar un turno de ataque
    // El atacante ataca al defensor e imprime el estado
    private void turno(Personaje atacante, Personaje defensor) {
        System.out.println("Turno de " + atacante.getNombre() + 
                           ". Puntos de vida de " + defensor.getNombre() + ": " + 
                           defensor.getPuntosDeVida()); // Imprime el turno y vida del defensor

        atacante.atacar(defensor); // El atacante realiza el ataque

        System.out.println(defensor.getNombre() + 
                           " ahora tiene " + defensor.getPuntosDeVida() + 
                           " puntos de vida."); // Imprime la vida restante del defensor
    }
}