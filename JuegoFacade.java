class JuegoFacade {
    private JuegoLucha juego;

    public JuegoFacade(String nombre1, String nombre2) {
        this.juego = new JuegoLucha(nombre1, nombre2);
    }

    public void jugar() {
        System.out.println("Preparando el juego...");
        juego.iniciarPelea();
        System.out.println("Juego finalizado.");
    }
}