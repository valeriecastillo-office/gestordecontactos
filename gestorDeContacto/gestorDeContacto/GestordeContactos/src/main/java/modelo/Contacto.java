/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
/*
 * @uator JUANCARLOS
 */
public class Contacto {
    // Atributos privados-Encapsulamiento
    private String nombre;
    private String telefono;

    // Constructor de nombre y telefono
    public Contacto(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    
    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}