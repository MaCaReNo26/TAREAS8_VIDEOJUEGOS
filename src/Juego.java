public abstract class Juego {
    private String nombre;
    private String dificultad;
    private double precio;

    public Juego(String nombre, String dificultad, double precio) throws DatoInvalidoException {
        setNombre(nombre);
        setDificultad(dificultad);
        setPrecio(precio);
    }

    public String getNombre() { return nombre; }
    public String getDificultad() { return dificultad; }
    public double getPrecio() { return precio; }

    public void setNombre(String nombre) throws DatoInvalidoException {
        if(nombre == null || nombre.trim().isEmpty())
            throw new DatoInvalidoException("El nombre no puede estar vacio");
        this.nombre = nombre;
    }

    public void setDificultad(String dificultad) throws DatoInvalidoException {
        if(dificultad == null || dificultad.trim().isEmpty())
            throw new DatoInvalidoException("La dificultad no puede estar vacia");
        this.dificultad = dificultad;
    }

    public void setPrecio(double precio) throws DatoInvalidoException {
        if(precio <= 0)
            throw new DatoInvalidoException("El precio debe ser positivo");
        this.precio = precio;
    }

    public abstract String mostrarInfo();
}
