import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class VoidServiceTest {

    @Test
    void testVoidMethod() {

        VoidService service = mock(VoidService.class);

        doNothing().when(service).printMessage();

        service.printMessage();

        verify(service).printMessage();

    }

    @Test
    void testVoidException() {

        VoidService service = mock(VoidService.class);

        doThrow(new RuntimeException("Error"))

                .when(service)

                .printMessage();

        try {

            service.printMessage();

        }

        catch (Exception e) {

            System.out.println(e.getMessage());

        }

    }

}