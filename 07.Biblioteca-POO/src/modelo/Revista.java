package src.modelo;

// Revista hereda de Publicacion
public class Revista extends Publicacion {

    // Información propia de la revista
    private int numero;

    // Constructor
    public Revista(String titulo, String autor, int anio, int numero) {

        // Llamamos al constructor del padre
        super(titulo, autor, anio);

        // Guardamos el número de la revista
        this.numero = numero;
    }

    // Sobrescribimos el método del padre
    @Override
    public void mostrarInformacion() {

        // Mostramos la información heredada
        super.mostrarInformacion();

        // Mostramos información propia de la revista
        System.out.println("Número de revista: " + numero);
    }
}