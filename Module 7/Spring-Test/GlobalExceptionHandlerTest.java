import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GlobalExceptionHandlerTest {

    @Test
    void testExceptionHandler(){

        GlobalExceptionHandler handler=
                new GlobalExceptionHandler();

        assertEquals("User not found",
                handler.handleException());

    }

}