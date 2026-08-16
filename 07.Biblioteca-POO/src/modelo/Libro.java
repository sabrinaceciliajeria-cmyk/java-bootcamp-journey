package src.modelo;

// Libro hereda de Publicacion
public class Libro extends Publicacion {

    // Información propia del libro
    private int paginas;

    // Constructor
    public Libro(String titulo, String autor, int anio, int paginas) {

        // Llamamos al constructor del padre
        super(titulo, autor, anio);

        // Guardamos las páginas
        this.paginas = paginas;
    }

    // Sobrescribimos el método del padre
    @Override
    public void mostrarInformacion() {

        // Mostramos primero la información heredada
        super.mostrarInformacion();

        // Mostramos información propia del libro
        System.out.println("Páginas: " + paginas);
    }
}