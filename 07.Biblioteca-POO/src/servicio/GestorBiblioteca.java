package src.servicio;

import src.modelo.Publicacion;

import java.util.ArrayList;

public class GestorBiblioteca {

    // Lista donde guardaremos las publicaciones
    private ArrayList<Publicacion> publicaciones = new ArrayList<>();

    // Agrega una publicación a la lista
    public void agregarPublicacion(Publicacion publicacion) {
        publicaciones.add(publicacion);
    }

    // Muestra todas las publicaciones
    public void mostrarTodo() {

        for (Publicacion publicacion : publicaciones) {

            System.out.println("--------------------");

            publicacion.mostrarInformacion();
        }
    }
}