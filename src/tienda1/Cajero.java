/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda1;

/**
 *
 * @author amada
 */
public class Cajero extends Empleado {
    public Cajero(int id, String nombre,String sucursal){
        super(id, nombre,sucursal);
        
    }
    
    public void procesarVenta(){
        System.out.println(getNombre()+ "Esta procesando una venta ");
    }
}
