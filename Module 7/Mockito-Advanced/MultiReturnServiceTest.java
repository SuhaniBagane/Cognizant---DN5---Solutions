import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class MultiReturnServiceTest {

    @Test
    void testMultipleReturns() {

        Repository repository = mock(Repository.class);

        when(repository.getData())

                .thenReturn("First Mock Data")

                .thenReturn("Second Mock Data");

        Service service = new Service(repository);

        assertEquals("Processed First Mock Data",
                service.processData());

        assertEquals("Processed Second Mock Data",
                service.processData());

    }

}