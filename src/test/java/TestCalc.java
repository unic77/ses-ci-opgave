import org.example.Calculator;
import org.example.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.annotation.Annotation;

public class TestCalc{


    @Test
    public void mustReturnDrie() {
        Calculator calc = new Calculator(1,2);
        Assertions.assertEquals(3, calc.add());
    }

    @Test
    public void mustReturnTwee() {
        Calculator calc = new Calculator(1,1);
        Assertions.assertEquals(2, calc.add());
    }

    @Test
    public void mustReturnEen() {
        Calculator calc = new Calculator(1,1);
        Assertions.assertEquals(1, calc.add());
    }
}
