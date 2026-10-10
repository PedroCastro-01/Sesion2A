package org.calc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

    @Test
    void testSuma() {
        int resultado = Calculadora.suma(3, 5);
        assertEquals(8, resultado);
    }

    @Test
    void testResta() {
        int resultado = Calculadora.resta(8, 3);
        assertEquals(5, resultado);
    }

    @Test
    void testMultiplica() {
        int resultado = Calculadora.multiplica(4, 3);
        assertEquals(12, resultado);
    }

    @Test
    void testDivide() {
        int resultado = Calculadora.divide(10, 2);
        assertEquals(5, resultado);
    }

    @Test
    void testDividePorCero() {
        int resultado = Calculadora.divide(10, 0);
        assertEquals(-1, resultado);
    }
}
