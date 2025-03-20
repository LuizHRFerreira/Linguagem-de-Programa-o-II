package lp2.exercicios_fixacao_java.ex5;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
public class DataTest {

    @Test
    public void testConstrutorValido() {
        Data d = new Data(15, 8, 2023);
        assertEquals(15, d.getDia());
        assertEquals(8, d.getMes());
        assertEquals(2023, d.getAno());
    }

    @Test
    public void testConstrutorInvalido() {
        assertThrows(IllegalArgumentException.class, () -> new Data(32, 1, 2023));
        assertThrows(IllegalArgumentException.class, () -> new Data(29, 2, 2021)); // 2021 não é bissexto
        assertThrows(IllegalArgumentException.class, () -> new Data(31, 4, 2023)); // Abril tem no máximo 30 dias
    }

    @Test
    public void testAnoBissexto() {
        Data d = new Data(1, 1, 2024);
        assertTrue(d.isBissexto(2024));
        assertFalse(d.isBissexto(2023));
    }

    @Test
    public void testDataAtual() {
        Data d = new Data(1, 1, 2000);
        d.dataAtual();
        LocalDate hoje = LocalDate.now();
        assertEquals(hoje.getDayOfMonth(), d.getDia());
        assertEquals(hoje.getMonthValue(), d.getMes());
        assertEquals(hoje.getYear(), d.getAno());
    }

    @Test
    public void testProximoDia() {
        Data d1 = new Data(28, 2, 2023);
        assertEquals("1/3/2023", d1.proxDia());

        Data d2 = new Data(28, 2, 2024);
        assertEquals("29/2/2024", d2.proxDia());

        Data d3 = new Data(31, 12, 2023);
        assertEquals("1/1/2024", d3.proxDia());
    }
}
