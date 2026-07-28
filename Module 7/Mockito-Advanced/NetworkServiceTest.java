import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class NetworkServiceTest {

    @Test
    void testNetworkClient() {

        NetworkClient client = mock(NetworkClient.class);

        when(client.connect())

                .thenReturn("Mock Connection");

        NetworkService service =
                new NetworkService(client);

        assertEquals("Connected to Mock Connection",
                service.connectToServer());

    }

}