package src.modelo;

// Periodico hereda de Publicacion
public class Periodico extends Publicacion {

    // Información propia del periódico
    private String seccion;

    // Constructor
    public Periodico(String titulo, String autor, int anio, String seccion) {

        // Llamamos al constructor del padre
        super(titulo, autor, anio);

        // Guardamos la sección
        this.seccion = seccion;
    }

    // Sobrescribimos el método del padre
    @Override
    public void mostrarInformacion() {

        // Mostramos la información heredada
        super.mostrarInformacion();

        // Mostramos información propia del periódico
        System.out.println("Sección: " + seccion);
    }
}