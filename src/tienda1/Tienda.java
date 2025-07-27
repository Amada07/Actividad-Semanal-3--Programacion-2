/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author amada
 */
public class Tienda {
  private String nombre;
    private String ubicacion;
    private List<Empleado> empleados;

    public Tienda(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado e) {
        empleados.add(e);
    }

    public void listarEmpleados() {
        System.out.println("Empleados en tienda " + nombre + ":");
        for (Empleado e : empleados) {
            System.out.println("- " + e.getNombre());
        }
    }
}
  

