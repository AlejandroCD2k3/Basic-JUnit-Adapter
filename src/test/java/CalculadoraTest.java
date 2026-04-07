import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import com.mycompany.calculadoralegacy.*;

public class CalculadoraTest {

    private List<Calculadora> calculadoras() {
        return List.of(
            new CalculadoraBasica(),
            new CalculadoraAdapter(new SistemaExterno())
        );
    }

    @Test
    void testSuma() {
        for (Calculadora calc : calculadoras()) {
            assertEquals(5, calc.sumar(2, 3));
            assertEquals(0, calc.sumar(2, -2));
            assertEquals(-7, calc.sumar(-3, -4));
        }
    }

    @Test
    void testConmutatividad(){
        for (Calculadora calc : calculadoras()) {
            assertEquals(calc.sumar(10, 4), calc.sumar(4, 10));
        }
    }
}


