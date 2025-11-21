public class CarreraVehiculos extends Juego {
    private String tipoVehiculo;
    private int pistas;

    public CarreraVehiculos(String nombre, String dificultad, double precio, String tipoVehiculo, int pistas)
            throws DatoInvalidoException {
        super(nombre, dificultad, precio);
        this.tipoVehiculo = tipoVehiculo;
        this.pistas = pistas;
    }

    @Override
    public String mostrarInfo() {
        return "----------|| CARRERITAS ||----------\n" +
                getNombre() + "\nDificultad: " + getDificultad() +
                "\nPrecio: $" + getPrecio() +
                "\nVehiculo: " + tipoVehiculo +
                "\nPistas: " + pistas;
    }
}

