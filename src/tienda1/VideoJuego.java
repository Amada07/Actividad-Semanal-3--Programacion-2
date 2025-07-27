/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda1;

/**
 *
 * @author amada
 */
public class VideoJuego {
     private String nombre;
    private double precio;
    private Genero genero; //Asociacion

    public VideoJuego(String nombre, double precio, Genero genero) {
        this.nombre = nombre;
        this.precio = precio;
        this.genero = genero;
    }
    
   public double obtenerPrecio(){
       return precio;
   } 
   
   public String getGeneroNombre(){
       return genero.getNombre();
   }
   
   public String getNombre(){
       return nombre;
   }
}
