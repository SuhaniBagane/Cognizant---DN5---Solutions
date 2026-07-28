import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class MyServiceTest {

    @Test
    void testMockingAndStubbing() {

        ExternalApi api = mock(ExternalApi.class);

        when(api.getData()).thenReturn("Mock Data");

        MyService service = new MyService(api);

        assertEquals("Mock Data", service.fetchData());

    }

    @Test
    void testVerifyInteraction() {

        ExternalApi api = mock(ExternalApi.class);

        MyService service = new MyService(api);

        service.fetchData();

        verify(api).getData();

    }

    @Test
    void testArgumentMatcher() {

        ExternalApi api = mock(ExternalApi.class);

        MyService service = new MyService(api);

        service.save("Java");

        verify(api).saveData(anyString());

    }

    @Test
    void testMultipleReturns() {

        ExternalApi api = mock(ExternalApi.class);

        when(api.getData())

                .thenReturn("First")

                .thenReturn("Second");

        MyService service = new MyService(api);

        assertEquals("First", service.fetchData());

        assertEquals("Second", service.fetchData());

    }

}