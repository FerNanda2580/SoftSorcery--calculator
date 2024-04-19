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
        calculator calc = new calculator(); 
        assertThrows(IllegalArgumentException.class, () -> {
            calc.divisao(6, 0);
        });
        assertThrows(IllegalArgumentException.class, () -> calc.divisao(6, 0));
    }
}
