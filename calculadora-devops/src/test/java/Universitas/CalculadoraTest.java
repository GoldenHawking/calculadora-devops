package Universitas;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    @Test
    public void probarSuma() {
        Calculadora calc = new Calculadora();
        double resultado = calc.sumar(10.0, 5.0);
        assertEquals(15.0, resultado, 0.0001);
    }

    @Test
    public void probarResta() {
        Calculadora calc = new Calculadora();
        double resultado = calc.restar(10.0, 5.0);
        assertEquals(5.0, resultado, 0.0001);
    }

    @Test
    public void probarMultiplicacionFalloIntencional() {
        Calculadora calc = new Calculadora();
        // Fallo intencional real: 2 * 3 NO es 99.0
        assertEquals(99.0, calc.multiplicar(2.0, 3.0), 0.0001);
    }
}