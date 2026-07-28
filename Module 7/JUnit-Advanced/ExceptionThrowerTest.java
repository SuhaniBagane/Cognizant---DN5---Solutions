import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExceptionThrowerTest {

    ExceptionThrower exceptionThrower = new ExceptionThrower();

    @Test
    void testException(){

        Exception exception = assertThrows(

                RuntimeException.class,

                ()->exceptionThrower.throwException()

        );

        assertEquals("Sample Exception",exception.getMessage());

    }

}