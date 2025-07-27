/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda1;

/**
 *
 * @author amada
 */
public class Empleado {
  private int id;
private String nombre;
private String sucursal;

    public Empleado(int id, String nombre, String sucursal) {
        this.id = id;
        this.nombre = nombre;
        this.sucursal = sucursal;
    }

public void realizarOperacion(){
    System.out.println(nombre+"realiza una operacion general");
}
public String getNombre(){
    return nombre;
 }
}
