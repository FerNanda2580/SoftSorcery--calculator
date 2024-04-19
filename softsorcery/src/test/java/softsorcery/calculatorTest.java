package softsorcery;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class calculatorTest {
    calculator calc = new calculator();

    @Test
    public void soma() {
        assertEquals(5, calc.add(2, 3));
        assertEquals(-1, calc.add(2, -3));
        assertEquals(-4, calc.add(-2, -2));
    }

    @Test
    public void subtracao() {
        assertEquals(-1, calc.subtract(2, 03));
        assertEquals(0, calc.subtract(-3, -3));
        assertEquals(-5, calc.subtract(-2, 03));
    }

    @Test
    public void multiplicacao() {
        assertEquals(6, calc.multiplicacao(2, 3));
        assertEquals(-6, calc.multiplicacao(2, -3));
        assertEquals(6, calc.multiplicacao(-2, -3));
    }

    @Test
    public void divisaoPorZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            calc.divisao(6, 0);
        });
        assertThrows(IllegalArgumentException.class, () -> calc.divisao(6, 0));
    }

    @Test
    public void potenciacaoTest(){
        assertEquals(1024, calc.potenciacao(2, 10));
        assertEquals(1, calc.potenciacao(0, 0));
        assertEquals(-8, calc.potenciacao(-2,3));
        assertEquals(0, calc.potenciacao(0, 1));
        assertEquals(1, calc.potenciacao(10, 0));
        assertEquals(0.0625, calc.potenciacao(2, -4));
    }

    @Test
    public void fatorialTest() {
        assertEquals(1, calc.fatorial(0));
        assertEquals(1, calc.fatorial(1));
        assertEquals(2, calc.fatorial(2));
        assertEquals(24, calc.fatorial(4));
        assertEquals(120, calc.fatorial(5));
        assertThrows(IllegalArgumentException.class, () -> {
            calc.fatorial(-1);
        });
}   
}
