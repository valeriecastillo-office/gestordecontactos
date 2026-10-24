/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package vista;

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
public class VentanaAgendaTest {
    
    public VentanaAgendaTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
   

    /**
     * Test of main method, of class VentanaAgenda.
     
     *///
     
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = new String[0];
     
        // TODO review the generated test code and remove the default call to fail.
        
        assertDoesNotThrow(() -> {
            VentanaAgenda.main(args);
        });
    }
}   

