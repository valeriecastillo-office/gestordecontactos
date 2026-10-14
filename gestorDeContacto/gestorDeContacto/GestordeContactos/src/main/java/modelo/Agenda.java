/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
/*
 * @uator JUANCARLOS
 */
import java.util.ArrayList;
import java.util.List;

public class Agenda {
    
   
    public String busquedaPersona(String nombre) {
        for (Contacto c : listaContactos) {
            // equalsIgnoreCase compara sin importar mayúsculas o minúsculas
            if (c.getNombre().equalsIgnoreCase(nombre)) {
                return c.getTelefono(); // Devuelve el número si coincide
            }
        }
        return null; 
    }

   