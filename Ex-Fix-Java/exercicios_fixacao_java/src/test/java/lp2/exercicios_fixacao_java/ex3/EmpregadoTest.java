package lp2.exercicios_fixacao_java.ex3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;

import static org.junit.jupiter.api.Assertions.*;

class EmpregadoTest {

    private Empregado empregado;

    @BeforeEach
    void setUp() {
        // Inicializando o objeto Empregado antes de cada teste
        empregado = new Empregado("João", "Silva", 3000.0);
    }

    private String formatar(double valor) {
        // Usando um padrão adequado para a formatação com duas casas decimais
        DecimalFormat df = new DecimalFormat("#,###.00");
        return df.format(valor);
    }

    @Test
    void testSalarioAnual() {
        // Verificando o salário anual sem aumento
        double salarioAnual = empregado.getSalarioAnual();
        System.out.println("Salário anual sem aumento: " + formatar(salarioAnual)); // Print no console
        assertEquals("36.000,00", formatar(salarioAnual), "O salário anual deveria ser R$ 36,000.00");
    }

    @Test
    void testSalarioAnualComAumento() {
        // Verificando o salário anual com aumento de 10%
        double salarioAnualComAumento = empregado.getSalarioAnualComAumento();
        System.out.println("Salário anual com aumento de 10%: " + formatar(salarioAnualComAumento)); // Print no console
        assertEquals("39.600,00", formatar(salarioAnualComAumento), "O salário anual com aumento de 10% deveria ser R$ 39,600.00");
    }

    @Test
    void testSetSalarioMensal() {
        // Alterando o salário mensal e verificando o novo salário anual
        empregado.setSalarioMensal(5000.0);
        System.out.println("Novo salário anual após alteração: " + formatar(empregado.getSalarioAnual())); // Print no console
        assertEquals("60.000,00", formatar(empregado.getSalarioAnual()), "O salário anual após alteração deveria ser R$ 60,000.00");
    }

    @Test
    void testSetSalarioMensalNegativo() {
        // Testando o caso em que o salário é negativo, ele deve ser ajustado para 0
        empregado.setSalarioMensal(-1000.0);
        System.out.println("Salário ajustado para 0: " + formatar(empregado.getSalarioMensal())); // Print no console
        assertEquals(",00", formatar(empregado.getSalarioMensal()), "O salário não pode ser negativo, deveria ser ajustado para 0");
    }

    @Test
    void testGetNome() {
        // Verificando se o nome do empregado está correto
        System.out.println("Nome do empregado: " + empregado.getNome()); // Print no console
        assertEquals("João", empregado.getNome(), "O nome do empregado deveria ser João");
    }

    @Test
    void testGetSobrenome() {
        // Verificando se o sobrenome do empregado está correto
        System.out.println("Sobrenome do empregado: " + empregado.getSobrenome()); // Print no console
        assertEquals("Silva", empregado.getSobrenome(), "O sobrenome do empregado deveria ser Silva");
    }
}
