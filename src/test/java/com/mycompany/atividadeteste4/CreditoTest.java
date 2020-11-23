package com.mycompany.atividadeteste4;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CreditoTest {
    
    public CreditoTest() {
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
    
    @Test
    public void testConcedeCredito1() {
        Credito instance = new Credito();
        boolean result = instance.concedeCredito(13, true, 6000);
        assertEquals(false, result);
    }
    
    @Test
    public void testConcedeCredito2() {
        Credito instance = new Credito();
        boolean result = instance.concedeCredito(10, true, 6000);
        assertEquals(true, result);
    }
    
    @Test
    public void testConcedeCredito3() {
        Credito instance = new Credito();
        boolean result = instance.concedeCredito(15, false, 6000);
        assertEquals(false, result);
    }
    
    @Test
    public void testConcedeCredito4() {
        Credito instance = new Credito();
        boolean result = instance.concedeCredito(8, false, 6000);
        assertEquals(false, result);
    }
    
    @Test
    public void testConcedeCredito5() {
        Credito instance = new Credito();
        boolean result = instance.concedeCredito(15, true, 4000);
        assertEquals(false, result);
    }
    
    @Test
    public void testConcedeCredito6() {
        Credito instance = new Credito();
        boolean result = instance.concedeCredito(10, true, 3000);
        assertEquals(false, result);
    }
    
    @Test
    public void testConcedeCredito7() {
        Credito instance = new Credito();
        boolean result = instance.concedeCredito(16, false, 2500);
        assertEquals(false, result);
    }
    
    @Test
    public void testConcedeCredito8() {
        Credito instance = new Credito();
        boolean result = instance.concedeCredito(11, false, 3500);
        assertEquals(false, result);
    }
    
    @Test
    public void testDefinirCredito1() {
        Credito instance = new Credito();
        double result = instance.definirCredito(13, true, 6000);
        assertEquals(0, result);
    }
    
    @Test
    public void testDefinirCredito2() {
        Credito instance = new Credito();
        double result = instance.definirCredito(10, true, 6000);
        assertEquals(20000, result);
    }
    
    @Test
    public void testDefinirCredito3() {
        Credito instance = new Credito();
        double result = instance.definirCredito(15, false, 6000);
        assertEquals(0, result);
    }
    
    @Test
    public void testDefinirCredito4() {
        Credito instance = new Credito();
        double result = instance.definirCredito(8, false, 6000);
        assertEquals(0, result);
    }
    
    @Test
    public void testDefinirCredito5() {
        Credito instance = new Credito();
        double result = instance.definirCredito(15, true, 4000);
        assertEquals(0, result);
    }
    
    @Test
    public void testDefinirCredito6() {
        Credito instance = new Credito();
        double result = instance.definirCredito(10, true, 3000);
        assertEquals(0, result);
    }
    
    @Test
    public void testDefinirCredito7() {
        Credito instance = new Credito();
        double result = instance.definirCredito(16, false, 2500);
        assertEquals(0, result);
    }
    
    @Test
    public void testDefinirCredito8() {
        Credito instance = new Credito();
        double result = instance.definirCredito(11, false, 3500);
        assertEquals(0, result);
    }
}