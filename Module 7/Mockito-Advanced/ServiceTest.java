import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class ServiceTest {

    @Test
    void testRepositoryMock() {

        Repository repository = mock(Repository.class);

        when(repository.getData()).thenReturn("Mock Data");

        Service service = new Service(repository);

        assertEquals("Processed Mock Data",
                service.processData());

    }

}