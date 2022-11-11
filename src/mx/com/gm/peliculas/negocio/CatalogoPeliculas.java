/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mx.com.gm.peliculas.negocio;

/**
 *
 * @author LENOVO
 */
public interface CatalogoPeliculas {
    
    
    String NOMBRE_ARCHIVO="peliculas.txt";
    
    void agregarPelicula(String nombrePelicula);
    
    void listarPeliculas();
    
    void buscarPeliculas(String buscar);
    
    void iniciarCatalogoPeliculas();

    
}
