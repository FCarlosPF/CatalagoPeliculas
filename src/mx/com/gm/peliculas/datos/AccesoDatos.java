/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mx.com.gm.peliculas.datos;

import java.util.List;
import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.*;
/**
 *
 * @author LENOVO
 */
public interface AccesoDatos {
    
    boolean existe(String nombreArchivo) throws AccesoDatosEx;
    
    List<Pelicula> listar(String nombreRecurso) throws LecturaDatosEx;
    
    void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosEx;
    
    String buscar(String nombreArchivo, String buscar) throws LecturaDatosEx;
    
    void crear(String nombreArchivo) throws AccesoDatosEx;
    
    void borrar(String nombreArchivo)throws AccesoDatosEx;
    
    
    
}
