package lp2.exercicios_fixacao_java.ex4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ComplexTest {

    private Complex complexo1;
    private Complex complexo2;

    @BeforeEach
    void setUp() {
        complexo1 = new Complex(3, 4);
        complexo2 = new Complex(1, 2);
    }

    @Test
    void testGetReal() {
        int resultado = complexo1.getReal();
        System.out.println("Parte real de complexo1: " + resultado);
        assertEquals(3, resultado, "A parte real do número complexo deve ser 3.");
    }

    @Test
    void testGetImag() {
        int resultado = complexo1.getImag();
        System.out.println("Parte imaginária de complexo1: " + resultado);
        assertEquals(4, resultado, "A parte imaginária do número complexo deve ser 4.");
    }

    @Test
    void testGetMod() {
        double esperado = Math.sqrt(3 * 3 + 4 * 4);
        double resultado = complexo1.getMod();
        System.out.println("Módulo de complexo1: " + resultado);
        assertEquals(esperado, resultado, "O módulo do número complexo deve ser 5.");
    }

    @Test
    void testGetAng() {
        double esperado = Math.atan2(4, 3);
        double resultado = complexo1.getAng();
        System.out.println("Ângulo de complexo1: " + resultado);
        assertEquals(esperado, resultado, "O ângulo do número complexo deve ser calculado corretamente.");
    }

    @Test
    void testInv() {
        Complex inverso = complexo1.inv();
        System.out.println("Inverso de complexo1: " + inverso.toString());
        assertEquals(-3, inverso.getReal(), "A parte real do inverso deve ser -3.");
        assertEquals(-4, inverso.getImag(), "A parte imaginária do inverso deve ser -4.");
    }

    @Test
    void testSoma() {
        Complex soma = complexo1.soma(complexo2);
        System.out.println("Soma de complexo1 e complexo2: " + soma.toString());
        assertEquals(4, soma.getReal(), "A parte real da soma deve ser 4.");
        assertEquals(6, soma.getImag(), "A parte imaginária da soma deve ser 6.");
    }

    @Test
    void testSub() {
        Complex sub = complexo1.sub(complexo2);
        System.out.println("Subtração de complexo1 e complexo2: " + sub.toString());
        assertEquals(2, sub.getReal(), "A parte real da subtração deve ser 2.");
        assertEquals(2, sub.getImag(), "A parte imaginária da subtração deve ser 2.");
    }

    @Test
    void testMult() {
        Complex mult = complexo1.mult(complexo2);
        System.out.println("Multiplicação de complexo1 e complexo2: " + mult.toString());
        assertEquals(-5, mult.getReal(), "A parte real da multiplicação deve ser -5.");
        assertEquals(10, mult.getImag(), "A parte imaginária da multiplicação deve ser 10.");
    }

    @Test
    void testDiv() {
        Complex div = complexo1.div(complexo2);
        double realEsperado = (3 * 1 + 4 * 2) / (1 * 1 + 2 * 2);
        double imagEsperado = (4 * 1 - 3 * 2) / (1 * 1 + 2 * 2);
        System.out.println("Divisão de complexo1 e complexo2: " + div.toString());
        assertEquals(realEsperado, div.getReal(), 0.01, "A parte real da divisão deve ser correta.");
        assertEquals(imagEsperado, div.getImag(), 0.01, "A parte imaginária da divisão deve ser correta.");
    }
}
