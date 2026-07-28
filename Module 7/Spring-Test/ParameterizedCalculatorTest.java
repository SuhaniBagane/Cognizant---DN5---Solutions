import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class ParameterizedCalculatorTest {

    CalculatorService service=
            new CalculatorService();

    @ParameterizedTest

    @CsvSource({

            "2,3,5",

            "5,5,10",

            "10,15,25"

    })

    void testAddition(int a,int b,int result){

        assertEquals(result,
                service.add(a,b));

    }

}