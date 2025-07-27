/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tienda1;

/**
 *
 * @author amada
 */
public class Tienda1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Asociacion: videojuego con genero
       Genero genero = new Genero("Aventura");
        VideoJuego juego = new VideoJuego("Zelda", 59.99, genero);

        System.out.println("Videojuego: " + juego.getNombre());
        System.out.println("Genero: " + juego.getGeneroNombre());
        System.out.println("Precio: Q" + juego.obtenerPrecio());

        // Agregación + Herencia: Tienda con empleados
        Tienda tienda = new Tienda("GameLand", "Zona 10");
        Cajero cajero = new Cajero(1, "Carlos", "Zona 10");
        Gerente gerente = new Gerente(2, "Lucia", "Zona 10");

        tienda.agregarEmpleado(cajero);
        tienda.agregarEmpleado(gerente);

        tienda.listarEmpleados();
        cajero.procesarVenta();
        gerente.generarReporte();  
    }
    
}
