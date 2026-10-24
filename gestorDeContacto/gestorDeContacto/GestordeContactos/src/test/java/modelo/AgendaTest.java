/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package modelo;

import modelo.Contacto;
import java.util.List;
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
public class AgendaTest {
    
    public AgendaTest() {
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
    public  void tearDown() {
    }

    /**
     * Test of guardarNuevosContactos method, of class Agenda.
     */
    @Test
    public void testGuardarNuevosContactos() {
        System.out.println("guardarNuevosContactos");
        Contacto c = null;
        Agenda instance = new Agenda();
        instance.guardarNuevosContactos(c);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of busquedaPersona method, of class Agenda.
     */
    @Test
    public void testBusquedaPersona() {
        System.out.println("busquedaPersona");
        String nombre = "Juan Carlos";
        Agenda instance = new Agenda();
        
        Contacto c = new Contacto("Juan Carlos","1234567");
        
        instance.guardarNuevosContactos(c);
        
        String result = instance.busquedaPersona(nombre);
        
        assertNotNull(result);
        
        assertNotEquals("",result);
        
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getContactos method, of class Agenda.
     */
    @Test
    public void testGetContactos() {
        System.out.println("getContactos");
        Agenda instance = new Agenda();
       
        List<Contacto> result = instance.getContactos();
        assertNotNull(result);
        assertEquals(0, result.size());
        // TODO review the generated test code and remove the default call to fail.
        
    }
}
    

