package Universitas;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculadoraTest {

    @Test
    public void probarSuma() {
        Calculadora calc = new Calculadora();
        double resultado = calc.sumar(10.0, 5.0);
        // assertEquals(esperado, obtenido, delta)
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
        // Le digo a la prueba que 2 * 3 debería dar 99 (fallo provocado)
        assertEquals(6.0, calc.multiplicar(2.0, 3.0), 0.0001);
    }
}