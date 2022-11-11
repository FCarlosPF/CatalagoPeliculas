/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.gm.peliculas.presentacion;

import java.util.Scanner;
import mx.com.gm.peliculas.negocio.CatalogoPeliculas;
import mx.com.gm.peliculas.negocio.CatalogoPeliculasImp;

/**
 *
 * @author LENOVO
 */
public class CatalogoPeliculasPresentacion {
    public static void main(String[] args) {
        var opcion=-1;
        
        Scanner e = new Scanner(System.in);
        CatalogoPeliculas catalogo = new CatalogoPeliculasImp(); 
        
        
        do {
            
            System.out.println("Elige una opción\n"
                    +"1. Iniciar catalogo de peliculas\n"
                    +"2. Agregar pelicula\n"
                    +"3. Listar pelicula\n"  
                    +"4. Buscar pelicula\n"
                    +"0. Salir"            );
            opcion = Integer.parseInt(e.nextLine());
            switch (opcion) {
                case 1:
                    catalogo.iniciarCatalogoPeliculas();
                    break;
                case 2:
                    System.out.println("Introduce el nombre de la pelicula");
                    var nombrePelicula = e.nextLine();
                    catalogo.agregarPelicula(nombrePelicula);
                    break;
                case 3:
                    catalogo.listarPeliculas();
                    break;
                case 4:
                    System.out.println("Ingre la pelicula a buscar");
                    var buscar = e.nextLine();
                    catalogo.buscarPeliculas(buscar);
                    break;
                case 0:
                    System.out.println("Hasta pronto");
                    break;    
                default:
                    System.out.println("Opción no reconocida ");

            }
        } while (opcion!=0);
        
    }
}
