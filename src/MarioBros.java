public class MarioBros extends Juego {
    private int nivel;
    private int mundos;

    public MarioBros(String nombre, String dificultad, double precio, int nivel, int mundos)
            throws DatoInvalidoException {
        super(nombre, dificultad, precio);
        this.nivel = nivel;
        this.mundos = mundos;
    }

    @Override
    public String mostrarInfo() {
        return "---------- || MARIO BROS ||----------\n" +
                getNombre() + "\nDificultad: " + getDificultad() +
                "\nPrecio: $" + getPrecio() +
                "\nNivel: " + nivel +
                "\nMundos: " + mundos;
    }
}

