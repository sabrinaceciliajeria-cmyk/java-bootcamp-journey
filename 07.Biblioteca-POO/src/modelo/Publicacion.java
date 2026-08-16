package src.modelo;

public class Publicacion {

    // Atributo con visibilidad default
    String titulo;

    // Atributo protegido
    protected String autor;

    // Atributo privado
    private int anio;

    // Constructor
    public Publicacion(String titulo, String autor, int anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
    }

    // Getter para consultar el año
    public int getAnio() {
        return anio;
    }

    // Muestra la información básica
    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año: " + anio);
    }
}