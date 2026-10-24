/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package modelo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author JUAN CARLOS
 */
public class ContactoTest {
    
    public ContactoTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getNombre method, of class Contacto.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Contacto instance = new Contacto ("Juan Carlos", "1234567");
        String expResult = "Juan Carlos";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getTelefono method, of class Contacto.
     */
    @Test
    public void testGetTelefono() {
        System.out.println("getTelefono");
        Contacto instance = new Contacto ("Juan Carlos", "1234567") ;
        String expResult = "1234567";
        String result = instance.getTelefono();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setNombre method, of class Contacto.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        Contacto instance = new Contacto ("NombreInicial", "1234567");
        String nuevoNombre = "Juan Carlos";
        instance.setNombre(nuevoNombre);
        String result = instance.getNombre();
        assertEquals("Juan Carlos", result);
                
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setTelefono method, of class Contacto.
     */
    @Test
    public void testSetTelefono() {
        System.out.println("setTelefono");
        String telefono = "1234567";
        Contacto instance = new Contacto ("NombreInicial", "1234567");
        instance.setTelefono(telefono);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    

}