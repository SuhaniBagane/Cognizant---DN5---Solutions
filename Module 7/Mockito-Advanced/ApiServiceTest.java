import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class ApiServiceTest {

    @Test
    void testRestClient() {

        RestClient client = mock(RestClient.class);

        when(client.getResponse())

                .thenReturn("Mock Response");

        ApiService service = new ApiService(client);

        assertEquals("Fetched Mock Response",
                service.fetchData());

    }

}