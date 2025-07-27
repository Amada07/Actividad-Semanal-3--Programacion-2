/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda1;

/**
 *
 * @author amada
 */
public class Gerente extends Empleado {
    
public Gerente( int id, String nombre, String sucursal){
 super(id, nombre, sucursal);
 }
public void generarReporte(){
    System.out.println(getNombre()+ "esta generando un reporte");
 }
}