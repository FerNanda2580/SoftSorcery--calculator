package softsorcery;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class calculatorTest {
    calculator calc = new calculator();
    @Test
    public void soma(){
        assertEquals(5, calc.add(2, 3));
        assertEquals(-1, calc.add(2, -3));
        assertEquals(-4, calc.add(-2, -2));
    }

    @Test
    public void subtracao(){
        assertEquals(-1, calc.subtract(2, 03));
        assertEquals(0, calc.subtract(-3, -3));
        assertEquals(-5, calc.subtract(-2, 03));
    }

    @Test
    public void multiplicacao(){
        assertEquals(6, calc.multiply(2, 3));
        assertEquals(-6, calc.multiply(2, -3));
        assertEquals(6, calc.multiply(-2, -3));
    }

    @Test ()
    public void divisao(){
        assertEquals(2, calc.divide(6, 3));
        assertEquals(-2, calc.divide(6, -3));
        assertEquals(2, calc.divide(-6, -3));
    }

    @Test (expected = IllegalArgumentException.class)
    public void divisaoPorZero(){
        calc.divide(6, 0);
    }
}

