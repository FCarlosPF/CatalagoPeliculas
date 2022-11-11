/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.gm.peliculas.negocio;

import java.util.logging.Level;
import java.util.logging.Logger;
import mx.com.gm.peliculas.datos.*;
import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.AccesoDatosEx;
import mx.com.gm.peliculas.excepciones.LecturaDatosEx;

/**
 *
 * @author LENOVO
 */
public class CatalogoPeliculasImp implements CatalogoPeliculas {
    
    
    private final AccesoDatos datos;

    public CatalogoPeliculasImp() {
        this.datos= new AccesoDatosImpl();
    }

    
    
    @Override
    public void agregarPelicula(String nombrePelicula) {
        Pelicula pelicula= new Pelicula(nombrePelicula);
        boolean anexar= false;
        try {   
            anexar = datos.existe(NOMBRE_ARCHIVO);
            datos.escribir(pelicula, NOMBRE_ARCHIVO, anexar);
        } catch (AccesoDatosEx ex) {
            System.out.println("Error de acceso a datos");
            ex.printStackTrace();
        }
    }

    @Override
    public void listarPeliculas() {
        try {
            var peliculas =  this.datos.listar(NOMBRE_ARCHIVO);
            for(var pelicula : peliculas){
                System.out.println("pelicula = " + pelicula);
            }
        } catch (LecturaDatosEx ex) {
            System.out.println("Error de acceso de datos");
            ex.printStackTrace();
        }
    }

    @Override
    public void buscarPeliculas(String buscar) {
        String resultado=null;
        try {
            resultado= this.datos.buscar(NOMBRE_ARCHIVO, buscar);
        } catch (LecturaDatosEx ex) {
            System.out.println("Error de acceso de datos");
            ex.printStackTrace();
        }
        System.out.println("resultado = " + resultado);
    }

    @Override
    public void iniciarCatalogoPeliculas() {
        try {
            if(this.datos.existe(NOMBRE_ARCHIVO)){
                datos.borrar(NOMBRE_ARCHIVO);
                datos.crear(NOMBRE_ARCHIVO);
            }else{
                datos.crear(NOMBRE_ARCHIVO);
            }
        } catch (AccesoDatosEx ex) {
            System.out.println("Error de acceso de datos");
            ex.printStackTrace();
        }
    }
    
}
